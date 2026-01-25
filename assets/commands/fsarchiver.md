# TLDR

**Save filesystem to archive**

```sudo fsarchiver savefs [archive.fsa] [/dev/sda1]```

**Restore filesystem from archive**

```sudo fsarchiver restfs [archive.fsa] id=0,dest=[/dev/sda1]```

**Save multiple filesystems**

```sudo fsarchiver savefs [archive.fsa] [/dev/sda1] [/dev/sda2]```

**List archive contents**

```fsarchiver archinfo [archive.fsa]```

**Save with compression**

```sudo fsarchiver savefs -z9 [archive.fsa] [/dev/sda1]```

**Save with encryption**

```sudo fsarchiver savefs -c [password] [archive.fsa] [/dev/sda1]```

# SYNOPSIS

**fsarchiver** _command_ [_options_] _archive_ [_filesystem_...]

# PARAMETERS

**savefs**
> Save filesystem(s) to archive.

**restfs**
> Restore filesystem from archive.

**archinfo**
> Show archive information.

**probe**
> Show detected filesystems.

**-z** _level_
> Compression level (0-9).

**-j** _jobs_
> Parallel compression jobs.

**-c** _password_
> Encrypt archive.

**-v**
> Verbose output.

**-A**
> Allow restoring to smaller filesystem.

# DESCRIPTION

**fsarchiver** saves and restores filesystems to/from archive files. Unlike tar, it preserves filesystem attributes, ACLs, extended attributes, and can restore to different sized partitions.

The tool works at the filesystem level, saving used blocks only. It supports ext2/3/4, XFS, Btrfs, NTFS, and other filesystems, with optional compression and encryption.

# CAVEATS

Filesystems must be unmounted for reliable backup. Different filesystem types can be restored if target supports features. Restoration may change UUIDs. Archive corruption protection with checksums.

# HISTORY

fsarchiver was created by **Francois Dupoux** as a more flexible alternative to partition imaging tools like partimage. It was designed to overcome limitations of block-level backup by working at the filesystem level.

# SEE ALSO

[partclone](/man/partclone)(8), [tar](/man/tar)(1), [dd](/man/dd)(1), [rsync](/man/rsync)(1)
