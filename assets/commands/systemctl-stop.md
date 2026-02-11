# TAGLINE

Stop systemd units

# TLDR

**Stop** a unit

```systemctl stop [unit]```

Stop a service and **suppress warnings**

```systemctl stop [unit] --no-warn```

Stop a **user** unit

```systemctl stop [unit] --user```

# SYNOPSIS

**systemctl** [_OPTIONS_...] **stop** _PATTERN_...

# PARAMETERS

**--user**
> Stop user service manager units instead of system units

**--no-block**
> Do not wait for the operation to complete

**--no-warn**
> Suppress warning about stopping running units

**--job-mode=**_MODE_
> Specify how to deal with already queued jobs

# DESCRIPTION

**systemctl stop** deactivates systemd units, stopping services, unmounting filesystems, or deactivating other unit types. The command queues a stop job for the specified unit.

For services, this sends a stop command (usually SIGTERM followed by SIGKILL after timeout). The unit transitions to the inactive state. Dependent units are not automatically stopped unless they cannot function without the stopped unit.

# CAVEATS

Requires root privileges for system units. Stopping a unit does not disable it; it may restart on next boot if enabled. Some services may take time to stop gracefully.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-start](/man/systemctl-start)(1), [systemctl-restart](/man/systemctl-restart)(1)
