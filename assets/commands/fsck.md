# TAGLINE

filesystem check and repair utility

# TLDR

**Check** filesystem

```sudo fsck /dev/sdXN```

Check with **interactive** repair

```sudo fsck -r /dev/sdXN```

**Automatically** repair without prompting

```sudo fsck -a /dev/sdXN```

Check **all** filesystems from /etc/fstab

```sudo fsck -A```

**Force** check even if clean

```sudo fsck -f /dev/sdXN```

Show **progress**

```sudo fsck -C /dev/sdXN```

# SYNOPSIS

**fsck** [_-sAVRTMNP_] [_-t fstype_] [_filesystem_...] [_--_] [_fs-specific-options_]

# DESCRIPTION

**fsck** checks and repairs Linux filesystems. It is a front-end that calls filesystem-specific checking utilities (fsck.ext4, fsck.xfs, etc.). The filesystem should be unmounted when running fsck.

# PARAMETERS

**-a**
> Automatically repair without prompting

**-A**
> Check all filesystems listed in /etc/fstab

**-C [FD]**
> Show progress bar

**-f**
> Force check even if filesystem seems clean

**-M**
> Do not check mounted filesystems

**-N**
> Dry run - show what would be done

**-P**
> Check filesystems in parallel (with -A)

**-R**
> Skip root filesystem (with -A)

**-r**
> Interactive repair mode

**-s**
> Serialize fsck operations

**-T**
> Do not show title on startup

**-t TYPE**
> Specify filesystem type

**-V**
> Verbose output

**-y**
> Answer "yes" to all questions

**-n**
> Answer "no" to all questions (read-only check)

# CONFIGURATION

**/etc/fstab**
> Defines which filesystems are checked with the -A option and in what order (pass field).

# CAVEATS

Never run fsck on a mounted filesystem (except in read-only mode). Automatic repair (**-a** or **-y**) may cause data loss. Always backup important data before repair.

# HISTORY

**fsck** is part of **util-linux**, providing a unified interface for filesystem checking across different filesystem types.

# SEE ALSO

[e2fsck](/man/e2fsck)(8), [xfs_repair](/man/xfs_repair)(8), [mount](/man/mount)(8), [fstab](/man/fstab)(5)
