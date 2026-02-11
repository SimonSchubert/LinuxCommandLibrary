# TAGLINE

Access alternate SteamOS partitions

# TLDR

Switch to **other** A/B partition

```steamos-chroot -p other```

Switch to partition on **another drive**

```steamos-chroot -d [/dev/sdX] -p [A|B]```

Display **help**

```steamos-chroot -h```

# SYNOPSIS

**steamos-chroot** [_OPTIONS_]

# PARAMETERS

**-p, --partset** _A|B|other_
> Select partition set (A, B, or the other inactive one)

**-d, --disk** _DEVICE_
> Target a specific disk device

**-h, --help**
> Display help

# DESCRIPTION

**steamos-chroot** switches the root directory in a SteamOS environment, enabling access to the alternate A/B partition or partitions on other drives. SteamOS uses A/B partition schemes for reliable updates, allowing one partition to be updated while the other remains bootable.

This tool is useful for recovery operations, system repair, or accessing files on the inactive partition.

# CAVEATS

Requires root privileges. Changes made in the chroot affect the target partition. Be careful when switching between A/B partitions during an active update.

# HISTORY

**steamos-chroot** is part of the **SteamOS** utilities developed by **Valve** for the Steam Deck. SteamOS 3.0, based on Arch Linux, was released in **2022** with the Steam Deck handheld gaming device.

# SEE ALSO

[steamos-readonly](/man/steamos-readonly)(1), [chroot](/man/chroot)(1)
