# TAGLINE

Anti-alias edges in PNM images

# TLDR

**Anti-alias image edges**

```pnmalias [input.pnm] > [output.pnm]```

**Specify background color**

```pnmalias -bgcolor [white] [input.pnm] > [output.pnm]```

# SYNOPSIS

**pnmalias** [_options_] [_file_]

# PARAMETERS

**-bgcolor** _color_
> Background color for anti-aliasing.

**-fgcolor** _color_
> Foreground color.

# DESCRIPTION

**pnmalias** anti-aliases edges in PNM images by smoothing transitions between foreground and background colors. Part of Netpbm toolkit.

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

[pnmsmooth](/man/pnmsmooth)(1), [ppmquant](/man/ppmquant)(1)

