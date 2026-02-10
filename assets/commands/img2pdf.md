# TAGLINE

converts images to PDF without re-encoding, preserving the original image

# TLDR

**Convert images to PDF**

```img2pdf [image1.jpg] [image2.png] -o [output.pdf]```

**Convert all images in directory**

```img2pdf [*.jpg] -o [output.pdf]```

**Set page size to A4**

```img2pdf --pagesize [A4] [image.jpg] -o [output.pdf]```

**Fit image to page** while maintaining aspect ratio

```img2pdf --fit [into] --pagesize [A4] [image.jpg] -o [output.pdf]```

**Set specific image DPI**

```img2pdf --imgsize [300dpi] [image.jpg] -o [output.pdf]```

**Convert with custom page margins**

```img2pdf --border [1cm:1cm] [image.jpg] -o [output.pdf]```

**Set PDF title and author**

```img2pdf --title "[Document Title]" --author "[Author Name]" [image.jpg] -o [output.pdf]```

**Pipe image from stdin**

```cat [image.jpg] | img2pdf -o [output.pdf]```

# SYNOPSIS

**img2pdf** [_options_] [_images ..._] **-o** _output.pdf_

# PARAMETERS

**-o**, **--output** _file_
> Output PDF file (required).

**--pagesize** _size_
> Page size: A4, Letter, Legal, or WxH (e.g., 210mmx297mm).

**--imgsize** _size_
> Image size: WxH with units or dpi (e.g., 300dpi).

**--fit** _mode_
> Fit mode: into, fill, exact, shrink.

**--border** _margin_
> Page borders/margins (e.g., 1cm, 1cm:2cm).

**--rotation** _angle_
> Rotate pages: 0, 90, 180, 270, auto.

**--title** _string_
> PDF title metadata.

**--author** _string_
> PDF author metadata.

**--subject** _string_
> PDF subject metadata.

**--keywords** _string_
> PDF keywords metadata.

**--creationdate** _date_
> PDF creation date.

**--moddate** _date_
> PDF modification date.

**--viewer-panes** _panes_
> Initial viewer panes: none, bookmarks, thumbs.

**--viewer-initial-page** _n_
> Initial page to display.

**--viewer-fullscreen**
> Open in fullscreen mode.

**--nodate**
> Don't set creation/modification dates.

**-S**, **--colorspace** _space_
> Force colorspace: RGB, L (grayscale).

# DESCRIPTION

**img2pdf** converts images to PDF without re-encoding, preserving the original image quality. Unlike tools that rasterize images, img2pdf embeds the original JPEG, PNG, TIFF, or other image data directly into the PDF structure.

This lossless approach means a 5MB JPEG becomes approximately a 5MB PDF (plus minimal PDF overhead), with no quality loss. Re-encoding tools would either lose quality or produce much larger files at equivalent quality.

Supported input formats include JPEG, JPEG2000, PNG (including transparency), TIFF, GIF, and others. The tool automatically handles colorspace, bit depth, and multi-page TIFFs.

Page sizing offers flexible options: natural image size (at specified DPI), fixed page sizes with fit modes, or explicit dimensions. The fit modes control how images are placed: **into** fits inside the page, **fill** fills the page (may crop), **shrink** only shrinks larger images.

Multiple images become multi-page PDFs in argument order. Piping from stdin enables integration with image processing pipelines.

# CAVEATS

Only works with raster images (no vector formats). Transparent PNGs become opaque in PDF (alpha becomes white). Some viewers may struggle with large embedded images. Not all PDF features are supported (no encryption, compression control is limited).

# HISTORY

**img2pdf** was created by Johannes Schauer Marin Rodrigues to address the common problem of converting images to PDF without quality loss. Existing tools like ImageMagick would re-encode images, causing quality degradation or size bloat. The tool is written in Python and published as a pip package.

# SEE ALSO

[convert](/man/convert)(1), [pdftk](/man/pdftk)(1), [pdfunite](/man/pdfunite)(1), [tesseract](/man/tesseract)(1)
