# TAGLINE

Decode AVIF images to standard formats

# TLDR

**Decode** AVIF to PNG

```avifdec [input.avif] [output.png]```

Decode to **JPEG** with specific quality

```avifdec -q [85] [input.avif] [output.jpg]```

**Show** image information only

```avifdec -i [input.avif]```

Decode with **16-bit depth** (PNG only)

```avifdec -d 16 [input.avif] [output.png]```

Decode using **multiple threads**

```avifdec -j [4] [input.avif] [output.png]```

# SYNOPSIS

**avifdec** [_options_] _input.avif_ _output_

# DESCRIPTION

**avifdec** decodes AVIF (AV1 Image File Format) images to standard formats like PNG, JPEG, or Y4M. AVIF is a modern image format offering superior compression and quality compared to JPEG.

The tool is part of libavif and enables viewing and converting AVIF images to more widely supported formats.

# PARAMETERS

**-c** _codec_
> AV1 codec to use (aom, dav1d, libgav1). Default: auto-selected from available codecs

**-d** _depth_
> Output bit depth, 8 or 16 (PNG only; JPEG is always 8bpc)

**-q** _quality_
> Output JPEG quality, 0-100 (default: 90)

**-j** _jobs_
> Number of worker threads, or 'all' for all cores (default: all)

**-i**, **--info**
> Display image information instead of saving to disk

**--png-compress** _level_
> PNG compression level, 0-9 (0=none, 9=max)

**--chroma-upsampling** _mode_
> Chroma upsampling for 420/422: automatic, fastest, best, nearest, bilinear (default: automatic)

**--ignore-icc**
> Ignore embedded ICC color profile

**--index** _n_
> Decode specific frame index, or 'all' for every frame (default: 0)

**--no-strict**
> Disable strict validation checks

**-r**
> Output raw RGB values instead of premultiplying by alpha

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

[avifenc](/man/avifenc)(1), [imagemagick](/man/imagemagick)(1), [convert](/man/convert)(1)
