# TLDR

**Compress** file

```bzip2 [file.txt]```

**Decompress** file

```bzip2 -d [file.txt.bz2]```

**Keep** original file

```bzip2 -k [file.txt]```

**Compress** to stdout

```bzip2 -c [file.txt] > [file.txt.bz2]```

Set **compression** level

```bzip2 -9 [file.txt]```

# SYNOPSIS

**bzip2** [_options_] [_file_...]

# DESCRIPTION

**bzip2** compresses files using the Burrows-Wheeler block-sorting compression algorithm. It typically achieves better compression ratios than gzip but is slower. By default, it replaces the original file with a compressed .bz2 file.

The tool is commonly used for compressing tarballs and large files.

# PARAMETERS

**-d**, **--decompress**
> Decompress file

**-k**, **--keep**
> Keep original files

**-f**, **--force**
> Overwrite existing files

**-c**, **--stdout**
> Write to standard output

**-t**, **--test**
> Test compressed file integrity

**-v**, **--verbose**
> Verbose mode

**-1** to **-9**
> Compression level (1=fast, 9=best, default: 9)

**-q**, **--quiet**
> Suppress warnings

# WORKFLOW

```bash
# Compress file (creates file.txt.bz2, removes original)
bzip2 file.txt

# Decompress
bzip2 -d file.txt.bz2

# Compress keeping original
bzip2 -k file.txt

# Compress to stdout
bzip2 -c file.txt > file.txt.bz2

# Test integrity
bzip2 -t file.txt.bz2

# Compress tar archive
tar -cjf archive.tar.bz2 directory/
```

# COMPRESSION

Block size affects memory usage and compression:
- **-1** - 100 KB blocks (fast, lower compression)
- **-9** - 900 KB blocks (slow, better compression, default)

# CAVEATS

Slower than gzip. Default removes original file (use -k to keep). Single-threaded (use pbzip2 or lbzip2 for parallel). Memory usage proportional to block size. .bz2 files larger than .xz but smaller than .gz typically.

# HISTORY

**bzip2** was created by Julian Seward in **1996** as a replacement for the earlier bzip, using improved algorithms for better compression.

# SEE ALSO

[bunzip2](/man/bunzip2)(1), [gzip](/man/gzip)(1), [xz](/man/xz)(1), [tar](/man/tar)(1)
