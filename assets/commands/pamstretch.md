# TAGLINE

scale up a Netpbm image by integer factors with interpolation

# TLDR

**Stretch an image 2x in both dimensions**

```pamstretch [2] [input.pam] > [output.pam]```

**Stretch 3x and drop the extra edge pixel** for cleaner dimensions

```pamstretch -dropedge [3] [input.pam] > [output.pam]```

**Stretch horizontally only** (4x wide, same height)

```pamstretch -xscale=[4] -yscale=[1] [input.pam] > [output.pam]```

**Stretch vertically only** (same width, 2x tall)

```pamstretch -xscale=[1] -yscale=[2] [input.pam] > [output.pam]```

**Interpolate to black** at the right/bottom edges

```pamstretch -blackedge [2] [input.pam] > [output.pam]```

**Stretch from standard input** in a Netpbm pipeline

```cat [input.pnm] | pamstretch [2] > [output.pnm]```

# SYNOPSIS

**pamstretch** [**-xscale=**_X_] [**-yscale=**_Y_] [**-blackedge**|**-dropedge**] _N_ [_file_]

# PARAMETERS

_N_
> Uniform integer stretch factor applied to both axes when **-xscale**/**-yscale** are not given.

**-xscale=**_X_
> Integer horizontal scale factor (default 1 if only **-yscale** is given).

**-yscale=**_Y_
> Integer vertical scale factor (default 1 if only **-xscale** is given).

**-blackedge**
> Interpolate toward black at the right and bottom edges, preserving output dimensions.

**-dropedge**
> Drop one source pixel at the right and bottom edges. Produces a cleaner result but yields non-standard output dimensions (_width_ * _N_ - _N_ + 1).

_file_
> Input PAM/PNM file. Reads from standard input if omitted.

# DESCRIPTION

**pamstretch** scales up a PAM, PNM, PPM, PGM, or PBM image by integer factors, interpolating between neighboring source pixels rather than simply replicating them. This yields smoother results than plain pixel duplication for photographs and other continuous-tone images.

The tool supports independent horizontal and vertical factors through **-xscale** and **-yscale**, or a single uniform factor given as the final positional argument. Edge behaviour is configurable: by default extra pixels are synthesised, **-blackedge** fades to black, and **-dropedge** trims the trailing row and column.

# CAVEATS

Only integer scale factors are supported; for non-integer scaling use **pamstretch-gen** or **pamscale**. Option names accept minimum unambiguous abbreviations and may use single or double hyphens.

# HISTORY

**pamstretch** is part of the **Netpbm** toolkit, a set of graphics file manipulation utilities originating from Jef Poskanzer's **pbmplus** package (1988). It was introduced as an interpolating alternative to **pnmenlarge**, which only replicates pixels.

# SEE ALSO

[pamstretch-gen](/man/pamstretch-gen)(1), [pamscale](/man/pamscale)(1), [pnmenlarge](/man/pnmenlarge)(1), [pnmscale](/man/pnmscale)(1), [pam](/man/pam)(5), [pnm](/man/pnm)(5)
