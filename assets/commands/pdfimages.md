# TAGLINE

extracts images embedded in PDF files

# TLDR

**Extract images from PDF**

```pdfimages [document.pdf] [output_prefix]```

**Extract as PNG**

```pdfimages -png [document.pdf] [output_prefix]```

**Extract as JPEG**

```pdfimages -j [document.pdf] [output_prefix]```

**Extract from page range**

```pdfimages -f [1] -l [5] [document.pdf] [output_prefix]```

**List images without extracting**

```pdfimages -list [document.pdf]```

**Extract preserving original format**

```pdfimages -all [document.pdf] [output_prefix]```

# SYNOPSIS

**pdfimages** [_-f first_] [_-l last_] [_-png_] [_-j_] [_-all_] [_options_] _file.pdf_ _prefix_

# PARAMETERS

**-f** _PAGE_
> First page to extract from.

**-l** _PAGE_
> Last page to extract from.

**-png**
> Output as PNG.

**-tiff**
> Output as TIFF.

**-j**
> Output as JPEG.

**-jp2**
> Output as JPEG2000.

**-jbig2**
> Output as JBIG2.

**-ccitt**
> Output as CCITT fax.

**-all**
> Preserve original format.

**-list**
> List images without extracting.

**-opw** _PASSWORD_
> Owner password.

**-upw** _PASSWORD_
> User password.

# DESCRIPTION

**pdfimages** extracts images embedded in PDF files. Each image is saved as a separate file with a sequential number.

Default output is PPM/PBM format. The -png, -j, and other format options convert to common formats. The -all option preserves original compression when possible.

List mode shows image details without extracting: dimensions, color space, compression, and size. This helps understand PDF content before extraction.

Page range options limit extraction to specific pages. This is useful for large documents where only certain pages are needed.

Images in PDFs may be split across multiple objects or use unusual color spaces. The tool handles these cases transparently.

Output files are named with the prefix followed by a sequence number and format extension.

# CAVEATS

Some images may extract with unexpected sizes or colors due to PDF transformations. Inline images may not extract correctly. Masks and transparency require special handling.

# HISTORY

**pdfimages** is part of **poppler-utils**, derived from the **Xpdf** project by **Derek Noonburg**. The tools provide command-line access to PDF content manipulation.

# SEE ALSO

[pdftotext](/man/pdftotext)(1), [pdfinfo](/man/pdfinfo)(1), [pdftoppm](/man/pdftoppm)(1), [convert](/man/convert)(1)
