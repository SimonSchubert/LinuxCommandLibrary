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

**systemctl emergency** transitions the system to emergency mode (`emergency.target`). This is equivalent to `systemctl isolate emergency.target` and blocks until complete unless `--no-block` is given. The target starts an emergency shell on the main console and pulls in no other services or mounts, providing a minimal environment for repairing a broken system.

Emergency mode is more minimal than rescue mode and is typically used when rescue mode cannot start properly.

# CAVEATS

Requires root privileges. Most services will be stopped. Network will be unavailable. Switching from a running system generally leaves existing mounts in place. When booted directly into this mode, the root filesystem is usually still read-only; remount with `mount -o remount,rw /` if needed for repairs.

# HISTORY

The **emergency** subcommand provides a standardized way to enter the most minimal recovery mode, as a managed alternative to the traditional init=/bin/sh boot parameter.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-rescue](/man/systemctl-rescue)(1), [systemctl-default](/man/systemctl-default)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
