# TLDR

**Shear image horizontally**

```pnmshear [30] [input.pnm] > [output.pnm]```

**Shear with background color**

```pnmshear -background [white] [45] [input.pnm] > [output.pnm]```

# SYNOPSIS

**pnmshear** [_options_] _angle_ [_file_]

# PARAMETERS

_angle_
> Shear angle in degrees.

**-background** _color_
> Fill color for new areas.

**-noantialias**
> Disable anti-aliasing.

# DESCRIPTION

**pnmshear** shears PNM images by a specified angle. Creates parallelogram-shaped output. Part of Netpbm toolkit for geometric transformations.

# SEE ALSO

[pnmrotate](/man/pnmrotate)(1), [pnmflip](/man/pnmflip)(1)

