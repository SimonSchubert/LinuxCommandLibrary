# TAGLINE

fixes truncated images

# TLDR

**Fix truncated image**

```pamfixtrunc [truncated.pam] > [fixed.pam]```

**Fill with specific value**

```pamfixtrunc -fillvalue=[0] [truncated.pam] > [fixed.pam]```

# SYNOPSIS

**pamfixtrunc** [_options_] [_file_]

# PARAMETERS

_FILE_
> Truncated PAM/PNM file.

**-fillvalue** _VALUE_
> Fill value for missing pixels.

# DESCRIPTION

**pamfixtrunc** fixes truncated images. Pads missing data.

The tool completes incomplete files. Part of Netpbm.

# CAVEATS

Part of Netpbm. Fills missing data. Original data lost.

# HISTORY

pamfixtrunc is part of **Netpbm** for fixing truncated image files.

# INSTALL

```apt: sudo apt install netpbm```

```dnf: sudo dnf install netpbm```

```pacman: sudo pacman -S netpbm```

```apk: sudo apk add netpbm-extras```

```zypper: sudo zypper install netpbm```

```brew: brew install netpbm```

```nix: nix profile install nixpkgs#netpbm```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pamfix](/man/pamfix)(1), [netpbm](/man/netpbm)(1)

