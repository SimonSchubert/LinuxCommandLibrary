# TLDR

**Compress PNG with quality range**

```pngquant --quality=[65-80] [image.png]```

**Compress to specific output file**

```pngquant [image.png] -o [output.png]```

**Compress and overwrite original**

```pngquant --ext=.png --force [image.png]```

**Compress with specific color count**

```pngquant [256] [image.png]```

**Compress multiple files**

```pngquant [*.png]```

**Compress with maximum quality**

```pngquant --quality=[90-100] [image.png]```

**Skip if quality cannot be met**

```pngquant --skip-if-larger [image.png]```

**Output to stdout** (for piping)

```pngquant - < [input.png] > [output.png]```

# SYNOPSIS

**pngquant** [_--quality min-max_] [_--speed N_] [_--output file_] [_--ext suffix_] [_colors_] _files_

# PARAMETERS

**--quality** _MIN_-_MAX_
> Quality range (0-100). Skip if quality below MIN.

**-o**, **--output** _FILE_
> Output file name.

**--ext** _SUFFIX_
> Set output filename suffix (default: -fs8.png).

**-f**, **--force**
> Overwrite existing files.

**-s** _N_, **--speed** _N_
> Speed/quality tradeoff (1=slowest, 11=fastest).

**--skip-if-larger**
> Don't write if output larger than input.

**--strip**
> Remove metadata.

**--posterize** _BITS_
> Reduce precision of color channels.

**--nofs**
> Disable Floyd-Steinberg dithering.

**--floyd** _SPREAD_
> Set dithering level (0-1).

**-v**, **--verbose**
> Verbose output.

**-**
> Read from stdin, write to stdout.

_NUM_
> Maximum number of colors (default: 256).

# DESCRIPTION

**pngquant** compresses PNG images by reducing the number of colors using lossy quantization. It converts 24/32-bit PNG to 8-bit palette PNG, dramatically reducing file size while maintaining visual quality.

The algorithm uses median-cut quantization with dithering to hide color reduction artifacts. Quality settings control how aggressively colors are reduced - higher quality preserves more detail but produces larger files.

Quality range (e.g., 65-80) sets minimum acceptable quality. If the minimum cannot be achieved, pngquant exits without writing (exit code 99). This prevents unacceptably degraded images.

Speed setting trades processing time for output quality. Slower speeds find better color palettes. For automated pipelines, moderate speeds (3-4) offer good balance.

The tool excels at compressing graphics, icons, and images with limited colors. Photographs may show more visible quality loss due to the 256-color limit.

# CAVEATS

Lossy compression - some quality is lost. 256 color maximum limits complex images. Photographs may not compress well. Original transparency is preserved but reduced to 8-bit. Metadata stripped by default. Results vary significantly by image content.

# HISTORY

**pngquant** was created by **Greg Roelofs** around **1997** with the original PNG specification work. The project was later taken over by **Kornel Lesinski** who rewrote it with the libimagequant library around **2011**. It became essential for web optimization, used in build tools and image CDNs to reduce bandwidth.

# SEE ALSO

[optipng](/man/optipng)(1), [oxipng](/man/oxipng)(1), [imagemagick](/man/imagemagick)(1), [jpegoptim](/man/jpegoptim)(1)
