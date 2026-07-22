# TAGLINE

Split multi-image PNM files into separate files

# TLDR

**Split multi-image PNM file**

```pnmsplit [input.pnm] [output%d.pnm]```

**Split with custom naming**

```pnmsplit [input.pnm] [frame_%03d.pnm]```

# SYNOPSIS

**pnmsplit** [_options_] _input_ _output_

# PARAMETERS

_INPUT_
> Multi-image PNM file.

_OUTPUT_
> Output filename pattern with %d.

**-padname** _N_
> Zero-padding width for numbers.

# DESCRIPTION

**pnmsplit** splits a multi-image PNM stream into individual files. PNM files can contain multiple images concatenated together, and this tool extracts each one into a separate output file.

The output filename pattern must contain a **%d** format specifier (or variant like **%03d**) which is replaced with the image sequence number starting from 0. The **-padname** option controls zero-padding width for the numbering. This is useful for processing animation frames or batch image sequences. Part of the Netpbm toolkit.

# CAVEATS

Requires %d in output name. Part of Netpbm suite.

# HISTORY

pnmsplit was created as part of **Netpbm** for multi-image file handling.

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

[pnmcat](/man/pnmcat)(1), [pnmindex](/man/pnmindex)(1), [pamcut](/man/pamcut)(1)

