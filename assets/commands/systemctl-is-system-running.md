# TLDR

Check **system state**

```systemctl is-system-running```

**Quiet** mode (exit code only)

```systemctl is-system-running -q```

**Wait** for boot completion

```systemctl is-system-running --wait```

# SYNOPSIS

**systemctl is-system-running** [_OPTIONS_]

# PARAMETERS

**-q, --quiet**
> Suppress output, return only exit code

**--wait**
> Wait until boot process is completed before returning

# DESCRIPTION

**systemctl is-system-running** checks the overall operational state of the system. It reports whether the system has finished booting and whether all units are functioning properly.

Possible states: initializing, starting, running, degraded, maintenance, stopping, offline, unknown. "Running" indicates successful boot with all units healthy.

# SYSTEM STATES

**running** - System fully operational

**degraded** - Running but some units failed

**starting** - Boot in progress

**initializing** - Early boot stage

**maintenance** - Rescue or emergency mode

# EXIT STATUS

Returns **0** only when the system is fully running. Any other state returns a non-zero exit code.

# CAVEATS

The `--wait` option is useful in scripts that need to wait for complete system startup before proceeding. "Degraded" state indicates at least one unit failed.

# HISTORY

The **is-system-running** subcommand provides a high-level health check for the entire system, enabling automated monitoring and boot-completion detection.

# SEE ALSO

[systemctl-status](/man/systemctl-status)(1), [systemctl](/man/systemctl)(1)
