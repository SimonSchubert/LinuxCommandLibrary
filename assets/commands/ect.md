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

```ect -recurse [directory]```

**Preserve modification time**

```ect -keep [image.png]```

**Strip metadata for smallest size**

```ect -strip [image.png]```

**Optimize JPEG** losslessly

```ect [image.jpg]```

# SYNOPSIS

**ect** [_options_] _files_...

# PARAMETERS

_FILES_
> Image files to optimize.

**-1** to **-9**
> Compression level (1 = fast, 9 = slowest/strongest). Default is **-3**.

**-recurse**
> Process directories recursively.

**-keep**
> Preserve file modification time.

**-strip**
> Strip metadata (EXIF, comments, color profiles).

**-progressive**
> Encode JPEGs as progressive.

**-gzip**
> Optimize gzip files instead of treating them as images.

**-zip**
> Optimize ZIP archives.

**-quiet**
> Suppress non-error output.

**--mt-deflate**[=_N_]
> Multithread the deflate stage; optionally pin to _N_ threads.

**--mt-file**[=_N_]
> Process multiple input files in parallel.

**-help**
> Display help information.

# DESCRIPTION

**ECT** (Efficient Compression Tool) losslessly optimizes PNG, JPEG, and gzip files for smaller sizes. It achieves better compression than many alternatives while remaining lossless.

The tool combines multiple compression strategies to reduce file sizes without quality loss. For PNG, it optimizes filters and DEFLATE compression. For JPEG, it optimizes Huffman tables.

ECT is useful for web optimization, reducing bandwidth and storage while maintaining perfect image quality.

# CAVEATS

High compression levels are very slow (level 9 may take minutes per image). Files are rewritten in place. Use **-strip** if you need the absolute smallest output, since metadata is kept by default.

# HISTORY

ECT was developed as a high-performance lossless image optimizer, combining techniques from multiple compression tools (zopfli, optipng, etc.) into an efficient single tool.

# SEE ALSO

[optipng](/man/optipng)(1), [pngcrush](/man/pngcrush)(1), [jpegoptim](/man/jpegoptim)(1)
