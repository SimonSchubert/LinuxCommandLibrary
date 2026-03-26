# TAGLINE

List loaded units and their states

# TLDR

List **active** units

```systemctl list-units```

List **all** units

```systemctl list-units -a```

Filter by **type**

```systemctl list-units -t [service|socket|timer]```

Filter by **state**

```systemctl list-units --state [running|listening|dead]```

Filter by **pattern**

```systemctl list-units '[pattern*]'```

Output without **pager**

```systemctl list-units --no-pager```

Output without **headers**

```systemctl list-units --no-legend```

List only **failed** units

```systemctl list-units --failed```

List units **with full names** (no ellipsis)

```systemctl list-units --full```

# SYNOPSIS

**systemctl list-units** [_OPTIONS_] [_PATTERN_...]

# PARAMETERS

**-a, --all**
> Include inactive units and units following other units

**-t, --type=** _TYPE_
> Filter by unit type (comma-separated list, e.g., service, socket, timer)

**--state=** _STATE_
> Filter by LOAD, SUB, or ACTIVE state (comma-separated list)

**--failed**
> Show only failed units (equivalent to --state=failed)

**-l, --full**
> Do not ellipsize unit names, descriptions, or other fields in the output

**-r, --recursive**
> Also show units of local containers

**--with-dependencies**
> Show specified units and their dependencies

**--no-pager**
> Disable pager output

**--no-legend**
> Suppress header and footer (useful for scripts)

# DESCRIPTION

**systemctl list-units** displays units that systemd currently has loaded in memory. By default, it shows units that are active, have pending jobs, or have failed.

The output shows the unit name, load state, active state, sub-state, and description. This is the primary command for viewing current system state.

# OUTPUT COLUMNS

**UNIT** - Unit name

**LOAD** - Load state (loaded, not-found, error)

**ACTIVE** - Active state (active, inactive, failed)

**SUB** - Sub-state (running, exited, dead, listening)

**DESCRIPTION** - Unit description

# CAVEATS

Only shows currently loaded units. Use `list-unit-files` to see all installed units. Failed units remain visible until acknowledged with `systemctl reset-failed`.

# HISTORY

The **list-units** subcommand is the primary status overview command in systemd, replacing various init script listing mechanisms.

# SEE ALSO

[systemctl-list-unit-files](/man/systemctl-list-unit-files)(1), [systemctl-list-timers](/man/systemctl-list-timers)(1), [systemctl-status](/man/systemctl-status)(1), [systemctl](/man/systemctl)(1), [journalctl](/man/journalctl)(1)
