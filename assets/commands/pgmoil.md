# TAGLINE

applies an oil painting effect to PGM images by selecting the most common gray

# TLDR

**Apply oil painting effect**

```pgmoil [input.pgm] > [output.pgm]```

**Specify smear radius**

```pgmoil -n [3] [input.pgm] > [output.pgm]```

# SYNOPSIS

**pgmoil** [_options_] [_file_]

# PARAMETERS

**-n** _radius_
> Smear radius (default 3).

# DESCRIPTION

**pgmoil** applies an oil painting effect to PGM images by selecting the most common gray value in a neighborhood. Part of Netpbm toolkit.

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

[pgmbentley](/man/pgmbentley)(1), [ppmspread](/man/ppmspread)(1)

