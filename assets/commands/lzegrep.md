# TLDR

**Search with extended regex**

```lzegrep [pattern] [file.lz]```

**Case-insensitive search**

```lzegrep -i [pattern] [file.lz]```

**Show line numbers**

```lzegrep -n [pattern] [file.lz]```

# SYNOPSIS

**lzegrep** [_options_] _pattern_ [_file_...]

# DESCRIPTION

**lzegrep** searches for extended regular expression patterns in lzip-compressed files. Equivalent to lzgrep -E. Automatically decompresses before searching.

# SEE ALSO

[lzgrep](/man/lzgrep)(1), [egrep](/man/egrep)(1)

