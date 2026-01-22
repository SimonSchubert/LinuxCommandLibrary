# TLDR

**Show image info**

```identify.im6 [image.jpg]```

**Verbose output**

```identify.im6 -verbose [image.png]```

**Custom format**

```identify.im6 -format "%wx%h" [image]```

**Quick ping mode**

```identify.im6 -ping [image.jpg]```

# SYNOPSIS

**identify.im6** [_options_] _files_

# PARAMETERS

_FILES_
> Image files to identify.

**-verbose**
> Detailed information.

**-format** _STRING_
> Custom format string.

**-ping**
> Quick identification.

**--help**
> Display help information.

# DESCRIPTION

**identify.im6** is the ImageMagick 6 version of identify. It describes image format, dimensions, and characteristics.

The tool provides the same functionality as identify but specifically from ImageMagick version 6. Both may coexist on systems.

identify.im6 is ImageMagick 6 identify.

# CAVEATS

ImageMagick 6 specific. May conflict with IM7. Legacy version.

# HISTORY

identify.im6 is part of **ImageMagick 6**, maintained separately from ImageMagick 7.

# SEE ALSO

[identify](/man/identify)(1), [convert.im6](/man/convert.im6)(1), [mogrify.im6](/man/mogrify.im6)(1)
