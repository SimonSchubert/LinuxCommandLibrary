# TAGLINE

Compare gzip-compressed files byte-by-byte

# TLDR

**Compare compressed files**

```zcmp [file1.gz] [file2.gz]```

**Show differences**

```zcmp -l [file1.gz] [file2.gz]```

**Silent mode**

```zcmp -s [file1.gz] [file2.gz]```

# SYNOPSIS

**zcmp** [_-l_] [_-s_] _file1_ _file2_

# PARAMETERS

**-l**
> Show byte positions.

**-s**
> Silent, exit code only.

**-i** _SKIP_
> Skip bytes.

# DESCRIPTION

**zcmp** compares gzip-compressed files byte-by-byte without requiring manual decompression. It works like **cmp** but transparently handles .gz files, decompressing them on the fly for comparison.

By default, zcmp reports only the first difference found. The **-l** flag shows all differing byte positions and values. Silent mode (**-s**) suppresses all output and communicates only through exit codes: 0 if files are identical, 1 if they differ.

The command is part of the gzip package and acts as a convenience wrapper. For line-by-line comparison of compressed files, use **zdiff** instead.

# CAVEATS

Gzip format. For .gz files. Part of gzip package.

# HISTORY

**zcmp** is part of the gzip package, providing cmp-like functionality for compressed files.

# SEE ALSO

[cmp](/man/cmp)(1), [zdiff](/man/zdiff)(1), [zcat](/man/zcat)(1)
