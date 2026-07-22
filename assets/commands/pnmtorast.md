# TAGLINE

Convert PNM to Sun rasterfile format

# TLDR

**Convert PNM to Sun raster**

```pnmtorast [input.pnm] > [output.ras]```

**Specify encoding**

```pnmtorast -rle [input.pnm] > [output.ras]```

# SYNOPSIS

**pnmtorast** [_options_] [_file_]

# PARAMETERS

**-rle**
> Use RLE compression.

**-standard**
> Use standard format.

# DESCRIPTION

**pnmtorast** converts PNM images to Sun Rasterfile format. Part of Netpbm toolkit.

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

[rasttopnm](/man/rasttopnm)(1), [pnmtoxwd](/man/pnmtoxwd)(1)

