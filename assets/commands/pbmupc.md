# TAGLINE

Create UPC-A barcode PBM images

# TLDR

**Create a UPC-A barcode image**

```pbmupc [0] [12345] [67890] [5] > [barcode.pbm]```

**Create barcode with style 1 (tall guards)**

```pbmupc -s1 [0] [12345] [67890] [5] > [barcode.pbm]```

**Create barcode with style 2 (short guards)**

```pbmupc -s2 [0] [12345] [67890] [5] > [barcode.pbm]```

# SYNOPSIS

**pbmupc** [**-s1** | **-s2**] _type_ _manufacturer_ _product_ _check_

# PARAMETERS

_type_
> Single digit indicating the number system type (typically 0 for standard UPC-A).

_manufacturer_
> Five-digit manufacturer code.

_product_
> Five-digit product code.

_check_
> Single check digit (modulo-10 checksum of the other 11 digits).

**-s1**
> Style 1 output with tall guard bars (default).

**-s2**
> Style 2 output with short guard bars.

# DESCRIPTION

**pbmupc** creates UPC-A (Universal Product Code) barcode images in PBM (Portable Bitmap) format. It takes the four components of a 12-digit UPC-A code as separate arguments: the number system type digit, a five-digit manufacturer code, a five-digit product code, and the check digit.

The output PBM image can be converted to other formats using Netpbm conversion tools. UPC-A barcodes are the standard retail barcode format used in the United States and Canada.

# CAVEATS

Only generates UPC-A format barcodes. The check digit is not validated or computed automatically; the user must supply the correct value. Part of the Netpbm toolkit.

# HISTORY

**pbmupc** is part of the **Netpbm** package, which originated from Jef Poskanzer's PBMplus toolkit in the late 1980s.

# SEE ALSO

[pbm](/man/pbm)(5), [netpbm](/man/netpbm)(1)

