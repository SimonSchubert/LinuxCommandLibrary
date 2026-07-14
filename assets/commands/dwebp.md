# TAGLINE

decode WebP images to other formats

# TLDR

**Convert WebP to PNG**

```dwebp [image.webp] -o [output.png]```

**Convert to PPM**

```dwebp [image.webp] -ppm -o [output.ppm]```

**Convert to BMP**

```dwebp [image.webp] -bmp -o [output.bmp]```

**Show image info** only

```dwebp -info [image.webp]```

**Resize** while decoding (0 keeps the aspect ratio)

```dwebp [image.webp] -resize [800] [0] -o [output.png]```

**Crop** a rectangle out of the image

```dwebp [image.webp] -crop [x] [y] [width] [height] -o [output.png]```

**Flip image** vertically

```dwebp -flip [image.webp] -o [output.png]```

# SYNOPSIS

**dwebp** [_options_] _input.webp_ **-o** _output_

# PARAMETERS

_INPUT_
> WebP file to decode.

**-o** _FILE_
> Output file path.

**-ppm**
> Output PPM format.

**-bmp**
> Output BMP format.

**-tiff**
> Output TIFF format.

**-pgm**
> Output PGM format (grayscale).

**-pam**
> Output PAM format (preserves the alpha channel).

**-alpha**
> Output only the alpha plane as a grayscale image.

**-info**
> Print image info only.

**-flip**
> Flip image vertically.

**-crop** _x_ _y_ _w_ _h_
> Decode only the given rectangle of the image.

**-resize** _width_ _height_ (or **-scale**)
> Rescale the decoded image. A value of 0 for one dimension preserves the aspect ratio.

**-nofancy**
> Disable fancy (higher quality) upsampling.

**-nodither**
> Disable dithering.

**-mt**
> Use multi-threading for decoding.

**-quiet**
> Suppress informational output.

**-v**
> Print decoding time.

**-version**
> Print the library version and exit.

**-h**
> Display help information.

# DESCRIPTION

**dwebp** decodes WebP images to other formats. It's part of the libwebp package providing reference implementations for WebP encoding and decoding.

The tool supports both lossy and lossless WebP images, including those with alpha transparency. Output format defaults to PNG unless specified otherwise.

dwebp is useful for converting WebP images from web sources to formats compatible with tools that don't support WebP natively.

# CAVEATS

The output file extension does not select the format; use the format flags. Animated WebP files are not handled by dwebp, only their first frame or nothing at all: use anim_dump or webpmux for animations. PNG output is the default and requires libpng at build time.

# HISTORY

dwebp is part of **libwebp**, Google's reference implementation of the WebP image format. WebP was introduced by Google in **2010** as an efficient image format for web use.

# SEE ALSO

[cwebp](/man/cwebp)(1), [gif2webp](/man/gif2webp)(1), [convert](/man/convert)(1)

# RESOURCES

```[Source code](https://chromium.googlesource.com/webm/libwebp)```

```[Homepage](https://developers.google.com/speed/webp)```

```[Documentation](https://developers.google.com/speed/webp/docs/dwebp)```

<!-- verified: 2026-07-14 -->
