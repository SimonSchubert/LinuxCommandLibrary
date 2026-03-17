# TAGLINE

Create an index image for a Kodak Photo CD

# TLDR

**Generate an index image** from a Photo CD overview file

```pcdovtoppm [overview.pcd] > [index.ppm]```

**Set maximum width** of the result image

```pcdovtoppm -m 768 [overview.pcd] > [index.ppm]```

**Set thumbnail size** and images per row

```pcdovtoppm -s 96 -a 4 [overview.pcd] > [index.ppm]```

**Use a custom font** for annotations with white background

```pcdovtoppm -f [smallfont.pbm] -w [overview.pcd] > [index.ppm]```

# SYNOPSIS

**pcdovtoppm** [**-m** _width_] [**-s** _size_] [**-a** _across_] [**-c** _colors_] [**-f** _font_] [**-b**|**-w**] [_pcdfile_]

# PARAMETERS

**-m** _width_
> Maximum width of the result image (default: 1152).

**-s** _size_
> Maximum size of each thumbnail image in pixels (default: 192).

**-a** _across_
> Maximum number of images per row (default: 6).

**-c** _colors_
> Maximum number of colors in the output, or **n** to disable quantization.

**-f** _font_
> PBM font file to use for annotation (default: internal font).

**-b**
> Use black background (default).

**-w**
> Use white background.

# DESCRIPTION

**pcdovtoppm** generates an index image in PPM format from a Kodak Photo CD overview file. It arranges the thumbnail images from the Photo CD into a grid, optionally annotated with image numbers using a configurable font. This program was formerly called **pcdindex**. It is part of the **Netpbm** toolkit.

# CAVEATS

Requires a valid Photo CD overview file as input. The output is in PPM format and may need conversion for other uses. Photo CD is an obsolete format from the 1990s.

# HISTORY

**pcdovtoppm** was originally named **pcdindex** and was renamed to conform to Netpbm naming conventions, where converter programs follow the pattern _sourcetodest_.

# SEE ALSO

[pcdindex](/man/pcdindex)(1), [ppmtojpeg](/man/ppmtojpeg)(1)
