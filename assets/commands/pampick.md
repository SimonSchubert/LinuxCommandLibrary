# TAGLINE

extracts specific images from a multi-image PAM stream by index number

# TLDR

**Extract specific images from stream**

```pampick [0] [2] [5] < [input.pam] > [output.pam]```

# SYNOPSIS

**pampick** _index_ [_index_ ...] < _file_

# PARAMETERS

_index_
> Zero-based image indices to extract.

# DESCRIPTION

**pampick** extracts specific images from a multi-image PAM stream by index number. Useful for selecting frames from animation or video sequences. Part of Netpbm toolkit.

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

[pamsplit](/man/pamsplit)(1)

