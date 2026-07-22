# TAGLINE

Convert PPM to DEC Sixel terminal format

# TLDR

**Convert PPM to Sixel**

```ppmtosixel [input.ppm]```

**Convert with raw output**

```ppmtosixel -raw [input.ppm]```

# SYNOPSIS

**ppmtosixel** [_options_] [_file_]

# PARAMETERS

**-raw**
> Raw sixel output.

**-margin**
> Add margin.

# DESCRIPTION

**ppmtosixel** converts PPM images to DEC Sixel format. Sixel enables inline graphics in compatible terminals. Part of Netpbm toolkit.

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

[ppmtoascii](/man/ppmtoascii)(1), [ppmtoterm](/man/ppmtoterm)(1)

