# TAGLINE

Convert Utah RLE images to PNM format

# TLDR

**Convert Utah RLE to PNM**

```rletopnm [input.rle] > [output.pnm]```

**Verbose output**

```rletopnm -verbose [input.rle] > [output.pnm]```

# SYNOPSIS

**rletopnm** [_options_] [_file_]

# PARAMETERS

**-verbose**
> Print image information.

**-headerdump**
> Dump RLE header information.

# DESCRIPTION

**rletopnm** converts Utah RLE (Run Length Encoded) images to PNM format. Utah RLE is part of the Utah Raster Toolkit. Part of Netpbm toolkit.

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

[pnmtorle](/man/pnmtorle)(1), [sgitopnm](/man/sgitopnm)(1)

