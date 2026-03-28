# TAGLINE

Add text labels to PPM images

# TLDR

**Add text label to image**

```ppmlabel -text "[Hello World]" [input.ppm] > [output.ppm]```

**Add label at specific position**

```ppmlabel -x [10] -y [20] -text "[Label]" [input.ppm] > [output.ppm]```

**Add label with custom color and size**

```ppmlabel -color [white] -size [24] -text "[Label]" [input.ppm] > [output.ppm]```

**Add rotated label**

```ppmlabel -angle [45] -text "[Watermark]" [input.ppm] > [output.ppm]```

**Add label with background highlight**

```ppmlabel -background [black] -color [yellow] -text "[Warning]" [input.ppm] > [output.ppm]```

**Add multiple labels** using a script file

```ppmlabel -file [labels.txt] [input.ppm] > [output.ppm]```

# SYNOPSIS

**ppmlabel** [_options_] [_file_]

# PARAMETERS

**-text** _string_
> Text string to render on the image.

**-file** _filename_
> Read label commands from a file, one per line.

**-x** _pixels_
> Horizontal position of the label from the left edge.

**-y** _pixels_
> Vertical position of the label baseline from the top edge.

**-color** _color_
> Text color (Netpbm color name or #rrggbb hex value).

**-background** _color_
> Background color behind the text. Default is transparent (no background).

**-angle** _degrees_
> Rotation angle in degrees counterclockwise. Default is 0.

**-size** _pixels_
> Font height in pixels. Default depends on the built-in font.

# DESCRIPTION

**ppmlabel** adds text labels to PPM (Portable Pixmap) images. It reads a PPM image, renders one or more text strings at specified positions with optional color, size, and rotation, and writes the result as a new PPM image. Part of the Netpbm toolkit.

Multiple labels can be placed on a single image by specifying multiple **-text** options or by using the **-file** option to read label specifications from a file. Each label can have independent position, color, size, and angle settings.

# CAVEATS

Uses a built-in bitmap font; does not support TrueType or external fonts. For more advanced text rendering, consider **pbmtext** piped through **pnmcomp**. Input and output are PPM format only.

# SEE ALSO

[pbmtext](/man/pbmtext)(1), [pnmcomp](/man/pnmcomp)(1), [ppmdraw](/man/ppmdraw)(1), [ppmchange](/man/ppmchange)(1)

