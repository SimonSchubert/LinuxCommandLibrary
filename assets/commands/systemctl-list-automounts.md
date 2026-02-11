# TAGLINE

List automount units and states

# TLDR

List **automount** units

```systemctl list-automounts```

List **all** including inactive

```systemctl list-automounts -a```

Filter by **state**

```systemctl list-automounts --state [active|inactive|failed]```

Filter by **pattern**

```systemctl list-automounts [pattern]```

# SYNOPSIS

**systemctl list-automounts** [_OPTIONS_] [_PATTERN_...]

# PARAMETERS

**-a, --all**
> Include inactive automount units

**--state=** _STATE_
> Filter by state (active, inactive, failed, etc.)

**--no-legend**
> Suppress header and footer

**--no-pager**
> Disable pager output

# DESCRIPTION

**systemctl list-automounts** displays automount units currently loaded in memory, showing mount paths and corresponding unit names. Automount units trigger on-demand mounting when the mount point is accessed.

The output shows the path being watched, the automount unit name, and its current state.

# CAVEATS

Only shows automount units, not regular mount units. Inactive automounts are hidden by default. For all mount information, use `systemctl list-units --type=mount`.

# HISTORY

The **list-automounts** subcommand provides a focused view of on-demand mounting configuration, separating automount units from regular mounts for easier administration.

# SEE ALSO

[systemctl-list-units](/man/systemctl-list-units)(1), [systemd.automount](/man/systemd.automount)(5), [systemctl](/man/systemctl)(1)
