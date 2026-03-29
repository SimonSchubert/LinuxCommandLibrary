# TAGLINE

GUI version of Vim

# TLDR

**Open file in GUI vim**

```gvim [file]```

**Open multiple files in tabs**

```gvim -p [file1] [file2]```

**Open in read-only mode**

```gvim -R [file]```

**Open with diff mode**

```gvim -d [file1] [file2]```

**Open at specific line**

```gvim +[42] [file]```

**Open in foreground (do not fork)**

```gvim -f [file]```

**Execute a command after opening a file**

```gvim -c "[%s/foo/bar/g]" [file]```

# SYNOPSIS

**gvim** [_options_] [_files_]

# PARAMETERS

_FILES_
> Files to edit.

**-p**
> Open files in tabs.

**-o**
> Open files in horizontal splits.

**-O**
> Open files in vertical splits.

**-R**
> Read-only mode.

**-d**
> Diff mode.

**+** _NUM_
> Start at line number.

**-c** _CMD_
> Execute command after start.

**-f**, **--nofork**
> Run in foreground, do not fork and detach from the shell.

**-g**
> Start in GUI mode (used when calling as vim -g).

**-u** _FILE_
> Use specified vimrc file for initialization instead of default.

**-U** _FILE_
> Use specified gvimrc file for GUI initialization.

**-N**
> No-compatible mode. Resets the 'compatible' option.

**-geometry** _GEOM_
> Set initial window geometry (e.g., 80x25+0+0).

**--**
> End of options. Arguments after this are treated as file names.

**--help**
> Display help information.

# DESCRIPTION

**gvim** is the GUI version of Vim. It provides all Vim functionality with graphical menus, mouse support, and system clipboard integration.

The editor supports the same commands and plugins as terminal Vim. It offers visual features like toolbar, scrollbars, and configurable fonts. By default, gvim forks and detaches from the launching shell; use -f or --nofork to run in the foreground.

# CAVEATS

Requires X11/Wayland or Windows GUI. Larger memory footprint than vim. GUI features configurable in .gvimrc.

# HISTORY

gvim was developed as part of **Vim** by **Bram Moolenaar** to provide a graphical interface for the editor.

# SEE ALSO

[vim](/man/vim)(1), [vi](/man/vi)(1), [nvim](/man/nvim)(1), [vimdiff](/man/vimdiff)(1)
