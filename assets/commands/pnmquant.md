# TAGLINE

Reduce color count in PNM images

# TLDR

**Reduce colors**

```pnmquant [256] [input.pnm] > [output.pnm]```

**Use center-of-box color selection**

```pnmquant -center [16] [input.pnm] > [output.pnm]```

**Apply Floyd-Steinberg dithering**

```pnmquant -floyd [256] [input.pnm] > [output.pnm]```

**Quantize to a predefined colormap**

```pnmquant -mapfile [mapfile.pnm] [256] [input.pnm] > [output.pnm]```

# SYNOPSIS

**pnmquant** [_options_] _ncolors_ [_file_]

# PARAMETERS

_ncolors_
> Target number of colors.

**-floyd**, **-fs**
> Enable Floyd-Steinberg dithering to improve visual quality.

**-nofloyd**, **-nofs**
> Disable dithering (default).

**-center**
> Choose the center of each color box as the representative color.

**-meancolor**
> Choose the mean of all colors in each box (default).

**-meanpixel**
> Choose the mean weighted by pixel count in each box.

**-spreadbrightness**
> Spread boxes based on brightness range rather than color population.

**-spreadluminosity**
> Spread boxes based on luminosity range.

**-mapfile** _file_
> Quantize to a predefined colormap from file.

# DESCRIPTION

**pnmquant** reduces the number of colors in a PNM image to a specified count using the median-cut color quantization algorithm. This is useful for preparing images for formats with limited color palettes or for reducing file size.

The **-floyd** option enables Floyd-Steinberg dithering to simulate more colors by distributing quantization error to neighboring pixels. The **-mapfile** option allows quantizing to a pre-defined color palette from another image. Part of the Netpbm toolkit; this is a wrapper script that calls **pnmcolormap** and **pnmremap** internally.

# SEE ALSO

[ppmquant](/man/ppmquant)(1), [pnmcolormap](/man/pnmcolormap)(1), [pnmremap](/man/pnmremap)(1), [pnmdepth](/man/pnmdepth)(1)

