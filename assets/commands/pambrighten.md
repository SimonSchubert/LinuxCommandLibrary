# TAGLINE

adjusts brightness and saturation of Netpbm images using HSV color model

# TLDR

**Increase image brightness by 50%**

```pambrighten -value 50 [input.pam] > [output.pam]```

**Decrease saturation by 30%**

```pambrighten -saturation -30 [input.pam] > [output.pam]```

**Adjust both brightness and saturation**

```pambrighten -value [20] -saturation [10] [input.pam] > [output.pam]```

**Read from stdin**

```cat [input.pam] | pambrighten -value [50] > [output.pam]```

# SYNOPSIS

**pambrighten** [**-value** _n_] [**-saturation** _n_] [_file_]

# PARAMETERS

**-value** _n_
> Change Value (brightness) by percentage. May be negative. Default is 0.

**-saturation** _n_
> Change Saturation by percentage. May be negative. Default is 0.

# DESCRIPTION

**pambrighten** increases or decreases the Saturation and Value (from the HSV color space) of each pixel of a Netpbm image by a specified percentage. Positive values increase, negative values decrease. If no file is specified, reads from stdin.

Minimum unique abbreviation of option names is acceptable. Double hyphens may be used instead of single hyphens. Part of the Netpbm toolkit.

# SEE ALSO

[pamfunc](/man/pamfunc)(1), [ppmbrighten](/man/ppmbrighten)(1)

