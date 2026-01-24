# TLDR

**Convert leading spaces to tabs** in a file

```unexpand [file]```

**Convert all spaces** (not just leading) to tabs

```unexpand -a [file]```

**Use a specific tab width**

```unexpand -t [4] [file]```

**Convert and save to a new file**

```unexpand [input.txt] > [output.txt]```

**Process multiple files**

```unexpand [file1] [file2]```

**Read from stdin**

```cat [file] | unexpand```

# SYNOPSIS

**unexpand** [_options_] [_file ..._]

# PARAMETERS

**-a**, **--all**
> Convert all sequences of two or more spaces to tabs, not just leading spaces.

**-t** _n_, **--tabs=**_n_
> Set tab stops every n columns (default: 8).

**-t** _list_, **--tabs=**_list_
> Set tab stops at specified column positions (comma-separated).

**--first-only**
> Convert only leading blanks (default behavior).

**--help**
> Display help message and exit.

**--version**
> Display version information and exit.

# DESCRIPTION

**unexpand** converts spaces to tabs in files, writing to standard output. By default, it only converts leading spaces (at the beginning of lines) into the maximum number of tabs followed by the minimum spaces needed to fill the same columns.

With **-a**, all sequences of spaces (not just leading) are converted. Tab stops default to every 8 columns but can be changed with **-t**.

When no file is specified or when file is **-**, unexpand reads from standard input.

# CAVEATS

By default, unexpand only converts leading spaces, unlike **expand** which converts all tabs by default. This asymmetry can cause unexpected results when round-tripping between the two commands. Use **-a** for consistent all-space conversion.

# HISTORY

unexpand is part of **GNU coreutils**, written by **David MacKenzie**. The command originated in early Unix systems as a companion to the expand utility. Both commands address the historical need to convert between tabs and spaces for different terminal and printer requirements.

# SEE ALSO

[expand](/man/expand)(1), [cat](/man/cat)(1), [pr](/man/pr)(1), [col](/man/col)(1)
