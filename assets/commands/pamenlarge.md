# TLDR

**Enlarge image 2x**

```pamenlarge 2 [input.pam] > [output.pam]```

**Enlarge image 4x**

```pamenlarge 4 [input.pam] > [output.pam]```

**Enlarge with different x/y factors**

```pamenlarge -xscale [3] -yscale [2] [input.pam] > [output.pam]```

# SYNOPSIS

**pamenlarge** [_options_] _factor_ [_pamfile_]

# PARAMETERS

**factor**
> Scale factor (integer).

**-xscale** _n_
> Horizontal scale factor.

**-yscale** _n_
> Vertical scale factor.

# DESCRIPTION

**pamenlarge** enlarges an image by an integer factor using pixel replication. Each pixel becomes a factor×factor block of identical pixels.

This produces a blocky/pixelated look, useful for pixel art or simple scaling. For smooth scaling, use pamscale instead.

# EXAMPLE

```bash
# Double the size
pamenlarge 2 small.ppm > large.ppm

# Triple horizontal, double vertical
pamenlarge -xscale 3 -yscale 2 input.ppm > output.ppm
```

# COMPARISON

```
pamenlarge - Fast, integer factors, blocky
pamscale   - Smooth scaling, any factor
```

# CAVEATS

Integer factors only. No interpolation. Large factors create big files quickly.

# HISTORY

pamenlarge is part of **Netpbm**, providing simple image magnification through pixel replication.

# SEE ALSO

[pamscale](/man/pamscale)(1), [pnmenlarge](/man/pnmenlarge)(1), [pamstretch](/man/pamstretch)(1)
