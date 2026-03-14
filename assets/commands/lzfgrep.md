# TAGLINE

Search compressed files for fixed strings

# TLDR

**Search for a fixed string** in a compressed file

```lzfgrep [string] [file.lz]```

**Case-insensitive search**

```lzfgrep -i [string] [file.lz]```

**Show line numbers** with matches

```lzfgrep -n [string] [file.lz]```

**Count matching lines**

```lzfgrep -c [string] [file.lz]```

**Search across multiple** compressed files

```lzfgrep [string] [file1.lz] [file2.lz]```

**List files containing** matches

```lzfgrep -l [string] [*.lz]```

# SYNOPSIS

**lzfgrep** [_grep_options_] [**-e**] _pattern_ [_file_...]

# PARAMETERS

All options are passed directly to **grep**(1). Common options include:

**-i**
> Case-insensitive matching.

**-n**
> Show line numbers.

**-c**
> Print count of matching lines only.

**-l**
> Print names of files with matches.

**-v**
> Invert match (show non-matching lines).

**-w**
> Match whole words only.

**-e** _pattern_
> Specify the pattern explicitly.

# DESCRIPTION

**lzfgrep** searches for fixed strings in files that may be compressed with xz, lzma, gzip, or bzip2. It is equivalent to **lzgrep -F** and is faster than regex-based search for literal string patterns. Files are automatically decompressed on the fly before searching.

lzfgrep is provided as part of xz-utils for backward compatibility with LZMA Utils. If no file is specified, standard input is decompressed if necessary and fed to grep.

# CAVEATS

When reading from standard input, gzip and bzip2 compressed files are not supported. All options are passed directly to grep.

# SEE ALSO

[lzgrep](/man/lzgrep)(1), [fgrep](/man/fgrep)(1), [lzegrep](/man/lzegrep)(1), [xzgrep](/man/xzgrep)(1), [zgrep](/man/zgrep)(1), [grep](/man/grep)(1)

