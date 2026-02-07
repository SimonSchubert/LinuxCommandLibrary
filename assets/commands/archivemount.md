# TAGLINE

Mount archive files as virtual filesystems via FUSE

# TLDR

**Mount** an archive to a specific mountpoint

```archivemount [path/to/archive] [path/to/mount_point]```

Mount an archive as **read-only**

```archivemount -o readonly [path/to/archive] [path/to/mount_point]```

**Unmount** the archive filesystem

```fusermount -u [path/to/mount_point]```

# SYNOPSIS

**archivemount** [_options_] _archive_ _mountpoint_

# DESCRIPTION

**archivemount** is a FUSE-based filesystem that mounts archives as virtual directories. It supports a wide variety of archive formats including tar, zip, cpio, ISO 9660, and compressed variants (gzip, bzip2, xz, lzma).

Once mounted, the archive contents can be accessed like a normal directory. This is useful for browsing or extracting specific files from large archives without fully extracting them.

# PARAMETERS

**-o readonly**
> Mount the archive as read-only

**-o nosave**
> Do not save changes to the archive when unmounting

**-o nobackup**
> Do not create a backup before modifying the archive

**-f**
> Run in foreground (do not daemonize)

# CAVEATS

Write support is experimental and may not work reliably with all archive formats. Modifications are buffered in memory and only written when unmounting, which can consume significant RAM for large changes. The archive format must be supported by libarchive.

# HISTORY

**archivemount** was created as part of the FUSE ecosystem to provide transparent access to archive contents. It leverages **libarchive** for format support and has been available since the mid-2000s.

# SEE ALSO

[fusermount](/man/fusermount)(1), [tar](/man/tar)(1), [mount](/man/mount)(8)
