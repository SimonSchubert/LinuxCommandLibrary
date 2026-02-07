# TAGLINE

Data Matrix barcode decoder

# TLDR

**Read Data Matrix barcode from image**

```dmtxread [image.png]```

**Read from multiple images**

```dmtxread [image1.png] [image2.png]```

**Output in verbose mode**

```dmtxread -v [image.png]```

**Limit search to specific region**

```dmtxread -x [100] -y [100] -W [200] -H [200] [image.png]```

**Set timeout for scanning**

```dmtxread -m [5000] [image.png]```

**Output newline-separated** (for multiple codes)

```dmtxread -n [image.png]```

**Read from webcam** (with other tools)

```fswebcam -r 640x480 - | dmtxread```

# SYNOPSIS

**dmtxread** [_options_] _image_...

# PARAMETERS

**-v**, **--verbose**
> Verbose output showing scan progress.

**-n**, **--newline**
> Print newline after each decoded message.

**-m**, **--milliseconds** _ms_
> Maximum scan time in milliseconds.

**-x**, **--x-min** _pixels_
> X coordinate of scan region origin.

**-y**, **--y-min** _pixels_
> Y coordinate of scan region origin.

**-W**, **--width** _pixels_
> Width of scan region.

**-H**, **--height** _pixels_
> Height of scan region.

**-N**, **--stop-after** _n_
> Stop after decoding n barcodes.

**-c**, **--codewords**
> Print codewords instead of decoded message.

**-e**, **--min-edge** _pixels_
> Minimum edge length to consider.

**-E**, **--max-edge** _pixels_
> Maximum edge length to consider.

# DESCRIPTION

**dmtxread** decodes Data Matrix barcodes from image files. Data Matrix is a 2D barcode format commonly used for small item marking, electronics, and industrial applications where high data density in small space is needed.

The tool processes various image formats (PNG, JPEG, TIFF, etc.) and searches for Data Matrix patterns. Multiple barcodes can be detected in a single image. The decoded text is output to stdout.

dmtxread is part of the **libdmtx** library, which provides Data Matrix encoding and decoding functionality. The library handles error correction built into the Data Matrix format.

# CAVEATS

Image quality significantly affects detection success. Very small, blurry, or damaged barcodes may not decode. Processing high-resolution images can be slow; use region limiting for better performance. Only supports Data Matrix format, not QR codes.

# HISTORY

**libdmtx** and its tools were created by **Mike Laughton** and first released in **2006**. The library provides open-source Data Matrix barcode support, filling a gap when most implementations were proprietary. Data Matrix itself was invented by **RVSI Acuity CiMatrix** in **1987** and became an ISO standard.

# SEE ALSO

[dmtxwrite](/man/dmtxwrite)(1), [zbarimg](/man/zbarimg)(1), [qrencode](/man/qrencode)(1)
