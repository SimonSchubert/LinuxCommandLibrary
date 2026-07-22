# TAGLINE

Convert PBM bitmaps to BBN BitGraph terminal format

# TLDR

**Convert a PBM file to BBN BitGraph format**

```pbmtobbnbg [input.pbm] > [output.bg]```

**Read from standard input**

```cat [input.pbm] | pbmtobbnbg > [output.bg]```

# SYNOPSIS

**pbmtobbnbg** [_pbmfile_]

# DESCRIPTION

**pbmtobbnbg** reads a PBM image as input and produces BBN BitGraph graphics terminal format as output. If no file is specified, it reads from standard input.

The BitGraph was a graphics terminal manufactured by BBN (Bolt Beranek and Newman). This tool is part of the **Netpbm** toolkit.

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

[pbmtoplot](/man/pbmtoplot)(1), [pbmtoascii](/man/pbmtoascii)(1), [pbm](/man/pbm)(1), [netpbm](/man/netpbm)(1)

