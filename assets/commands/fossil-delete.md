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

**fossil delete** is an alias for fossil rm. Schedules files for removal from the repository on the next commit.

# SEE ALSO

[fossil-rm](/man/fossil-rm)(1), [fossil-add](/man/fossil-add)(1)

