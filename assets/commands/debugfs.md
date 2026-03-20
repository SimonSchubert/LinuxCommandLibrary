# TAGLINE

interactive debugger for ext2/ext3/ext4 filesystems

# TLDR

Open filesystem in **read-only** mode

```debugfs [/dev/sdXN]```

Open filesystem in **read-write** mode

```debugfs -w [/dev/sdXN]```

Read commands from **file**

```debugfs -f [path/to/cmd_file] [/dev/sdXN]```

Execute a **single command** and exit

```debugfs -R "stats" [/dev/sdXN]```

**List deleted** inodes (interactive)

```lsdel```

**Recover** a deleted inode to a file (interactive)

```dump <[inode_number]> [/path/to/output]```

# SYNOPSIS

**debugfs** [_options_] [_device_]

# DESCRIPTION

**debugfs** is an interactive debugger for ext2/ext3/ext4 filesystems. It allows direct manipulation of filesystem structures, which is useful for data recovery, analysis, and troubleshooting.

Can be used to recover deleted files, examine inodes, and manually fix filesystem issues.

# PARAMETERS

**-w**
> Open in read-write mode (default is read-only)

**-c**
> Open in catastrophic mode (inode and group bitmaps not read initially, forces read-only)

**-n**
> Disable metadata checksum verification

**-f** _cmd_file_
> Read and execute commands from file, then exit

**-R** _request_
> Execute a single command and exit

**-b** _blocksize_
> Force a specific block size in bytes instead of auto-detecting

**-s** _superblock_
> Read superblock from the given block number (requires -b)

**-i**
> Treat device as an ext2 image file created by e2image

**-D**
> Open device using Direct I/O, bypassing the buffer cache

**-z** _undo_file_
> Write old block contents to an undo file before overwriting (for use with e2undo)

# INTERACTIVE COMMANDS

**stats**
> Show filesystem statistics

**ls** _dir_
> List directory contents

**cat** _file_
> Display file contents

**lsdel**
> List deleted inodes

**undel** _<inode>_ _[pathname]_
> Undelete inode and optionally link to pathname

**dump** _inode_ _file_
> Dump inode contents to a file

**ncheck** _inode_
> Translate inode numbers to pathnames

**icheck** _block_
> Translate block numbers to inodes

**logdump**
> Dump ext3/ext4 journal contents

# CAVEATS

Requires root privileges. Use with extreme caution in write mode. Unmount filesystem before making changes. Improper use can cause data loss.

# SEE ALSO

[e2fsck](/man/e2fsck)(8), [dumpe2fs](/man/dumpe2fs)(8), [tune2fs](/man/tune2fs)(8)
