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

```systemctl list-unit-files --legend=false```

# SYNOPSIS

**systemctl list-unit-files** [_OPTIONS_] [_PATTERN_...]

# PARAMETERS

**--state=** _STATE_
> Filter by enablement state (enabled, disabled, static, masked, etc.)

**-t, --type=** _TYPE_
> Filter by unit type

**--no-pager**
> Disable pager output

**--legend=** _BOOL_
> Show or hide the column headers and footer (default true); replaces the older `--no-legend`

# DESCRIPTION

**systemctl list-unit-files** displays all installed unit files and their enablement states. Unlike `list-units` which shows runtime state, this shows the boot configuration for all available units, including template units.

The output shows the unit file name and its state: enabled, enabled-runtime, linked, linked-runtime, alias, masked, masked-runtime, static, indirect, disabled, generated, transient, or bad.

# ENABLEMENT STATES

**enabled** - Enabled via .wants/, .requires/ or Alias= symlinks

**disabled** - Not enabled, but has an [Install] section

**static** - Not enabled and has no [Install] provisions; started as a dependency

**masked** - Linked to /dev/null, so any start fails

**indirect** - Not enabled itself, but `Also=` lists other units that might be, or it has an alias under another name

# CAVEATS

Shows all installed unit files regardless of runtime state. Some unit files may be present but never used. Static units cannot be enabled directly.

# HISTORY

The **list-unit-files** subcommand provides visibility into the full set of available units and their boot configuration, complementing `list-units` which shows only currently loaded units.

# SEE ALSO

[systemctl-list-units](/man/systemctl-list-units)(1), [systemctl-enable](/man/systemctl-enable)(1), [systemctl](/man/systemctl)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
