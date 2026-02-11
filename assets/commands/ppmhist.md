# TAGLINE

Display color histogram of PPM images

# TLDR

**Show color histogram**

```ppmhist [input.ppm]```

**Show as map file**

```ppmhist -map [input.ppm]```

**Limit output colors**

```ppmhist -noheader [input.ppm] | head -20```

# SYNOPSIS

**ppmhist** [_options_] [_file_]

# PARAMETERS

**-map**
> Output as colormap file.

**-nomap**
> Output as text histogram.

**-noheader**
> Omit header line.

**-sort** _method_
> Sort by (frequency, rgb).

# DESCRIPTION

**ppmhist** displays a color histogram of a PPM image. Shows each color and its frequency. Part of Netpbm toolkit for image analysis.

# SEE ALSO

[pgmhist](/man/pgmhist)(1), [pnmcolormap](/man/pnmcolormap)(1)

