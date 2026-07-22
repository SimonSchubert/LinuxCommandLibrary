# TAGLINE

Convert PPM images to AutoCAD format

# TLDR

**Convert PPM to AutoCAD DXF**

```ppmtoacad [input.ppm] > [output.dxf]```

**Specify scale**

```ppmtoacad -scale [0.1] [input.ppm] > [output.dxf]```

# SYNOPSIS

**ppmtoacad** [_options_] [_file_]

# PARAMETERS

**-scale** _n_
> Scale factor for output.

**-dxb**
> Output DXB binary format.

# DESCRIPTION

**ppmtoacad** converts PPM images to AutoCAD DXF (Drawing Exchange Format) slide files for CAD applications. Part of Netpbm toolkit.

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

[ppmtoilbm](/man/ppmtoilbm)(1), [pnmtops](/man/pnmtops)(1)

