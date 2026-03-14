# TAGLINE

Convert PPM images to ASCII art

# TLDR

**Convert PPM to ASCII art** (default 1x2 cell size)

```ppmtoascii [input.ppm]```

**Convert with 2x4 cell size** for more detail

```ppmtoascii -2x4 [input.ppm]```

# SYNOPSIS

**ppmtoascii** [_-1x2_|_-2x4_] [_file_]

# PARAMETERS

**-1x2**
> Each character represents 1 pixel across by 2 pixels down. This is the default.

**-2x4**
> Each character represents 2 pixels across by 4 pixels down, giving more detail.

# DESCRIPTION

**ppmtoascii** reads a PPM image and produces ASCII art as output, with ANSI terminal control characters for color when displayed on a color text terminal. Part of the Netpbm toolkit.

# SEE ALSO

[pbmtoascii](/man/pbmtoascii)(1), [ppmtosixel](/man/ppmtosixel)(1)

