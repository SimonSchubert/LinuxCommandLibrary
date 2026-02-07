# TAGLINE

Data Matrix barcode encoder

# TLDR

**Encode text as Data Matrix barcode**

```echo "[text]" | dmtxwrite -o [output.png]```

**Create barcode from file contents**

```dmtxwrite -o [output.png] < [data.txt]```

**Set output image size**

```echo "[text]" | dmtxwrite -d [300] -o [output.png]```

**Create SVG output**

```echo "[text]" | dmtxwrite -o [output.svg]```

**Set module (cell) size**

```echo "[text]" | dmtxwrite -m [5] -o [output.png]```

**Add margin around barcode**

```echo "[text]" | dmtxwrite -M [10] -o [output.png]```

**Use specific symbol size**

```echo "[text]" | dmtxwrite -s s -o [output.png]```

# SYNOPSIS

**dmtxwrite** [_options_] [**-o** _output_]

# PARAMETERS

**-o**, **--output** _file_
> Output filename (format from extension).

**-d**, **--resolution** _dpi_
> Image resolution in DPI.

**-m**, **--module** _pixels_
> Module (cell) size in pixels.

**-M**, **--margin** _pixels_
> Margin size in pixels.

**-s**, **--symbol-size** _size_
> Symbol size: s(quare), r(ectangle), or NxN.

**-e**, **--encoding** _scheme_
> Encoding scheme: b(est), a(scii), c(40), etc.

**-f**, **--format** _format_
> Output format: png, tif, gif, pdf, svg.

**-b**, **--background** _color_
> Background color.

**-c**, **--foreground** _color_
> Foreground color.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**dmtxwrite** generates Data Matrix barcode images from input text or binary data. Data Matrix barcodes are 2D square or rectangular patterns that encode data with built-in error correction.

The tool reads data from standard input and produces images in various formats. Symbol size is automatically chosen based on data length, or can be specified manually. Error correction is automatically included per the Data Matrix standard.

Data Matrix barcodes are widely used for small item marking (electronics, medical devices), logistics, and anywhere high data density is needed in a small space.

# SYMBOL SIZES

**s**: Automatic square selection
**r**: Automatic rectangle selection
**10x10** to **144x144**: Specific square sizes
**8x18** to **16x48**: Specific rectangle sizes

# CAVEATS

Data capacity depends on symbol size and encoding; larger symbols hold more data. Binary data encoding may require specific encoding schemes. Very small module sizes may not scan reliably. Some scanners have difficulty with rectangular Data Matrix codes.

# HISTORY

dmtxwrite is part of **libdmtx**, created by **Mike Laughton** in **2006**. The library provides open-source tools for Data Matrix barcode generation and reading. Data Matrix is an ISO/IEC 16022 standard, originally developed for industrial marking applications.

# SEE ALSO

[dmtxread](/man/dmtxread)(1), [qrencode](/man/qrencode)(1), [zint](/man/zint)(1)
