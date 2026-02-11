# TAGLINE

Convert PostScript and PDF to vector formats

# TLDR

Convert PDF page to **PNG or JPEG**

```pstoedit -page [1] -f magick [file.pdf] [output.png]```

Convert **multiple pages** to numbered images

```pstoedit -f magick [file.pdf] [page%d.png]```

# SYNOPSIS

**pstoedit** [**-page** _num_] [**-f** _format_] _input_ _output_

# PARAMETERS

**-page _num_**
> Page number to convert (1-based)

**-f _format_**
> Output format driver

**-dt**
> Draw text as polygons

**-adt**
> Approximate curves with lines

**-flat _value_**
> Flatness for curve approximation

# DESCRIPTION

**pstoedit** translates PostScript and PDF files to various vector and bitmap formats. It uses format-specific drivers to produce output suitable for different applications.

The tool can convert to formats like SVG, DXF, and through ImageMagick to raster formats. It's useful for extracting graphics from PDF documents.

# CAVEATS

Quality depends on source PDF complexity. Text may be converted to outlines. Some formats require additional drivers. Complex gradients may not convert well.

# HISTORY

**pstoedit** was created by **Wolfgang Glunz** to enable conversion of PostScript graphics to editable vector formats. It has been maintained since the 1990s and supports many output formats.

# SEE ALSO

[ps2pdf](/man/ps2pdf)(1), [pdf2svg](/man/pdf2svg)(1), [convert](/man/convert)(1)
