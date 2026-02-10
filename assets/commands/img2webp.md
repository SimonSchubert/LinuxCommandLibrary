# TAGLINE

converts images to the WebP format developed by Google

# TLDR

**Convert** an image to WebP format

```img2webp [path/to/image] -o [path/to/output.webp]```

# SYNOPSIS

**img2webp** [_options_] _input_ **-o** _output_

# PARAMETERS

**-o** _FILE_
> Output WebP filename

**-lossy**
> Use lossy compression

**-lossless**
> Use lossless compression (default for PNG input)

**-q** _QUALITY_
> Quality factor (0-100, default 75)

**-m** _METHOD_
> Compression method (0-6, default 4)

**-loop** _COUNT_
> Loop count for animations (0 = infinite)

**-d** _MS_
> Frame duration in milliseconds for animations

# DESCRIPTION

**img2webp** converts images to the WebP format developed by Google. WebP provides superior compression compared to JPEG and PNG while maintaining good visual quality, making it ideal for web images.

The tool supports both lossy and lossless compression modes. It can also create animated WebP images from multiple input frames.

# CAVEATS

Part of the libwebp package. Input format support depends on linked libraries. Very old browsers may not support WebP format. Some image editors have limited WebP support.

# HISTORY

WebP was developed by Google and announced in **2010** as an open standard for compressed web images. The format is based on the VP8 video codec and offers significant size reductions compared to traditional formats.

# SEE ALSO

[cwebp](/man/cwebp)(1), [dwebp](/man/dwebp)(1), [gif2webp](/man/gif2webp)(1)
