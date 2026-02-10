# TAGLINE

merges lines from multiple files side by side

# TLDR

**Merge files side by side**

```paste [file1.txt] [file2.txt]```

**Merge with custom delimiter**

```paste -d "," [file1.txt] [file2.txt]```

**Merge lines from single file**

```paste -s [file.txt]```

**Create tab-separated columns**

```paste - - < [file.txt]```

**Merge multiple files**

```paste [file1] [file2] [file3]```

# SYNOPSIS

**paste** [_options_] _files_...

# DESCRIPTION

**paste** merges lines from multiple files side by side. Each line from the first file is joined with the corresponding line from subsequent files, separated by tabs.

The tool is useful for combining data from different sources into columnar format.

# PARAMETERS

**-d** _list_
> Use characters from list as delimiters.

**-s**, **--serial**
> Paste one file at a time.

**-z**, **--zero-terminated**
> Use NUL as line delimiter.

**--help**
> Display help.

**--version**
> Display version.

# CAVEATS

Files should have same number of lines for alignment. Delimiter cycles through list. Empty lines produce empty columns.

# HISTORY

**paste** is a traditional Unix utility, part of **POSIX** and **GNU coreutils**. It has been standard in Unix systems since the early days, providing simple tabular data assembly.

# SEE ALSO

[cut](/man/cut)(1), [join](/man/join)(1), [column](/man/column)(1), [pr](/man/pr)(1)
