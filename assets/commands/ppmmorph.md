# TAGLINE

Not a Netpbm program: use ppmfade for image transitions

# TLDR

**Create a transition** between two images with the real Netpbm tool

```ppmfade -f [first.ppm] -l [last.ppm] -mix -base [frame]```

**Fade an image to black**

```ppmfade -f [first.ppm] -mix -base [frame]```

# SYNOPSIS

**ppmfade** [**-f** _first.ppm_] [**-l** _last.ppm_] [**-mix**|**-spread**|**-shift**|**-relief**|**-oil**|**-edge**|**-bentley**|**-block**] [**-base** _name_]

# DESCRIPTION

No program named **ppmmorph** could be found in the Netpbm program directory or its distribution packages, so its existence and options cannot be confirmed.

The closest Netpbm tool is **ppmfade**, which writes 30 intermediate PPM frames named _base_.nnnn.ppm. It blends between images using effects but does not morph them with control points. The ppmfade manual recommends **xmorph** for true morphing.

# SEE ALSO

[ppmfade](/man/ppmfade)(1), [netpbm](/man/netpbm)(1)
