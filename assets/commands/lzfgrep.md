# TLDR

**Search for fixed string**

```lzfgrep [string] [file.lz]```

**Case-insensitive search**

```lzfgrep -i [string] [file.lz]```

**Show line numbers**

```lzfgrep -n [string] [file.lz]```

# SYNOPSIS

**lzfgrep** [_options_] _string_ [_file_...]

# DESCRIPTION

**lzfgrep** searches for fixed strings in lzip-compressed files. Equivalent to lzgrep -F. Faster than regex search for literal strings. Automatically decompresses before searching.

# SEE ALSO

[lzgrep](/man/lzgrep)(1), [fgrep](/man/fgrep)(1)

