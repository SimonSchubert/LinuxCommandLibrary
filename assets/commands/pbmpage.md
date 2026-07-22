# TAGLINE

generates printer calibration and test pages as PBM images

# TLDR

**Generate printer test page**

```pbmpage [1] > [output.pbm]```

**Generate A4 test page**

```pbmpage -a4 [1] > [output.pbm]```

# SYNOPSIS

**pbmpage** [_options_] _pagenum_

# PARAMETERS

_pagenum_
> Test page number (1-3).

**-a4**
> Generate A4 size instead of US letter (default).

# DESCRIPTION

**pbmpage** generates printer calibration and test pages as PBM images at 600 dpi resolution. Different page numbers produce different test patterns useful for calibrating margins, alignment, and print quality. The default output is for US letter paper; use **-a4** for A4 size. Part of the Netpbm toolkit.

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

[pbmtext](/man/pbmtext)(1), [pbmtolj](/man/pbmtolj)(1)

