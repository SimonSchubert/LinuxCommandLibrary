# TAGLINE

Trash CLI written in Go

# TLDR

**Move to trash**

```gomi [file.txt]```

**Restore file**

```gomi -r```

**List trash contents**

```gomi -l```

**Empty trash**

```gomi --empty```

# SYNOPSIS

**gomi** [_options_] _files_

# PARAMETERS

_FILES_
> Files to move to trash.

**-r**, **--restore**
> Interactive restore.

**-l**, **--list**
> List trash contents.

**--empty**
> Empty the trash.

**--help**
> Display help information.

# DESCRIPTION

**gomi** is a trash CLI written in Go that moves files to a trash directory instead of permanently deleting them. It implements the FreeDesktop.org trash specification, providing an undo mechanism for file deletion.

The tool enables recovery of accidentally deleted files through an interactive restore interface and provides trash management commands for listing and emptying.

# CAVEATS

Files still use disk space. Different from rm. Trash may need periodic cleaning.

# HISTORY

gomi was created as a Go implementation of a trash-cli alternative with a focus on simplicity.

# SEE ALSO

[rm](/man/rm)(1), [trash-cli](/man/trash-cli)(1)
