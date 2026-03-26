# TAGLINE

resizes NTFS filesystems without data loss

# TLDR

**Show current size and minimum shrinkable size**

```sudo ntfsresize --info /dev/[sda1]```

**Perform a dry run** of resizing to a specific size

```sudo ntfsresize --no-action --size [50G] /dev/[sda1]```

**Resize to a specific size**

```sudo ntfsresize --size [50G] /dev/[sda1]```

**Expand filesystem** to fill the current partition

```sudo ntfsresize --expand /dev/[sda1]```

**Check if a device is ready** to be resized

```sudo ntfsresize --check /dev/[sda1]```

**Force resize** bypassing consistency check prompts

```sudo ntfsresize --force --size [50G] /dev/[sda1]```

# SYNOPSIS

**ntfsresize** [_options_] **--info**(**-mb-only**) _device_
**ntfsresize** [_options_] [**--size** _size_[**k**|**M**|**G**]] _device_

# PARAMETERS

**-i**, **--info**
> Show volume size and the smallest shrunken size supported.

**-m**, **--info-mb-only**
> Like --info but only print the shrinkable size in MB.

**-s**, **--size** _SIZE_[**k**|**M**|**G**]
> Resize filesystem to SIZE. Modifiers: k (10^3), M (10^6), G (10^9).

**-x**, **--expand**
> Expand the filesystem to the current partition size.

**-c**, **--check**
> Check the device is ready to be resized without making changes.

**-n**, **--no-action**
> Perform a test run without making changes (read-only).

**-f**, **--force**
> Force operation even if the filesystem is marked for consistency check. Use twice (-ff) to skip all safety checks.

**-b**, **--bad-sectors**
> Support disks with bad sectors that would otherwise be refused.

**-P**, **--no-progress-bar**
> Disable the progress bar.

**-v**, **--verbose**
> Increase output verbosity.

**-V**, **--version**
> Display version number and exit.

**-h**, **--help**
> Display help message and exit.

# DESCRIPTION

**ntfsresize** safely resizes NTFS filesystems without data loss or prior defragmentation. It can shrink or expand volumes on unmounted devices.

**For shrinking:** First resize the filesystem with ntfsresize, then shrink the partition with fdisk or parted.

**For enlarging:** First expand the partition, then use ntfsresize to grow the filesystem (or use --expand).

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

The volume must be unmounted before resizing. Back up important data first. Partition resize is a separate step. After resizing, Windows will schedule a consistency check (chkdsk) on next boot. Running from a Live USB is recommended.

# HISTORY

ntfsresize is part of **ntfs-3g**, developed by **Szabolcs Szakacsits** and others, providing safe NTFS resizing on Linux.

# SEE ALSO

[ntfs-3g](/man/ntfs-3g)(8), [ntfsfix](/man/ntfsfix)(8), [parted](/man/parted)(8), [fdisk](/man/fdisk)(8)
