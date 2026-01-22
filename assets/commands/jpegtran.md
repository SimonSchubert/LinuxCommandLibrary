# TLDR

**Mirror** an image horizontally or vertically

```jpegtran -flip [horizontal|vertical] [path/to/image.jpg] > [path/to/output.jpg]```

**Rotate** an image 90, 180, or 270 degrees clockwise

```jpegtran -rotate [90|180|270] [path/to/image.jpg] > [path/to/output.jpg]```

**Transpose** across upper-left to lower-right axis

```jpegtran -transpose [path/to/image.jpg] > [path/to/output.jpg]```

Convert to **grayscale**

```jpegtran -grayscale [path/to/image.jpg] > [path/to/output.jpg]```

**Crop** to specified dimensions

```jpegtran -crop [W]x[H]+[X]+[Y] [path/to/image.jpg] > [path/to/output.jpg]```

Crop and save to **specific file**

```jpegtran -crop [W]x[H] -outfile [path/to/output.jpg] [path/to/image.jpg]```

# SYNOPSIS

**jpegtran** [_options_] [_file_]

# PARAMETERS

**-flip** _horizontal|vertical_
> Mirror the image

**-rotate** _90|180|270_
> Rotate clockwise by specified degrees

**-transpose**
> Transpose across main diagonal

**-transverse**
> Transpose across anti-diagonal

**-grayscale**
> Convert to grayscale

**-crop** _WxH+X+Y_
> Crop to width W, height H, at offset X,Y

**-outfile** _FILE_
> Write output to specified file

**-optimize**
> Optimize Huffman tables

**-progressive**
> Create progressive JPEG

# DESCRIPTION

**jpegtran** performs lossless transformations on JPEG images. Unlike re-encoding, these operations work directly on the DCT coefficients, preserving image quality completely.

Supported lossless operations include rotation (in 90-degree increments), flipping, transposition, grayscale conversion, and cropping (on MCU boundaries). The tool can also optimize or convert between baseline and progressive formats.

# CAVEATS

Crop dimensions may be adjusted to MCU (Minimum Coded Unit) boundaries. Some transformations may require -trim to discard partial edge blocks. Output goes to stdout by default; redirect or use -outfile.

# HISTORY

jpegtran is part of libjpeg/libjpeg-turbo, the reference JPEG library. The original libjpeg was developed by the Independent JPEG Group starting in **1991**.

# SEE ALSO

[cjpeg](/man/cjpeg)(1), [djpeg](/man/djpeg)(1), [convert](/man/convert)(1)
