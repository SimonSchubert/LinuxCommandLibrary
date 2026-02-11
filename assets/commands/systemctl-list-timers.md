# TAGLINE

List scheduled timer units

# TLDR

List **active** timers

```systemctl list-timers```

List **all** timers

```systemctl list-timers -a```

Filter by **pattern**

```systemctl list-timers [pattern]```

Filter by **state**

```systemctl list-timers --state [active|inactive|failed]```

# SYNOPSIS

**systemctl list-timers** [_OPTIONS_] [_PATTERN_...]

# PARAMETERS

**-a, --all**
> Include inactive timers

**--state=** _STATE_
> Filter by state

**--no-legend**
> Suppress header and footer

**--no-pager**
> Disable pager

# DESCRIPTION

**systemctl list-timers** displays timer units currently active in memory. The output shows next activation time, time until activation, last trigger time, time since last trigger, the timer unit, and the unit it activates.

Timer units are systemd's replacement for cron, providing scheduled activation of services with more flexibility and better logging integration.

# OUTPUT COLUMNS

**NEXT** - Next scheduled activation

**LEFT** - Time until next activation

**LAST** - Previous trigger time

**PASSED** - Time since last trigger

**UNIT** - Timer unit name

**ACTIVATES** - Unit triggered by this timer

# CAVEATS

Times are relative to the current time. Transient timers created with `systemd-run` also appear here. Some system timers run very infrequently (weekly, monthly).

# HISTORY

The **list-timers** subcommand provides an overview of scheduled tasks, replacing traditional `crontab -l` listings with richer information about timing and triggered services.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemd.timer](/man/systemd.timer)(5), [crontab](/man/crontab)(1)
