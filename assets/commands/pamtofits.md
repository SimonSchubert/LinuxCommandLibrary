# TAGLINE

converts PAM/PNM images to FITS format used in astronomy

# TLDR

**Convert PAM to FITS format**

```pamtofits [input.pam] > [output.fits]```

# SYNOPSIS

**pamtofits** [_options_] [_file_]

# PARAMETERS

**-max** _n_
> Maximum output value.

**-min** _n_
> Minimum output value.

# DESCRIPTION

**pamtofits** converts PAM/PNM images to FITS (Flexible Image Transport System) format used in astronomy. Part of Netpbm toolkit.

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

[fitstopnm](/man/fitstopnm)(1), [pnmtofits](/man/pnmtofits)(1)

