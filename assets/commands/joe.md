# TAGLINE

joe's Own Editor, a terminal text editor

# TLDR

**Open file**

```joe [file.txt]```

**Open at line number**

```joe +[100] [file.txt]```

**Read-only mode**

```joe -rdonly [file.txt]```

**Enable syntax highlighting**

```joe -syntax [c] [file.c]```

**Disable word wrap**

```joe -wordwrap [file.txt]```

# SYNOPSIS

**joe** [_options_] [_file_...]

# PARAMETERS

_FILE_
> Files to edit.

**+**_LINE_
> Go to line number.

**-rdonly**
> Read-only mode.

**-syntax** _NAME_
> Syntax highlighting mode.

**-wordwrap**
> Enable word wrap.

**-help**
> Display help information.

# DESCRIPTION

**joe** is Joe's Own Editor, a terminal text editor. It supports multiple editing modes including WordStar and Emacs.

The editor features syntax highlighting, macros, and split windows. Key bindings are configurable.

# CAVEATS

WordStar bindings by default. Configuration via joerc. Multiple personalities (jmacs, jstar).

# HISTORY

joe was created by **Joseph H. Allen** in 1991 as a modeless text editor with familiar WordStar key bindings.

# SEE ALSO

[nano](/man/nano)(1), [vim](/man/vim)(1), [emacs](/man/emacs)(1), [jmacs](/man/jmacs)(1)
