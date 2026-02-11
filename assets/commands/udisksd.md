# TAGLINE

Storage device management D-Bus daemon

# TLDR

**Daemon is started automatically by D-Bus or systemd**

```udisksd```

**Run with debug output**

```udisksd --debug```

**Run without replacing existing instance**

```udisksd --no-replace```

**Run without LUKS support**

```udisksd --no-cryptsetup```

# SYNOPSIS

**udisksd** [_options_]

# PARAMETERS

**--debug**
> Enable debug output.

**--no-replace**
> Don't replace existing daemon instance.

**--no-cryptsetup**
> Disable LUKS cryptographic volume support.

**--no-sigint**
> Don't exit on SIGINT for debugging.

**--force-load-modules**
> Load kernel modules even if not needed.

**-h**, **--help**
> Display help.

**--version**
> Display version.

# DESCRIPTION

**udisksd** is the system daemon for udisks2, providing D-Bus interfaces for managing storage devices. It handles mounting, unmounting, formatting, partitioning, and LUKS encryption operations without requiring root privileges for each action.

The daemon monitors udev events to track device changes and exposes device information through the org.freedesktop.UDisks2 D-Bus interface. Desktop environments and applications use this interface for storage management.

Users should not start udisksd manually; it's automatically activated by D-Bus or systemd when applications access its interfaces. Access control uses polkit, allowing logged-in users to manage devices on their session's seat.

# CAVEATS

Requires polkit for access control. Automatic mounting depends on desktop environment integration. Debug mode produces verbose output. Some features require specific kernel modules.

# HISTORY

**udisksd** evolved from the original udisks project (DeviceKit-disks) created for modern Linux desktop storage management. The udisks2 rewrite improved the API and added features like LUKS support. It's now maintained as part of the storaged project and is a core component of most Linux desktop environments.

# SEE ALSO

[udisksctl](/man/udisksctl)(1), [polkit](/man/polkit)(8), [mount](/man/mount)(8), [udevadm](/man/udevadm)(8)
