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

**zlib-flate** compresses with zlib. It uses raw deflate.

Raw deflate format. No headers.

Stdin/stdout. Pipe-based.

Simple interface. Compress/uncompress.

Part of qpdf. Utility tool.

# CAVEATS

Raw format. No gzip headers. Part of qpdf package.

# HISTORY

**zlib-flate** is included with **QPDF**, providing raw zlib deflate compression and decompression.

# SEE ALSO

[gzip](/man/gzip)(1), [zcat](/man/zcat)(1), [pigz](/man/pigz)(1)
