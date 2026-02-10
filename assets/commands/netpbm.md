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

# PARAMETERS

_TOOL_
> Specific netpbm utility.

**jpegtopnm**
> Convert JPEG to portable format.

**pngtopam**
> Convert PNG to PAM.

**pamscale**
> Scale images.

**pamflip**
> Flip/rotate images.

**--help**
> Display help information.

# DESCRIPTION

**netpbm** is a toolkit for image manipulation. It includes many utilities for format conversion.

The tools work with portable bitmap formats. Pipeline-based image processing.

# CAVEATS

Collection of tools. PNM/PAM intermediate format. Command-line based.

# HISTORY

Netpbm evolved from **PBMPLUS**, a pioneering image manipulation package created by Jef Poskanzer in 1988.

# SEE ALSO

[imagemagick](/man/imagemagick)(1), [convert](/man/convert)(1), [gimp](/man/gimp)(1)

