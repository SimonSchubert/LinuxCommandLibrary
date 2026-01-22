# TLDR

**Compress** files

```compress path/to/file1 path/to/file2```

Compress with **force** (overwrite existing)

```compress -f path/to/file```

Set maximum **compression bits**

```compress -b 12 path/to/file```

Write to **stdout** without modifying files

```compress -c path/to/file```

**Decompress** files

```compress -d path/to/file.Z```

Display **compression percentage**

```compress -v path/to/file```

**Keep** original files

```compress -k path/to/file```

# SYNOPSIS

**compress** [**-fkvcV**] [**-b** _bits_] [_file_...]

# DESCRIPTION

**compress** reduces file sizes using adaptive Lempel-Ziv coding. Compressed files are given a .Z extension. The program preserves file ownership, modes, and timestamps. It ignores symbolic links and refuses to compress files with multiple hard links unless forced.

# PARAMETERS

**-f**
> Force compression, overwriting existing files and compressing files with hard links

**-k**
> Keep (do not delete) input files

**-v**
> Verbose mode; display compression percentage for each file

**-c**
> Write output to stdout without modifying any files

**-V**
> Print version and patchlevel information

**-r**
> Operate recursively through directories

**-b BITS**
> Set maximum bits per code (9-16, default 16)

**--**
> Stop parsing options; treat remaining arguments as filenames

# CAVEATS

The program uses a modified Lempel-Ziv algorithm starting with 9-bit codes. Typical compression achieves 50-60% reduction for text files. Exit status is 0 for success, 2 if output would be larger than input, and 1 for errors. Use -b12 for compatibility with older systems.

# HISTORY

**compress** implements the classic Unix LZW compression algorithm. While largely superseded by gzip and other modern compressors, it remains available for compatibility and for processing .Z files.

# SEE ALSO

[uncompress](/man/uncompress)(1), [gzip](/man/gzip)(1), [bzip2](/man/bzip2)(1), [zcat](/man/zcat)(1)
