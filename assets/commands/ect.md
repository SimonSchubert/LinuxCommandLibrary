# TAGLINE

lossless image compression optimizer

# TLDR

**Optimize PNG file**

```ect [image.png]```

**Optimize with maximum** compression

```ect -9 [image.png]```

**Optimize multiple files**

```ect [*.png]```

**Optimize recursively**

```ect --recurse [directory]```

**Keep original files**

```ect --keep [image.png]```

**Optimize JPEG** losslessly

```ect [image.jpg]```

# SYNOPSIS

**ect** [_options_] _files_...

# PARAMETERS

_FILES_
> Image files to optimize.

**-1** to **-9**
> Compression level (9 = maximum).

**--recurse**
> Process directories recursively.

**--keep**
> Keep original files.

**--strip**
> Remove metadata.

**--gzip**
> Optimize gzip files.

**--help**
> Display help information.

# DESCRIPTION

**ECT** (Efficient Compression Tool) losslessly optimizes PNG, JPEG, and gzip files for smaller sizes. It achieves better compression than many alternatives while remaining lossless.

The tool combines multiple compression strategies to reduce file sizes without quality loss. For PNG, it optimizes filters and DEFLATE compression. For JPEG, it optimizes Huffman tables.

ECT is useful for web optimization, reducing bandwidth and storage while maintaining perfect image quality.

# CAVEATS

High compression levels are slow. Original files overwritten by default. Some metadata may be stripped. Very large files may use significant memory.

# HISTORY

ECT was developed as a high-performance lossless image optimizer, combining techniques from multiple compression tools (zopfli, optipng, etc.) into an efficient single tool.

# SEE ALSO

[optipng](/man/optipng)(1), [pngcrush](/man/pngcrush)(1), [jpegoptim](/man/jpegoptim)(1)
