# TAGLINE

Rotate PNM images by any angle

# TLDR

**Rotate image**

```pnmrotate [45] [input.pnm] > [output.pnm]```

**Rotate with background color**

```pnmrotate -background [white] [30] [input.pnm] > [output.pnm]```

**Rotate without anti-aliasing**

```pnmrotate -noantialias [90] [input.pnm] > [output.pnm]```

# SYNOPSIS

**pnmrotate** [_options_] _angle_ [_file_]

# PARAMETERS

_angle_
> Rotation angle in degrees.

**-background** _color_
> Background fill color.

**-noantialias**
> Disable anti-aliasing.

# DESCRIPTION

**pnmrotate** rotates PNM images by an arbitrary angle specified in degrees. The output image is enlarged as needed to contain the full rotated result, with new areas filled by the background color.

Anti-aliasing is applied by default for smooth edges; use **-noantialias** to disable it for faster processing or when working with binary images. The **-background** option sets the fill color for areas outside the rotated image. Part of the Netpbm toolkit.

# SEE ALSO

[pnmflip](/man/pnmflip)(1), [pnmshear](/man/pnmshear)(1)

