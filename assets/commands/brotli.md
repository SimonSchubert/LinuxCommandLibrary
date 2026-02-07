# TAGLINE

Compress and decompress files with the Brotli algorithm

# TLDR

**Compress** file

```brotli [file.txt]```

**Decompress** file

```brotli -d [file.txt.br]```

**Compress** to stdout

```brotli -c [file.txt] > [file.txt.br]```

Set **quality** level

```brotli -q [11] [file.txt]```

# SYNOPSIS

**brotli** [_options_] [_file_...]

# DESCRIPTION

**brotli** is a compression tool using the Brotli algorithm developed by Google. It provides better compression ratios than gzip and deflate, particularly for web content, making it popular for HTTP compression.

The tool supports compression levels from 0 (fast) to 11 (maximum compression).

# PARAMETERS

**-d**, **--decompress**
> Decompress file

**-c**, **--stdout**
> Write to standard output

**-f**, **--force**
> Overwrite existing files

**-k**, **--keep**
> Keep input files

**-q** _level_, **--quality=**_level_
> Compression quality (0-11, default: 11)

**-w** _size_, **--lgwin=**_size_
> Window size (10-24)

**-t**, **--test**
> Test compressed file

# COMPRESSION LEVELS

- **0-3** - Fast, lower compression
- **4-9** - Balanced
- **10-11** - Maximum compression, slower

# WORKFLOW

```bash
# Compress file
brotli file.txt
# Creates: file.txt.br

# Decompress
brotli -d file.txt.br

# Compress with fast setting
brotli -q 4 file.txt

# Compress keeping original
brotli -k file.txt

# Compress to specific output
brotli -o compressed.br file.txt
```

# FEATURES

- Better compression than gzip
- Supported by all modern browsers
- Dictionary-based compression
- Optimized for text/web content
- Backward compatible decompression

# CAVEATS

Slower than gzip at maximum compression. Not as widely supported on older systems. Quality 11 can be very slow. Some systems use brotli via `br` command instead.

# HISTORY

**Brotli** was developed by Jyrki Alakuijala and Zoltán Szabadka at Google, released in **2013** and standardized as RFC 7932 in **2016**.

# SEE ALSO

[gzip](/man/gzip)(1), [zstd](/man/zstd)(1), [xz](/man/xz)(1)
