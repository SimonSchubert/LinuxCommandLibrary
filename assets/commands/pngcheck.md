# TAGLINE

Verify PNG file integrity and structure

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

**pngcheck** verifies the integrity and structure of PNG, JNG, and MNG image files. It validates CRC checksums, checks chunk ordering, and reports any structural errors or corruption in the file format.

In verbose mode, it displays detailed information about each chunk including dimensions, color type, bit depth, and compression method. The **-t** option extracts embedded text metadata from PNG text chunks.

# CAVEATS

PNG/JNG/MNG formats. Read-only analysis.

# HISTORY

pngcheck was created for **PNG file validation** and inspection.

# SEE ALSO

[pngcrush](/man/pngcrush)(1), [optipng](/man/optipng)(1), [file](/man/file)(1)

