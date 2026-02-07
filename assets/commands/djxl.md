# TAGLINE

JPEG XL decoder to multiple formats

# TLDR

**Decode JPEG XL** to PNG

```djxl [image.jxl] [output.png]```

**Decode to JPEG**

```djxl [image.jxl] [output.jpg]```

**Decode to PPM**

```djxl [image.jxl] [output.ppm]```

**Show image info** only

```djxl --info [image.jxl]```

**Decode with specific** number of threads

```djxl --num_threads [4] [image.jxl] [output.png]```

**Decode specific frame** from animation

```djxl --frame [5] [animation.jxl] [frame5.png]```

# SYNOPSIS

**djxl** [_options_] _input.jxl_ [_output_]

# PARAMETERS

_INPUT_
> JPEG XL file to decode.

_OUTPUT_
> Output file (format inferred from extension).

**--info**
> Show image information only.

**--num_threads** _N_
> Number of decoding threads.

**--frame** _N_
> Extract specific frame from animation.

**--jpeg**
> Reconstruct exact JPEG if losslessly recompressed.

**--bits_per_sample** _N_
> Output bit depth.

**--help**
> Display help information.

# DESCRIPTION

**djxl** is the reference JPEG XL decoder, converting JPEG XL images to other formats. It's part of the libjxl reference implementation and supports all JPEG XL features including animation, HDR, and lossless JPEG reconstruction.

JPEG XL files created by losslessly recompressing JPEG can be decoded back to the exact original JPEG bytes using the --jpeg flag. This allows JPEG XL to serve as a reversible compression layer.

The decoder supports various output formats with automatic format detection based on file extension, and can extract metadata and individual frames from animated images.

# CAVEATS

Output format support depends on build configuration. Some HDR features may require specific output formats. JPEG reconstruction requires original was losslessly compressed. Large images may use significant memory.

# HISTORY

djxl is part of the **libjxl** reference implementation of JPEG XL, developed by the **JPEG Committee** with contributions from Google. JPEG XL was standardized in **2022** as a next-generation image format combining features from Google's PIK and Cloudinary's FUIF.

# SEE ALSO

[cjxl](/man/cjxl)(1), [djpeg](/man/djpeg)(1), [convert](/man/convert)(1)
