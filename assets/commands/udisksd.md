# TAGLINE

Storage device management D-Bus daemon

# TLDR

**Restart the daemon** with debug output (full path varies by distribution)

```sudo /usr/libexec/udisks2/udisksd --replace --debug```

**Run without handling SIGINT**

```sudo /usr/libexec/udisks2/udisksd --no-sigint```

**Activate modules on startup**

```sudo /usr/libexec/udisks2/udisksd --force-load-modules```

# SYNOPSIS

**udisksd** [_options_]

# PARAMETERS

**-r**, **--replace**
> Replace the existing daemon.

**-d**, **--debug**
> Print debug or informational messages on stdout/stderr.

**-s**, **--no-sigint**
> Do not handle SIGINT for controlled shutdown.

**--force-load-modules**
> Activate udisks modules on startup.

**--disable-modules**
> Do not load modules even when asked for it.

**-h**, **--help**
> Display help.

# DESCRIPTION

**udisksd** is the system daemon for udisks2, providing D-Bus interfaces for managing storage devices. It handles mounting, unmounting, formatting, partitioning, and LUKS encryption operations without requiring root privileges for each action.

The daemon monitors udev events to track device changes and exposes device information through the org.freedesktop.UDisks2 D-Bus interface. Desktop environments and applications use this interface for storage management.

Users should not start udisksd manually; it's automatically activated by D-Bus or systemd when applications access its interfaces. Access control uses polkit, allowing logged-in users to manage devices on their session's seat.

# CAVEATS

Requires polkit for access control. Automatic mounting depends on desktop environment integration. Debug mode produces verbose output. The binary is usually not in the PATH: it is at /usr/libexec/udisks2/udisksd on Debian and /usr/lib/udisks2/udisksd on Arch Linux. The "modules" in the options are udisks daemon modules, not kernel modules.

# HISTORY

**udisksd** evolved from the original udisks project (DeviceKit-disks) created for modern Linux desktop storage management. The udisks2 rewrite improved the API. It's now maintained under the storaged project and is a core component of most Linux desktop environments.

# SEE ALSO

[udisksctl](/man/udisksctl)(1), [polkit](/man/polkit)(8), [mount](/man/mount)(8), [udevadm](/man/udevadm)(8), [dbus-daemon](/man/dbus-daemon)(1)

# RESOURCES

```[Source code](https://github.com/storaged-project/udisks)```

```[Homepage](https://www.freedesktop.org/wiki/Software/udisks/)```

```[Documentation](https://storaged.org/doc/udisks2-api/latest/)```

<!-- verified: 2026-11-09 -->
