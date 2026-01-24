# TLDR

**Move file to trash**

```trash-put [file]```

**List trashed files**

```trash-list```

**Restore file**

```trash-restore```

**Empty trash**

```trash-empty```

**Remove files older than days**

```trash-empty [30]```

**Remove specific trashed file**

```trash-rm [pattern]```

# SYNOPSIS

**trash-put** _files_
**trash-list**
**trash-restore**
**trash-empty** [_days_]
**trash-rm** _pattern_

# COMMANDS

**trash-put** _FILES_
> Move files to trash.

**trash-list**
> List trashed files.

**trash-restore**
> Interactively restore files.

**trash-empty** [_N_]
> Empty trash (or files older than N days).

**trash-rm** _PATTERN_
> Remove matching trashed files.

# PARAMETERS

**-d**, **--directory**
> Allow trashing directories (trash-put).

**-f**, **--force**
> Ignore nonexistent files.

**-v**, **--verbose**
> Verbose mode.

**--version**
> Show version.

**--help**
> Show help.

# DESCRIPTION

**trash-cli** provides a command-line interface to the FreeDesktop.org trash. It moves files to trash instead of permanently deleting them.

Files are moved to ~/.local/share/Trash following the freedesktop.org specification. Desktop environments can see and restore these files.

Restoration is interactive. trash-restore lists trashed files with numbers, and you select which to restore.

Empty trash permanently deletes trashed files. Age-based emptying removes only old files, keeping recent deletions recoverable.

The tools work with filesystem trash on external drives. Each mounted filesystem has its own trash directory.

Aliasing rm to trash-put provides safer default behavior while maintaining familiar syntax.

# CAVEATS

Trash uses disk space until emptied. Trashing large files fills disk. Doesn't work on filesystems without trash support. Root trash is separate.

# HISTORY

**trash-cli** was created by **Andrea Francia** to provide command-line access to the standard Linux trash. It follows the FreeDesktop.org Trash specification for interoperability.

# SEE ALSO

[rm](/man/rm)(1), [gio](/man/gio)(1), [gvfs-trash](/man/gvfs-trash)(1)
