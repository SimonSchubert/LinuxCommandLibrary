# TAGLINE

Convert X11 or X10 bitmap to PBM format

# TLDR

**Convert XBM to PBM**

```xbmtopbm [input.xbm] > [output.pbm]```

# SYNOPSIS

**xbmtopbm** [_file_]

# DESCRIPTION

**xbmtopbm** reads an X11 or X10 bitmap (.xbm) as input and produces a PBM image as output. X bitmap files are C source code that define image data as arrays; this tool extracts and converts the image data. Part of the Netpbm toolkit.

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

[pbmtoxbm](/man/pbmtoxbm)(1), [xpmtoppm](/man/xpmtoppm)(1)

