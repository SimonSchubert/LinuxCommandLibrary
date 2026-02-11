# TAGLINE

Enlarge PNM images by pixel replication

# TLDR

**Enlarge image 2x**

```pnmenlarge [2] [input.pnm] > [output.pnm]```

**Enlarge image 4x**

```pnmenlarge [4] [input.pnm] > [output.pnm]```

# SYNOPSIS

**pnmenlarge** _factor_ [_file_]

# PARAMETERS

_factor_
> Enlargement factor (integer).

# DESCRIPTION

**pnmenlarge** enlarges PNM images by replicating pixels. Simple nearest-neighbor scaling without interpolation. Part of Netpbm toolkit. For smoother scaling, use pamscale.

# SEE ALSO

[pamscale](/man/pamscale)(1), [pnmscale](/man/pnmscale)(1)

