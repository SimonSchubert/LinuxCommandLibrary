# TAGLINE

converts JPEG images to ASCII art

# TLDR

**Convert image to ASCII**

```jp2a [image.jpg]```

**Set output width**

```jp2a --width=[80] [image.jpg]```

**Colored ASCII**

```jp2a --colors [image.jpg]```

**Invert colors**

```jp2a --invert [image.jpg]```

**Custom characters**

```jp2a --chars="[.:-=+*#%@]" [image.jpg]```

**Output to file**

```jp2a [image.jpg] --output=[output.txt]```

# SYNOPSIS

**jp2a** [_options_] _file_...

# PARAMETERS

_FILE_
> Image file(s) to convert.

**--width** _N_
> Output width in characters.

**--height** _N_
> Output height.

**--colors**
> Use ANSI colors.

**--invert**
> Invert brightness.

**--chars** _STRING_
> Character ramp to use.

**--output** _FILE_
> Output file.

**--help**
> Display help information.

# DESCRIPTION

**jp2a** converts JPEG images to ASCII art. It maps pixel brightness to characters for text-based display.

The tool supports color output for terminals. It can process multiple images and URLs.

# CAVEATS

JPEG input required. Terminal width affects output. Aspect ratio considerations.

# HISTORY

jp2a was created to convert JPEG images to ASCII art for terminal display and text-based image representation.

# SEE ALSO

[img2txt](/man/img2txt)(1), [aalib](/man/aalib)(3), [cacaview](/man/cacaview)(1)
