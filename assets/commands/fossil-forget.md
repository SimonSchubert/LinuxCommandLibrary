# TLDR

**Forget a file**

```fossil forget [file]```

**Forget multiple files**

```fossil forget [file1] [file2]```

**Forget with dry run**

```fossil forget --dry-run [file]```

# SYNOPSIS

**fossil** **forget** [_options_] _file_...

# PARAMETERS

**--dry-run**
> Show what would be forgotten.

# DESCRIPTION

**fossil forget** removes files from source control but leaves them in the working directory. Unlike rm/delete, the file itself is not removed from disk.

# SEE ALSO

[fossil-rm](/man/fossil-rm)(1), [fossil-add](/man/fossil-add)(1)

