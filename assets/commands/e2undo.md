# TAGLINE

replay ext filesystem undo logs

# TLDR

Display **undo file info**

```e2undo -h [path/to/undo_file] [/dev/sdXN]```

**Dry run** showing candidate blocks

```e2undo -nv [path/to/undo_file] [/dev/sdXN]```

Perform **undo operation**

```e2undo [path/to/undo_file] [/dev/sdXN]```

Perform undo with **verbose output**

```e2undo -v [path/to/undo_file] [/dev/sdXN]```

Create **backup undo file** before overwriting

```e2undo -z [path/to/file.e2undo] [path/to/undo_file] [/dev/sdXN]```

# SYNOPSIS

**e2undo** [_options_] _undo-file_ _device_

# DESCRIPTION

**e2undo** replays undo logs for ext2/ext3/ext4 filesystems. This can reverse a failed or unwanted operation by e2fsprogs tools like e2fsck, resize2fs, or tune2fs, providing a safety mechanism for filesystem modifications.

Undo files are created when these tools are run with the -z option. The undo file records all blocks modified during the operation, allowing precise rollback to the pre-operation state. This is particularly valuable when testing filesystem modifications or recovering from interrupted operations.

# PARAMETERS

**-h**
> Display undo file information

**-n**
> Dry run, don't modify filesystem

**-v**
> Verbose output

**-z** _file_
> Create backup undo file

# CAVEATS

Requires undo file created with -z option. Part of e2fsprogs. Filesystem must be unmounted.

# SEE ALSO

[e2fsck](/man/e2fsck)(8), [tune2fs](/man/tune2fs)(8), [resize2fs](/man/resize2fs)(8)
