# TAGLINE

List installed unit files and states

# TLDR

List **installed** unit files

```systemctl list-unit-files```

Filter by **state**

```systemctl list-unit-files --state [enabled|disabled|static]```

Filter by **type**

```systemctl list-unit-files -t [service|socket|timer]```

Filter by **name pattern**

```systemctl list-unit-files '[pattern*]'```

Output without **pager**

```systemctl list-unit-files --no-pager```

Output without **headers**

```systemctl list-unit-files --no-legend```

# SYNOPSIS

**systemctl list-unit-files** [_OPTIONS_] [_PATTERN_...]

# PARAMETERS

**--state=** _STATE_
> Filter by enablement state (enabled, disabled, static, masked, etc.)

**-t, --type=** _TYPE_
> Filter by unit type

**--no-pager**
> Disable pager output

**--no-legend**
> Suppress header and footer

# DESCRIPTION

**systemctl list-unit-files** displays all installed unit files and their enablement states. Unlike `list-units` which shows runtime state, this shows the boot configuration for all available units.

The output shows the unit file name and its state: enabled, disabled, static, masked, generated, transient, indirect, or alias.

# ENABLEMENT STATES

**enabled** - Starts automatically at boot

**disabled** - Does not start at boot

**static** - No install section, started as dependency

**masked** - Completely blocked

**indirect** - Enabled via another unit

# CAVEATS

Shows all installed unit files regardless of runtime state. Some unit files may be present but never used. Static units cannot be enabled directly.

# HISTORY

The **list-unit-files** subcommand provides visibility into the full set of available units and their boot configuration, complementing `list-units` which shows only currently loaded units.

# SEE ALSO

[systemctl-list-units](/man/systemctl-list-units)(1), [systemctl-enable](/man/systemctl-enable)(1), [systemctl](/man/systemctl)(1)
