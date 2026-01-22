# TLDR

**Open a file**

```vi [file]```

**Open at specific line**

```vi +[line_number] [file]```

**Open in read-only mode**

```vi -R [file]```

**Open multiple files**

```vi [file1] [file2]```

**Recover a file** from swap

```vi -r [file]```

# SYNOPSIS

**vi** [**-rR**] [**+**_command_] [_file_...]

# PARAMETERS

**-R**
> Read-only mode

**-r** [_file_]
> Recovery mode; list recoverable files or recover specific file

**+** _command_
> Execute command after loading

**+** _line_
> Start at specified line number

**-c** _command_
> Execute command after loading (same as +)

# MODES

**Normal**: Navigation and commands (default)
**Insert**: Text input (i, a, o)
**Command**: Ex commands (:)
**Visual**: Selection (v) - vim only

Press **Esc** to return to Normal mode.

# ESSENTIAL COMMANDS

**Navigation**: h/j/k/l (left/down/up/right), 0/$ (line start/end), gg/G (file start/end)
**Insert**: i (before cursor), a (after cursor), o (new line below), O (new line above)
**Delete**: x (character), dd (line), dw (word)
**Copy/Paste**: yy (copy line), p (paste after), P (paste before)
**Undo**: u (undo), Ctrl+r (redo - vim only)
**Save/Quit**: :w (save), :q (quit), :wq (save & quit), :q! (quit without saving), ZZ (save & quit)
**Search**: /pattern (forward), ?pattern (backward), n/N (next/previous)

# DESCRIPTION

**vi** is the classic Unix visual text editor, present on virtually all Unix-like systems. It uses modal editing where keys have different functions depending on the current mode.

On most modern Linux systems, **vi** is actually a link to **vim** (Vi IMproved) running in compatibility mode, or a minimal vi clone like **nvi**. True original vi is rare outside of commercial Unix systems.

The modal design allows powerful text manipulation without modifier keys, using the home row for navigation. While the learning curve is steep, proficiency enables very efficient editing.

Configuration is stored in **~/.exrc** for traditional vi or **~/.vimrc** for vim.

# CAVEATS

Vi has a steep learning curve. Use **vimtutor** (if vim is installed) to learn interactively.

Without a proper terminal, vi may not function correctly. Set the TERM environment variable appropriately.

On minimal systems, only basic vi may be available without vim's enhancements. Know the common subset of commands.

# HISTORY

Vi was created by **Bill Joy** at UC Berkeley in **1976** as the visual mode for the ex line editor. It became the standard Unix editor and influenced countless text editors. The name stands for "visual" as it was the visual interface to ex.

# SEE ALSO

[vim](/man/vim)(1), [nvim](/man/nvim)(1), [nano](/man/nano)(1), [emacs](/man/emacs)(1), [ed](/man/ed)(1)
