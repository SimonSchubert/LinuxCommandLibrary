# TAGLINE

Create bitmap mask from color selection

# TLDR

**Create mask for color**

```ppmcolormask [color] [input.ppm] > [mask.pbm]```

**Mask for red**

```ppmcolormask red [input.ppm] > [mask.pbm]```

**Mask for hex color**

```ppmcolormask "#ff0000" [input.ppm] > [mask.pbm]```

**Mask for RGB value**

```ppmcolormask "rgb:ff/00/00" [input.ppm] > [mask.pbm]```

# SYNOPSIS

**ppmcolormask** _color_ [_ppmfile_]

# PARAMETERS

**color**
> Target color (name, hex, or rgb format).

# DESCRIPTION

**ppmcolormask** creates a bitmap mask from a PPM image where matching pixels are white (1) and non-matching are black (0). Useful for selecting regions by color.

Part of Netpbm toolkit.

# EXAMPLES

```bash
# Mask white pixels
ppmcolormask white image.ppm > white_mask.pbm

# Mask specific color
ppmcolormask "#00ff00" image.ppm > green_mask.pbm

# Use mask to replace color
ppmcolormask blue original.ppm > mask.pbm
pnmpaste replacement.ppm 0 0 original.ppm -and mask.pbm > result.ppm

# Chain with conversion
jpegtopnm photo.jpg | ppmcolormask red | pnmtopng > red_mask.png
```

# COLOR FORMATS

```
Named:  red, green, blue, white, black...
Hex:    #rrggbb or #rgb
RGB:    rgb:rr/gg/bb
```

# CAVEATS

Exact color match only. For range matching, use pamfunc or similar. Output is PBM bitmap.

# HISTORY

ppmcolormask is part of **Netpbm** by **Jef Poskanzer**, providing color-based masking functionality.

# SEE ALSO

[pammasksharpen](/man/pammasksharpen)(1), [pnmcomp](/man/pnmcomp)(1), [pgmtopbm](/man/pgmtopbm)(1), [netpbm](/man/netpbm)(1)
