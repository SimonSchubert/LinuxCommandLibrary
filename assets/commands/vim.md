# TAGLINE

Highly configurable modal text editor

# TLDR

**Open a file in vim**

```vim [file]```

**Open file at specific line**

```vim +[line_number] [file]```

**Open in read-only mode**

```vim -R [file]```

**Open multiple files** in tabs

```vim -p [file1] [file2]```

**Open multiple files** in split windows

```vim -o [file1] [file2]```

**Open and execute command**

```vim -c "[command]" [file]```

**Compare two files** (diff mode)

```vim -d [file1] [file2]```

# SYNOPSIS

**vim** [_options_] [_file_...]

# PARAMETERS

**+** _line_
> Start at specified line number

**+** _command_
> Execute command after loading file

**-c** _command_
> Execute command after loading file

**-R**
> Read-only mode

**-r**
> Recovery mode (recover from swap file)

**-p**
> Open files in tabs

**-o**
> Open files in horizontal splits

**-O**
> Open files in vertical splits

**-d**
> Diff mode

**-b**
> Binary mode

**-x**
> Edit encrypted file

**-u** _vimrc_
> Use specified vimrc file

**-N**
> Not compatible mode (use Vim defaults)

# NORMAL MODE COMMANDS

**Movement**: h/j/k/l (left/down/up/right), w/b (word), 0/$ (line start/end), gg/G (file start/end)
**Editing**: i (insert), a (append), o (new line below), x (delete char), dd (delete line), yy (copy line), p (paste)
**Save/Quit**: :w (save), :q (quit), :wq (save & quit), :q! (quit without saving), ZZ (save & quit)
**Search**: /pattern (search forward), ?pattern (search backward), n/N (next/previous match)
**Undo/Redo**: u (undo), Ctrl+r (redo)

# MODES

**Normal**: Default mode for navigation and commands
**Insert**: Text input (i, a, o, etc.)
**Visual**: Selection (v for char, V for line, Ctrl+v for block)
**Command**: Ex commands (:)
**Replace**: Overwrite text (R)

Press **Esc** to return to Normal mode from any other mode.

# DESCRIPTION

**vim** (Vi IMproved) is a highly configurable text editor built for efficient text editing. It extends the classic vi editor with features like syntax highlighting, visual mode, multiple buffers, and extensive plugin support.

Vim operates primarily through keyboard commands in different modes, enabling powerful text manipulation without leaving the home row. While the learning curve is steep, proficiency enables very fast editing.

Configuration lives in **~/.vimrc** (or ~/.vim/vimrc). Plugins can be managed with package managers like vim-plug, Vundle, or native packages (Vim 8+).

# CAVEATS

Vim's modal editing is different from most editors. New users often struggle with modes; remember **Esc** returns to Normal mode.

Configuration can become complex. Start simple and add features as needed. Use **:help** extensively—Vim has excellent built-in documentation.

If stuck with a frozen terminal after Ctrl+S (XOFF), press **Ctrl+Q** to resume.

# HISTORY

Vim was created by **Bram Moolenaar** and first released in **1991** as an improved clone of vi. Vi itself was created by Bill Joy in **1976**. Vim added features while maintaining vi compatibility, becoming one of the most popular text editors among developers.

# SEE ALSO

[vi](/man/vi)(1), [nvim](/man/nvim)(1), [nano](/man/nano)(1), [emacs](/man/emacs)(1), [vimtutor](/man/vimtutor)(1)
