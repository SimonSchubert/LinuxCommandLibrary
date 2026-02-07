# TAGLINE

remove files from version control

# TLDR

**Delete a file**

```fossil delete [file]```

**Delete with dry run**

```fossil delete --dry-run [file]```

**Delete with force**

```fossil delete -f [file]```

# SYNOPSIS

**fossil** **delete** [_options_] _file_...

# PARAMETERS

**--dry-run**
> Show what would be deleted.

**-f**, **--force**
> Force delete.

# DESCRIPTION

**fossil delete** is an alias for **fossil rm**. It schedules files for removal from version control on the next commit.

This command is provided for convenience and compatibility. All options and behaviors are identical to **fossil rm**. By default, files remain on disk and are only removed from version control.

# SEE ALSO

[fossil-rm](/man/fossil-rm)(1), [fossil-add](/man/fossil-add)(1)

