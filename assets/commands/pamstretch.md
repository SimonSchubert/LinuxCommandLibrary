# TAGLINE

stretches PAM/PNM images by pixel replication with interpolation

# TLDR

**Stretch image 2x**

```pamstretch [2] [input.pam] > [output.pam]```

**Stretch with interpolation**

```pamstretch -dropedge [3] [input.pam] > [output.pam]```

# SYNOPSIS

**pamstretch** [_options_] _factor_ [_file_]

# PARAMETERS

_factor_
> Stretch factor (integer).

**-dropedge**
> Drop edge pixels.

**-xscale** _n_
> Horizontal scale only.

**-yscale** _n_
> Vertical scale only.

# DESCRIPTION

**pamstretch** stretches PAM/PNM images by pixel replication with interpolation. Smoother than simple enlargement. Part of Netpbm toolkit.

# SEE ALSO

[pamscale](/man/pamscale)(1), [pnmenlarge](/man/pnmenlarge)(1)

