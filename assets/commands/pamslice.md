# TAGLINE

extract a single row or column from a Netpbm image as text

# TLDR

**Extract a horizontal slice** (row) from an image

```pamslice -row=[100] [input.pam]```

**Extract a vertical slice** (column) from an image

```pamslice -column=[50] [input.pam]```

**Extract only the red plane** (plane 0) of a row

```pamslice -row=[100] -plane=[0] [input.ppm]```

**Format output for xmgr plotting**

```pamslice -row=[100] -xmgr [input.pam]```

# SYNOPSIS

**pamslice** {**-row**=_rownumber_ | **-column**=_columnnumber_} [**-plane**=_planenumber_] [**-xmgr**] [_imagefile_]

# PARAMETERS

_IMAGEFILE_
> Input PAM, PBM, PGM, or PPM image file. Reads from standard input if omitted.

**-row**=_N_
> Extract row N as a horizontal slice. Rows are numbered from the top starting with 0.

**-column**=_N_
> Extract column N as a vertical slice. Columns are numbered from the left starting with 0.

**-plane**=_N_
> Restrict output to a single color plane. For PPM images: 0=red, 1=green, 2=blue. Omit for all planes.

**-xmgr**
> Format output as input for the xmgr plotting program by adding header information.

# DESCRIPTION

**pamslice** extracts one line of pixels (a row or column) from a Netpbm image and prints the sample values as ASCII decimal numbers. The first number on each output line is the position index (column number for row slices, row number for column slices), followed by the sample values for each plane.

This is useful for generating profile data from images, such as plotting intensity values along a scanline for image analysis. The output can be fed directly into plotting tools like xmgr using the **-xmgr** option.

Either **-row** or **-column** must be specified, but not both.

# CAVEATS

Part of Netpbm. Output is plain text only, not an image. Row and column numbering starts at 0.

# HISTORY

pamslice is part of the **Netpbm** toolkit for image manipulation and analysis. It was added as a tool for extracting profile data from images.

# SEE ALSO

[pamcut](/man/pamcut)(1), [pamfile](/man/pamfile)(1), [pamtopnm](/man/pamtopnm)(1), [netpbm](/man/netpbm)(1)

