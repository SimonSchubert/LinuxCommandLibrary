# TLDR

**Reduce colors**

```pnmquant [256] [input.pnm] > [output.pnm]```

**Use median-cut algorithm**

```pnmquant -center [16] [input.pnm] > [output.pnm]```

**Spread error (dithering)**

```pnmquant -fs [256] [input.pnm] > [output.pnm]```

# SYNOPSIS

**pnmquant** [_options_] _ncolors_ [_file_]

# PARAMETERS

_ncolors_
> Target number of colors.

**-fs**
> Floyd-Steinberg dithering.

**-center**
> Center box color selection.

**-spreadbrightness**
> Spread brightness.

**-mapfile** _file_
> Use colormap from file.

# DESCRIPTION

**pnmquant** reduces the number of colors in a PNM image. Uses median-cut quantization algorithm. Part of Netpbm toolkit for color reduction.

# SEE ALSO

[ppmquant](/man/ppmquant)(1), [pnmdepth](/man/pnmdepth)(1)

