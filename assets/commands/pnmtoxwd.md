# TAGLINE

Convert PNM to X Window Dump format

# TLDR

**Convert PNM to XWD format**

```pnmtoxwd [input.pnm] > [output.xwd]```

**Specify visual class**

```pnmtoxwd -directcolor [input.pnm] > [output.xwd]```

# SYNOPSIS

**pnmtoxwd** [_options_] [_file_]

# PARAMETERS

**-pseudocolor**
> Use PseudoColor visual.

**-directcolor**
> Use DirectColor visual.

# DESCRIPTION

**pnmtoxwd** converts PNM images to X Window Dump (XWD) format. Part of Netpbm toolkit.

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

[xwdtopnm](/man/xwdtopnm)(1), [pnmtorast](/man/pnmtorast)(1)

