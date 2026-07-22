# TAGLINE

Generate decorative pattern images

# TLDR

**Create checkerboard pattern**

```ppmpat -gingham2 [100] [100] > [pattern.ppm]```

**Create tartan pattern**

```ppmpat -tartan [200] [200] > [tartan.ppm]```

**Create argyle pattern**

```ppmpat -argyle1 [150] [150] > [argyle.ppm]```

# SYNOPSIS

**ppmpat** _pattern_ _width_ _height_

# PARAMETERS

**-gingham2**
> Gingham checkerboard.

**-gingham3**
> 3-color gingham.

**-tartan**
> Tartan plaid.

**-argyle1**
> Argyle pattern.

**-argyle2**
> Argyle with lines.

**-poles**
> Barber pole stripes.

**-squig**
> Squiggly lines.

**-camo**
> Camouflage pattern.

# DESCRIPTION

**ppmpat** generates various pattern images. Creates test patterns, plaids, and decorative backgrounds. Part of Netpbm toolkit.

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

[pgmramp](/man/pgmramp)(1), [ppmforge](/man/ppmforge)(1)

