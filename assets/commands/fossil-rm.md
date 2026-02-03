# TLDR

**Remove a file**

```fossil rm [file]```

**Remove with force**

```fossil rm -f [file]```

**Remove with dry run**

```fossil rm --dry-run [file]```

# SYNOPSIS

**fossil** **rm** [_options_] _file_...

# PARAMETERS

**--dry-run**
> Show what would be removed.

**-f**, **--force**
> Force removal.

**--hard**
> Also delete from disk.

# DESCRIPTION

**fossil rm** schedules files for removal from the repository. By default, files remain on disk. Use --hard to also delete from disk.

# SEE ALSO

[fossil-add](/man/fossil-add)(1), [fossil-forget](/man/fossil-forget)(1)

