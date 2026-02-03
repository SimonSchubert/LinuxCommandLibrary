# TLDR

**Flip horizontally**

```pnmflip -lr [input.pnm] > [output.pnm]```

**Flip vertically**

```pnmflip -tb [input.pnm] > [output.pnm]```

**Rotate 90 clockwise**

```pnmflip -cw [input.pnm] > [output.pnm]```

**Rotate 90 counter-clockwise**

```pnmflip -ccw [input.pnm] > [output.pnm]```

**Rotate 180**

```pnmflip -r180 [input.pnm] > [output.pnm]```

# SYNOPSIS

**pnmflip** [_options_] [_file_]

# PARAMETERS

**-lr**
> Flip left-right.

**-tb**
> Flip top-bottom.

**-cw**
> Rotate 90 degrees clockwise.

**-ccw**
> Rotate 90 degrees counter-clockwise.

**-r180**
> Rotate 180 degrees.

**-transpose**
> Transpose rows and columns.

# DESCRIPTION

**pnmflip** flips and rotates PNM images. Part of Netpbm toolkit for image manipulation. Supports all basic geometric transformations.

# SEE ALSO

[pnmrotate](/man/pnmrotate)(1), [pamflip](/man/pamflip)(1)

