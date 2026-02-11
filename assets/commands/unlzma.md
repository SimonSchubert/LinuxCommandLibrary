# TAGLINE

Decompress LZMA compressed files

# TLDR

**Decompress file**

```unlzma [file.lzma]```

**Keep original**

```unlzma -k [file.lzma]```

**To stdout**

```unlzma -c [file.lzma]```

**Force overwrite**

```unlzma -f [file.lzma]```

**Verbose**

```unlzma -v [file.lzma]```

# SYNOPSIS

**unlzma** [_-k_] [_-c_] [_-f_] [_options_] _files_

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

**unlzma** decompresses files that were compressed with the LZMA (Lempel-Ziv-Markov chain Algorithm) compression format. It is functionally equivalent to running **xz --format=lzma --decompress** and is provided as a convenience command within the xz-utils package.

By default, unlzma replaces the compressed .lzma file with the decompressed output, removing the original. The **-k** flag preserves the original compressed file, and **-c** writes the decompressed data to standard output for piping to other commands.

The LZMA format is a legacy compression format that has been largely superseded by the XZ format, which uses the improved LZMA2 algorithm with better multi-threading support. unlzma remains useful for decompressing older archives and for compatibility with systems that still use the .lzma format.

# CAVEATS

Legacy format. Use xz for new files. Part of xz-utils.

# HISTORY

**unlzma** is part of **xz-utils**, providing decompression for the legacy LZMA format.

# SEE ALSO

[xz](/man/xz)(1), [lzma](/man/lzma)(1), [unxz](/man/unxz)(1)
