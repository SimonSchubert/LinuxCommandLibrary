# TLDR

**Scan image for barcodes**

```zbarimg [image.png]```

**Scan multiple images**

```zbarimg [image1.png] [image2.jpg]```

**Output raw data only**

```zbarimg --raw [image.png]```

**Scan specific barcode types**

```zbarimg -S[qrcode.enable] [image.png]```

**Quiet mode**

```zbarimg -q [image.png]```

**Display decoded data**

```zbarimg -d [image.png]```

**XML output**

```zbarimg --xml [image.png]```

# SYNOPSIS

**zbarimg** [_--raw_] [_-q_] [_-d_] [_-S setting_] [_options_] _images_

# PARAMETERS

**--raw**
> Output raw data only.

**-q**, **--quiet**
> Suppress messages.

**-d**, **--display**
> Show images with decoded symbols.

**--xml**
> XML output format.

**-S** _SETTING_
> Scanner setting.

**-D**, **--nodisplay**
> Disable display.

**--verbose**, **-v**
> Verbose output.

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

**Code-128**, **Code-39**
> Linear barcodes.

**ISBN-10**, **ISBN-13**
> Book identifiers.

**DataBar**
> GS1 DataBar.

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
