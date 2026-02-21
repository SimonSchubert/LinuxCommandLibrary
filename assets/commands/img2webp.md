# TAGLINE

create animated WebP files from a sequence of input images

# TLDR

**Create animated WebP** from image sequence

```img2webp [frame1.png] [frame2.png] [frame3.png] -o [animation.webp]```

# SYNOPSIS

**img2webp** [_options_] _input_ **-o** _output_

# PARAMETERS

**-o** _FILE_
> Output WebP filename

**-lossy**
> Use lossy compression

**-lossless**
> Use lossless compression (default)

**-q** _QUALITY_
> Quality factor (0-100, default 75)

**-m** _METHOD_
> Compression method (0-6, default 4)

**-loop** _COUNT_
> Loop count for animations (0 = infinite)

**-d** _MS_
> Frame duration in milliseconds for animations

# DESCRIPTION

**img2webp** creates animated WebP files from a sequence of input images. Each input frame can have individual compression settings (lossy or lossless) and duration. For single-image conversion to WebP, use **cwebp** instead.

The tool supports both lossy and lossless compression modes per frame, with configurable animation loop count and frame durations.

# CAVEATS

Part of the libwebp package. Input format support depends on linked libraries. Very old browsers may not support WebP format. Some image editors have limited WebP support.

# HISTORY

WebP was developed by Google and announced in **2010** as an open standard for compressed web images. The format is based on the VP8 video codec and offers significant size reductions compared to traditional formats.

# SEE ALSO

[cwebp](/man/cwebp)(1), [dwebp](/man/dwebp)(1), [gif2webp](/man/gif2webp)(1)
