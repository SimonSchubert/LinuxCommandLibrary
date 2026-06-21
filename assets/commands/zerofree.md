# TAGLINE

zero free blocks on ext2/3/4 filesystems

# TLDR

Zero the free blocks of an **unmounted** filesystem

```sudo zerofree /dev/[sda1]```

Show **progress** while clearing

```sudo zerofree -v /dev/[sda1]```

**Dry run**: count non-zero free blocks without writing

```sudo zerofree -n /dev/[sda1]```

Remount the **root** filesystem read-only first, then clear

```sudo mount -o remount,ro / && sudo zerofree /dev/[sda1]```

# SYNOPSIS

**zerofree** [_OPTIONS_] _device_

# PARAMETERS

**-n**
> Dry run: report how many free blocks are non-zero without writing anything.

**-v**
> Verbose: print progress as a percentage while clearing.

**-f** _fillval_
> Fill free blocks with the byte value fillval (0-255) instead of zero.

# DESCRIPTION

**zerofree** scans an ext2, ext3, or ext4 filesystem and overwrites every unallocated block that is not already zero with zeros (or a chosen fill byte). Data in allocated files is left untouched.

Zeroing free space is mainly useful before imaging or compressing a disk. A virtual machine image or sparse file shrinks dramatically once its free blocks are zero, and the unused space can then be reclaimed by the host or by sparse-aware tools.

The target filesystem must be unmounted or mounted read-only, since zerofree reads and writes the block device directly and cannot run safely while the kernel is also modifying it.

# CAVEATS

The filesystem must not be mounted read-write. Run zerofree from a live/rescue environment, or remount the device read-only first (the root filesystem usually needs single-user or recovery mode). Only ext2/3/4 are supported. Zeroing is not a secure erase; it only makes free space compress well. Use **shred** or **blkdiscard** to destroy previously written data.

# HISTORY

**zerofree** was written by Ron Yorston to help shrink User-Mode Linux and virtual machine disk images. It is packaged as **zerofree** on most distributions.

# SEE ALSO

[e2fsck](/man/e2fsck)(8), [fstrim](/man/fstrim)(8), [blkdiscard](/man/blkdiscard)(8), [shred](/man/shred)(1)
