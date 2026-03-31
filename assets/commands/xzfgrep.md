# TAGLINE

Search compressed files for fixed strings

# TLDR

**Search fixed string in xz files**

```xzfgrep "[string]" [file.xz]```

**Search multiple strings**

```xzfgrep -e "[str1]" -e "[str2]" [file.xz]```

**Case-insensitive search**

```xzfgrep -i "[string]" [file.xz]```

**Count matching lines**

```xzfgrep -c "[string]" [file.xz]```

**Show line numbers**

```xzfgrep -n "[string]" [file.xz]```

# SYNOPSIS

**xzfgrep** [_option..._] [_pattern_] [_file..._]

# DESCRIPTION

**xzfgrep** searches compressed files for fixed strings. It is equivalent to **xzgrep -F**, meaning patterns are not interpreted as regular expressions. This makes it faster than xzgrep for literal string searches.

The file compression format is detected from the filename suffix. Files compressed with xz, lzma, gzip, bzip2, lzop, zstd, or lz4 are automatically decompressed before searching. Unrecognized suffixes are assumed to be uncompressed.

All options are passed directly to grep(1). The options **-r**, **-R**, **-d**, **-Z**, and **-z** are not supported.

When no file is specified, standard input is read. From standard input, only xz-compressed data is supported.

# SEE ALSO

[xzgrep](/man/xzgrep)(1), [xzegrep](/man/xzegrep)(1), [xz](/man/xz)(1), [fgrep](/man/fgrep)(1), [grep](/man/grep)(1), [zgrep](/man/zgrep)(1), [zfgrep](/man/zfgrep)(1)

