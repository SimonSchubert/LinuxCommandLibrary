# TAGLINE

Enter minimal emergency recovery mode

# TLDR

Enter **emergency** mode

```systemctl emergency```

Enter emergency mode **asynchronously**

```systemctl emergency --no-block```

# SYNOPSIS

**systemctl emergency** [_OPTIONS_]

# PARAMETERS

**--no-block**
> Return immediately without waiting for the operation to complete

# DESCRIPTION

**systemctl emergency** transitions the system to emergency mode (`emergency.target`). Emergency mode mounts the root filesystem read-only and starts only essential services needed for system recovery. It provides a minimal environment for repairing a broken system.

Emergency mode is more minimal than rescue mode and is typically used when rescue mode cannot start properly.

# CAVEATS

Requires root privileges. Most services will be stopped. Network will be unavailable. The root filesystem is mounted read-only by default; remount with `mount -o remount,rw /` if needed for repairs.

# HISTORY

The **emergency** subcommand provides a standardized way to enter the most minimal recovery mode, replacing the traditional init=/bin/sh boot parameter.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-rescue](/man/systemctl-rescue)(1), [systemctl-default](/man/systemctl-default)(1)
