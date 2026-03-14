# TAGLINE

Show runtime status of units

# TLDR

Show the **status** of a systemd unit

```systemctl status [unit].service```

Show **system overview** status

```systemctl status```

Show status of **multiple units**

```systemctl status [unit1] [unit2]```

Show status by **PID**

```systemctl status [pid]```

Show status with more **journal lines**

```systemctl status -n [50] [unit]```

Show the status of a **user unit**

```systemctl status --user [unit]```

# SYNOPSIS

**systemctl** [_OPTIONS_...] **status** [_PATTERN_...|_PID_...]

# PARAMETERS

**--user**
> Query user service manager instead of system

**-n**, **--lines=**_NUM_
> Number of journal lines to show

**-o**, **--output=**_MODE_
> Journal output mode (short, verbose, json, etc.)

**--no-pager**
> Do not pipe output to pager

**-l**, **--full**
> Do not ellipsize unit names, process tree entries, or journal output

# DESCRIPTION

**systemctl status** displays the current state of systemd units including services, sockets, targets, and timers. It shows whether units are active, enabled, or have failed, along with recent log entries from the journal.

Without arguments, it shows an overview of system state. With a unit name, it provides detailed status including the main PID, memory usage, control group, and recent log lines.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-start](/man/systemctl-start)(1), [systemctl-restart](/man/systemctl-restart)(1), [journalctl](/man/journalctl)(1)
