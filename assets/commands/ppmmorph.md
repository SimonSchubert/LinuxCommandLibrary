# TAGLINE

Create morphing sequence between images

# TLDR

**Morph between two images**

```ppmmorph -n [10] [control.ctl] [image1.ppm] [image2.ppm] > [sequence.ppm]```

**Generate frames**

```ppmmorph -n [30] [morph.ctl] [start.ppm] [end.ppm]```

# SYNOPSIS

**ppmmorph** [_options_] _controlfile_ _image1_ _image2_

# PARAMETERS

**-n** _count_
> Number of intermediate frames.

**controlfile**
> Defines corresponding points.

# DESCRIPTION

**ppmmorph** creates a morphing sequence between two images. Control points define corresponding features in both images, and the tool generates smooth transitions.

Part of Netpbm toolkit.

# CONTROL FILE FORMAT

```
# Lines of corresponding points
# x1 y1 x2 y2 for image1 point to image2 point
100 50  150 60
200 100 250 110
```

# EXAMPLES

```bash
# Create 10-frame morph
ppmmorph -n 10 morph.ctl face1.ppm face2.ppm > sequence.ppm

# Split into individual frames
ppmmorph -n 20 morph.ctl a.ppm b.ppm | pamsplit frame%d.ppm

# Create animation
ppmmorph -n 30 ctrl.txt img1.ppm img2.ppm | \
  pamtogif > morph.gif
```

# CAVEATS

Requires careful control point placement. More points give smoother results. Images should be same size.

# HISTORY

ppmmorph is part of **Netpbm**, implementing the morphing technique popularized in the 1990s for film effects.

# SEE ALSO

[xmorph](/man/xmorph)(1), [pnmpaste](/man/pnmpaste)(1), [ppmfade](/man/ppmfade)(1), [netpbm](/man/netpbm)(1)
