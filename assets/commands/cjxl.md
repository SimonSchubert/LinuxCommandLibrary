# TLDR

**Encode** an image to JPEG XL format with default settings

```cjxl [input.png] [output.jxl]```

**Encode with a specific quality** level (1-100, higher is better)

```cjxl -q [90] [input.png] [output.jxl]```

**Encode with lossless** compression

```cjxl -q [100] [input.png] [output.jxl]```

**Encode with a specific effort** level (1-9, higher is slower but smaller)

```cjxl -e [7] [input.png] [output.jxl]```

**Losslessly transcode** a JPEG file to JPEG XL (preserves original)

```cjxl --lossless_jpeg=1 [input.jpg] [output.jxl]```

**Encode with specific distance** value (0=lossless, higher=more compression)

```cjxl -d [1.0] [input.png] [output.jxl]```

# SYNOPSIS

**cjxl** [_options_] _input_ _output.jxl_

# PARAMETERS

**-q** _N_, **--quality**=_N_
> Quality setting from 1 to 100. 100 is mathematically lossless. Default is 90.

**-d** _N_, **--distance**=_N_
> Target visual distance (0=lossless, 1.0=visually lossless, higher means more compression). Overrides quality.

**-e** _N_, **--effort**=_N_
> Encoder effort level from 1 to 9. Higher values produce smaller files but encode slower. Default is 7.

**--lossless_jpeg**=_N_
> When encoding JPEG input, 1 preserves the original JPEG data for bit-exact reconstruction.

**-j**, **--jpeg_transcode**
> Lossless JPEG transcode mode (shortcut for --lossless_jpeg=1).

**--num_threads**=_N_
> Number of threads to use. 0 means use all available cores.

**--progressive**
> Enable progressive decoding for the output file.

**--premultiply**=_N_
> Premultiply alpha channel (0=no, 1=yes, -1=auto).

**-h**, **--help**
> Display help information and exit.

**-v**, **--verbose**
> Enable verbose output.

# DESCRIPTION

**cjxl** is the reference encoder for JPEG XL, a next-generation image format designed to replace both JPEG and PNG. It is part of the libjxl project maintained by the JPEG committee.

JPEG XL offers superior compression compared to legacy formats, supporting both lossy and lossless modes. A unique feature is the ability to losslessly transcode existing JPEG files, reducing their size by approximately 20% while allowing perfect reconstruction of the original JPEG.

The encoder supports a wide range of input formats including PNG, APNG, GIF, JPEG, PPM, and PFM. It handles high bit depths, HDR content, and animations natively. The effort parameter provides a trade-off between encoding speed and compression ratio.

# CAVEATS

Browser support for JPEG XL is limited as of 2024. The lossless JPEG transcode feature only works with standard baseline JPEGs and may fail on progressive or arithmetic-coded JPEGs. High effort levels significantly increase encoding time.

# HISTORY

JPEG XL was standardized as **ISO/IEC 18181** in **2022**. The format was developed by the JPEG committee, combining technologies from Google's PIK and Cloudinary's FUIF projects. The cjxl encoder is part of the reference implementation released by the libjxl project starting in **2019**.

# SEE ALSO

[djxl](/man/djxl)(1), [cjpeg](/man/cjpeg)(1), [convert](/man/convert)(1), [cwebp](/man/cwebp)(1)
