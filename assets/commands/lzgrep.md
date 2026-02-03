# TLDR

**Search in lzip-compressed file**

```lzgrep [pattern] [file.lz]```

**Case-insensitive search**

```lzgrep -i [pattern] [file.lz]```

**Show line numbers**

```lzgrep -n [pattern] [file.lz]```

**Search multiple files**

```lzgrep [pattern] [*.lz]```

**Extended regex**

```lzegrep [pattern] [file.lz]```

# SYNOPSIS

**lzgrep** [_options_] _pattern_ [_file_...]

# PARAMETERS

**-i**
> Case-insensitive search.

**-n**
> Show line numbers.

**-l**
> Show only filenames.

**-c**
> Show match counts.

**-v**
> Invert match.

All grep options are supported.

# DESCRIPTION

**lzgrep** searches for patterns in lzip-compressed files. Automatically decompresses before searching. Passes options through to grep. Use lzegrep for extended regex or lzfgrep for fixed strings.

# SEE ALSO

[lzip](/man/lzip)(1), [grep](/man/grep)(1), [zgrep](/man/zgrep)(1)

