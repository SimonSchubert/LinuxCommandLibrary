# TAGLINE

enlarges a Netpbm image N times by duplicating pixels

# TLDR

**Enlarge image 2x**

```pamenlarge 2 [input.pam] > [output.pam]```

**Enlarge image 4x**

```pamenlarge 4 [input.pam] > [output.pam]```

**Enlarge using named option**

```pamenlarge -scale=[3] [input.pam] > [output.pam]```

**Enlarge with different x/y factors**

```pamenlarge -xscale=[3] -yscale=[2] [input.pam] > [output.pam]```

**Enlarge horizontally only**

```pamenlarge -xscale=[4] [input.pam] > [output.pam]```

# SYNOPSIS

**pamenlarge** [**-scale=**_N_] [**-xscale=**_N_] [**-yscale=**_N_] [_pamfile_]

**pamenlarge** _N_ [_pamfile_]

# PARAMETERS

**-scale=**_N_
> Scale factor applied both horizontally and vertically. Cannot be combined with -xscale or -yscale.

**-xscale=**_N_
> Horizontal scale factor. If -yscale is not given, vertical scaling defaults to 1.

**-yscale=**_N_
> Vertical scale factor. If -xscale is not given, horizontal scaling defaults to 1.

_N_
> Positional scale factor (legacy syntax). Equivalent to -scale=N.

# DESCRIPTION

**pamenlarge** reads a Netpbm image, replicates its pixels N times, and produces an enlarged Netpbm image. Each pixel becomes an N x N block of identical pixels.

This produces a blocky/pixelated look, useful for pixel art or simple scaling. For smooth scaling, use **pamscale** instead. For scale factors of 3 or more, applying **pnmsmooth** afterward can reduce pixelation.

For PBM images, optimized algorithms exist for scale factors up to 10. Running multiple passes with smaller factors can be faster than a single large factor.

# EXAMPLE

```bash
# Double the size
pamenlarge 2 small.ppm > large.ppm

# Triple horizontal, double vertical
pamenlarge -xscale=3 -yscale=2 input.ppm > output.ppm
```

# COMPARISON

```
pamenlarge - Fast, integer factors, blocky
pamscale   - Smooth scaling, any factor
```

# CAVEATS

Integer factors only. No interpolation. Large factors create big files quickly. The -scale, -xscale, and -yscale options were added in Netpbm 10.86 (March 2019); older versions only support the positional argument syntax.

# HISTORY

**pamenlarge** was added to Netpbm in version **10.25** (October 2004) as a replacement for the older **pnmenlarge**.

# SEE ALSO

[pamscale](/man/pamscale)(1), [pnmenlarge](/man/pnmenlarge)(1), [pamstretch](/man/pamstretch)(1)
