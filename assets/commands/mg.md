# TLDR

**Open file**

```mg [file.txt]```

**Open at line**

```mg +[10] [file.txt]```

**Read-only mode**

```mg -R [file.txt]```

**Open multiple files**

```mg [file1.txt] [file2.txt]```

# SYNOPSIS

**mg** [_options_] [_files_]

# PARAMETERS

_FILES_
> Files to edit.

**+** _LINE_
> Start at line number.

**-R**
> Read-only mode.

**-n**
> No backup files.

**--help**
> Display help information.

# DESCRIPTION

**mg** is a micro GNU Emacs-style editor. It provides basic Emacs keybindings in a small package.

The tool is lightweight and fast. It's the default editor on OpenBSD and available elsewhere.

mg is a micro Emacs clone.

# CAVEATS

Limited compared to GNU Emacs. No Lisp extension. Basic editing only.

# HISTORY

mg was originally **MicroGNUEmacs**, created for systems where full Emacs was too large.

# SEE ALSO

[emacs](/man/emacs)(1), [nano](/man/nano)(1), [vi](/man/vi)(1)

