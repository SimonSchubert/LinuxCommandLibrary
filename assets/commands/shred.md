# TLDR

**Securely delete a file**

```shred [file]```

**Shred and remove the file**

```shred -u [file]```

**Shred with specific number of passes**

```shred -n [5] [file]```

**Shred and zero-fill at end** (hide shredding)

```shred -z [file]```

**Shred verbosely** (show progress)

```shred -v [file]```

**Shred multiple files**

```shred -u [file1] [file2] [file3]```

**Shred a disk partition** (dangerous)

```sudo shred -v /dev/[sdX]```

# SYNOPSIS

**shred** [_options_] _file_...

# PARAMETERS

**-u**, **--remove**
> Truncate and remove file after overwriting

**-n** _N_, **--iterations**=_N_
> Overwrite N times (default: 3)

**-z**, **--zero**
> Add final overwrite with zeros to hide shredding

**-v**, **--verbose**
> Show progress

**-f**, **--force**
> Change permissions if necessary to allow writing

**-s** _N_, **--size**=_N_
> Shred only first N bytes (suffixes K, M, G accepted)

**--random-source**=_FILE_
> Get random bytes from FILE

**-x**, **--exact**
> Do not round file sizes up to full block

# DESCRIPTION

**shred** overwrites files to make them harder to recover, then optionally deletes them. It writes random patterns multiple times over the file data, attempting to destroy information at the physical level.

By default, shred performs 3 passes of random overwrites. Adding **-z** performs a final pass with zeros, which makes the shredding less obvious (the file looks simply zeroed rather than deliberately destroyed).

Shred can be used on regular files or entire devices (disk partitions). For devices, it overwrites all data on the device.

The **-u** option removes the file after shredding, including attempting to rename it to disguise the original filename before unlinking.

# CAVEATS

**Journaling filesystems**: On ext3, ext4, ReiserFS, and others, shred may not be effective because the filesystem may write data elsewhere before overwriting. Only the current location is shredded.

**Copy-on-write filesystems**: On Btrfs, ZFS, and similar, shred is ineffective as old data remains in previous snapshots.

**SSD and flash storage**: Wear leveling means data isn't overwritten in place. Use manufacturer's secure erase commands or full-disk encryption instead.

**RAID**: Striping and mirroring complicate secure deletion. Data may remain on individual disks.

**For maximum security**, use full-disk encryption from the start; then destroying the key makes all data unrecoverable regardless of filesystem or storage type.

# SEE ALSO

[rm](/man/rm)(1), [wipe](/man/wipe)(1), [srm](/man/srm)(1), [dd](/man/dd)(1)
