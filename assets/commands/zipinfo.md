# TAGLINE

Display ZIP archive information

# TLDR

**Show archive info**

```zipinfo [archive.zip]```

**Short listing**

```zipinfo -1 [archive.zip]```

**Long listing**

```zipinfo -l [archive.zip]```

**Medium listing**

```zipinfo -m [archive.zip]```

**Show header info**

```zipinfo -h [archive.zip]```

**Show totals only**

```zipinfo -t [archive.zip]```

**Show specific file info**

```zipinfo [archive.zip] [file.txt]```

# SYNOPSIS

**zipinfo** [_-1_] [_-l_] [_-m_] [_-h_] [_-t_] [_options_] _archive_ [_members_]

# PARAMETERS

**-1**
> Filenames only, one per line.

**-2**
> Filenames only, allows headers (-h), totals (-t), and comments (-z).

**-s**
> Short Unix ls -l format (default).

**-m**
> Medium format: adds compression factor percentage.

**-l**
> Long format: shows compressed size in bytes.

**-h**
> Print archive header (name, size, file count).

**-t**
> Print totals (file count, total sizes, compression ratio).

**-T**
> Print timestamps in sortable decimal format (yymmdd.hhmmss).

**-z**
> Print archive comment.

**-v**
> Verbose multi-page format with all available info.

**-M**
> Pipe output through internal pager (like more).

**-x** _PATTERN_
> Exclude files matching pattern.

# OUTPUT FIELDS

Long listing shows:
- Permissions
- Version
- OS
- Size (uncompressed)
- Compression type
- Size (compressed)
- Ratio
- Date/time
- Filename

# DESCRIPTION

**zipinfo** displays information about ZIP archives without extracting. It shows structure, compression, and metadata.

Short listing (-1) provides filenames only, useful for scripting. Each file appears on its own line.

Long listing (-l) resembles ls -l output. It shows permissions, sizes, compression, and dates.

The header (-h) shows archive-level information: filename, size, and number of entries.

Totals (-t) summarize the archive: file count, total sizes, and compression ratio.

Pattern matching selects specific files to display. Wildcards work for filtering large archives.

# CAVEATS

Part of Info-ZIP package. Some encrypted archives may not show all info. Very large archives may be slow.

# HISTORY

**zipinfo** is part of **Info-ZIP**, developed by the Info-ZIP group starting in the early **1990s**. It provides archive inspection without extraction.

# SEE ALSO

[unzip](/man/unzip)(1), [zip](/man/zip)(1), [zipgrep](/man/zipgrep)(1), [zipcloak](/man/zipcloak)(1)
