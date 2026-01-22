# TLDR

**Convert** a PNG image to AVIF

```avifenc [path/to/input.png] [path/to/output.avif]```

Encode with a **specific speed** (0=slowest, 10=fastest)

```avifenc --speed [2] [path/to/input.png] [path/to/output.avif]```

Set **quality** level (0-63, lower is better)

```avifenc --min [20] --max [30] [path/to/input.png] [path/to/output.avif]```

# SYNOPSIS

**avifenc** [_options_] _input_ _output.avif_

# DESCRIPTION

**avifenc** encodes images into the AV1 Image File Format (AVIF), a modern image format based on the AV1 video codec. AVIF provides excellent compression efficiency, often achieving smaller file sizes than JPEG and WebP at equivalent quality.

The encoder supports input from PNG, JPEG, and Y4M formats and can produce both lossy and lossless AVIF images.

# PARAMETERS

**--speed** _n_
> Encoding speed (0-10, default 6). Lower values produce better quality but take longer

**--min** _n_
> Minimum quality (0-63)

**--max** _n_
> Maximum quality (0-63)

**--lossless**
> Encode losslessly

**-d, --depth** _bits_
> Output bit depth (8, 10, or 12)

**-j, --jobs** _n_
> Number of parallel encoding jobs

# CAVEATS

Encoding at low speed values can be extremely slow. AVIF support in browsers and image viewers is still growing but not universal. Very high quality settings may produce larger files than the original.

# HISTORY

AVIF was developed by the Alliance for Open Media and finalized in **2019**. It is based on the AV1 video codec, which itself was designed to be a royalty-free alternative to HEVC/H.265.

# SEE ALSO

[avifdec](/man/avifdec)(1), [cwebp](/man/cwebp)(1), [convert](/man/convert)(1)
