# TAGLINE

Convert PPM images to BMP format

# TLDR

**Convert PPM to BMP**

```ppmtobmp [input.ppm] > [output.bmp]```

**Create Windows BMP**

```ppmtobmp -windows [input.ppm] > [output.bmp]```

**Create OS/2 BMP**

```ppmtobmp -os2 [input.ppm] > [output.bmp]```

**Force 8 bits per pixel**

```ppmtobmp -bpp 8 [input.ppm] > [output.bmp]```

# SYNOPSIS

**ppmtobmp** [**-windows**|**-os2**] [**-bpp** _n_] [**-mapfile** _file_] [_ppmfile_]

# PARAMETERS

**-windows**
> Produce a Microsoft Windows BMP file. This is the default (since August 2000).

**-os2**
> Produce an OS/2 BMP file.

**-bpp** _bits_
> Bits per pixel in the output: 1, 4, 8, or 24. By default ppmtobmp picks the smallest value that can represent all colors in the input.

**-mapfile** _file_
> Use the given file as the BMP palette (colormap) instead of computing one automatically. Useful when you need specific palette index values.

# DESCRIPTION

**ppmtobmp** converts PPM images to BMP (Windows/OS2 bitmap) format. Part of Netpbm toolkit for image format conversion.

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

[bmptopnm](/man/bmptopnm)(1), [pnmtopng](/man/pnmtopng)(1)

