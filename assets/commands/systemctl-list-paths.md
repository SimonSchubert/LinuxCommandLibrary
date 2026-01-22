# TLDR

List **path** units

```systemctl list-paths```

Filter by **pattern**

```systemctl list-paths [pattern]```

List **all** including inactive

```systemctl list-paths -a```

Filter by **state**

```systemctl list-paths --state [state]```

Show **unit types**

```systemctl list-paths --show-types```

# SYNOPSIS

**systemctl list-paths** [_OPTIONS_] [_PATTERN_...]

# PARAMETERS

**-a, --all**
> Include inactive path units

**--state=** _STATE_
> Filter by state

**--show-types**
> Display unit types in output

**--no-legend**
> Suppress header and footer

**--no-pager**
> Disable pager

# DESCRIPTION

**systemctl list-paths** displays path units currently loaded in memory, ordered by the paths they watch. Path units activate other units when specified filesystem paths are modified.

The output shows the watched path, the path unit name, and its current state.

# CAVEATS

Only shows path units, not related service units. Inactive path units are hidden by default. Path monitoring uses inotify, which has kernel limits on watched paths.

# HISTORY

The **list-paths** subcommand provides a focused view of filesystem-triggered units, which are systemd's replacement for incron or similar file-watching mechanisms.

# SEE ALSO

[systemctl-list-units](/man/systemctl-list-units)(1), [systemd.path](/man/systemd.path)(5), [systemctl](/man/systemctl)(1)
