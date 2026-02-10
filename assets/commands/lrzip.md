# TAGLINE

designed for compressing large files

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

**-k, --keep**
> Keep original file

# CAVEATS

Very effective on large files with redundant data. ZPAQ compression is extremely slow but achieves best ratios.

# SEE ALSO

[lrunzip](/man/lrunzip)(1), [lrztar](/man/lrztar)(1), [gzip](/man/gzip)(1), [xz](/man/xz)(1)
