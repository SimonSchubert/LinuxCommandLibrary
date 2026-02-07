# TAGLINE

compare two sorted files line by line

# TLDR

**Compare two sorted files**

```comm [file1] [file2]```

**Show lines unique to first file**

```comm -23 [file1] [file2]```

**Show lines unique to second file**

```comm -13 [file1] [file2]```

**Show lines common to both**

```comm -12 [file1] [file2]```

**Compare with custom delimiter**

```comm --output-delimiter='|' [file1] [file2]```

**Compare unsorted files**

```comm <(sort [file1]) <(sort [file2])```

# SYNOPSIS

**comm** [_option_]... _file1_ _file2_

# DESCRIPTION

**comm** compares two sorted files line by line. Produces three columns: lines unique to file1, lines unique to file2, and lines common to both. Part of GNU coreutils.

# PARAMETERS

**-1**
> Suppress column 1 (lines unique to file1)

**-2**
> Suppress column 2 (lines unique to file2)

**-3**
> Suppress column 3 (common lines)

**--check-order**
> Check input is properly sorted

**--nocheck-order**
> Skip sort order verification

**--output-delimiter** _str_
> Separate columns with string

**--total**
> Output summary counts

**-z**, **--zero-terminated**
> Line delimiter is NUL

**--help**
> Display help

**--version**
> Show version

# OUTPUT COLUMNS

```
unique_to_file1
        unique_to_file2
                common_to_both
```

# CAVEATS

Input files must be sorted. Use process substitution for unsorted files: comm <(sort f1) <(sort f2). Comparisons follow LC_COLLATE rules.

# SEE ALSO

[sort](/man/sort)(1), [diff](/man/diff)(1), [uniq](/man/uniq)(1)
