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

**-l, --full**
> Do not ellipsize column contents

**--no-legend**
> Suppress header and footer

**--no-pager**
> Disable pager output

# DESCRIPTION

**systemctl list-automounts** displays automount units currently loaded in memory, showing mount paths and corresponding unit names. Automount units trigger on-demand mounting when the mount point is accessed.

Units are ordered by mount path. The output columns are **WHAT** (the backing device or source), **WHERE** (the mount path), **MOUNTED** (yes or no), **IDLE TIMEOUT** and **UNIT**.

# CAVEATS

Only shows automount units, not regular mount units. Inactive automounts are hidden by default. For all mount information, use `systemctl list-units --type=mount`.

# HISTORY

The **list-automounts** subcommand was added in **systemd 252** (2022) to provide a focused view of on-demand mounting configuration, separating automount units from regular mounts for easier administration.

# SEE ALSO

[systemctl-list-units](/man/systemctl-list-units)(1), [systemctl](/man/systemctl)(1), [mount](/man/mount)(8)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
