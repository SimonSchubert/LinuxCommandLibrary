# TAGLINE

Reduce color count in PNM images

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

**pnmquant** reduces the number of colors in a PNM image to a specified count using the median-cut color quantization algorithm. This is useful for preparing images for formats with limited color palettes or for reducing file size.

The **-fs** option enables Floyd-Steinberg dithering to simulate more colors by distributing quantization error to neighboring pixels. The **-mapfile** option allows quantizing to a pre-defined color palette from another image. Part of the Netpbm toolkit; wrapper around **pnmcolormap** and **pnmremap**.

# SEE ALSO

[ppmquant](/man/ppmquant)(1), [pnmdepth](/man/pnmdepth)(1)

