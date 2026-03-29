# TAGLINE

ugrep with config file, pretty output, and sorted results

# TLDR

**Search for a pattern in a file**

```ug "[pattern]" [file]```

**Search recursively in current directory**

```ug -r "[pattern]"```

**Case-insensitive search**

```ug -i "[pattern]" [file]```

**Show line numbers**

```ug -n "[pattern]" [file]```

**Interactive TUI query mode**

```ug -Q```

**Count matches per file**

```ug -c "[pattern]" [file]```

**List only filenames with matches**

```ug -l "[pattern]"```

**Search for whole words only**

```ug -w "[pattern]" [file]```

# SYNOPSIS

**ug** [_options_] [_pattern_] [_file_...]

# PARAMETERS

**-i**
> Case insensitive matching.

**-r**, **-R**
> Recursive search (-R follows symlinks).

**-n**
> Show line numbers.

**-Q**
> Launch interactive TUI query mode.

**-c**
> Count matching lines per file.

**-l**
> Print only names of files with matches.

**-w**
> Match whole words only.

**-e** _pattern_
> Specify a pattern (use multiple times for alternation).

**--no-config**
> Do not load the .ugrep configuration file.

# DESCRIPTION

**ug** is the user-friendly front-end to **ugrep**. It is equivalent to running `ugrep --config --pretty --sort`: it automatically loads the `.ugrep` configuration file from the working directory or home directory, enables pretty-printed colour output, and sorts results by filename. These defaults make ug suitable for interactive terminal use.

Unlike plain **ugrep** (which targets scripting and batch use with no sorting for performance), ug is tuned for exploratory searching. It supports all ugrep options including Boolean queries, fuzzy matching, hexdumps, and searching inside archives and compressed files.

The interactive TUI mode (`-Q`) lets you type a query and see results update in real time.

# SEE ALSO

[ugrep](/man/ugrep)(1), [grep](/man/grep)(1), [rg](/man/rg)(1)
