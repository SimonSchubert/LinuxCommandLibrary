# TAGLINE

describes image format and characteristics

# TLDR

**Show image info**

```identify [image.jpg]```

**Verbose info**

```identify -verbose [image.png]```

**Show specific property**

```identify -format "%wx%h" [image.jpg]```

**Check multiple images**

```identify [*.png]```

**Show format only**

```identify -format "%m\n" [image]```

# SYNOPSIS

**identify** [_options_] _files_

# PARAMETERS

_FILES_
> Image files to identify.

**-verbose**
> Detailed output.

**-format** _STRING_
> Custom output format.

**-quiet**
> Suppress warnings.

**-ping**
> Efficiently determine image attributes without fully decoding pixels.

**-regard-warnings**
> Pay attention to warnings when loading the image.

**-list** _type_
> List supported values for the specified option (e.g. format, color).

**--help**
> Display help information.

# DESCRIPTION

**identify** describes image format and characteristics. It shows dimensions, color depth, format, and other metadata.

The tool is part of ImageMagick. It reads many image formats and provides detailed technical information about images. In ImageMagick 7, the equivalent is invoked as **magick identify**.

# CAVEATS

Part of ImageMagick. Memory for large images. Some formats need delegates.

# HISTORY

identify is part of **ImageMagick**, the comprehensive image manipulation suite.

# SEE ALSO

[convert](/man/convert)(1), [mogrify](/man/mogrify)(1), [magick](/man/magick)(1), [file](/man/file)(1)
