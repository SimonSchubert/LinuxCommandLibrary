# TAGLINE

Switch to a specific target

# TLDR

Switch to a **target**

```systemctl isolate [target]```

Switch to **graphical** target

```systemctl isolate graphical.target```

Switch to **rescue** mode

```systemctl isolate rescue.target```

Switch to **emergency** mode

```systemctl isolate emergency.target```

Switch to **text-mode** multi-user (stop the graphical session)

```systemctl isolate multi-user.target```

Switch without waiting for the job to finish

```systemctl isolate --no-block [target]```

# SYNOPSIS

**systemctl isolate** _UNIT_

# DESCRIPTION

**systemctl isolate** starts the specified unit and its dependencies while stopping all other units not required by that unit. This is similar to changing runlevels in SysV init systems.

Units with `IgnoreOnIsolate=yes` are not stopped during isolation. The `.target` suffix is assumed if no extension is provided. Only one unit may be given.

**systemctl rescue** and **systemctl emergency** are shortcuts that also notify logged-in users before isolating to the corresponding target.

# COMMON TARGETS

**graphical.target**: Full GUI environment (replaces SysV runlevel 5).

**multi-user.target**: Text-mode multi-user (runlevel 3).

**rescue.target**: Single-user rescue mode (runlevel 1) with most filesystems mounted.

**emergency.target**: Minimal emergency shell with only the root filesystem mounted read-only.

**reboot.target**, **poweroff.target**, **halt.target**: Transitional targets that cleanly bring the system to the matching state.

# CAVEATS

Only units that have **AllowIsolate=yes** can be isolated to. This is a disruptive operation that stops every running unit not required by the new target except those declaring **IgnoreOnIsolate=yes**. Requires root privileges. Isolating to **multi-user.target** from a graphical session terminates the desktop and all its applications. To make a target the default at boot, use **systemctl set-default** instead.

# HISTORY

The **isolate** subcommand provides runlevel-like behavior in systemd, allowing transitions between different system states while maintaining compatibility with the target-based boot model.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-default](/man/systemctl-default)(1), [systemctl-rescue](/man/systemctl-rescue)(1), [systemctl-emergency](/man/systemctl-emergency)(1), [systemctl-set-default](/man/systemctl-set-default)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-23 -->
