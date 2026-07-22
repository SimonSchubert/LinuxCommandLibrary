# TAGLINE

extracts a row or column from a PGM image and outputs the gray values

# TLDR

**Extract row or column slice from image**

```pgmslice -row [100] [input.pgm]```

**Extract column slice**

```pgmslice -col [200] [input.pgm]```

# SYNOPSIS

**pgmslice** [_options_] [_file_]

# PARAMETERS

**-row** _n_
> Extract horizontal slice at row n.

**-col** _n_
> Extract vertical slice at column n.

# DESCRIPTION

**pgmslice** extracts a row or column from a PGM image and outputs the gray values. Useful for analyzing image cross-sections. Part of Netpbm toolkit.

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

[pamcut](/man/pamcut)(1), [pgmhist](/man/pgmhist)(1)

