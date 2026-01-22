# TLDR

**Check PNG file**

```pngcheck [image.png]```

**Verbose output**

```pngcheck -v [image.png]```

**Check multiple files**

```pngcheck [*.png]```

**Show color info**

```pngcheck -c [image.png]```

**Extract text chunks**

```pngcheck -t [image.png]```

# SYNOPSIS

**pngcheck** [_options_] _file_...

# PARAMETERS

_FILE_
> PNG file(s) to check.

**-v**
> Verbose output.

**-c**
> Color information.

**-t**
> Extract text.

**-7**
> Check for 7-bit clean.

**--help**
> Display help.

# DESCRIPTION

**pngcheck** verifies PNG file integrity. Checks CRC and structure.

The tool validates PNG format. Also handles JNG and MNG.

pngcheck validates PNGs.

# CAVEATS

PNG/JNG/MNG formats. Read-only analysis.

# HISTORY

pngcheck was created for **PNG file validation** and inspection.

# SEE ALSO

[pngcrush](/man/pngcrush)(1), [optipng](/man/optipng)(1), [file](/man/file)(1)

