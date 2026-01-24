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

**unlzma** decompresses LZMA files. It extracts .lzma.

LZMA decompression. High ratio format.

Equivalent to xz --format=lzma. Same tool.

Single file decompression. In-place.

Legacy format support. LZMA1 algorithm.

# CAVEATS

Legacy format. Use xz for new files. Part of xz-utils.

# HISTORY

**unlzma** is part of **xz-utils**, providing decompression for the legacy LZMA format.

# SEE ALSO

[xz](/man/xz)(1), [lzma](/man/lzma)(1), [unxz](/man/unxz)(1)
