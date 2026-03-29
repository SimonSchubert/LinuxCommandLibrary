# TAGLINE

Read barcodes from image files

# TLDR

**Scan image for barcodes**

```zbarimg [image.png]```

**Scan multiple images**

```zbarimg [image1.png] [image2.jpg]```

**Output raw data only**

```zbarimg --raw [image.png]```

**Scan only QR codes** (disable all, then enable qrcode)

```zbarimg -Sdisable -Sqrcode.enable [image.png]```

**Quiet mode** (suppress statistics and warnings)

```zbarimg -q [image.png]```

**Display image with detected barcodes highlighted**

```zbarimg -d [image.png]```

**XML output**

```zbarimg --xml [image.png]```

**Output polygon points of detected barcodes**

```zbarimg --polygon [image.png]```

# SYNOPSIS

**zbarimg** [_-qv_] [_--raw_] [_-dD_] [_--xml_] [_-S[symbology.]config[=value]_] _image..._

# PARAMETERS

**--raw**
> Output raw symbol data without symbology type prefix.

**-q**, **--quiet**
> Quiet operation; only output decoded symbol data. Suppresses the statistics line and no-barcode warnings on stderr.

**-d**, **--display**
> Enable display of images with decoded symbols highlighted.

**-D**, **--nodisplay**
> Disable image display.

**--xml**, **--noxml**
> Enable or disable XML output format wrapping decoded data with scan metadata.

**--polygon**
> Output polygon points of the barcode boundary in SVG format.

**-S** _[symbology.]config[=value]_
> Set decoder configuration. Symbologies include: ean13, ean8, upca, upce, isbn13, isbn10, i25, codabar, code39, code93, code128, qrcode, or * for all.

**-v**, **--verbose**[=_n_]
> Increase debug output level. Use multiple -v for more detail, or specify n directly.

**--help**
> Show help.

**--version**
> Show version.

# SUPPORTED FORMATS

**QR-Code**
> 2D matrix barcodes.

**EAN-13**, **EAN-8**
> European Article Number.

**UPC-A**, **UPC-E**
> Universal Product Code.

**Code-128**, **Code-93**, **Code-39**
> Linear barcodes.

**Interleaved 2 of 5** (i25)
> Numeric-only linear barcode.

**Codabar**
> Numeric barcode used in libraries and blood banks.

**ISBN-10**, **ISBN-13**
> Book identifiers.

**DataBar**, **DataBar Expanded**
> GS1 DataBar symbologies.

# DESCRIPTION

**zbarimg** reads barcodes from image files. It detects and decodes various barcode formats including QR codes.

Multiple barcode types are detected automatically. Settings can disable specific types for faster scanning.

Output shows barcode type and decoded data. Raw mode outputs only the data without type prefixes.

Multiple barcodes in one image are all detected. Each is reported on a separate line.

The display option shows images with detected barcodes highlighted. This helps verify correct detection.

Image formats supported include PNG, JPEG, and any format supported by ImageMagick.

# CAVEATS

Detection depends on image quality. Blurry or low-contrast images may fail. Some barcode types need explicit enabling.

# HISTORY

**zbar** and **zbarimg** were created by **Jeff Brown** around **2007**. The library provides barcode scanning for both images and video, with bindings for many languages.

# SEE ALSO

[zbarcam](/man/zbarcam)(1), [qrencode](/man/qrencode)(1), [dmtxread](/man/dmtxread)(1)
