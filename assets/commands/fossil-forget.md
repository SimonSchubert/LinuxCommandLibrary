# TAGLINE

untrack files without deleting them

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

**fossil forget** removes files from source control but leaves them in the working directory. This is useful when you've added files by mistake and want to untrack them without deleting them.

Unlike **fossil rm** or **fossil delete**, forgotten files remain on disk untouched. The command only affects the staging area, removing the scheduled addition of files that haven't been committed yet.

# SEE ALSO

[fossil-rm](/man/fossil-rm)(1), [fossil-add](/man/fossil-add)(1)

