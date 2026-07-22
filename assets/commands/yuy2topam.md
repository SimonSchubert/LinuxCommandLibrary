# TAGLINE

Convert YUY2 packed video to PAM

# TLDR

**Convert YUY2 video to PAM**

```yuy2topam [width] [height] [input.yuy2] > [output.pam]```

# SYNOPSIS

**yuy2topam** _width_ _height_ [_file_]

# PARAMETERS

_width_
> Image width.

_height_
> Image height.

# DESCRIPTION

**yuy2topam** converts YUY2 (YUYV) packed YUV format to PAM. YUY2 is a common video format used by webcams and video capture. Part of Netpbm toolkit.

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

[yuvtoppm](/man/yuvtoppm)(1)

