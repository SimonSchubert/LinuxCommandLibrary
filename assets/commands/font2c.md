# TLDR

**Convert font to** C array

```font2c [font.ttf] [output.c]```

**Specify character range**

```font2c --range [32-126] [font.ttf] [output.c]```

**Set pixel size**

```font2c --size [16] [font.ttf] [output.c]```

**Generate header file**

```font2c --header [font.ttf] [output.h]```

# SYNOPSIS

**font2c** [_options_] _font-file_ _output-file_

# PARAMETERS

_FONT-FILE_
> Input font file (.ttf, .otf).

_OUTPUT-FILE_
> Output C source file.

**--range** _CHARS_
> Character range to include.

**--size** _PIXELS_
> Font size in pixels.

**--header**
> Generate header file.

**--format** _FORMAT_
> Output format.

**--help**
> Display help information.

# DESCRIPTION

**font2c** converts font files to C source code arrays for embedded systems. It renders characters at specified sizes and outputs bitmap data as C arrays.

The tool enables using custom fonts on displays without font rendering libraries. Character ranges can be limited to reduce memory usage on constrained devices.

font2c produces data suitable for microcontrollers, OLED displays, and other embedded graphics applications.

# CAVEATS

Output size depends on font and character count. Anti-aliasing may not work on all targets. Bitmap fonts lose scalability.

# HISTORY

font2c tools exist in various forms for embedded development, converting vector fonts to bitmap arrays usable without runtime font rendering on resource-constrained devices.

# SEE ALSO

[fontforge](/man/fontforge)(1), [otf2bdf](/man/otf2bdf)(1)
