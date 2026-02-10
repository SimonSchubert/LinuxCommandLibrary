# TAGLINE

mounts or unmounts SteamOS filesystem partitions, used primarily for accessing

# TLDR

**Mount** all necessary partitions from a device to a target directory

```sudo mount.steamos [/dev/sdX] [/mnt]```

Mount with options to **exclude specific partitions** (e.g. /home, overlays)

```sudo mount.steamos -o nohome,nooverlay [/dev/sdX] [/mnt]```

**Unmount** all partitions mounted under a target directory

```sudo mount.steamos -u [/mnt]```

Display **help**

```mount.steamos -h```

# SYNOPSIS

**mount.steamos** [_options_] _device_ _mountpoint_

# PARAMETERS

**-o, --options _opts_**
> Mount options (nohome, nooverlay, etc.)

**-u, --unmount**
> Unmount all partitions under the specified directory

**-h, --help**
> Display help information

# DESCRIPTION

**mount.steamos** mounts or unmounts SteamOS filesystem partitions, used primarily for accessing Steam Deck storage when booted from another operating system or recovery media.

SteamOS uses a complex partition layout with multiple overlays for system updates and user data separation. This tool handles the specific mount requirements, including the A/B root partitions, overlay filesystems, and home directory.

The command simplifies what would otherwise require multiple mount commands with specific options for each partition.

# CAVEATS

Requires root privileges. Designed specifically for SteamOS partition layouts (Steam Deck). The device should be a complete disk device (e.g., /dev/sda), not individual partitions. Ensure SteamOS is not running when mounting its partitions from another system.

# SEE ALSO

[mount](/man/mount)(8), [steamos-dump-info](/man/steamos-dump-info)(1), [umount](/man/umount)(8)
