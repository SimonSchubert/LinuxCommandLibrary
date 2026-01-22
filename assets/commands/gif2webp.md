# TLDR

Convert a **GIF image** to WebP

```gif2webp [path/to/image.gif] -o [path/to/image.webp]```

# SYNOPSIS

**gif2webp** [_options_] _input.gif_ **-o** _output.webp_

# PARAMETERS

**-o** _FILE_
> Output WebP filename

**-q** _QUALITY_
> Quality factor (0-100), higher is better quality

**-m** _METHOD_
> Compression method (0-6), higher is slower but better

**-lossy**
> Use lossy compression (default is lossless for GIF)

**-mixed**
> Use mixed lossy/lossless compression per frame

**-min_size**
> Minimize output size (slower)

**-loop_compatibility**
> Use compatibility mode for GIF loop count

**-f** _NUM_
> Filter strength (0-100), for lossy compression

**-metadata** _STRING_
> Comma-separated metadata to copy (all, none, icc, xmp)

**-v**
> Verbose output

# DESCRIPTION

**gif2webp** converts GIF images, including animated GIFs, to WebP format. WebP typically provides better compression than GIF while maintaining quality, resulting in smaller file sizes suitable for web use.

For animated GIFs, the tool preserves frame timing, loop count, and transparency. It can use lossless compression (preserving exact pixel values) or lossy compression for even smaller files.

The tool is part of Google's libwebp package.

# CAVEATS

Lossy compression may introduce artifacts, especially in images with sharp edges or text. Some older browsers don't support animated WebP. Very long or complex animations may take significant time to convert.

# HISTORY

gif2webp is part of the WebP project developed by Google. WebP was announced in **2010** as a new image format for the web, offering both lossy and lossless compression. The animated WebP format was added later to provide an alternative to animated GIFs.

# SEE ALSO

[cwebp](/man/cwebp)(1), [dwebp](/man/dwebp)(1), [webpinfo](/man/webpinfo)(1), [convert](/man/convert)(1)
