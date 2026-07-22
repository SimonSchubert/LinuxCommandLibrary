# TAGLINE

Convert PPM to Mitsubishi printer format

# TLDR

**Convert PPM to Mitsubishi printer format**

```ppmtomitsu [input.ppm] > [output.mitsu]```

**Specify paper size**

```ppmtomitsu -A [input.ppm] > [output.mitsu]```

# SYNOPSIS

**ppmtomitsu** [_options_] [_file_]

# PARAMETERS

**-A**
> A size paper.

**-L**
> L size paper.

**-tiny**
> Tiny output mode.

# DESCRIPTION

**ppmtomitsu** converts PPM images to Mitsubishi dye sublimation printer format (S340-10). Part of Netpbm toolkit.

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

[pnmtops](/man/pnmtops)(1), [ppmtolj](/man/ppmtolj)(1)

