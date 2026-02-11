# TAGLINE

Portable Anymap image format family

# TLDR

**View PNM info**

```pnmfile [image.pnm]```

**Convert to other format**

```pnmtopng [image.pnm] > [image.png]```

**Convert from other format**

```pngtopnm [image.png] > [image.pnm]```

# SYNOPSIS

Various **pnm*** tools for PNM image manipulation.

# PARAMETERS

PNM formats include:
- PBM (bitmap)
- PGM (grayscale)
- PPM (color)

Part of Netpbm toolkit.

# DESCRIPTION

**PNM** (Portable Anymap) is an umbrella term for the Netpbm image format family: PBM (bitmap, black and white), PGM (graymap, grayscale), and PPM (pixmap, color). These formats use simple, human-readable headers followed by pixel data in either ASCII or binary encoding.

PNM serves as the intermediate format in the Netpbm toolkit, where images are converted to PNM, processed with various pnm* tools, and then converted to the desired output format. The simplicity of PNM makes it easy to generate and parse programmatically.

# CAVEATS

Part of Netpbm. Simple format. Large file sizes.

# HISTORY

PNM was created as part of **Netpbm** for portable image format.

# SEE ALSO

[pbm](/man/pbm)(5), [pgm](/man/pgm)(5), [ppm](/man/ppm)(5), [netpbm](/man/netpbm)(1)

