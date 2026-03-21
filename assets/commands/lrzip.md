# TAGLINE

Long range redundancy compression program for large files

# TLDR

Compress with **LZMA** (default)

```lrzip [path/to/file]```

Compress with **BZIP2**

```lrzip --bzip2 [path/to/file]```

Compress with **ZPAQ** (extreme)

```lrzip --zpaq [path/to/file]```

Compress with **LZO** (fast)

```lrzip --lzo [path/to/file]```

**Encrypt** compressed file

```lrzip --encrypt [path/to/file]```

Set **thread count**

```lrzip --threads 8 [path/to/file]```

**Decompress** a file

```lrzip -d [path/to/file.lrz]```

Compress and specify **output file**

```lrzip -o [output.lrz] [path/to/file]```

# SYNOPSIS

**lrzip** [_options_] [_file_]

# DESCRIPTION

**lrzip** (Long Range ZIP) is designed for compressing large files. It uses long-range redundancy reduction followed by compression, achieving high ratios on files with distant matching data.

# PARAMETERS

**-b, --bzip2**
> Use BZIP2 compression (balanced)

**-z, --zpaq**
> Use ZPAQ compression (maximum, slow)

**-l, --lzo**
> Use LZO compression (fast)

**-g, --gzip**
> Use GZIP compression

**-e, --encrypt**
> Encrypt with password

**-p, --threads N**
> Number of processor threads

**-o, --outfile FILE**
> Specify output filename

**-d, --decompress**
> Decompress the file

**-t, --test**
> Test compressed file integrity

**-i, --info**
> Show compression information about a compressed file

**-k, --keep**
> Keep original file

**-L** _N_, **--level** _N_
> Set compression level 1-9 (default 7)

**-n, --no-compress**
> Apply only long-range redundancy reduction without backend compression

**-q, --quiet**
> Quiet mode, reduce output verbosity

**-v, --verbose**
> Increase verbosity (can be used multiple times)

# CAVEATS

Most effective on large files (100MB+) with long-range redundant data. ZPAQ compression is extremely slow but achieves best ratios. The default LZMA backend provides a good balance of speed and compression. Files are not compatible with standard zip/gzip tools; use **lrunzip** or **lrzip -d** to decompress. By default, the original file is removed after compression.

# SEE ALSO

[lrunzip](/man/lrunzip)(1), [lrztar](/man/lrztar)(1), [gzip](/man/gzip)(1), [xz](/man/xz)(1), [bzip2](/man/bzip2)(1), [zstd](/man/zstd)(1)
