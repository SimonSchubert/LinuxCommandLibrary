# TAGLINE

converts PBM bitmap images to ASCII art

# TLDR

**Convert PBM to ASCII art**

```pbmtoascii [input.pbm]```

**Convert with grid size**

```pbmtoascii -[2x4] [input.pbm]```

# SYNOPSIS

**pbmtoascii** [_options_] [_file_]

# PARAMETERS

**-1x2**
> 1x2 cell size.

**-2x4**
> 2x4 cell size (default).

# DESCRIPTION

**pbmtoascii** converts PBM bitmap images to ASCII art. Renders images using text characters. Part of Netpbm toolkit.

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

[ppmtoascii](/man/ppmtoascii)(1), [asciitopgm](/man/asciitopgm)(1)

