# TLDR

**View contents** of an xz compressed file

```xzcat [file.xz]```

**View contents of a .lzma file**

```xzcat [file.lzma]```

**Pipe to another command**

```xzcat [file.xz] | grep "[pattern]"```

**Test file integrity** without decompressing

```xzcat -t [file.xz]```

**Verbose output** showing filename

```xzcat -v [file.xz]```

**Decompress multiple files**

```xzcat [file1.xz] [file2.xz]```

# SYNOPSIS

**xzcat** [_options_] [_file ..._]

# PARAMETERS

**-f**, **--force**
> Force decompression even if input doesn't appear to be in .xz format.

**-k**, **--keep**
> Keep input files (they're not deleted anyway with xzcat).

**-t**, **--test**
> Test compressed file integrity without outputting data.

**-q**, **--quiet**
> Suppress warnings and non-fatal error messages.

**-v**, **--verbose**
> Display filename and statistics during processing.

**--memlimit=**_limit_
> Set memory usage limit for decompression.

**--format=**_format_
> Restrict to specific format: xz, lzma, raw, auto.

**-h**, **--help**
> Display help message and exit.

**-V**, **--version**
> Display version information and exit.

# DESCRIPTION

**xzcat** decompresses .xz and .lzma files and writes the uncompressed data to standard output. It is equivalent to running **xz --decompress --stdout** or **xz -dc**.

The XZ format uses LZMA2 compression algorithm and provides better compression ratios than gzip or bzip2, though at the cost of slower compression speed. Decompression is relatively fast.

xzcat reads from standard input if no files are specified or if **-** is given as a filename.

# CAVEATS

xzcat only decompresses; it cannot handle tar archives (use **tar -xJf** for .tar.xz files). Memory usage can be significant for files compressed with high settings; use **--memlimit** to control this. The command is part of XZ Utils, which had a security incident in 2024 affecting versions 5.6.0-5.6.1.

# HISTORY

xzcat is part of **XZ Utils**, developed by **Lasse Collin** and first released in **2009** as a successor to LZMA Utils. The .xz format was designed to replace .lzma with better features including integrity checking (CRC32/CRC64/SHA-256). XZ Utils became widely adopted as the standard compression tool for software distribution, particularly for Linux kernel and distribution tarballs.

# SEE ALSO

[xz](/man/xz)(1), [unxz](/man/unxz)(1), [zcat](/man/zcat)(1), [bzcat](/man/bzcat)(1), [lzcat](/man/lzcat)(1)
