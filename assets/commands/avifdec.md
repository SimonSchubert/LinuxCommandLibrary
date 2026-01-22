# TLDR

**Decode** AVIF to PNG

```avifdec [input.avif] [output.png]```

Decode to **JPEG**

```avifdec -c jpg [input.avif] [output.jpg]```

**Show** information only

```avifdec --info [input.avif]```

Decode with **specific depth**

```avifdec --depth [10] [input.avif] [output.png]```

# SYNOPSIS

**avifdec** [_options_] _input.avif_ _output_

# DESCRIPTION

**avifdec** decodes AVIF (AV1 Image File Format) images to standard formats like PNG, JPEG, or Y4M. AVIF is a modern image format offering superior compression and quality compared to JPEG.

The tool is part of libavif and enables viewing and converting AVIF images to more widely supported formats.

# PARAMETERS

**-c**, **--codec** _format_
> Output format (png, jpg, y4m)

**-q**, **--quality** _value_
> JPEG quality (1-100)

**--depth** _bits_
> Bit depth for output

**--info**
> Display image information only

**--ignore-icc**
> Ignore ICC color profile

**--ignore-exif**
> Ignore EXIF metadata

**-i**, **--index** _n_
> Decode specific frame from animation

# FEATURES

- HDR support (10-bit, 12-bit)
- Wide color gamut
- ICC profile preservation
- EXIF metadata extraction
- Animation frame selection

# CAVEATS

Output format support depends on compile-time options. Large images may consume significant memory. HDR content may not display correctly in non-HDR-aware viewers.

# HISTORY

**avifdec** was developed as part of libavif by Joe Drago and the Alliance for Open Media, released around **2019** to support the new AVIF format standardized by AOM.

# SEE ALSO

[avifenc](/man/avifenc)(1), [imagemagick](/man/imagemagick)(1), [libheif](/man/libheif)(1)
