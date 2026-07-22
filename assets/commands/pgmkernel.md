# TAGLINE

generates convolution kernels as PGM images for use with pnmconvol

# TLDR

**Generate convolution kernel**

```pgmkernel [7] [7] > [kernel.pgm]```

**Generate with weight**

```pgmkernel -weight [6.0] [5] [5] > [kernel.pgm]```

# SYNOPSIS

**pgmkernel** [_options_] _width_ _height_

# PARAMETERS

_width_
> Kernel width.

_height_
> Kernel height.

**-weight** _n_
> Center pixel weight.

# DESCRIPTION

**pgmkernel** generates convolution kernels as PGM images for use with pnmconvol. Creates Gaussian-like weighting patterns. Part of Netpbm toolkit.

# INSTALL

```apt: sudo apt install netpbm```

```dnf: sudo dnf install netpbm```

```pacman: sudo pacman -S netpbm```

```apk: sudo apk add netpbm```

```zypper: sudo zypper install netpbm```

```brew: brew install netpbm```

```nix: nix profile install nixpkgs#netpbm```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pnmconvol](/man/pnmconvol)(1), [pgmtexture](/man/pgmtexture)(1)

