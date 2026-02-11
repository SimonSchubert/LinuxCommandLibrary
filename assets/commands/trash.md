# TAGLINE

Move files to recoverable trash

# TLDR

**Send** a file to the trash

```trash [path/to/file]```

**List** all files in the trash

```trash-list```

**Interactively restore** a file from the trash

```trash-restore```

**Empty** the trash

```trash-empty```

Permanently delete files older than **10 days**

```trash-empty 10```

**Remove** files matching a pattern from trash

```trash-rm "*.o"```

Remove files with a **specific original location**

```trash-rm /[path/to/file_or_directory]```

# SYNOPSIS

**trash** [_options_] _file_...

**trash-list**

**trash-restore**

**trash-empty** [_days_]

**trash-rm** _pattern_

# PARAMETERS

**trash** _files_
> Move files to trash (alias: trash-put)

**trash-list**
> List files in trash with original path and deletion date

**trash-restore**
> Interactively restore files from trash

**trash-empty** [_days_]
> Empty trash, optionally only files older than days

**trash-rm** _pattern_
> Remove files from trash matching pattern or original path

**-d**, **--directory**
> Remove empty directories

**-f**, **--force**
> Ignore nonexistent files

**-v**, **--verbose**
> Explain what is being done

**--trash-dir** _dir_
> Use specified trash directory

# DESCRIPTION

**trash-cli** is a command-line interface to the FreeDesktop.org Trash specification, providing a safer alternative to rm by moving files to a recoverable trash location instead of permanent deletion. The trash follows XDG standards and integrates with desktop file managers.

Files can be restored to their original location using trash-restore, which presents an interactive menu of trashed items. The trash-empty command permanently deletes items from the trash, with optional age filtering.

# CAVEATS

Trashing files on external drives creates a .Trash directory on that drive. Disk space is not freed until trash is emptied. Files trashed from command line may not appear in desktop trash depending on file manager implementation.

# HISTORY

Developed by **Andrea Francia** as a command-line implementation of the FreeDesktop.org Trash specification. Provides Unix philosophy-compliant access to desktop trash functionality, enabling safe deletion practices in terminal workflows.

# SEE ALSO

[rm](/man/rm)(1), [gio-trash](/man/gio-trash)(1), [trashy](/man/trashy)(1)
