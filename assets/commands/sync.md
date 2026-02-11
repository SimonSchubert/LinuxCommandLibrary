# TAGLINE

Flush filesystem buffers to disk

# TLDR

**Flush all file system buffers** to disk

```sync```

**Synchronize a specific file**

```sync [path/to/file]```

**Synchronize data only** (skip metadata)

```sync -d [path/to/file]```

**Synchronize file systems** containing specific files

```sync -f [path/to/file]```

# SYNOPSIS

**sync** [_OPTION_] [_FILE_]...

# PARAMETERS

**-d**, **--data**
> Sync only file data, skip unnecessary metadata

**-f**, **--file-system**
> Sync the file systems containing the specified files

**--help**
> Display help and exit

**--version**
> Output version information and exit

# DESCRIPTION

**sync** flushes file system buffers, forcing changed blocks (dirty pages) to be written to disk. This ensures data currently held in memory is persisted to storage.

Linux buffers write operations in memory for performance, bundling and reordering disk I/O. While efficient, this means an unexpected crash or power loss could result in data loss. sync forces the kernel to write buffered data to disk, ensuring integrity.

When called without arguments, sync flushes all buffers system-wide. With FILE arguments, only those files are synchronized.

# CAVEATS

sync guarantees data reaches the device driver but does not guarantee physical writes to the disk platter or flash memory have completed. For SSDs and some drives with write caching, data may still be in the drive's internal cache. Modern utilities like **umount**, **reboot**, and **shutdown** invoke sync automatically.

# HISTORY

sync has been part of Unix since the early days, ensuring filesystem consistency before shutdown or media removal. Written by Jim Meyering for GNU coreutils. The underlying sync(2) system call has existed since the original Unix.

# SEE ALSO

[fsync](/man/fsync)(2), [umount](/man/umount)(8), [shutdown](/man/shutdown)(8)
