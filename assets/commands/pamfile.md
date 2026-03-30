# TAGLINE

displays image file information

# TLDR

**Show image info**

```pamfile [image.pam]```

**Machine-readable output**

```pamfile -machine [image.pam]```

**Show only image dimensions**

```pamfile -size [image.pam]```

**Count images in a multi-image file**

```pamfile -count [image.pam]```

**Describe all images in a multi-image file**

```pamfile -allimages [image.pam]```

**Show multiple files**

```pamfile [image1.pam] [image2.pam]```

# SYNOPSIS

**pamfile** [**-allimages**] [**-comments**] [**-count**] [**-machine**] [**-size**] [_file_...]

# PARAMETERS

_FILE_
> PAM/PNM image file(s). Reads from stdin if not specified.

**-allimages**
> Describe every image in each input file, not just the first.

**-comments**
> Include comments from the header of PAM images.

**-count**
> Display only a count of how many images are in each input file.

**-machine**
> Machine-parseable output. Reports format, subformat, width, height, depth, maxval, and tuple type as space-separated tokens, one line per image.

**-size**
> Output only the width and height of the image, space-separated.

# DESCRIPTION

**pamfile** reads one or more Netpbm image files and writes out short descriptions of the image type, dimensions, depth, maxval, and format. It supports PAM, PBM, PGM, and PPM formats. Part of the Netpbm suite.

At most one of **-count**, **-machine**, or **-size** may be specified.

# CAVEATS

The **-comments** option only works for PAM images; for PBM, PGM, or PPM images it reports no comments even if present. Without **-allimages**, only the first image in each file is described.

# SEE ALSO

[pnmfile](/man/pnmfile)(1), [file](/man/file)(1), [netpbm](/man/netpbm)(1)

