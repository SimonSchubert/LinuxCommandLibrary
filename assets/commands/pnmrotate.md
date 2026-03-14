# TAGLINE

Rotate PNM images by an arbitrary angle

# TLDR

**Rotate image**

```pnmrotate [45] [input.pnm] > [output.pnm]```

**Rotate with background color**

```pnmrotate -background [white] [30] [input.pnm] > [output.pnm]```

**Rotate without anti-aliasing**

```pnmrotate -noantialias [30] [input.pnm] > [output.pnm]```

# SYNOPSIS

**pnmrotate** [_options_] _angle_ [_file_]

# PARAMETERS

_angle_
> Rotation angle in degrees (must be between -90 and 90). Measured counter-clockwise.

**-background** _color_
> Background fill color. By default, pnmrotate selects what appears to be the background color of the original image.

**-noantialias**
> Disable anti-aliasing. Simply moves pixels instead of synthesizing output pixels from multiple input pixels.

# DESCRIPTION

**pnmrotate** rotates PNM images by an arbitrary angle specified in degrees (between -90 and 90, measured counter-clockwise). The output image is enlarged as needed to contain the full rotated result, with new areas filled by the background color.

Anti-aliasing is applied by default for smooth edges; use **-noantialias** to disable it for faster processing or when working with binary images. For rotations that are multiples of 90 degrees, use **pamflip** instead. Part of the Netpbm toolkit.

# SEE ALSO

[pamflip](/man/pamflip)(1), [pnmflip](/man/pnmflip)(1), [pnmshear](/man/pnmshear)(1)

