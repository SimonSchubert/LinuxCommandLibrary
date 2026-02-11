# TAGLINE

Search gzip-compressed files for patterns

# TLDR

**Search for pattern in gzipped file**

```zgrep "[pattern]" [file.gz]```

**Case-insensitive search**

```zgrep -i "[pattern]" [file.gz]```

**Show line numbers**

```zgrep -n "[pattern]" [file.gz]```

**Search recursively in compressed files**

```zgrep -r "[pattern]" [directory]```

**Count matching lines**

```zgrep -c "[pattern]" [file.gz]```

**Show only filenames with matches**

```zgrep -l "[pattern]" [*.gz]```

# SYNOPSIS

**zgrep** [_grep-options_] [**-e**] _pattern_ [_file_...]

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

**-r**, **-R**
> Recursive search

**-E**
> Extended regular expressions (like egrep)

**-F**
> Fixed string matching (like fgrep)

**-e** _pattern_
> Specify pattern

# DESCRIPTION

**zgrep** searches for patterns in gzip-compressed files without manual decompression. It's equivalent to **gunzip -c file.gz | grep pattern** but more convenient.

The tool automatically detects whether files are compressed and handles them appropriately. This makes it safe to use on directories containing mixed compressed and uncompressed files.

zgrep supports the same options as grep, including basic and extended regular expressions. For explicit regex modes, use **zegrep** (extended) or **zfgrep** (fixed strings).

Multiple files can be searched, with filenames shown by default when multiple files match.

# CAVEATS

Only gzip compression is supported natively. For other formats:
- bzip2: use **bzgrep**
- xz: use **xzgrep**
- zstd: pipe through **zstdcat**

Large compressed files must be fully decompressed to search, using CPU and potentially significant memory.

On some systems, zgrep is a wrapper script that may have slightly different behavior than native grep.

# SEE ALSO

[grep](/man/grep)(1), [zegrep](/man/zegrep)(1), [zfgrep](/man/zfgrep)(1), [zcat](/man/zcat)(1), [gzip](/man/gzip)(1), [bzgrep](/man/bzgrep)(1)
