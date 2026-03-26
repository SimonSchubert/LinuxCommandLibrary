# TAGLINE

Compress and decompress files with the Brotli algorithm

# TLDR

**Compress** a file (keeps original by default)

```brotli [file.txt]```

**Decompress** a file

```brotli -d [file.txt.br]```

**Compress** and remove original file

```brotli --rm [file.txt]```

**Compress** to stdout

```brotli -c [file.txt] > [file.txt.br]```

**Compress with fast quality level** (0=fast, 11=best)

```brotli -q [4] [file.txt]```

**Compress to a specific output file**

```brotli -o [output.br] [file.txt]```

**Test compressed file integrity**

```brotli -t [file.txt.br]```

# SYNOPSIS

**brotli** [_options_] [_file_...]

# DESCRIPTION

**brotli** is a compression tool using the Brotli algorithm developed by Google. It provides better compression ratios than gzip and deflate, particularly for web content, making it popular for HTTP compression. Unlike gzip, source files are preserved by default.

The tool supports compression levels from 0 (fast) to 11 (maximum compression).

# PARAMETERS

**-d**, **--decompress**
> Decompress file

**-c**, **--stdout**
> Write to standard output

**-f**, **--force**
> Overwrite existing files

**-j**, **--rm**
> Remove source file(s) after processing

**-k**, **--keep**
> Keep input files (default behavior)

**-o** _FILE_, **--output=**_FILE_
> Write output to specified file

**-q** _NUM_, **--quality=**_NUM_
> Compression quality (0-11, default: 11)

**-S** _SUFFIX_, **--suffix=**_SUFFIX_
> Output filename suffix (default: .br)

**-v**, **--verbose**
> Display detailed status messages

**-V**, **--version**
> Display version

**-w** _NUM_, **--lgwin=**_NUM_
> LZ77 window size (0, 10-24, default: 24)

**-t**, **--test**
> Test compressed file integrity

# CAVEATS

Slower than gzip at maximum compression. Not as widely supported on older systems. Quality 11 can be very slow. Some systems use brotli via `br` command instead.

# HISTORY

**Brotli** was developed by Jyrki Alakuijala and Zoltán Szabadka at Google, released in **2013** and standardized as RFC 7932 in **2016**.

# SEE ALSO

[gzip](/man/gzip)(1), [zstd](/man/zstd)(1), [xz](/man/xz)(1)
