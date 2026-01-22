# TLDR

**Convert tabs to** spaces

```expand [file.txt]```

**Set tab width**

```expand -t [4] [file.txt]```

**Custom tab stops**

```expand -t [4,8,12] [file.txt]```

**Process multiple files**

```expand [file1.txt] [file2.txt]```

**Read from stdin**

```cat [file.txt] | expand```

# SYNOPSIS

**expand** [_options_] [_files_...]

# PARAMETERS

_FILES_
> Files to process (stdin if none).

**-t** _N_
> Tab width (default: 8).

**-t** _LIST_
> Comma-separated tab stops.

**-i**, **--initial**
> Only convert leading tabs.

**--help**
> Display help information.

# DESCRIPTION

**expand** converts tab characters to spaces. It's commonly used to normalize text files for consistent display or before processing by tools that don't handle tabs well.

By default, tabs expand to 8-space intervals. Custom tab widths or specific tab stop positions can be set. The --initial option only converts tabs at line beginnings.

expand is the inverse of unexpand, which converts spaces to tabs.

# CAVEATS

Changes file content permanently if redirected. Tab interpretation is contextual. Binary files may be corrupted. Original tabs unrecoverable.

# HISTORY

expand is a classic Unix utility from the early BSD distribution, providing tab-to-space conversion for text processing pipelines.

# SEE ALSO

[unexpand](/man/unexpand)(1), [col](/man/col)(1), [pr](/man/pr)(1)
