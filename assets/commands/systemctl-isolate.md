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

# SYNOPSIS

**systemctl isolate** _UNIT_

# DESCRIPTION

**systemctl isolate** starts the specified unit and its dependencies while stopping all other units not required by that unit. This is similar to changing runlevels in SysV init systems.

Units with `IgnoreOnIsolate=yes` are not stopped during isolation. The `.target` suffix is assumed if no extension is provided.

# COMMON TARGETS

**graphical.target** - Full GUI environment

**multi-user.target** - Text-mode multi-user

**rescue.target** - Single-user rescue mode

**emergency.target** - Minimal emergency shell

# CAVEATS

Only units marked as isolatable can be targets. This is a disruptive operation that stops most running services. Essential services (with IgnoreOnIsolate=yes) continue running.

# HISTORY

The **isolate** subcommand provides runlevel-like behavior in systemd, allowing transitions between different system states while maintaining compatibility with the target-based boot model.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-default](/man/systemctl-default)(1), [systemctl-rescue](/man/systemctl-rescue)(1)
