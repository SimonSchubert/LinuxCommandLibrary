# TLDR

**Apply gamma correction**

```pamgamma [2.2] [input.pam] > [output.pam]```

**Apply inverse gamma**

```pamgamma [0.45] [input.pam] > [output.pam]```

**Convert sRGB to linear**

```pamgamma -ungamma [input.pam] > [linear.pam]```

**Convert linear to sRGB**

```pamgamma -gamma [linear.pam] > [srgb.pam]```

# SYNOPSIS

**pamgamma** [_options_] [_gamma_] [_pamfile_]

# PARAMETERS

**gamma**
> Gamma value (> 0).

**-ungamma**
> Remove gamma (to linear).

**-gamma**
> Apply gamma (to sRGB).

**-bt709**
> Use BT.709 transfer.

**-srgb**
> Use sRGB transfer.

# DESCRIPTION

**pamgamma** applies gamma correction to images. Gamma correction adjusts the brightness curve; values > 1 darken midtones, values < 1 brighten them.

Standard display gamma is approximately 2.2; inverse is about 0.45.

# COMMON VALUES

```
2.2   - Standard gamma
0.45  - Inverse gamma (1/2.2)
1.0   - No change
```

# EXAMPLE

```bash
# Brighten dark image
pamgamma 0.7 dark.ppm > brighter.ppm

# Standard gamma encode
pamgamma 2.2 linear.ppm > encoded.ppm
```

# CAVEATS

Input should match expected gamma. Clipping may occur at extremes.

# HISTORY

pamgamma is part of **Netpbm**, providing gamma correction as part of color space conversions.

# SEE ALSO

[pnmgamma](/man/pnmgamma)(1), [pamrecolor](/man/pamrecolor)(1), [netpbm](/man/netpbm)(1)
