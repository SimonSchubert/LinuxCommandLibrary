# TAGLINE

Convert BMP images to PPM format

# TLDR

**Convert a BMP image** to PPM format

```bmptoppm [image.bmp] > [output.ppm]```

**Convert from stdin**

```cat [image.bmp] | bmptoppm > [output.ppm]```

**Convert BMP to JPEG** via pipe

```bmptoppm [image.bmp] | pnmtojpeg > [output.jpg]```

# SYNOPSIS

**bmptoppm** [_bmpfile_]

# DESCRIPTION

**bmptoppm** reads a Microsoft Windows or OS/2 BMP file as input and produces a PPM (Portable PixMap) color image as output. This is part of the Netpbm package.

This command was replaced in Netpbm 9.25 (**March 2002**) by **bmptopnm**, which automatically determines the appropriate output format (PBM, PGM, or PPM) based on the input image characteristics. **bmptoppm** is retained only for backward compatibility and takes no options of its own.

Input can be from a file or standard input; output is to standard output.

# CAVEATS

For grayscale BMP images, consider using **bmptopnm** instead, which will produce more appropriate PGM output. This command always outputs PPM regardless of the input color depth.

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

[bmptopnm](/man/bmptopnm)(1), [ppmtobmp](/man/ppmtobmp)(1), [pnmtojpeg](/man/pnmtojpeg)(1), [netpbm](/man/netpbm)(1)

# RESOURCES

```[Homepage](https://netpbm.sourceforge.net/)```

```[Documentation](https://netpbm.sourceforge.net/doc/bmptoppm.html)```

<!-- verified: 2026-06-19 -->
