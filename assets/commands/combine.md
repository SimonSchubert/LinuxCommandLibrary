# TLDR

**Combine two images** using the default compose operator

```combine [image1.png] [image2.png] [output.png]```

**Combine using a specific** compose method

```combine -compose [multiply] [image1.png] [image2.png] [output.png]```

**Combine images with a displacement map**

```combine -compose [displace] [image.png] [map.png] [output.png]```

**Combine RGB channels** from separate images

```combine -channel [RGB] -combine [red.png] [green.png] [blue.png] [output.png]```

**Use difference blending** to highlight changes

```combine -compose [difference] [original.png] [modified.png] [diff.png]```

**Combine with screen** blend mode

```combine -compose [screen] [base.png] [overlay.png] [output.png]```

# SYNOPSIS

**combine** [_options_] _image1_ _image2_ _output_

# PARAMETERS

**-compose** _METHOD_
> Specify the compositing method (over, multiply, screen, difference, etc.).

**-channel** _TYPE_
> Apply operation to specific channels (R, G, B, A, RGB, RGBA).

**-gravity** _TYPE_
> Position for overlay image (center, north, south, east, west, etc.).

**-geometry** _GEOMETRY_
> Size and offset for positioning the overlay.

**-alpha** _TYPE_
> Control alpha channel handling (on, off, set, etc.).

**-blend** _GEOMETRY_
> Blend percentages for source and destination images.

**-dissolve** _PERCENT_
> Dissolve source image into destination.

**-watermark** _BRIGHTNESS_
> Apply as a watermark with specified brightness.

# DESCRIPTION

**combine** is an ImageMagick command for compositing two images together using various blending modes. It provides Photoshop-like layer compositing operations from the command line.

The tool supports numerous composition methods including standard blend modes (multiply, screen, overlay, soft-light), mathematical operations (add, subtract, difference), and specialized methods for masking and channel manipulation.

When combining images, the first image serves as the base or destination, and the second image is composited over it according to the specified method. Gravity and geometry options control positioning when images differ in size.

# CAVEATS

The **combine** command is a legacy alias in ImageMagick. Modern usage recommends **magick composite** or **convert** with **-composite** for more flexibility. Image dimensions and color spaces should typically match for predictable results.

# HISTORY

combine is part of **ImageMagick**, first released in **1990** by John Cristy. It evolved alongside digital image editing software, implementing composition algorithms similar to those in Adobe Photoshop. The command provides scriptable access to these professional compositing techniques.

# SEE ALSO

[composite](/man/composite)(1), [convert](/man/convert)(1), [montage](/man/montage)(1), [magick](/man/magick)(1)
