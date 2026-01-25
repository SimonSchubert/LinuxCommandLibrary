# TLDR

**Show current size and minimum**

```ntfsresize --info /dev/[sda1]```

**Resize to specific size**

```ntfsresize --size [50G] /dev/[sda1]```

**Shrink to minimum**

```ntfsresize --size [$(ntfsresize -i /dev/sda1 | grep minimum)] /dev/[sda1]```

**Dry run**

```ntfsresize --no-action --size [50G] /dev/[sda1]```

**Force resize**

```ntfsresize --force --size [50G] /dev/[sda1]```

# SYNOPSIS

**ntfsresize** [_options_] _device_

# PARAMETERS

**-i**, **--info**
> Show volume information.

**-s**, **--size** _size_
> New size (K, M, G suffixes).

**-n**, **--no-action**
> Dry run.

**-f**, **--force**
> Force operation.

**-b**, **--bad-sectors**
> Handle bad sectors.

**-P**, **--no-progress**
> Disable progress bar.

# DESCRIPTION

**ntfsresize** resizes NTFS filesystems without data loss. It can shrink or expand volumes, showing the minimum possible size before shrinking.

After resizing, the partition table must be updated separately (using fdisk/parted).

# TYPICAL WORKFLOW

```bash
# 1. Check filesystem
ntfsfix /dev/sda1

# 2. Get info
ntfsresize --info /dev/sda1

# 3. Resize filesystem
ntfsresize --size 50G /dev/sda1

# 4. Resize partition (separate step)
parted /dev/sda resizepart 1 50G
```

# CAVEATS

Unmount before resizing. Back up important data. Partition resize is separate step. Run from Live USB recommended.

# HISTORY

ntfsresize is part of **ntfs-3g**, developed by **Szabolcs Szakacsits** and others, providing safe NTFS resizing on Linux.

# SEE ALSO

[ntfs-3g](/man/ntfs-3g)(8), [parted](/man/parted)(8), [fdisk](/man/fdisk)(8), [gparted](/man/gparted)(8)
