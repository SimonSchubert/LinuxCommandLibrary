# TLDR

**Add a file**

```fossil add [file]```

**Add all new files**

```fossil add .```

**Add with dry run**

```fossil add --dry-run [file]```

**Add ignoring binary detection**

```fossil add --dotfiles [file]```

# SYNOPSIS

**fossil** **add** [_options_] _file_...

# PARAMETERS

**--dry-run**
> Show what would be added.

**--dotfiles**
> Include dotfiles.

**--ignore**
> Files to ignore.

**-f**, **--force**
> Add even if ignored.

# DESCRIPTION

**fossil add** schedules files to be added to the repository on the next commit. Files must be committed after adding.

# SEE ALSO

[fossil-commit](/man/fossil-commit)(1), [fossil-rm](/man/fossil-rm)(1)

