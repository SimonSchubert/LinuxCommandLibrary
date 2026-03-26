# TAGLINE

Transform images into ASCII art for terminal display

# TLDR

**Convert image to ASCII art**

```ascii-image-converter [image.png]```

**Convert with color output**

```ascii-image-converter -C [image.png]```

**Convert with specific width**

```ascii-image-converter -W [80] [image.png]```

**Convert using braille characters**

```ascii-image-converter -b [image.png]```

**Use a custom character map** (darkest to lightest)

```ascii-image-converter -m " .:-=+*#%@" [image.png]```

**Fit output to terminal width**

```ascii-image-converter -f [image.png]```

**Save output as PNG image**

```ascii-image-converter -s [output_dir] -C [image.png]```

# SYNOPSIS

**ascii-image-converter** [_options_] _image_

# DESCRIPTION

**ascii-image-converter** transforms images into ASCII art. It analyzes pixel brightness and maps values to ASCII characters, creating text representations of images viewable in terminals.

The tool supports various image formats and can produce colored output using ANSI escape codes.

# PARAMETERS

**-C**, **--color**
> Display with colors from the original image

**-b**, **--braille**
> Use Braille characters instead of ASCII

**-g**, **--grayscale**
> Display in grayscale colors

**-n**, **--negative**
> Invert colors

**-c**, **--complex**
> Use a wider range of ASCII characters for more detail

**-m** _chars_, **--map** _chars_
> Custom character string (darkest to lightest)

**-d** _width_,_height_, **--dimensions** _width_,_height_
> Set width and height in character lengths

**-W** _width_, **--width** _width_
> Set width; height calculated by aspect ratio

**-H** _height_, **--height** _height_
> Set height; width calculated by aspect ratio

**-f**, **--full**
> Fit to terminal width while maintaining aspect ratio

**-x**, **--flipX**
> Flip horizontally

**-y**, **--flipY**
> Flip vertically

**--dither**
> Apply dithering for braille art

**--threshold** _value_
> Threshold (0-255) for braille pixel comparison

**--color-bg**
> Apply color to character backgrounds instead of foregrounds

**-s** _dir_, **--save-img** _dir_
> Save output as PNG image

**--save-txt** _dir_
> Save output as TXT file

**--save-gif** _dir_
> Save converted GIF as ASCII art GIF

**--only-save**
> Suppress terminal output when saving

**--formats**
> Display supported input image formats

# CAVEATS

Output quality depends on terminal font and size. Colored output requires a terminal with 24-bit or 8-bit ANSI color support. Braille characters require UTF-8 terminal support. Wide images need large terminal widths.

# HISTORY

**ascii-image-converter** is a modern Go-based tool for ASCII art generation, providing more features than traditional tools like jp2a.

# SEE ALSO

[jp2a](/man/jp2a)(1), [img2txt](/man/img2txt)(1)
