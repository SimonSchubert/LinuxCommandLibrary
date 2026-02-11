# TAGLINE

Raw zlib deflate compression utility

# TLDR

**Compress data**

```zlib-flate -compress < [input] > [output.zz]```

**Decompress data**

```zlib-flate -uncompress < [input.zz] > [output]```

**Compress level**

```zlib-flate -compress=[9] < [input] > [output.zz]```

# SYNOPSIS

**zlib-flate** [_-compress[=level]_] [_-uncompress_]

# PARAMETERS

**-compress**
> Compress data.

**-uncompress**
> Decompress data.

**=**_LEVEL_
> Compression level (1-9).

# DESCRIPTION

**zlib-flate** performs raw zlib deflate compression and decompression. It reads from standard input and writes to standard output, making it well suited for use in shell pipelines.

The tool produces raw deflate format without gzip or zlib headers, which distinguishes it from utilities like **gzip** or **zcat**. Compression levels from 1 (fastest) to 9 (best compression) can be specified with the **-compress=** option.

zlib-flate is included as a utility in the **QPDF** package. It is useful for working with raw deflate streams such as those found in PDF file internals or other formats that use zlib compression without wrapper headers.

# CAVEATS

Raw format. No gzip headers. Part of qpdf package.

# HISTORY

**zlib-flate** is included with **QPDF**, providing raw zlib deflate compression and decompression.

# SEE ALSO

[gzip](/man/gzip)(1), [zcat](/man/zcat)(1), [pigz](/man/pigz)(1)
