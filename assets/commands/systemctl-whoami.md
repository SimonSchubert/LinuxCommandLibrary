# TAGLINE

Show unit owning a process

# TLDR

Show **current** shell's unit

```systemctl whoami```

Show for **user** service manager

```systemctl whoami --user```

Show unit for **specific PID**

```systemctl whoami [pid]```

Show units for **multiple** PIDs

```systemctl whoami [pid1 pid2 ...]```

# SYNOPSIS

**systemctl whoami** [_PID_...]

# PARAMETERS

**--user**
> Query user service manager

**--system**
> Query system service manager (default)

# DESCRIPTION

**systemctl whoami** displays which systemd unit a process belongs to. Without arguments, it shows the unit of the current shell (the process running systemctl).

With PIDs specified, it shows the units for those processes. This helps identify which service or scope owns a particular process.

# CAVEATS

Processes not managed by systemd may show as belonging to the root slice or have no associated unit. Container processes may appear differently.

# HISTORY

The **whoami** subcommand provides a quick way to identify which unit a process is running under, useful for debugging and understanding cgroup membership.

# SEE ALSO

[systemctl-status](/man/systemctl-status)(1), [systemctl](/man/systemctl)(1), [ps](/man/ps)(1)
