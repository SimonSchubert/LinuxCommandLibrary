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

**pnmrotate** rotates PNM images by any angle. Uses anti-aliasing by default for smooth rotation. Part of Netpbm toolkit.

# SEE ALSO

[pnmflip](/man/pnmflip)(1), [pnmshear](/man/pnmshear)(1)

