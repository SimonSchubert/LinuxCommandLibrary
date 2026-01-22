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

**-watermark** _BRIGHTNESS_
> Apply overlay as watermark with given brightness.

**-tile**
> Tile the overlay image across the background.

**-quality** _VALUE_
> Output compression quality (0-100).

# DESCRIPTION

**composite.im6** is the ImageMagick version 6 command for combining images through compositing operations. It is functionally identical to **composite** but explicitly references the ImageMagick 6 installation, useful on systems where both ImageMagick 6 and 7 are installed.

The tool overlays one image on another using various blending modes and positioning options. It supports mask-based compositing, watermarking, and dozens of composition operators matching professional image editing capabilities.

On most systems, this command exists as a versioned alternative to ensure compatibility with scripts written for ImageMagick 6 when ImageMagick 7 is also present. The **im6** suffix indicates the legacy API version.

# CAVEATS

ImageMagick 6 is in maintenance mode; new features are added to ImageMagick 7. Some systems may only have one version installed. Scripts using **composite.im6** explicitly will fail on systems with only ImageMagick 7 installed.

# HISTORY

ImageMagick was created by John Cristy in **1990**. Version 6 was a long-standing stable release. When ImageMagick 7 introduced breaking changes in **2016**, versioned command names were added to allow both versions to coexist, with **.im6** suffix denoting version 6 commands.

# SEE ALSO

[composite](/man/composite)(1), [convert.im6](/man/convert.im6)(1), [mogrify.im6](/man/mogrify.im6)(1), [magick](/man/magick)(1)
