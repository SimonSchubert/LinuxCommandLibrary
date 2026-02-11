# TAGLINE

Shear PNM images horizontally

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

**pnmshear** applies a horizontal shear transformation to PNM images, sliding each row by an amount proportional to its distance from the center. The result is a parallelogram-shaped image where the shear angle is specified in degrees.

Anti-aliasing is applied by default for smooth results. The **-background** option sets the fill color for newly exposed areas, and **-noantialias** disables smoothing. Part of the Netpbm toolkit.

# SEE ALSO

[pnmrotate](/man/pnmrotate)(1), [pnmflip](/man/pnmflip)(1)

