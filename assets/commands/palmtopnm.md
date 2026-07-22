# TAGLINE

converts Palm Pilot image format to PNM

# TLDR

**Convert Palm image to PNM**

```palmtopnm [input.palm] > [output.pnm]```

**Show image information only**

```palmtopnm -verbose [input.palm] > /dev/null```

# SYNOPSIS

**palmtopnm** [_options_] [_file_]

# PARAMETERS

**-verbose**
> Print image information.

**-rendition** _n_
> Select specific rendition from multirendition image.

# DESCRIPTION

**palmtopnm** converts Palm Pilot image format to PNM. Palm images were used on Palm OS PDAs. Part of Netpbm toolkit.

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

[pnmtopalm](/man/pnmtopalm)(1), [pnmtopng](/man/pnmtopng)(1)

