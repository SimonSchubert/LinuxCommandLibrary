# TAGLINE

Multi-format barcode generator

# TLDR

**Generate QR code**

```zint -b 58 -d "[data]" -o [output.png]```

**Generate Code 128 barcode**

```zint -b 20 -d "[data]" -o [output.png]```

**Generate EAN-13 barcode**

```zint -b 13 -d "[1234567890123]"```

**Set output format**

```zint -b 58 -d "[data]" -o [output.svg]```

**Scale barcode size**

```zint -b 58 -d "[data]" --scale [3]```

**Generate with human-readable text**

```zint -b 20 -d "[data]" --notext=0```

# SYNOPSIS

**zint** [_options_]

# PARAMETERS

**-b** _type_
> Barcode type (number or name)

**-d** _data_
> Data to encode

**-o** _file_
> Output filename

**--scale** _factor_
> Scale factor for output

**--height** _value_
> Barcode height (for 1D barcodes)

**--fg** _color_
> Foreground color (hex)

**--bg** _color_
> Background color (hex)

**--notext**
> Disable human-readable text

**-i** _file_
> Read data from file

**--batch**
> Process batch data from file

**--dump**
> Output hex dump instead of image

**-e**
> Display symbol information

# BARCODE TYPES

Common types: **1** (Code 11), **13** (EAN-13), **20** (Code 128), **29** (UPC-A), **55** (PDF417), **58** (QR Code), **71** (Data Matrix), **92** (Aztec Code), **142** (MaxiCode)

Use **zint -t** to list all supported types.

# DESCRIPTION

**zint** is a barcode generator supporting over 50 barcode types. It creates 1D barcodes (Code 128, EAN, UPC), 2D barcodes (QR Code, Data Matrix, PDF417), and specialized formats (postal codes, pharmaceutical).

Output formats include PNG, BMP, GIF, PCX, SVG, EPS, and EMF. The tool can also output raw hex dumps for debugging or custom rendering.

zint includes both a command-line interface and a GUI (zint-qt). A library (libzint) is available for integration into applications.

# CAVEATS

Different barcode types have different data requirements. Some accept only numbers, others have length restrictions.

QR codes and other 2D barcodes have error correction levels that trade capacity for redundancy.

Not all barcode scanners support all symbologies. Verify compatibility with target readers.

# SEE ALSO

[qrencode](/man/qrencode)(1), [barcode](/man/barcode)(1), [dmtxwrite](/man/dmtxwrite)(1)
