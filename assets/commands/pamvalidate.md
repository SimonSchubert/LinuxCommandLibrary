# TAGLINE

validates PAM/PNM image files

# TLDR

**Validate PAM file**

```pamvalidate [input.pam]```

**Validate and copy to output**

```pamvalidate [input.pam] > [output.pam]```

# SYNOPSIS

**pamvalidate** [_file_]

# DESCRIPTION

**pamvalidate** validates PAM/PNM image files. Checks for correct format and outputs valid image. Useful for sanitizing untrusted images. Part of Netpbm toolkit.

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

[pnmfile](/man/pnmfile)(1)

