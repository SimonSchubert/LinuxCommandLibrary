# TLDR

**Generate a barcode as PostScript**

```barcode -b "[data]" -o [output.ps]```

**Generate a barcode as EPS**

```barcode -b "[data]" -e EPS -o [output.eps]```

**Generate Code 39 barcode**

```barcode -e code39 -b "[DATA123]" -o [output.ps]```

**Generate EAN-13 barcode**

```barcode -e ean -b "[5901234123457]" -o [output.ps]```

**Generate Code 128 barcode**

```barcode -e code128 -b "[data]" -o [output.ps]```

**Generate barcode without text label**

```barcode -b "[data]" -n -o [output.ps]```

**Set custom dimensions**

```barcode -b "[data]" -g [100x50] -o [output.ps]```

# SYNOPSIS

**barcode** [**-e** _encoding_] [**-b** _string_] [**-o** _file_] [_options_]

# PARAMETERS

**-b** _string_
> Data to encode in the barcode.

**-e** _encoding_
> Barcode encoding type (ean, upc, code39, code128, etc.).

**-o** _file_
> Output file (default: stdout).

**-g** _WxH_
> Barcode geometry (width x height in points).

**-n**
> No text; suppress human-readable label below barcode.

**-t** _WxH_
> Table mode: generate multiple barcodes per page.

**-m** _margin_
> Margin size around barcode.

**-p** _pagesize_
> Page size (a4, letter, etc.).

**-u** _unit_
> Unit for dimensions (mm, in, pt).

**-E**
> Output as EPS (Encapsulated PostScript).

**-P**
> Output as PCL (for HP printers).

# SUPPORTED ENCODINGS

**ean** / **ean13**: European Article Number (13 digits)
**upc** / **upc-a**: Universal Product Code
**isbn**: International Standard Book Number
**code39**: Code 39 (alphanumeric)
**code128**: Code 128 (high-density)
**code93**: Code 93
**i25**: Interleaved 2 of 5
**cbr** / **codabar**: Codabar
**msi**: MSI Plessey
**pls**: Plessey

# DESCRIPTION

**barcode** is a GNU utility that generates barcodes in various formats from textual data. It produces PostScript or EPS output that can be printed directly, converted to other formats, or embedded in documents.

The tool supports all major 1D barcode symbologies used in retail, logistics, and inventory management. Each encoding has specific rules for valid characters and optional check digits. The tool automatically calculates check digits for formats that require them.

Output can be customized with different sizes, margins, and label options. Table mode allows generating sheets of labels for batch printing.

# CAVEATS

Output is PostScript/EPS only; conversion to PNG or other raster formats requires tools like Ghostscript or ImageMagick. Not all encodings accept all characters; Code 39 is uppercase only, EAN/UPC require specific digit counts. Check digit validation is performed automatically but data must be valid for the chosen encoding.

# HISTORY

GNU barcode was written by **Alessandro Rubini** and first released in the **late 1990s** as part of the GNU project. It was designed for use with Unix printing systems and document preparation workflows. While newer tools and libraries have emerged for generating barcodes in various formats, GNU barcode remains useful for its simplicity and PostScript output quality.

# SEE ALSO

[qrencode](/man/qrencode)(1), [zint](/man/zint)(1), [gs](/man/gs)(1)
