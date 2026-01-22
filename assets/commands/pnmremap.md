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

**pnmremap** remaps image colors to a palette. Reduces color count.

The tool quantizes to specified colors. Supports dithering methods.

pnmremap remaps colors.

# CAVEATS

Requires palette file. Part of Netpbm suite.

# HISTORY

pnmremap was created as part of **Netpbm** for color palette mapping.

# SEE ALSO

[ppmquant](/man/ppmquant)(1), [pnmcolormap](/man/pnmcolormap)(1), [ppmtogif](/man/ppmtogif)(1)

