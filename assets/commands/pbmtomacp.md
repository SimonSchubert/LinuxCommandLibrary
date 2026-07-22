# TAGLINE

converts PBM bitmaps to MacPaint format for classic Macintosh

# TLDR

**Convert PBM to MacPaint format**

```pbmtomacp [input.pbm] > [output.macp]```

**Specify position**

```pbmtomacp -left [100] -top [50] [input.pbm] > [output.macp]```

# SYNOPSIS

**pbmtomacp** [_options_] [_file_]

# PARAMETERS

**-left** _n_
> Left margin pixels.

**-top** _n_
> Top margin pixels.

# DESCRIPTION

**pbmtomacp** converts PBM bitmaps to MacPaint format for classic Macintosh. MacPaint used a fixed 576x720 canvas. Part of Netpbm toolkit.

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

[macptopbm](/man/macptopbm)(1), [picttoppm](/man/picttoppm)(1)

