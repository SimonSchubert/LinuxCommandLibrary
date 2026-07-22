# TAGLINE

displays a grayscale histogram of a PGM image

# TLDR

**Show grayscale histogram**

```pgmhist [input.pgm]```

**Show median value**

```pgmhist -median [input.pgm]```

# SYNOPSIS

**pgmhist** [_options_] [_file_]

# PARAMETERS

**-median**
> Show median gray value.

**-quartile**
> Show quartile values.

# DESCRIPTION

**pgmhist** displays a grayscale histogram of a PGM image. Shows distribution of gray values. Part of Netpbm toolkit for image analysis.

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

[ppmhist](/man/ppmhist)(1), [pgmnorm](/man/pgmnorm)(1)

