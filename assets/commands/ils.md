# TAGLINE

lists inode information from filesystem images

# TLDR

**List inodes**

```ils [image.dd]```

**Show allocated only**

```ils -a [image.dd]```

**Show unallocated only**

```ils -e [image.dd]```

**Specify offset**

```ils -o [2048] [image.dd]```

**Machine output**

```ils -m [image.dd]```

# SYNOPSIS

**ils** [_options_] _image_

# PARAMETERS

_IMAGE_
> Disk or partition image.

**-a**
> Show allocated only.

**-e**
> Show unallocated only.

**-o** _OFFSET_
> Partition offset.

**-m**
> Machine-readable output.

**-f** _FSTYPE_
> Filesystem type.

**--help**
> Display help information.

# DESCRIPTION

**ils** lists inode information from filesystem images. It's part of The Sleuth Kit for digital forensics.

The tool shows inode metadata for allocated and deleted files. It's useful for file recovery and forensic analysis.

# CAVEATS

Part of sleuthkit. Forensic tool. Read-only analysis.

# HISTORY

ils is part of **The Sleuth Kit** by **Brian Carrier** for filesystem forensics.

# INSTALL

```apt: sudo apt install sleuthkit```

```dnf: sudo dnf install sleuthkit```

```pacman: sudo pacman -S sleuthkit```

```apk: sudo apk add sleuthkit```

```zypper: sudo zypper install sleuthkit```

```brew: brew install sleuthkit```

```nix: nix profile install nixpkgs#sleuthkit```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[fls](/man/fls)(1), [mmls](/man/mmls)(1)
