# TLDR

**Search for literal string in gzipped file**

```zfgrep "[string]" [file.gz]```

**Case-insensitive search**

```zfgrep -i "[string]" [file.gz]```

**Show line numbers**

```zfgrep -n "[string]" [file.gz]```

**Count matching lines**

```zfgrep -c "[string]" [file.gz]```

**List files containing matches**

```zfgrep -l "[string]" [*.gz]```

# SYNOPSIS

**zfgrep** [_grep-options_] [**-e**] _pattern_ [_file_...]

# PARAMETERS

**-i**
> Case-insensitive matching

**-n**
> Show line numbers

**-l**
> List filenames with matches only

**-c**
> Count matching lines

**-v**
> Invert match (show non-matching lines)

**-h**
> Suppress filename in output

**-e** _pattern_
> Specify pattern

**-x**
> Match whole lines only

# DESCRIPTION

**zfgrep** searches for fixed strings in gzip-compressed files without manual decompression. It's equivalent to **zcat file.gz | fgrep pattern** but more convenient.

The "f" indicates fixed string matching (like **grep -F**). Patterns are interpreted literally, not as regular expressions. This is faster than regex matching and useful when searching for strings containing special characters.

zfgrep automatically handles both compressed and uncompressed files, making it safe for mixed file sets.

Multiple patterns can be specified, one per line, using **-e** or by newline-separating them.

# CAVEATS

Only gzip compression is supported. Use **bzfgrep** for bzip2 files or pipe through appropriate decompressors for other formats.

Fixed string matching means special characters like **.**,**\***, **[** are literal. Use **zgrep** or **zegrep** if regex is needed.

Processing large compressed files requires CPU for decompression.

# SEE ALSO

[zgrep](/man/zgrep)(1), [zegrep](/man/zegrep)(1), [fgrep](/man/fgrep)(1), [zcat](/man/zcat)(1), [gzip](/man/gzip)(1)
