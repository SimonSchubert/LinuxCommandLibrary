# TAGLINE

Manipulate WebP metadata and animation

# TLDR

**Extract frame from animation**

```webpmux -get frame [1] [input.webp] -o [frame.webp]```

**Get ICC profile**

```webpmux -get icc [input.webp] -o [profile.icc]```

**Set EXIF metadata**

```webpmux -set exif [metadata.exif] [input.webp] -o [output.webp]```

**Create animation from frames**

```webpmux -frame [1.webp] +[100] -frame [2.webp] +[100] -loop [0] -o [output.webp]```

**Show file info**

```webpmux -info [input.webp]```

**Strip EXIF metadata**

```webpmux -strip exif [input.webp] -o [output.webp]```

**Change frame duration of an animation**

```webpmux -duration [200] [input.webp] -o [output.webp]```

# SYNOPSIS

**webpmux** [_-get|-set|-strip_] [_options_] _input_ [**-o** _output_]

# PARAMETERS

**-get** _TYPE_
> Extract data: frame n, icc, exif, or xmp.

**-set** _TYPE FILE_
> Set metadata: icc, exif, or xmp.

**-strip** _TYPE_
> Remove metadata: icc, exif, or xmp.

**-frame** _FILE+OPTS_
> Add frame for animation (file +duration[+x+y[+method[blend]]]).

**-duration** _DURATION[,START[,END]]_
> Set frame duration in milliseconds.

**-loop** _COUNT_
> Loop count for animation (0=infinite, range 0-65535).

**-bgcolor** _A,R,G,B_
> Background color for animation canvas (values 0-255).

**-info**
> Display file information.

**-o** _FILE_
> Output file.

**-version**
> Display version number.

# DESCRIPTION

**webpmux** is a tool from Google's libwebp library for manipulating WebP image files at the container level. It can extract and set metadata profiles (ICC color, XMP, EXIF), extract individual frames from animated WebP files, and combine frames into animations.

The tool operates on the WebP container format without re-encoding the image data, making operations fast and lossless. Metadata can be stripped from files to reduce size, or added to include color management and descriptive information.

For animated WebP files, individual frames can be extracted as separate WebP images, and frame timing and looping parameters can be inspected with the info command.

# CAVEATS

WebP format only. Part of libwebp-tools. Only one -strip/-get/-set operation per invocation; stripping multiple metadata types requires separate commands.

# HISTORY

**webpmux** is part of **libwebp** by Google, providing tools to manipulate WebP images.

# SEE ALSO

[cwebp](/man/cwebp)(1), [dwebp](/man/dwebp)(1), [img2webp](/man/img2webp)(1)
