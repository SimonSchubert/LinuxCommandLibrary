# TLDR

**Apply gamma correction**

```ppmgamma [2.2] [input.ppm] > [output.ppm]```

**Lighten image**

```ppmgamma [0.5] [input.ppm] > [output.ppm]```

**Darken image**

```ppmgamma [2.0] [input.ppm] > [output.ppm]```

**Per-channel gamma**

```ppmgamma [1.0] [1.2] [1.0] [input.ppm] > [output.ppm]```

# SYNOPSIS

**ppmgamma** _gamma_ [_ppmfile_]

**ppmgamma** _rgamma_ _ggamma_ _bgamma_ [_ppmfile_]

# PARAMETERS

**gamma**
> Gamma value for all channels.

**rgamma**, **ggamma**, **bgamma**
> Per-channel gamma values.

# DESCRIPTION

**ppmgamma** applies gamma correction to a PPM image. Gamma < 1 lightens the image, gamma > 1 darkens it. Each pixel value is raised to the power of 1/gamma.

Part of Netpbm toolkit.

# EXAMPLES

```bash
# Standard gamma correction
ppmgamma 2.2 image.ppm > corrected.ppm

# Lighten dark image
ppmgamma 0.5 dark.ppm > lighter.ppm

# Darken bright image
ppmgamma 2.0 bright.ppm > darker.ppm

# Adjust blue channel only
ppmgamma 1.0 1.0 1.3 image.ppm > blue_adjusted.ppm

# Reverse gamma
ppmgamma 0.45 linear.ppm > srgb.ppm
```

# GAMMA VALUES

```
< 1.0  - Lighten midtones
= 1.0  - No change
> 1.0  - Darken midtones
2.2    - Typical monitor gamma
```

# CAVEATS

Use pamgamma for more features. Values at 0 and max unchanged. Part of Netpbm.

# HISTORY

ppmgamma is part of **Netpbm** by **Jef Poskanzer**, implementing gamma correction for images.

# SEE ALSO

[pamgamma](/man/pamgamma)(1), [ppmbrighten](/man/ppmbrighten)(1), [pnmgamma](/man/pnmgamma)(1), [netpbm](/man/netpbm)(1)
