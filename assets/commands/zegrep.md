# TAGLINE

Search gzip-compressed files with extended regex

# TLDR

**Search for pattern in gzipped file**

```zegrep "[pattern]" [file.gz]```

**Case-insensitive search**

```zegrep -i "[pattern]" [file.gz]```

**Show line numbers**

```zegrep -n "[pattern]" [file.gz]```

**Search multiple files**

```zegrep "[pattern]" [file1.gz] [file2.gz]```

**Extended regex search**

```zegrep "[foo|bar]+" [file.gz]```

# SYNOPSIS

**zegrep** [_grep-options_] [**-e**] _pattern_ [_file_...]

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
> Specify pattern (useful for patterns starting with -)

# DESCRIPTION

**zegrep** searches for patterns in gzip-compressed files without manually decompressing them. It's equivalent to **zcat file.gz | egrep pattern** but more convenient.

The "e" indicates extended regular expression support, same as **grep -E**. This allows patterns with **+**, **?**, **|**, and **()** without escaping.

zegrep automatically detects whether input files are compressed. Uncompressed files are searched normally, making it safe to use on mixed file sets.

Multiple patterns can be specified with **-e** or by separating with **|** in the pattern.

# CAVEATS

zegrep decompresses files to search them, which uses CPU. For large compressed files, this may be slow.

Only gzip compression is supported. For other formats, use **bzgrep** (bzip2), **xzgrep** (xz), or **zstdgrep** (zstd).

Memory usage scales with decompressed file size as the file must be processed through the decompressor.

On some systems, zegrep is a script wrapper around zcat and egrep.

# SEE ALSO

[zgrep](/man/zgrep)(1), [zfgrep](/man/zfgrep)(1), [zcat](/man/zcat)(1), [grep](/man/grep)(1), [egrep](/man/egrep)(1), [gzip](/man/gzip)(1)
