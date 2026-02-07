# TAGLINE

combine images with blending and compositing operations

# TLDR

**Overlay one image** on top of another

```composite [overlay.png] [background.png] [output.png]```

**Place overlay at a specific position**

```composite -geometry +[100]+[50] [overlay.png] [background.png] [output.png]```

**Blend images** with transparency

```composite -blend [50]% [image1.png] [image2.png] [output.png]```

**Use a mask** for compositing

```composite [overlay.png] [background.png] [mask.png] [output.png]```

**Apply multiply** blend mode

```composite -compose multiply [overlay.png] [background.png] [output.png]```

**Dissolve overlay** into background

```composite -dissolve [75]% [overlay.png] [background.png] [output.png]```

**Center the overlay** on background

```composite -gravity center [overlay.png] [background.png] [output.png]```

# SYNOPSIS

**composite** [_options_] _overlay_ _background_ [_mask_] _output_

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

**-stegano** _OFFSET_
> Hide the overlay within the background image (steganography).

**-stereo** _OFFSET_
> Create a stereo anaglyph image.

**-density** _VALUE_
> Set image resolution.

**-quality** _VALUE_
> Output compression quality (0-100).

# DESCRIPTION

**composite** is the ImageMagick tool for combining two or more images into a single image. It provides extensive compositing operations similar to layer blending in graphics editors, enabling complex image manipulation from the command line.

The overlay image is placed over the background image according to the specified compose method and positioning. An optional mask image can control which parts of the overlay affect the final result. Common operations include watermarking, creating image collages, and applying visual effects.

The gravity option provides convenient positioning (center, corners, edges) while geometry allows pixel-precise placement. Blend modes like multiply, screen, and overlay follow standard graphics compositing mathematics.

# CAVEATS

Image order matters: overlay comes before background in the command. The output inherits dimensions from the background image by default. Alpha channels affect compositing; use **-alpha** options for explicit control. For batch operations, consider **mogrify** or **magick** for better performance.

# HISTORY

composite is part of **ImageMagick**, originally created by John Cristy in **1990**. It has evolved to support dozens of compositing operators, matching capabilities found in professional image editing software. The tool remains essential for scriptable image manipulation.

# SEE ALSO

[convert](/man/convert)(1), [montage](/man/montage)(1), [mogrify](/man/mogrify)(1), [magick](/man/magick)(1)
