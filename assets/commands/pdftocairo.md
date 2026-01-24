# TLDR

**Convert PDF to PNG**

```pdftocairo -png [document.pdf] [output_prefix]```

**Convert PDF to SVG**

```pdftocairo -svg [document.pdf] [output.svg]```

**Convert PDF to EPS**

```pdftocairo -eps [document.pdf] [output.eps]```

**Convert specific page**

```pdftocairo -png -f [1] -l [1] [document.pdf] [output]```

**Convert with resolution**

```pdftocairo -png -r [300] [document.pdf] [output]```

**Convert to JPEG**

```pdftocairo -jpeg [document.pdf] [output]```

**Scale to specific size**

```pdftocairo -png -scale-to [800] [document.pdf] [output]```

# SYNOPSIS

**pdftocairo** [_-png_] [_-svg_] [_-eps_] [_-pdf_] [_-r dpi_] [_-f first_] [_-l last_] [_options_] _input.pdf_ _output_

# PARAMETERS

**-png**
> Output as PNG.

**-jpeg**
> Output as JPEG.

**-tiff**
> Output as TIFF.

**-svg**
> Output as SVG.

**-eps**
> Output as EPS.

**-ps**
> Output as PostScript.

**-pdf**
> Output as PDF.

**-r** _DPI_
> Resolution in DPI.

**-f** _PAGE_
> First page.

**-l** _PAGE_
> Last page.

**-scale-to** _SIZE_
> Scale to pixel size.

**-x** _N_
> X-offset.

**-y** _N_
> Y-offset.

**-W** _N_
> Width.

**-H** _N_
> Height.

**-transp**
> Transparent background.

**-antialias** _MODE_
> Antialiasing (default, none, gray, subpixel).

# DESCRIPTION

**pdftocairo** converts PDF pages to various image and vector formats using the Cairo graphics library. It produces high-quality output suitable for print and web.

PNG output creates raster images at specified resolution. Higher DPI produces larger, more detailed images. Default is 150 DPI.

SVG output creates scalable vector graphics, preserving text and shapes. This is ideal for editing or embedding in web pages.

EPS output creates encapsulated PostScript for print workflows. It integrates with LaTeX and professional publishing tools.

Transparent backgrounds work with PNG for overlays and compositing. JPEG output is smaller but loses transparency.

Page range selection extracts specific pages. Combined with scripting, batch conversion of large documents is straightforward.

# CAVEATS

Vector output may have issues with complex fonts. Very high DPI uses significant memory. Some PDF features may not convert perfectly.

# HISTORY

**pdftocairo** is part of **poppler-utils** and uses the **Cairo** graphics library. It provides higher-quality output than older rasterization tools by leveraging Cairo's sophisticated rendering.

# SEE ALSO

[pdftoppm](/man/pdftoppm)(1), [convert](/man/convert)(1), [inkscape](/man/inkscape)(1), [pdfimages](/man/pdfimages)(1)
