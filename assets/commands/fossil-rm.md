# TAGLINE

schedule files for removal

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

**fossil rm** schedules files for removal from the repository on the next commit. By default, files remain on disk and are only removed from version control.

The **--hard** option deletes files from both the repository and the filesystem. This is useful for cleaning up unwanted files while also removing them from version control.

Unlike **fossil forget**, which only works on files not yet committed, **fossil rm** handles files already tracked in the repository.

# SEE ALSO

[fossil-add](/man/fossil-add)(1), [fossil-forget](/man/fossil-forget)(1)

