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

**Ctrl+x u**
> Undo

# DESCRIPTION

**zile** is a lightweight clone of the Emacs text editor. It implements core Emacs keybindings and features in a smaller, faster package.

The name stands for "Zile Is Lossy Emacs" - it deliberately omits complex Emacs features.

# CAVEATS

Missing many Emacs features like Lisp scripting and complex modes. Not a full Emacs replacement.

# SEE ALSO

[emacs](/man/emacs)(1), [nano](/man/nano)(1), [mg](/man/mg)(1)
