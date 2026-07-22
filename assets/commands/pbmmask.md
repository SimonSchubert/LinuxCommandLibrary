# TAGLINE

creates a mask bitmap from the outline of shapes in a PBM image

# TLDR

**Create mask from bitmap edges**

```pbmmask [input.pbm] > [output.pbm]```

**Expand mask by pixels**

```pbmmask -expand [2] [input.pbm] > [output.pbm]```

# SYNOPSIS

**pbmmask** [_options_] [_file_]

# PARAMETERS

**-expand** _n_
> Expand mask by n pixels.

# DESCRIPTION

**pbmmask** creates a mask bitmap from the outline of shapes in a PBM image. Useful for creating selection masks or outlines. Part of Netpbm toolkit.

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

[ppmcolormask](/man/ppmcolormask)(1), [pbmtext](/man/pbmtext)(1)

