# TLDR

**Uncompress** files

```uncompress [path/to/file1.Z] [path/to/file2.Z]```

Ignore **non-existent** files

```uncompress -f [path/to/file1.Z] [path/to/file2.Z]```

Write to **stdout**

```uncompress -c [path/to/file1.Z]```

**Verbose** mode

```uncompress -v [path/to/file1.Z]```

# SYNOPSIS

**uncompress** [_OPTIONS_] [_FILE_...]

# PARAMETERS

**-c**
> Write to stdout, don't modify files

**-f**
> Force, ignore non-existent files

**-v**
> Verbose, show compression percentage

# DESCRIPTION

**uncompress** decompresses files compressed using the Unix compress command. Files typically have a .Z extension. The original compressed file is replaced by the uncompressed version unless -c is used.

This format uses LZW compression and was common on older Unix systems before gzip became standard.

# CAVEATS

LZW compression format is largely obsolete. Most systems now use gzip or newer compression. The compress/uncompress commands may not be installed by default.

# HISTORY

**uncompress** is part of the traditional Unix compress utilities using LZW compression, predating the more common gzip format.

# SEE ALSO

[compress](/man/compress)(1), [gzip](/man/gzip)(1), [gunzip](/man/gunzip)(1)
