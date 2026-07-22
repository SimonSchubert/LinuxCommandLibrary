# TAGLINE

convert an SBIG astronomical CCD image to PGM

# TLDR

**Convert an SBIG image** to PGM

```sbigtopgm [image.sbig] > [image.pgm]```

**Read from stdin** in a pipeline

```cat [image.sbig] | sbigtopgm > [image.pgm]```

**Convert and stretch contrast** with pnmnorm

```sbigtopgm [image.sbig] | pnmnorm > [stretched.pgm]```

**Convert and encode** as PNG

```sbigtopgm [image.sbig] | pnmtopng > [image.png]```

# SYNOPSIS

**sbigtopgm** [_sbigfile_]

# DESCRIPTION

**sbigtopgm** reads an astronomical CCD image in the native SBIG (Santa Barbara Instrument Group) Type 3 file format and writes the pixel values out as a PGM (portable graymap) image on standard output. When no filename is given, the program reads from standard input.

The SBIG Type 3 format is produced by the CCDOPS software bundled with SBIG ST-series CCD cameras. It consists of an ASCII header (with flexible capitalization and tolerant line endings) followed by a 16-bit grayscale pixel array. **sbigtopgm** preserves the full 16-bit precision of the source, so the output PGM has a maxval matching the original ADU range. Part of the **Netpbm** toolkit.

# CAVEATS

There is no **pgmtosbig** going the other way in upstream Netpbm. The output is always 16-bit even when the camera reports less precision. Astronomy-specific FITS files should be converted with **fitstopnm** instead.

# HISTORY

**sbigtopgm** was contributed to **Netpbm** to support amateur and professional astronomy workflows on Unix systems where SBIG's own CCDOPS software was not available. It has remained largely unchanged since its addition.

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

[fitstopnm](/man/fitstopnm)(1), [pnmtopng](/man/pnmtopng)(1), [pamtopnm](/man/pamtopnm)(1), [pnmnorm](/man/pnmnorm)(1)
