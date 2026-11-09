# TAGLINE

combine images using ImageMagick 6

# TLDR

**Overlay one image** on top of another

```composite.im6 [overlay.png] [background.png] [output.png]```

**Place overlay at a specific position**

```composite.im6 -geometry +[100]+[50] [overlay.png] [background.png] [output.png]```

**Blend images** with transparency

```composite.im6 -blend [50]% [image1.png] [image2.png] [output.png]```

**Apply multiply** blend mode

```composite.im6 -compose multiply [overlay.png] [background.png] [output.png]```

**Dissolve overlay** into background

```composite.im6 -dissolve [75]% [overlay.png] [background.png] [output.png]```

**Center the overlay** on background

```composite.im6 -gravity center [overlay.png] [background.png] [output.png]```

**Tile the overlay** across the background

```composite.im6 -tile [overlay.png] [background.png] [output.png]```

# SYNOPSIS

**composite.im6** [_options_] _overlay_ _background_ [_mask_] _output_

# PARAMETERS

**-compose** _METHOD_
> Compositing operator: over, multiply, screen, overlay, darken, lighten, etc.

**-geometry** _GEOMETRY_
> Position offset for overlay (+X+Y format).

**-gravity** _TYPE_
> Anchor point: center, north, south, east, west, northeast, etc.

**-blend** _GEOMETRY_
> Blend percentages for source and destination.

**-dissolve** _PERCENT_
> Dissolve overlay into background at specified percentage.

**-watermark** _GEOMETRY_
> Apply overlay as a watermark, given percent brightness and saturation.

**-tile**
> Tile the overlay image across the background.

**-quality** _VALUE_
> Output compression quality (0-100).

**-stegano** _OFFSET_
> Hide watermark within image using steganography.

**-stereo** _+X+Y_
> Create a stereo anaglyph from two images.

**-alpha** _TYPE_
> Activate, deactivate, or reset the alpha channel.

**-channel** _TYPE_
> Apply the operation to the selected channels.

# DESCRIPTION

**composite.im6** is the ImageMagick version 6 command for combining images through compositing operations. It is functionally identical to the ImageMagick 6 **composite** but explicitly references the ImageMagick 6 installation.

The tool overlays one image on another using various blending modes and positioning options. It supports mask-based compositing, watermarking, and dozens of composition operators.

# CAVEATS

The **.im6** suffix is a distribution packaging name, not an upstream ImageMagick command. Debian 12 ships the binary as **composite-im6.q16** instead, and newer Debian releases package ImageMagick 7, so scripts that call **composite.im6** may fail. Check what your system provides, or use **composite** or **magick composite**.

ImageMagick 6 receives maintenance updates; new features go to ImageMagick 7.

# HISTORY

ImageMagick was created by John Cristy in **1990**.

# SEE ALSO

[composite](/man/composite)(1), [convert](/man/convert)(1), [mogrify.im6](/man/mogrify.im6)(1), [display.im6](/man/display.im6)(1), [magick](/man/magick)(1)

# RESOURCES

```[Source code](https://github.com/ImageMagick/ImageMagick6)```

```[Homepage](https://imagemagick.org)```

```[Documentation](https://legacy.imagemagick.org/script/composite.php)```

<!-- verified: 2026-11-09 -->
