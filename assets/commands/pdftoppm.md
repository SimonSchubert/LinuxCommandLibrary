# TLDR

Specify the **range of pages** to convert (n - first page, m - last page)

```pdftoppm -f [n] -l [m] [path/to/file.pdf] [image_name_prefix]```

Convert only the **first page** of a PDF

```pdftoppm -singlefile [path/to/file.pdf] [image_name_prefix]```

Generate a **monochrome PBM** file (instead of color PPM)

```pdftoppm -mono [path/to/file.pdf] [image_name_prefix]```

Generate a **grayscale PGM** file (instead of color PPM)

```pdftoppm -gray [path/to/file.pdf] [image_name_prefix]```

Generate a **PNG file** instead of PPM

```pdftoppm -png [path/to/file.pdf] [image_name_prefix]```

# SYNOPSIS

**pdftoppm** [_options_] _pdf_file_ _image_root_

# PARAMETERS

**-f _n_**
> First page to convert

**-l _n_**
> Last page to convert

**-singlefile**
> Write only the first page, don't add page number suffix

**-mono**
> Generate monochrome PBM output

**-gray**
> Generate grayscale PGM output

**-png**
> Generate PNG output

**-jpeg**
> Generate JPEG output

**-tiff**
> Generate TIFF output

**-r _dpi_**
> Resolution in DPI (default: 150)

**-rx _dpi_**
> X resolution

**-ry _dpi_**
> Y resolution

**-scale-to _size_**
> Scale to specified size

# DESCRIPTION

**pdftoppm** converts PDF document pages to image formats (PPM, PGM, PBM, PNG, JPEG, TIFF). Part of the **poppler-utils** package, it renders each page as a raster image at the specified resolution.

Output files are named with the provided prefix followed by a page number (e.g., image-001.png). Use **-singlefile** for a single page without numbering.

The tool is commonly used for creating thumbnails, preparing PDFs for OCR, or converting documents for image-based workflows.

# CAVEATS

High DPI settings produce large files and require more memory. Processing many pages can be slow. Vector graphics are rasterized, losing scalability. Part of poppler-utils package.

# SEE ALSO

[pdftohtml](/man/pdftohtml)(1), [pdftotext](/man/pdftotext)(1), [pdfinfo](/man/pdfinfo)(1), [convert](/man/convert)(1)
