# TAGLINE

Raw zlib compression and decompression utility

# TLDR

**Compress data**

```zlib-flate -compress < [input] > [output.zz]```

**Decompress data**

```zlib-flate -uncompress < [input.zz] > [output]```

**Compress with specific level (1=fastest, 9=best)**

```zlib-flate -compress=[9] < [input] > [output.zz]```

**Decompress a raw zlib stream from a PDF**

```zlib-flate -uncompress < [stream.bin] > [decoded.txt]```

# SYNOPSIS

**zlib-flate** **-compress**[=_level_] | **-uncompress**

# PARAMETERS

**-compress**
> Compress data.

**-uncompress**
> Decompress data.

**=**_LEVEL_
> Compression level (1-9).

# DESCRIPTION

**zlib-flate** performs raw zlib compression and decompression. It reads from standard input and writes to standard output, making it suitable for use in shell pipelines.

The tool uses raw zlib compression format, which distinguishes it from utilities like **gzip** that add wrapper headers. Compression levels from 1 (fastest) to 9 (best compression) can be specified with the **-compress=** option.

zlib-flate is included as a utility in the **QPDF** package. It is primarily provided as a debugging tool for working with raw zlib streams such as those found inside PDF files. It should not be used as a general purpose compression tool; use **gzip** instead for that.

# CAVEATS

Raw zlib format only, no gzip or other wrapper headers. Part of the qpdf package. Not intended as a general purpose compression tool.

# HISTORY

**zlib-flate** is included with **QPDF**, providing raw zlib deflate compression and decompression.

# SEE ALSO

[qpdf](/man/qpdf)(1), [gzip](/man/gzip)(1), [zcat](/man/zcat)(1), [pigz](/man/pigz)(1)
