# TLDR

**Decompress file**

```unzstd [file.zst]```

**Keep original**

```unzstd -k [file.zst]```

**To stdout**

```unzstd -c [file.zst]```

**Force overwrite**

```unzstd -f [file.zst]```

**Decompress multiple**

```unzstd [file1.zst] [file2.zst]```

# SYNOPSIS

**unzstd** [_-k_] [_-c_] [_-f_] [_options_] _files_

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

**unzstd** decompresses Zstandard files. It extracts .zst.

Fast decompression. Very fast algorithm.

Equivalent to zstd -d. Same tool.

Modern format. Facebook developed.

High speed. Optimized decompression.

# CAVEATS

Newer format. May not be everywhere. Part of zstd package.

# HISTORY

**unzstd** is part of **Zstandard** (zstd), a fast compression algorithm developed by Facebook.

# SEE ALSO

[zstd](/man/zstd)(1), [gzip](/man/gzip)(1), [xz](/man/xz)(1)
