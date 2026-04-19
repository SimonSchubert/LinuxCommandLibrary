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

**-b**, **--print-bytes**
> Print differing bytes (as octal values).

**-l**, **--verbose**
> Output byte numbers and differing byte values for all differences.

**-s**, **--quiet**, **--silent**
> Suppress all output; communicate result only via exit status.

**-i** _SKIP_, **--ignore-initial=**_SKIP_
> Skip the first _SKIP_ bytes of each (decompressed) input.

**-n** _LIMIT_, **--bytes=**_LIMIT_
> Compare at most _LIMIT_ bytes.

# DESCRIPTION

**zcmp** compares gzip-compressed files byte-by-byte without requiring manual decompression. It invokes **cmp** on uncompressed contents and passes all supplied options directly to it.

By default, zcmp reports only the first difference found. The **-l** flag shows all differing byte positions and values. Silent mode (**-s**) suppresses all output and communicates only through exit codes: 0 if files are identical, 1 if they differ, 2 on error.

The command is part of the gzip package and acts as a convenience wrapper. For line-by-line comparison of compressed files, use **zdiff** instead.

# CAVEATS

Gzip format. For .gz files. Part of gzip package.

# HISTORY

**zcmp** is part of the gzip package, providing cmp-like functionality for compressed files.

# SEE ALSO

[cmp](/man/cmp)(1), [zdiff](/man/zdiff)(1), [zcat](/man/zcat)(1)
