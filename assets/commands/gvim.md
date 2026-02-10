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

**--help**
> Display help information.

# DESCRIPTION

**gvim** is the GUI version of Vim. It provides all Vim functionality with graphical menus, mouse support, and system clipboard integration.

The editor supports the same commands and plugins as terminal Vim. It offers visual features like toolbar, scrollbars, and configurable fonts.

# CAVEATS

Requires X11/Wayland or Windows GUI. Larger memory footprint than vim. GUI features configurable in .gvimrc.

# HISTORY

gvim was developed as part of **Vim** by **Bram Moolenaar** to provide a graphical interface for the editor.

# SEE ALSO

[vim](/man/vim)(1), [vi](/man/vi)(1), [nvim](/man/nvim)(1)
