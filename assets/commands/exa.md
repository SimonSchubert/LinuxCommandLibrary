# TLDR

**List files** with colors

```exa```

**Long format** with details

```exa -l```

**Show hidden files**

```exa -a```

**Tree view**

```exa --tree```

**Show git status**

```exa -l --git```

**Sort by modified** time

```exa -l --sort=modified```

**Show file sizes** human-readable

```exa -lh```

**Extended attributes**

```exa -l --extended```

# SYNOPSIS

**exa** [_options_] [_files_...]

# PARAMETERS

_FILES_
> Files or directories to list.

**-l**, **--long**
> Long format.

**-a**, **--all**
> Show hidden files.

**--tree**
> Tree view.

**--git**
> Show git status.

**-s**, **--sort** _FIELD_
> Sort by field.

**-h**, **--header**
> Show header row.

**--icons**
> Show file icons.

**--color** _WHEN_
> Color mode: always, auto, never.

**--help**
> Display help information.

# DESCRIPTION

**exa** is a modern replacement for ls written in Rust. It provides colorful output, git integration, tree view, and more detailed file information in a user-friendly format.

The tool defaults to human-readable sizes and sensible colors. Git integration shows file status in repository directories. Extended attributes and metadata are easily accessible.

exa is faster than ls for most operations while providing significantly more features.

# CAVEATS

Different output format than ls. May break scripts expecting ls output. Icons need font support. Unmaintained since 2023 (see eza fork).

# HISTORY

exa was created by **Benjamin Sago** (ogham) starting around **2014** as a modern ls replacement. Development stopped in **2023**, with **eza** continuing as an active fork.

# SEE ALSO

[ls](/man/ls)(1), [eza](/man/eza)(1), [lsd](/man/lsd)(1), [tree](/man/tree)(1)
