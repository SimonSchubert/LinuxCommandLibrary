# TAGLINE

Check overall system operational state

# TLDR

Check **system state**

```systemctl is-system-running```

**Quiet** mode (exit code only)

```systemctl is-system-running -q```

**Wait** for boot completion, then print the state

```systemctl is-system-running --wait```

Check the **user service manager** state

```systemctl --user is-system-running```

Use in a **script** to act only on a fully healthy system

```systemctl is-system-running -q && [command]```

List **failed units** when the state is degraded

```systemctl --failed```

# SYNOPSIS

**systemctl is-system-running** [_OPTIONS_]

# PARAMETERS

**-q**, **--quiet**
> Suppress output, return only the exit code.

**--wait**
> Wait until the boot process is completed before returning.

**--user**
> Query the calling user's service manager instead of the system manager.

**-H**, **--host** _[USER@]HOST_
> Query a remote system over SSH.

# DESCRIPTION

**systemctl is-system-running** checks the overall operational state of the system. It reports whether the system has finished booting and whether all units are functioning properly.

# SYSTEM STATES

**initializing**
> Early bootup, before basic.target is reached or the maintenance state entered.

**starting**
> Late bootup, before the job queue becomes idle for the first time or a rescue target is reached.

**running**
> The system is fully operational.

**degraded**
> The system is operational but one or more units failed.

**maintenance**
> The rescue or emergency target is active.

**stopping**
> The manager is shutting down.

**offline**
> The manager is not running, e.g. an incompatible program is running as PID 1 (such as inside some chroots or containers).

**unknown**
> The operational state could not be determined due to lack of resources or another error.

# EXIT STATUS

Returns **0** only when the state is **running**. Any other state returns non-zero, so `systemctl is-system-running -q` is a convenient health-check primitive in scripts.

# CAVEATS

A **degraded** state is common on desktops where a single non-essential unit failed; inspect with **systemctl --failed** and clear with **systemctl reset-failed**. Without **--wait**, the command returns immediately and may report **starting** during boot.

# HISTORY

The **is-system-running** verb was added to **systemd** in version **215** (2014), providing a single high-level health check for boot completion and failed units.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-status](/man/systemctl-status)(1), [systemctl-is-failed](/man/systemctl-is-failed)(1), [systemctl-reset-failed](/man/systemctl-reset-failed)(1), [systemd-analyze](/man/systemd-analyze)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-23 -->
