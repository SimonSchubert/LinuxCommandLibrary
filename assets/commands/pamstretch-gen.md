# TAGLINE

Scale a Netpbm image by a non-integer factor

# TLDR

**Scale an image** by a non-integer factor N

```pamstretch-gen [2.5] [input.pam] > [output.pam]```

**Read from standard input**

```cat [input.pam] | pamstretch-gen [1.75] > [output.pam]```

# SYNOPSIS

**pamstretch-gen** _N_ [_pnmfile_]

# PARAMETERS

_N_
> Scale factor (may be a non-integer such as `1.5` or `2.75`). Applied to both dimensions.

_pnmfile_
> Input Netpbm image file. If omitted, reads from standard input.

# DESCRIPTION

**pamstretch-gen** scales a Netpbm image by an arbitrary (possibly non-integer) factor. Internally it upscales to the next integer multiple with **pamstretch** (which only supports integer factors) and then uses **pamscale** to scale back down to the requested size, producing higher-quality results than pamscale alone for modest upscaling.

There are no command-line options specific to pamstretch-gen; it recognizes the common libnetpbm options (for example `-quiet` and `-plain` on recent versions).

# CAVEATS

Requires both **pamstretch** and **pamscale** to be available. Works only with Netpbm (PNM/PAM) images.

# SEE ALSO

[pamstretch](/man/pamstretch)(1), [pamscale](/man/pamscale)(1)

