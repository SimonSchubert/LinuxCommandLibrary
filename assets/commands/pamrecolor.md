# TAGLINE

changes the colors of an image while preserving luminance

# TLDR

**Colorize grayscale image**

```pamrecolor -colorfile [color.ppm] [gray.ppm] > [output.ppm]```

**Apply color from solid**

```pamrecolor -targetcolor "rgb:ff/00/00" [gray.ppm] > [red.ppm]```

**Preserve luminance**

```pamrecolor -colorfile [palette.ppm] -rmult [1.0] [input.ppm] > [output.ppm]```

# SYNOPSIS

**pamrecolor** [_options_] [_pamfile_]

# PARAMETERS

**-colorfile** _file_
> Source color image.

**-targetcolor** _color_
> Single target color.

**-rmult**, **-gmult**, **-bmult** _factor_
> Channel multipliers.

# DESCRIPTION

**pamrecolor** changes the colors of an image while preserving luminance. It can colorize grayscale images or remap colors from one image using colors from another.

# EXAMPLE

```bash
# Colorize old photo with sepia
pamrecolor -targetcolor "rgb:94/6d/50" old_photo.ppm > sepia.ppm

# Apply palette from reference
pamrecolor -colorfile reference.ppm target.ppm > recolored.ppm
```

# CAVEATS

Results depend on luminance preservation. Works best on grayscale or low-saturation images.

# HISTORY

pamrecolor is part of **Netpbm**, providing color manipulation tools for image processing.

# SEE ALSO

[ppmchange](/man/ppmchange)(1), [pamgamma](/man/pamgamma)(1), [ppmtopgm](/man/ppmtopgm)(1)
