# TLDR

**Decompress JPEG** to PPM

```djpeg [image.jpg] > [output.ppm]```

**Decompress to BMP** format

```djpeg -bmp [image.jpg] > [output.bmp]```

**Decompress to GIF** format

```djpeg -gif [image.jpg] > [output.gif]```

**Scale output** to fraction

```djpeg -scale [1/2] [image.jpg] > [output.ppm]```

**Output grayscale only**

```djpeg -grayscale [image.jpg] > [output.ppm]```

**Show verbose info**

```djpeg -verbose [image.jpg] > [output.ppm]```

# SYNOPSIS

**djpeg** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input JPEG file (stdin if omitted).

**-bmp**
> Output BMP format.

**-gif**
> Output GIF format.

**-ppm**
> Output PPM format (default).

**-targa**
> Output Targa format.

**-scale** _M/N_
> Scale output by fraction.

**-grayscale**
> Output grayscale only.

**-colors** _N_
> Quantize to N colors.

**-verbose**, **-debug**
> Show debug information.

# DESCRIPTION

**djpeg** decompresses JPEG images to various uncompressed or lossless formats. It's part of the libjpeg/libjpeg-turbo package and provides command-line JPEG decoding with format conversion.

The tool reads JPEG files and outputs PPM, BMP, GIF, or Targa format. Scaling during decompression is efficient as it uses DCT coefficient scaling rather than full decompression followed by resizing.

djpeg is useful for batch processing, scripting, and converting JPEG images to formats suitable for further processing with other tools.

# CAVEATS

Output goes to stdout by default (redirect to file). Color quantization for GIF may lose quality. Not all JPEG features supported equally. Progressive JPEG processing requires buffering.

# HISTORY

djpeg is part of the **libjpeg** project created by the **Independent JPEG Group (IJG)** starting in **1991**. libjpeg-turbo, a high-performance fork, provides compatible djpeg with SIMD optimizations.

# SEE ALSO

[cjpeg](/man/cjpeg)(1), [jpegtran](/man/jpegtran)(1), [convert](/man/convert)(1)
