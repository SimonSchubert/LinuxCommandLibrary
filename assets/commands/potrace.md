# TAGLINE

Trace bitmaps into vector graphics

# TLDR

**Convert bitmap to SVG**

```potrace -s [input.bmp] -o [output.svg]```

**Convert to PDF**

```potrace -b pdf [input.bmp] -o [output.pdf]```

**Convert to EPS**

```potrace -e [input.bmp] -o [output.eps]```

**Invert colors**

```potrace -s --invert [input.bmp] -o [output.svg]```

**From PBM/PGM/PPM**

```potrace -s [input.pbm] -o [output.svg]```

# SYNOPSIS

**potrace** [_options_] [_files_]

# PARAMETERS

**-b**, **--backend** _format_
> Output format (svg, pdf, eps, ps).

**-s**, **--svg**
> SVG output.

**-e**, **--eps**
> EPS output.

**-p**, **--postscript**
> PostScript output.

**-o** _file_
> Output file.

**--invert**
> Invert input.

**-t**, **--turdsize** _n_
> Suppress speckles.

**-a**, **--alphamax** _n_
> Corner threshold.

# DESCRIPTION

**potrace** transforms bitmap images into smooth, scalable vector graphics by tracing the boundaries between black and white regions. It uses an optimal polygon-fitting algorithm to produce clean curves, making it ideal for converting logos, line art, scanned drawings, and other high-contrast images into SVG, PDF, EPS, or PostScript format.

The tool accepts PBM, PGM, PPM, and BMP input formats. Tuning parameters control corner detection (alphamax) and speckle suppression (turdsize) to balance accuracy against smoothness. For photographs or color images, preprocessing with threshold or edge-detection tools is needed first.

# EXAMPLES

```bash
# Bitmap to SVG
potrace -s logo.bmp -o logo.svg

# PDF output with smoothing
potrace -b pdf --alphamax 1 image.bmp -o output.pdf

# Remove small spots
potrace -s --turdsize 5 noisy.bmp -o clean.svg

# From PNG (via conversion)
convert image.png image.bmp && potrace -s image.bmp
```

# INPUT FORMATS

Accepts PBM, PGM, PPM, and BMP formats. Use ImageMagick or similar to convert other formats first.

# CAVEATS

Works best on high-contrast images. Photos don't trace well. Input should be monochrome for best results.

# HISTORY

potrace was written by **Peter Selinger** as an improved alternative to autotrace, using optimal polygon algorithms.

# SEE ALSO

[inkscape](/man/inkscape)(1), [convert](/man/convert)(1), [autotrace](/man/autotrace)(1)
