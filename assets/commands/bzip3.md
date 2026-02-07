# TAGLINE

High-performance file compressor with improved ratios over bzip2

# TLDR

**Compress** file

```bzip3 [file.txt]```

**Decompress** file

```bzip3 -d [file.txt.bz3]```

**Keep** original file

```bzip3 -k [file.txt]```

**Set** block size

```bzip3 -b [256] [file.txt]```

# SYNOPSIS

**bzip3** [_options_] [_file_...]

# DESCRIPTION

**bzip3** is a compression tool offering better compression ratios than bzip2, gzip, and zstd while maintaining reasonable speed. It uses a more modern algorithm than bzip2 with improved performance.

The tool is backward incompatible with bzip2 but provides significantly better compression for most data types.

# PARAMETERS

**-d**, **--decompress**
> Decompress file

**-k**, **--keep**
> Keep original files

**-f**, **--force**
> Overwrite existing files

**-c**, **--stdout**
> Write to standard output

**-b**, **--block** _size_
> Block size in MiB (65-511)

**-j**, **--jobs** _n_
> Number of threads

**-v**, **--verbose**
> Verbose mode

# FEATURES

- Better compression than bzip2
- Multi-threaded compression
- Configurable block sizes
- Fast decompression
- Low memory usage
- Modern algorithm

# WORKFLOW

```bash
# Compress file
bzip3 file.txt
# Creates: file.txt.bz3

# Decompress
bzip3 -d file.txt.bz3

# Compress keeping original
bzip3 -k file.txt

# Multi-threaded compression
bzip3 -j 4 largefile.bin

# Custom block size
bzip3 -b 128 file.txt
```

# COMPARISON

Typical compression ratios:
- **bzip3** - Best
- **xz/lzma** - Excellent but slower
- **bzip2** - Good
- **gzip** - Moderate but fast
- **lz4** - Fast but lower compression

# CAVEATS

Not compatible with bzip2 (.bz2 files). Less widely supported than gzip/bzip2. Relatively new (may have bugs). Not installed by default on most systems. Some features require recent versions.

# HISTORY

**bzip3** was created by Kamila Szewczyk in **2022** as a modern successor to bzip2, using improved algorithms for better compression.

# SEE ALSO

[bzip2](/man/bzip2)(1), [xz](/man/xz)(1), [zstd](/man/zstd)(1)
