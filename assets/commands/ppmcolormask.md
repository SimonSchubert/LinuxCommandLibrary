# TAGLINE

Create a PBM mask from one or more colors in a PPM image

# TLDR

**Mask a single color** (modern syntax)

```ppmcolormask -color=[red] [input.ppm] > [mask.pbm]```

**Mask several colors at once**

```ppmcolormask -color=[red,pink,salmon] [input.ppm] > [mask.pbm]```

**Use a hex/RGB color**

```ppmcolormask -color=[rgb:ff/00/00] [input.ppm] > [mask.pbm]```

**Use Berlin-Kay fuzzy color matching**

```ppmcolormask -color=[bk:red,bk:orange] [input.ppm] > [mask.pbm]```

**Obsolete positional form** (single exact color)

```ppmcolormask [red] [input.ppm] > [mask.pbm]```

**Feed a non-PPM image via pipe**

```jpegtopnm [photo.jpg] | ppmcolormask -color=[white] > [mask.pbm]```

# SYNOPSIS

**ppmcolormask** **-color=**_color_list_ [_ppmfile_]

**ppmcolormask** _color_ [_ppmfile_]

# PARAMETERS

**-color=**_color_list_
> Mandatory. Comma-separated list of colors to mask. Each color may be a named color (`red`), a hex/rgb specifier (`rgb:ff/00/00`, `#ff0000`), or a Berlin-Kay fuzzy match prefixed with `bk:`.

**-quiet**
> Common libnetpbm option: suppress informational messages on stderr.

# DESCRIPTION

**ppmcolormask** reads a PPM image and writes a PBM bitmap of the same dimensions. In the output, pixels matching any color in the **-color** list are **black**; all other pixels are **white**. The resulting mask is meant to be fed to programs such as **pamcomp** (as an alpha channel) or used with **pnmpaste** for region replacement.

The Berlin-Kay (`bk:`) form applies a Sugeno-type fuzzy inference over HSV values, so related shades of a named color all match. The positional (non-`-color`) form is retained only for backwards compatibility and supports just one exact color.

If _ppmfile_ is omitted, input is read from standard input; output is always written to standard output.

# CAVEATS

The non-`bk:` match is exact — small rounding differences from JPEG or scaling can miss pixels. For range or tolerance-based matching, use **pambackground** (for background selection) or pre-quantize the image with **ppmquant**.

Output is always PBM, so a mask cannot encode partial transparency; convert with **pgmtopbm** or use `pnmtopng -transparent` if that is what you actually need.

# HISTORY

**ppmcolormask** is part of the **Netpbm** toolkit originally written by **Jef Poskanzer**. The `-color` form (accepting a color list and Berlin-Kay matching) superseded the positional-color form in Netpbm 10.32.

# SEE ALSO

[pamcomp](/man/pamcomp)(1), [ppmchange](/man/ppmchange)(1), [pambackground](/man/pambackground)(1), [pbmmask](/man/pbmmask)(1), [pnmtopng](/man/pnmtopng)(1), [pnmcomp](/man/pnmcomp)(1), [netpbm](/man/netpbm)(1)
