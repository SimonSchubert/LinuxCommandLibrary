# TAGLINE

compare compressed files byte by byte

# TLDR

**Compare two compressed files**

```lzcmp [file1.xz] [file2.xz]```

**Compare with verbose output**

```lzcmp -l [file1.xz] [file2.xz]```

**Compare silently**

```lzcmp -s [file1.gz] [file2.gz]```

**Compare compressed file with its uncompressed original**

```lzcmp [file.xz]```

# SYNOPSIS

**lzcmp** [_cmp_options_] _file1_ [_file2_]

# PARAMETERS

**-l**
> Print byte number and differing byte values.

**-s**
> Silent mode, output nothing, return exit status only.

All options are passed directly to **cmp**(1).

# DESCRIPTION

**lzcmp** invokes cmp(1) on compressed files. It supports files compressed with xz, lzma, gzip, bzip2, lzop, zstd, and lz4. If only one file is specified, it is compared against a file with the compression suffix stripped. If two files are specified, both are decompressed as needed and fed to cmp. The exit status from cmp is preserved: 0 if identical, 1 if different, 2 on error.

The name lzcmp is provided for backward compatibility with LZMA Utils. It is deprecated in favor of **xzcmp** and will be removed in a future version of XZ Utils.

# SEE ALSO

[cmp](/man/cmp)(1), [lzdiff](/man/lzdiff)(1), [xzcmp](/man/xzcmp)(1), [xzdiff](/man/xzdiff)(1), [zcmp](/man/zcmp)(1), [xz](/man/xz)(1)

