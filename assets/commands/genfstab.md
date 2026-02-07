# TAGLINE

/etc/fstab generator from mounted filesystems

# TLDR

Generate **/etc/fstab** using volume UUIDs during Arch installation

```genfstab -U /mnt >> /mnt/etc/fstab```

Display fstab-compatible output based on volume **labels**

```genfstab -L [path/to/mount_point]```

Display fstab-compatible output based on volume **UUIDs**

```genfstab -U [path/to/mount_point]```

Display fstab-compatible output based on **specified identifier**

```genfstab -t [LABEL|UUID|PARTLABEL|PARTUUID]```

**Append** a volume into /etc/fstab for automatic mounting

```genfstab -U [path/to/mount_point] | sudo tee -a /etc/fstab```

# SYNOPSIS

**genfstab** [_options_] _root_

# PARAMETERS

**-U**
> Use UUIDs for source identifiers

**-L**
> Use filesystem labels for source identifiers

**-t** _TAG_
> Use specified tag: LABEL, UUID, PARTLABEL, or PARTUUID

**-p**
> Exclude pseudofs mounts (default)

**-P**
> Include pseudofs mounts

**-f** _FILE_
> Use specified fstab file as base

# DESCRIPTION

**genfstab** generates output suitable for an /etc/fstab file by detecting mounted filesystems under a given root directory. It's primarily used during Arch Linux installation to create the fstab file for a new system.

The tool reads mount information from /proc/self/mountinfo and outputs proper fstab entries with the appropriate source identifiers (UUID, LABEL, etc.), mount points adjusted relative to the specified root, filesystem types, and mount options.

Using UUIDs (**-U**) is recommended as they remain stable across hardware changes, unlike device names like /dev/sda1 which can change.

# CAVEATS

Must be run with appropriate permissions to read mount information. The target filesystems must be mounted before running genfstab. Verify the output before writing to /etc/fstab, as incorrect entries can prevent system boot.

# HISTORY

genfstab is part of the **arch-install-scripts** package, developed for Arch Linux installation. It simplifies fstab creation, which was traditionally done manually or with less reliable methods. The tool has been adopted by other Arch-based distributions.

# SEE ALSO

[mount](/man/mount)(8), [fstab](/man/fstab)(5), [blkid](/man/blkid)(8), [lsblk](/man/lsblk)(8)
