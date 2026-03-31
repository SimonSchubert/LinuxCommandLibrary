# TAGLINE

Lightweight Emacs clone

# TLDR

**Start** editor

```zile```

**Open** file

```zile [path/to/file]```

Open at **line** number

```zile +[line_number] [path/to/file]```

# SYNOPSIS

**zile** [_OPTIONS_] [_FILE..._]

# PARAMETERS

**+**_LINE_
> Start at specified line number

**-q**
> Quiet mode, suppress messages

**Ctrl+x Ctrl+s**
> Save file

**Ctrl+x Ctrl+c**
> Quit

**Ctrl+k**
> Kill (cut) to end of line

**Ctrl+y**
> Yank (paste) killed text

**Ctrl+x u**
> Undo

**Ctrl+s**
> Incremental search forward

**Ctrl+g**
> Cancel current command

# DESCRIPTION

**zile** is a lightweight clone of the Emacs text editor. It implements core Emacs keybindings and features in a smaller, faster package.

The name is a recursive acronym: "Zile Is Lossy Emacs". It deliberately omits complex Emacs features like Lisp scripting while retaining the familiar key bindings.

# CAVEATS

Missing many Emacs features like Elisp scripting, major/minor modes, and package management. Not a full Emacs replacement.

# SEE ALSO

[emacs](/man/emacs)(1), [nano](/man/nano)(1), [mg](/man/mg)(1), [vi](/man/vi)(1), [ed](/man/ed)(1)
