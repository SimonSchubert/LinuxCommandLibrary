# TAGLINE

wrapper for lrzip that simplifies compression of directories

# TLDR

**Archive and compress** a directory with default LZMA compression

```lrztar [path/to/directory]```

Compress with **LZO** (fastest)

```lrztar -l [path/to/directory]```

Compress with **bzip2**

```lrztar -b [path/to/directory]```

Compress with **gzip**

```lrztar -g [path/to/directory]```

Compress with **ZPAQ** (best ratio, slowest)

```lrztar -z [path/to/directory]```

Specify **output file**

```lrztar -o [path/to/output.tar.lrz] [path/to/directory]```

Compress with **verbose output** and **force** overwrite

```lrztar -v -f [path/to/directory]```

# SYNOPSIS

**lrztar** [_lrzip-options_] _directory_

# DESCRIPTION

**lrztar** is a wrapper for lrzip that simplifies compression of directories. It first creates a tar archive, then compresses it using lrzip's long-range compression algorithms. Output defaults to DIRECTORY.tar.lrz. lrztar accepts the same options as lrzip.

# PARAMETERS

**-l, --lzo**
> Use ultra-fast LZO compression

**-b, --bzip2**
> Use bzip2 compression

**-g, --gzip**
> Use gzip compression

**-z, --zpaq**
> Use ZPAQ compression (best ratio, very slow)

**-n, --no-compress**
> Only perform long-range redundancy reduction (no 2nd stage compression)

**-o, --outfile** _FILE_
> Specify output filename

**-p, --threads** _N_
> Number of processor threads

**-f, --force**
> Force overwrite existing files

**-v, --verbose**
> Increase verbosity (-vv for more)

**-D, --delete**
> Delete source files after successful compression

# CAVEATS

Default compression algorithm is LZMA. ZPAQ provides best compression ratio but is approximately 4x slower than LZMA. LZO offers bzip2-like ratios at near file-copy speeds.

# SEE ALSO

[lrzip](/man/lrzip)(1), [lrzuntar](/man/lrzuntar)(1), [lrunzip](/man/lrunzip)(1), [tar](/man/tar)(1)
