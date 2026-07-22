# TAGLINE

Convert Garmin SRF vehicle images to PAM

# TLDR

**Convert Garmin SRF to PAM**

```srftopam [input.srf] > [output.pam]```

# SYNOPSIS

**srftopam** [_file_]

# DESCRIPTION

**srftopam** converts images in the Garmin SRF (Sun Raster Format variant used for vehicle icons) to PAM (Portable Arbitrary Map) format. The SRF format is used for custom vehicle icons displayed on Garmin GPS navigation devices. This tool is part of the Netpbm image processing toolkit, which provides converters between many image formats.

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

[pamtosrf](/man/pamtosrf)(1), [pngtopam](/man/pngtopam)(1)

