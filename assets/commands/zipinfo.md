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
> Filenames only (like -1).

**-s**
> Short Unix format.

**-m**
> Medium Unix format.

**-l**
> Long Unix format.

**-h**
> Header info.

**-t**
> Totals.

**-T**
> Decimal timestamps.

**-z**
> Archive comment.

**-v**
> Verbose (all available info).

**-x** _PATTERN_
> Exclude files.

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
