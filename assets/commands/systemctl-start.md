# TLDR

**Start** a unit

```systemctl start [unit]```

Start a **user** unit

```systemctl start [unit] --user```

# SYNOPSIS

**systemctl** [_OPTIONS_...] **start** _PATTERN_...

# PARAMETERS

**--user**
> Start user service manager units instead of system units

**--no-block**
> Do not wait for the operation to complete

**--job-mode=**_MODE_
> Specify how to deal with already queued jobs (fail, replace, etc.)

# DESCRIPTION

**systemctl start** activates systemd units, starting services, mounting filesystems, or activating other unit types. The command queues a start job for the specified unit and its dependencies.

For services, this starts the service process. For sockets, it begins listening. For mounts, it mounts the filesystem. Dependencies are automatically started as needed.

# CAVEATS

Requires root privileges for system units. Starting a unit does not enable it for boot; use **systemctl enable** for persistence. Some units may have dependencies that must be satisfied first.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-stop](/man/systemctl-stop)(1), [systemctl-enable](/man/systemctl-enable)(1)
