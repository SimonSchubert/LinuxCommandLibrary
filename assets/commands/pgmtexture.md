# TAGLINE

calculates Haralick texture features from a PGM image using gray level

# TLDR

**Calculate image texture measures**

```pgmtexture [input.pgm]```

**Specify distance**

```pgmtexture -d [1] [input.pgm]```

# SYNOPSIS

**pgmtexture** [_options_] [_file_]

# PARAMETERS

**-d** _n_
> Distance for co-occurrence matrix.

# DESCRIPTION

**pgmtexture** calculates Haralick texture features from a PGM image using gray level co-occurrence matrices. Outputs statistical measures for texture analysis. Part of Netpbm toolkit.

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

[pgmhist](/man/pgmhist)(1), [pgmkernel](/man/pgmkernel)(1)

