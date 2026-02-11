# TAGLINE

Decompress Zstandard compressed files

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

**unzstd** decompresses files that were compressed with the Zstandard (zstd) algorithm. It is functionally equivalent to running **zstd --decompress** and is provided as a convenience command within the zstd package.

Zstandard offers very fast decompression speeds while achieving compression ratios comparable to zlib. By default, unzstd replaces the compressed .zst file with the decompressed output. The **-k** flag preserves the original, and **-c** writes to standard output for piping.

Developed by Facebook (now Meta) and released in 2016, Zstandard has been adopted by the Linux kernel, package managers like pacman and apt, and many other tools as a modern replacement for gzip that provides both better compression and faster decompression.

# CAVEATS

Newer format. May not be everywhere. Part of zstd package.

# HISTORY

**unzstd** is part of **Zstandard** (zstd), a fast compression algorithm developed by Facebook.

# SEE ALSO

[zstd](/man/zstd)(1), [gzip](/man/gzip)(1), [xz](/man/xz)(1)
