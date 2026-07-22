# TAGLINE

Convert Atari Spectrum 512 images to PPM

# TLDR

**Convert Atari Spectrum 512 to PPM**

```sputoppm [input.spu] > [output.ppm]```

# SYNOPSIS

**sputoppm** [_file_]

# DESCRIPTION

**sputoppm** converts images in the Atari Spectrum 512 uncompressed format (SPU) to PPM (Portable Pixmap) format. The Spectrum 512 format was used on the Atari ST computer to display images with up to 512 simultaneous colors by cycling the palette on each scanline. This tool is part of the Netpbm image processing toolkit, which provides converters between many image formats.

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

[ppmtospu](/man/ppmtospu)(1), [spctoppm](/man/spctoppm)(1)

