# TLDR

**Extract frame from animation**

```webpmux -get frame [1] [input.webp] -o [frame.webp]```

**Get ICC profile**

```webpmux -get icc [input.webp] -o [profile.icc]```

**Set ICC profile**

```webpmux -set icc [profile.icc] [input.webp] -o [output.webp]```

**Show info**

```webpmux -info [input.webp]```

**Strip metadata**

```webpmux -strip all [input.webp] -o [output.webp]```

# SYNOPSIS

**webpmux** [_-get type_] [_-set type file_] [_-info_] _input_ [_-o output_]

# PARAMETERS

**-get** _TYPE_
> Extract (frame, icc, xmp).

**-set** _TYPE FILE_
> Set metadata.

**-strip** _TYPE_
> Remove metadata.

**-info**
> Show information.

**-o** _FILE_
> Output file.

# DESCRIPTION

**webpmux** manipulates WebP files. It handles metadata and animation.

Extract frames. From animated WebP.

Metadata handling. ICC, XMP, EXIF.

Animation creation. Combine frames.

Part of libwebp. Google tool.

# CAVEATS

WebP format only. Part of libwebp-tools. Animation support.

# HISTORY

**webpmux** is part of **libwebp** by Google, providing tools to manipulate WebP images.

# SEE ALSO

[cwebp](/man/cwebp)(1), [dwebp](/man/dwebp)(1), [img2webp](/man/img2webp)(1)
