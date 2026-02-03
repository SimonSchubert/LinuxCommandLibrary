# TLDR

**Increase image brightness**

```pambrighten -value [50] [input.pam] > [output.pam]```

**Adjust saturation**

```pambrighten -saturation [-30] [input.pam] > [output.pam]```

# SYNOPSIS

**pambrighten** [_options_] [_file_]

# PARAMETERS

**-value** _n_
> Change brightness by percentage (-100 to +100).

**-saturation** _n_
> Change saturation by percentage (-100 to +100).

# DESCRIPTION

**pambrighten** adjusts brightness and saturation of PAM/PPM images using HSV color model. Positive values increase, negative values decrease. Part of Netpbm toolkit.

# SEE ALSO

[pamfunc](/man/pamfunc)(1), [ppmbrighten](/man/ppmbrighten)(1)

