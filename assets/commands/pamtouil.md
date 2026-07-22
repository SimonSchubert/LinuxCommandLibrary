# TAGLINE

converts PAM/PNM images to UIL format for Motif/X11 GUI development

# TLDR

**Convert PAM to UIL format**

```pamtouil [input.pam] > [output.uil]```

**Specify output name**

```pamtouil -name [iconname] [input.pam] > [output.uil]```

# SYNOPSIS

**pamtouil** [_options_] [_file_]

# PARAMETERS

**-name** _string_
> Name for the UIL icon.

# DESCRIPTION

**pamtouil** converts PAM/PNM images to UIL (User Interface Language) format for Motif/X11 GUI development. Part of Netpbm toolkit.

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

[ppmtouil](/man/ppmtouil)(1), [ppmtoxpm](/man/ppmtoxpm)(1)

