# TAGLINE

creates Windows-Linux user mappings

# TLDR

**Create user mapping**

```ntfs-3g.usermap [/dev/sda1]```

**Map to specific file**

```ntfs-3g.usermap [/dev/sda1] > [UserMapping]```

**Interactive mode**

```ntfs-3g.usermap -i [/dev/sda1]```

# SYNOPSIS

**ntfs-3g.usermap** [_options_] _device_

# PARAMETERS

_DEVICE_
> NTFS partition.

**-i**
> Interactive mode.

**--help**
> Display help information.

# DESCRIPTION

**ntfs-3g.usermap** creates Windows-Linux user mappings. Maps SIDs to UIDs.

The tool generates UserMapping file. Used for permission mapping.

# CAVEATS

Part of ntfs-3g. Creates .NTFS-3G/UserMapping. Manual editing possible.

# HISTORY

ntfs-3g.usermap provides **user identity mapping** between Windows and Linux.

# SEE ALSO

[ntfs-3g](/man/ntfs-3g)(1), [ntfs-3g.secaudit](/man/ntfs-3g.secaudit)(1)

