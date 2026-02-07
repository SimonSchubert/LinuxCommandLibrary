# TAGLINE

ext3/ext4 file recovery utility

# TLDR

**Restore all** deleted files from partition

```sudo extundelete [/dev/sdXN] --restore-all```

Restore a **specific file**

```extundelete [/dev/sdXN] --restore-file [path/to/file]```

Restore a **specific directory**

```extundelete [/dev/sdXN] --restore-directory [path/to/directory]```

Restore files deleted **after** a date

```extundelete [/dev/sdXN] --restore-all --after [1577840400]```

# SYNOPSIS

**extundelete** _device_ [_options_]

# DESCRIPTION

**extundelete** recovers deleted files from ext3 and ext4 partitions by parsing the filesystem journal. It can restore individual files, directories, or all recoverable files.

Works best when run immediately after deletion before journal wraps.

# PARAMETERS

**--restore-all**
> Restore all recoverable files

**--restore-file** _path_
> Restore specific file

**--restore-directory** _path_
> Restore specific directory

**--after** _time_
> Only restore files deleted after Unix timestamp

**--before** _time_
> Only restore files deleted before timestamp

# CAVEATS

Only works with ext3/ext4 filesystems. Unmount partition before recovery for best results. Paths are relative to filesystem root (no leading /). Recovery success depends on journal state.

# SEE ALSO

[testdisk](/man/testdisk)(8), [photorec](/man/photorec)(8), [debugfs](/man/debugfs)(8)
