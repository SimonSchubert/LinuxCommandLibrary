# TAGLINE

searches for extended regular expression patterns in lzip-compressed files

# TLDR

**Search with extended regex**

```lzegrep [pattern] [file.lz]```

**Case-insensitive search**

```lzegrep -i [pattern] [file.lz]```

**Show line numbers**

```lzegrep -n [pattern] [file.lz]```

# SYNOPSIS

**lzegrep** [_options_] _pattern_ [_file_...]

# PARAMETERS

**-i**
> Case-insensitive matching.

**-n**
> Prefix each matching line with its line number.

**-v**
> Invert match; show lines that do not match.

**-c**
> Print only the count of matching lines per file.

**-l**
> Print only the names of files containing matches.

**-h**
> Suppress file name prefixes in output.

**-H**
> Force file name prefixes in output.

**-e** _PATTERN_
> Use _PATTERN_ as the search pattern; useful for multiple patterns.

# DESCRIPTION

**lzegrep** searches for extended regular expression patterns in lzip-compressed files. It is equivalent to **lzgrep -E** and internally pipes decompressed data through **grep -E** (or **egrep**). Uncompressed files are searched directly.

# SEE ALSO

[lzgrep](/man/lzgrep)(1), [egrep](/man/egrep)(1)

