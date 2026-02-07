# TAGLINE

modern ls replacement with git integration

# TLDR

**List files with** icons and colors

```eza --icons```

**Long format with** git status

```eza -l --git```

**Show hidden files**

```eza -a```

**Tree view**

```eza --tree --level [2]```

**Sort by modification** time

```eza -l --sort modified```

# SYNOPSIS

**eza** [_options_] [_files_...]

# PARAMETERS

_FILES_
> Files or directories to list (default: current directory).

**-l**, **--long**
> Display detailed list format.

**-a**, **--all**
> Show hidden files (dotfiles).

**--tree**
> Display as tree structure.

**--level** _N_
> Tree depth limit.

**--git**
> Show git status for each file.

**--icons**
> Display file type icons.

**-h**, **--header**
> Show column headers.

**--sort** _FIELD_
> Sort by: name, size, modified, accessed, created.

**-r**, **--reverse**
> Reverse sort order.

**--group-directories-first**
> List directories before files.

**--help**
> Display help information.

# DESCRIPTION

**eza** is a modern replacement for ls, written in Rust. It provides colorful output, git integration, extended attributes display, and tree view capabilities out of the box.

The tool improves on ls with features like git status integration, file icons, and better defaults for human-readable output. It recognizes many file types and displays them with distinctive colors and icons.

eza is designed as a drop-in ls replacement while adding modern features developers expect from file listing tools.

# CAVEATS

Requires terminal with color support. Icons need compatible font (Nerd Font). Git integration adds overhead in large repos. Not POSIX-compliant.

# HISTORY

eza is a maintained fork of **exa**, which was unmaintained since 2023. It continues development with new features and bug fixes, preserving exa's modern approach to file listing while actively maintaining the codebase.

# SEE ALSO

[ls](/man/ls)(1), [tree](/man/tree)(1), [lsd](/man/lsd)(1)
