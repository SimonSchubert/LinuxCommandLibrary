# TLDR

**Decompress file**

```unxz [file.xz]```

**Keep original**

```unxz -k [file.xz]```

**To stdout**

```unxz -c [file.xz]```

**Force overwrite**

```unxz -f [file.xz]```

**Decompress multiple**

```unxz [file1.xz] [file2.xz]```

# SYNOPSIS

**unxz** [_-k_] [_-c_] [_-f_] [_options_] _files_

# PARAMETERS

**-k**
> Keep original.

**-c**
> Write to stdout.

**-f**
> Force overwrite.

**-v**
> Verbose mode.

**-q**
> Quiet mode.

# DESCRIPTION

**unxz** decompresses XZ files. It extracts .xz.

XZ decompression. High compression ratio.

Equivalent to xz -d. Same tool.

Replaces original. Unless -k used.

LZMA2 algorithm. Modern compression.

# CAVEATS

Slow for very large files. Part of xz-utils. Single-threaded by default.

# HISTORY

**unxz** is part of **xz-utils**, equivalent to running xz with decompression mode.

# SEE ALSO

[xz](/man/xz)(1), [gzip](/man/gzip)(1), [bzip2](/man/bzip2)(1)
