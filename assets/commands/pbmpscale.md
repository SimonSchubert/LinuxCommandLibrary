# TAGLINE

scales PBM bitmaps by an integer factor with anti-aliasing, producing

# TLDR

**Scale bitmap with anti-aliasing**

```pbmpscale [4] [input.pbm] > [output.pgm]```

# SYNOPSIS

**pbmpscale** _scale_ [_file_]

# PARAMETERS

_scale_
> Integer scale factor.

# DESCRIPTION

**pbmpscale** scales PBM bitmaps by an integer factor with anti-aliasing, producing grayscale output. Useful for smooth enlargement of 1-bit images. Part of Netpbm toolkit.

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

[pbmreduce](/man/pbmreduce)(1), [pamscale](/man/pamscale)(1)

