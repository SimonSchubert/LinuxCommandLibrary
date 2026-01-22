# TLDR

**Convert** image to ASCII

```ascii-image-converter [image.png]```

Convert with **color**

```ascii-image-converter -C [image.png]```

Convert with **specific width**

```ascii-image-converter -W [80] [image.png]```

Save to **file**

```ascii-image-converter [image.png] > [output.txt]```

Use **custom characters**

```ascii-image-converter -c " .:-=+*#%@" [image.png]```

# SYNOPSIS

**ascii-image-converter** [_-W width_] [_-C_] [_-c chars_] [_options_] _image_

# DESCRIPTION

**ascii-image-converter** transforms images into ASCII art. It analyzes pixel brightness and maps values to ASCII characters, creating text representations of images viewable in terminals.

The tool supports various image formats and can produce colored output using ANSI escape codes.

# PARAMETERS

**-W** _width_
> Output width in characters

**-H** _height_
> Output height in characters

**-C**, **--color**
> Enable colored output

**-c** _chars_
> Custom character set (dark to light)

**-b**, **--braille**
> Use Braille characters

**-f**, **--full**
> Full block characters

**-n**, **--negative**
> Invert colors

**--dither**
> Apply dithering

# CAVEATS

Output quality depends on terminal font and size. Colored output requires terminal with ANSI support. Wide images need large terminal widths.

# HISTORY

**ascii-image-converter** is a modern Go-based tool for ASCII art generation, providing more features than traditional tools like jp2a.

# SEE ALSO

[jp2a](/man/jp2a)(1), [libcaca](/man/libcaca)(1), [img2txt](/man/img2txt)(1)
