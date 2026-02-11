# TAGLINE

Remap image colors to a specified palette

# TLDR

**Remap image to palette**

```pnmremap -mapfile=[palette.pnm] [input.pnm] > [output.pnm]```

**Use Floyd-Steinberg dithering**

```pnmremap -floyd -mapfile=[palette.pnm] [input.pnm] > [output.pnm]```

**No dithering**

```pnmremap -nofloyd -mapfile=[palette.pnm] [input.pnm] > [output.pnm]```

# SYNOPSIS

**pnmremap** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input PNM file.

**-mapfile** _FILE_
> Color palette image.

**-floyd**
> Use Floyd-Steinberg dithering.

**-nofloyd**
> No dithering.

**-norandom**
> Disable random dithering.

**-firstisdefault**
> Use first palette color as default.

# DESCRIPTION

**pnmremap** replaces each pixel's color in a PNM image with the closest matching color from a specified palette image. This is useful for forcing an image to use only a specific set of colors, such as when targeting a limited-color display format.

The **-floyd** option enables Floyd-Steinberg error diffusion dithering for smoother visual results. The palette is provided via **-mapfile** as a PNM image where each unique pixel color represents one allowed color. Part of the Netpbm toolkit.

# CAVEATS

Requires palette file. Part of Netpbm suite.

# HISTORY

pnmremap was created as part of **Netpbm** for color palette mapping.

# SEE ALSO

[ppmquant](/man/ppmquant)(1), [pnmcolormap](/man/pnmcolormap)(1), [ppmtogif](/man/ppmtogif)(1)

