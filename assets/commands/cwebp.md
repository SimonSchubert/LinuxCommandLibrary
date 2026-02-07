# TAGLINE

Google WebP image encoder

# TLDR

**Convert an image to WebP** format

```cwebp [input.png] -o [output.webp]```

**Convert with specific quality** (0-100)

```cwebp -q [80] [input.jpg] -o [output.webp]```

**Create lossless WebP**

```cwebp -lossless [input.png] -o [output.webp]```

**Resize during conversion**

```cwebp -resize [800] [600] [input.jpg] -o [output.webp]```

**Convert with alpha channel** preservation

```cwebp -alpha_q [90] [input.png] -o [output.webp]```

**Use near-lossless** compression

```cwebp -near_lossless [60] [input.png] -o [output.webp]```

# SYNOPSIS

**cwebp** [_options_] _input_file_ **-o** _output_file.webp_

# PARAMETERS

**-o** _FILE_
> Output WebP file path.

**-q** _QUALITY_
> Compression quality (0-100, default 75). Higher is better quality.

**-lossless**
> Encode image losslessly.

**-near_lossless** _LEVEL_
> Near-lossless preprocessing (0-100, 0 is maximum preprocessing).

**-alpha_q** _QUALITY_
> Alpha channel quality (0-100).

**-resize** _WIDTH_ _HEIGHT_
> Resize to specified dimensions.

**-crop** _X_ _Y_ _W_ _H_
> Crop the input image.

**-preset** _NAME_
> Preset: default, photo, picture, drawing, icon, text.

**-m** _METHOD_
> Compression method (0-6, higher is slower/better).

**-z** _LEVEL_
> Lossless compression preset (0-9).

**-v**
> Verbose output.

# DESCRIPTION

**cwebp** is Google's encoder for the WebP image format. WebP provides superior compression compared to JPEG and PNG while supporting both lossy and lossless modes, as well as animation and alpha transparency.

The encoder accepts PNG, JPEG, TIFF, and WebP inputs. For lossy compression, the **-q** parameter controls the quality-size tradeoff. For lossless, the **-z** parameter controls compression effort.

WebP is widely supported in web browsers and offers 25-34% smaller file sizes than JPEG at equivalent quality. The lossless mode typically achieves 26% smaller files than PNG.

# CAVEATS

Very high quality settings may produce files larger than the source. Some older software doesn't support WebP. Lossy WebP introduces artifacts similar to JPEG. Near-lossless mode modifies pixels slightly for better compression.

# HISTORY

WebP was developed by **Google** and released in **2010**, based on the VP8 video codec. The cwebp encoder is part of the libwebp reference implementation. WebP achieved widespread browser support by **2020** and is recommended for web image optimization.

# SEE ALSO

[dwebp](/man/dwebp)(1), [gif2webp](/man/gif2webp)(1), [cjpeg](/man/cjpeg)(1), [convert](/man/convert)(1)
