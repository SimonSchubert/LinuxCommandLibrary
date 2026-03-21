# TAGLINE

Optimize PNG files for smaller size

# TLDR

**Optimize PNG**

```pngcrush [input.png] [output.png]```

**Optimize in place**

```pngcrush -ow [image.png]```

**Remove metadata**

```pngcrush -rem alla [input.png] [output.png]```

**Best compression**

```pngcrush -brute [input.png] [output.png]```

**Reduce colors**

```pngcrush -reduce [input.png] [output.png]```

**Batch optimize** all PNGs in a directory

```pngcrush -d [output_dir/] [input_dir/]*.png```

**Set specific compression level** (0-9)

```pngcrush -l [9] [input.png] [output.png]```

# SYNOPSIS

**pngcrush** [_options_] _input_ [_output_]

# PARAMETERS

_INPUT_
> Input PNG file.

_OUTPUT_
> Output PNG file.

**-ow**
> Overwrite the input file in place.

**-d** _DIRECTORY_
> Write output files to the specified directory.

**-rem** _CHUNK_
> Remove a specified ancillary chunk. Use **alla** to remove all text chunks, or **allb** to remove all non-critical chunks.

**-brute**
> Try all 148 filter/compression combinations for maximum reduction.

**-reduce**
> Reduce color depth and bit depth where possible without data loss.

**-l** _LEVEL_
> Set zlib compression level (0 = no compression, 9 = maximum).

**-n**
> No output file; test compression without writing (useful for benchmarks).

**-fix**
> Fix otherwise fatal conditions such as bad CRCs.

# DESCRIPTION

**pngcrush** optimizes PNG files by testing multiple compression strategies and selecting the smallest result. The optimization is completely lossless - the image data is preserved exactly while reducing file size through better compression parameters.

The **-brute** option tries all filter and compression combinations for maximum reduction at the cost of processing time. The **-rem** option strips metadata chunks like text comments, timestamps, and color profiles to further reduce size.

# CAVEATS

All optimization is lossless; image data is preserved exactly. The **-brute** option can be very slow on large images as it tests all 148 compression strategies. The **-ow** flag creates a temporary file and replaces the original, so sufficient disk space is needed. Does not support animated PNGs (APNG).

# HISTORY

**pngcrush** was created by Glenn Randers-Pehrson and has been one of the oldest and most widely used PNG optimization tools, first released in 1998.

# SEE ALSO

[optipng](/man/optipng)(1), [pngcheck](/man/pngcheck)(1), [pngquant](/man/pngquant)(1), [zopflipng](/man/zopflipng)(1), [convert](/man/convert)(1)

