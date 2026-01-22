# TLDR

**Join on first field**

```join [file1] [file2]```

**Join on specific fields**

```join -1 [2] -2 [1] [file1] [file2]```

**Output specific fields**

```join -o 1.1,2.2 [file1] [file2]```

**Case insensitive**

```join -i [file1] [file2]```

**Show unmatched lines**

```join -a 1 [file1] [file2]```

**Custom delimiter**

```join -t "," [file1.csv] [file2.csv]```

# SYNOPSIS

**join** [_options_] _file1_ _file2_

# PARAMETERS

_FILE1_ _FILE2_
> Files to join (must be sorted on join field).

**-1** _FIELD_
> Join on field N of file 1.

**-2** _FIELD_
> Join on field N of file 2.

**-o** _FORMAT_
> Output format specification.

**-t** _CHAR_
> Field delimiter.

**-i**
> Ignore case differences.

**-a** _FILENUM_
> Print unpairable lines.

**--help**
> Display help information.

# DESCRIPTION

**join** merges two files on a common field. It performs relational database-style joins on text files.

Files must be sorted on the join field. The tool supports inner, left, and right join operations.

join merges files on common field.

# CAVEATS

Files must be sorted. Field-based joining. Default whitespace delimiter.

# HISTORY

join is part of **POSIX** and traditional Unix utilities, providing relational join operations on text files.

# SEE ALSO

[sort](/man/sort)(1), [cut](/man/cut)(1), [paste](/man/paste)(1), [awk](/man/awk)(1)
