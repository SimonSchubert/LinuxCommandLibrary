# TAGLINE

stage files for version control

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

**fossil add** schedules files to be added to the repository on the next commit. Unlike some version control systems, adding files in Fossil simply marks them for inclusion - they won't appear in the repository until committed.

The command supports glob patterns and can recursively add directories. Dotfiles are ignored by default unless explicitly specified. Binary files are detected automatically and handled appropriately.

# SEE ALSO

[fossil-commit](/man/fossil-commit)(1), [fossil-rm](/man/fossil-rm)(1)

