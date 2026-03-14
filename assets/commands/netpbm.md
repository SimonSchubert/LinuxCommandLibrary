# TAGLINE

toolkit for image manipulation

# TLDR

**Convert JPEG to PPM**

```jpegtopnm [image.jpg] > [image.ppm]```

**Convert PNG to PPM**

```pngtopam [image.png] > [image.ppm]```

**Convert PPM to JPEG**

```pnmtojpeg [image.ppm] > [image.jpg]```

**Resize image**

```pamscale -width [800] [input.ppm] > [output.ppm]```

**Flip image**

```pamflip -lr [input.ppm] > [output.ppm]```

# SYNOPSIS

**netpbm** [_tool_] [_options_] [_files_]

# COMMON TOOLS

**jpegtopnm**
> Convert JPEG to PNM format.

**pngtopam**
> Convert PNG to PAM format.

**pnmtojpeg**
> Convert PNM to JPEG format.

**pnmtopng**
> Convert PNM to PNG format.

**ppmtogif**
> Convert PPM to GIF format.

**giftopnm**
> Convert GIF to PNM format.

**pamscale**
> Scale (resize) images.

**pamflip**
> Flip or rotate images.

**pnmcrop**
> Crop whitespace from edges.

**ppmbrighten**
> Adjust brightness and saturation.

**pnmcat**
> Concatenate images side by side or vertically.

# DESCRIPTION

**netpbm** is a toolkit of over 350 separate programs for manipulation of graphic images, including conversion between about 100 graphics formats. The programs use PNM (Portable Any Map) and PAM as intermediate formats for pipeline-based image processing.

The tools are designed for command-line use and pipeline composition. A typical workflow converts an input format to PNM, applies transformations, then converts to an output format. Each tool does one thing, and they are most powerful when combined in shell pipelines.

# CAVEATS

Not an interactive tool. Requires converting to/from PNM/PAM intermediate formats. Individual tools have separate man pages. Some tools have been superseded by newer equivalents (e.g., pnmtopng replaces ppmtogif for many use cases).

# HISTORY

Netpbm evolved from **PBMPLUS**, a pioneering image manipulation package created by Jef Poskanzer in 1988.

# SEE ALSO

[imagemagick](/man/imagemagick)(1), [convert](/man/convert)(1), [gimp](/man/gimp)(1)

