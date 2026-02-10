# TAGLINE

modern terminal text editor

# TLDR

**Open file**

```micro [file.txt]```

**Open at line**

```micro [file.txt]:[line]```

**Open multiple files**

```micro [file1.txt] [file2.txt]```

**Diff files**

```micro -diff [file1] [file2]```

**Read-only mode**

```micro -readonly [file.txt]```

**Show version**

```micro -version```

# SYNOPSIS

**micro** [_options_] [_files_]

# PARAMETERS

_FILES_
> Files to edit.

**-diff** _F1_ _F2_
> Diff two files.

**-readonly**
> Read-only mode.

**-plugin** _CMD_
> Plugin management.

**-version**
> Show version.

**--help**
> Display help information.

# DESCRIPTION

**micro** is a modern terminal text editor. It provides intuitive keybindings and mouse support.

The tool is easy to use like nano but more powerful. Supports syntax highlighting and plugins.

# CAVEATS

Go-based. Plugin system available. Different from vim/emacs.

# HISTORY

Micro was created by **Zachary Yedidia** as a modern, intuitive alternative to nano and vim.

# SEE ALSO

[nano](/man/nano)(1), [vim](/man/vim)(1), [emacs](/man/emacs)(1)

