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

**ppmtoascii** reads a PPM image and produces a somewhat crude ASCII graphic as output, with ANSI terminal control characters so it has crude color when sent to a color text terminal. Part of the Netpbm toolkit.

In addition to the resolution options, **ppmtoascii** supports the common Netpbm options such as **-quiet** to suppress informational messages.

Note that **ppmtoterm** does a similar conversion but displays each character as a single pixel (using the same dense character for every pixel), whereas **ppmtoascii** combines 2 or 8 pixels into one character that roughly represents those pixels.

# SEE ALSO

[pbmtoascii](/man/pbmtoascii)(1), [ppmtoterm](/man/ppmtoterm)(1), [ppmtosixel](/man/ppmtosixel)(1)

