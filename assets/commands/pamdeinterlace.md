# TAGLINE

extracts one field from an interlaced video frame, producing a half-height image

# TLDR

**Extract even field from interlaced video**

```pamdeinterlace -takeodd=false [input.pam] > [output.pam]```

**Extract odd field from interlaced video**

```pamdeinterlace -takeodd=true [input.pam] > [output.pam]```

# SYNOPSIS

**pamdeinterlace** [_options_] [_file_]

# PARAMETERS

**-takeodd**
> Take odd lines (true) or even lines (false).

# DESCRIPTION

**pamdeinterlace** extracts one field from an interlaced video frame, producing a half-height image. Used for processing interlaced video captures. Part of Netpbm toolkit.

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

[pammixinterlace](/man/pammixinterlace)(1), [pamscale](/man/pamscale)(1)

