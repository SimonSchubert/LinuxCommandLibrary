# TAGLINE

Show runtime status of units

# TLDR

Show the **status** of a systemd unit

```systemctl status [unit].service```

Show the status of **failed** units

```systemctl status --failed```

**List all** running services

```systemctl status```

List **all units** in the system

```systemctl status -a```

List all units of a **specific type**

```systemctl status -t [service|timer|socket|target]```

List all units with a **specific state**

```systemctl status --state [active|inactive|failed]```

Show the status of a **user unit**

```systemctl status [unit] --user```

# SYNOPSIS

**systemctl** [_OPTIONS_...] **status** [_PATTERN_...|_PID_...]

# PARAMETERS

**-a**, **--all**
> Show all loaded units regardless of state

**-t**, **--type=**_TYPE_
> Filter by unit type (service, socket, target, timer, etc.)

**--state=**_STATE_
> Filter by state (active, inactive, failed, etc.)

**--failed**
> Show only failed units

**--user**
> Query user service manager instead of system

**-n**, **--lines=**_NUM_
> Number of journal lines to show

**-o**, **--output=**_MODE_
> Journal output mode (short, verbose, json, etc.)

**--no-pager**
> Do not pipe output to pager

# DESCRIPTION

**systemctl status** displays the current state of systemd units including services, sockets, targets, and timers. It shows whether units are active, enabled, or have failed, along with recent log entries from the journal.

Without arguments, it shows an overview of system state. With a unit name, it provides detailed status including the main PID, memory usage, control group, and recent log lines.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-start](/man/systemctl-start)(1), [journalctl](/man/journalctl)(1)
