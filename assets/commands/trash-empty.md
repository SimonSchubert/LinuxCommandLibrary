# TAGLINE

Permanently empty the trash

# TLDR

**Empty all trashed files**

```trash-empty```

**Empty files trashed more than N days ago**

```trash-empty [days]```

**Skip the confirmation prompt**

```trash-empty -f```

**Empty trash on a specific volume**

```trash-empty --trash-dir=[/path/to/.Trash]```

# SYNOPSIS

**trash-empty** [_options_] [_days_]

# PARAMETERS

_days_
> Only delete files trashed more than the given number of days ago.

**-f**
> Don't ask for confirmation before deleting.

**-i**, **--interactive**
> Prompt before deleting each file.

**--trash-dir** _DIR_
> Empty a specific trash directory instead of the default per-user/per-volume locations.

**-v**, **--verbose**
> List files as they are deleted.

**--dry-run**
> Show what would be deleted without actually removing anything.

**-h**, **--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**trash-empty** is part of the **trash-cli** suite and permanently removes files from the trash. Without arguments it empties all trashed files. When given a number of days, only files trashed earlier than that threshold are removed, allowing periodic clean-up via cron while keeping recent items recoverable.

It operates on the standard FreeDesktop.org trash locations, including per-user and per-volume trash directories.

# SEE ALSO

[trash](/man/trash)(1), [trash-list](/man/trash-list)(1), [trash-restore](/man/trash-restore)(1)
