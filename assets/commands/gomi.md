# TAGLINE

Trash CLI tool written in Go

# TLDR

**Move files to trash**

```gomi [file1] [file2]```

**Interactively restore a file from trash**

```gomi -r```

**List trash contents**

```gomi -l```

**Empty the trash permanently**

```gomi --empty```

# SYNOPSIS

**gomi** [_options_] _files_

# PARAMETERS

_FILES_
> Files or directories to move to trash.

**-r**, **--restore**
> Interactively select and restore files from trash.

**-l**, **--list**
> List all files currently in the trash.

**--empty**
> Permanently delete all files in the trash.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**gomi** is a trash CLI written in Go that moves files to a trash directory instead of permanently deleting them. It provides an undo mechanism for file deletion with an interactive fuzzy-finder restore interface powered by fzf-style selection.

The tool uses the XDG Trash specification on Linux and integrates with system trash on macOS. Files can be restored to their original location through the interactive restore interface.

# CAVEATS

Trashed files still consume disk space until the trash is emptied. Behavior differs from `rm` which permanently deletes files. Cross-filesystem trashing may copy files instead of moving them. Trash should be emptied periodically to reclaim space.

# SEE ALSO

[rm](/man/rm)(1), [trash-cli](/man/trash-cli)(1)
