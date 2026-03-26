# TAGLINE

converts Atari Neochrome .neo image to PPM

# TLDR

**Convert an Atari Neochrome file to PPM**

```neotoppm [input.neo] > [output.ppm]```

**Read from stdin and convert**

```cat [input.neo] | neotoppm > [output.ppm]```

# SYNOPSIS

**neotoppm** [_neofile_]

# DESCRIPTION

**neotoppm** reads an Atari Neochrome .neo file as input and produces a PPM image as output. If no input file is specified, it reads from standard input. Neochrome was a paint program for Atari ST computers. This program is part of the **Netpbm** toolkit.

There are no command-line options specific to neotoppm.

# HISTORY

Copyright (C) 2001 by Teemu Hukkanen, based on **pi1toppm** by Steve Belczyk and Jef Poskanzer.

# SEE ALSO

[ppmtoneo](/man/ppmtoneo)(1), [pi1toppm](/man/pi1toppm)(1)
