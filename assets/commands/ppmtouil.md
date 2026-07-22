# TAGLINE

Convert PPM to Motif UIL icon format

# TLDR

**Convert PPM to UIL format**

```ppmtouil [input.ppm] > [output.uil]```

**Specify name**

```ppmtouil -name [iconname] [input.ppm] > [output.uil]```

# SYNOPSIS

**ppmtouil** [_options_] [_file_]

# PARAMETERS

**-name** _string_
> Name for the UIL icon.

# DESCRIPTION

**ppmtouil** converts PPM images to UIL (User Interface Language) format for Motif X11 GUI development. Part of Netpbm toolkit.

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

[pamtouil](/man/pamtouil)(1), [ppmtoxpm](/man/ppmtoxpm)(1)

