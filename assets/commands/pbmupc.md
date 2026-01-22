# TLDR

**Create UPC barcode**

```pbmupc [0] [12345] [67890] [5] > [barcode.pbm]```

**Create barcode with type**

```pbmupc -s1 [0] [12345] [67890] [5] > [barcode.pbm]```

# SYNOPSIS

**pbmupc** [_options_] _digits_

# PARAMETERS

_DIGITS_
> UPC-A digits (type, mfg, prod, check).

**-s1**
> Style 1 output.

**-s2**
> Style 2 output.

# DESCRIPTION

**pbmupc** creates UPC-A barcodes. Generates barcode images.

The tool produces retail barcodes. Part of Netpbm.

pbmupc makes barcodes.

# CAVEATS

Part of Netpbm. UPC-A format only. Requires valid digits.

# HISTORY

pbmupc is part of **Netpbm** for generating UPC barcode images.

# SEE ALSO

[pbm](/man/pbm)(5), [netpbm](/man/netpbm)(1)

