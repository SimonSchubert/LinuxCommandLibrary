# TLDR

**Convert WebP to PNG**

```dwebp [image.webp] -o [output.png]```

**Convert to PPM**

```dwebp [image.webp] -ppm -o [output.ppm]```

**Convert to BMP**

```dwebp [image.webp] -bmp -o [output.bmp]```

**Show image info** only

```dwebp -info [image.webp]```

**Convert with** alpha channel

```dwebp [image.webp] -o [output.png]```

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

**-info**
> Print image info only.

**-flip**
> Flip image vertically.

**--help**
> Display help information.

# DESCRIPTION

**dwebp** decodes WebP images to other formats. It's part of the libwebp package providing reference implementations for WebP encoding and decoding.

The tool supports both lossy and lossless WebP images, including those with alpha transparency. Output format defaults to PNG unless specified otherwise.

dwebp is useful for converting WebP images from web sources to formats compatible with tools that don't support WebP natively.

# CAVEATS

Output file extension doesn't determine format (use flags). Animation not fully supported. Large images may use significant memory.

# HISTORY

dwebp is part of **libwebp**, Google's reference implementation of the WebP image format. WebP was introduced by Google in **2010** as an efficient image format for web use.

# SEE ALSO

[cwebp](/man/cwebp)(1), [gif2webp](/man/gif2webp)(1), [convert](/man/convert)(1)
