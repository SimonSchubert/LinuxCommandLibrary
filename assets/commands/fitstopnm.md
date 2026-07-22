# TAGLINE

convert astronomical FITS images to PNM

# TLDR

**Convert FITS to PNM**

```fitstopnm [input.fits] > [output.pnm]```

**Convert specific image in file**

```fitstopnm -image [2] [input.fits] > [output.pnm]```

# SYNOPSIS

**fitstopnm** [_options_] [_file_]

# PARAMETERS

**-image** _num_
> Select specific image from multi-image file.

**-noraw**
> Output in plain format.

# DESCRIPTION

**fitstopnm** converts FITS (Flexible Image Transport System) files to PNM format. FITS is the standard astronomical image format used for scientific data interchange.

The tool reads multi-dimensional image data from FITS files and converts it to the portable anymap format, making astronomical images accessible to standard image processing tools. Part of the Netpbm toolkit.

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

[pnmtofits](/man/pnmtofits)(1), [pamtofits](/man/pamtofits)(1)

# RESOURCES

```[Homepage](https://netpbm.sourceforge.net/)```

<!-- verified: 2026-07-15 -->

