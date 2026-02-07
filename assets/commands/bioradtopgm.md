# TAGLINE

Convert Bio-Rad confocal microscope images to PGM format

# TLDR

**Convert a Biorad confocal file** to PGM

```bioradtopgm [bioradfile.pic] > [output.pgm]```

**Extract a specific image** from a multi-image file

```bioradtopgm -imagenum [0] [bioradfile.pic] > [output.pgm]```

**Preserve original intensity values** without scaling

```bioradtopgm -truegrayscale [bioradfile.pic] > [output.pgm]```

**Read from stdin** and convert to JPEG

```cat [bioimage.pic] | bioradtopgm | pnmtojpeg > [output.jpg]```

**Show image info** without converting

```bioradtopgm [bioradfile.pic]```

# SYNOPSIS

**bioradtopgm** [**-imagenum** _n_] [**-truegrayscale**] [_bioradfile_]

# PARAMETERS

**-imagenum** _n_
> Select which image to extract from a multi-image file. Images are numbered starting at zero.

**-truegrayscale**
> Preserve original intensity values without scaling. Important for scientific applications requiring photometric accuracy.

# DESCRIPTION

**bioradtopgm** converts Biorad confocal microscope image files (PIC format) to PGM (Portable GrayMap) format. It is part of the Netpbm package of image manipulation utilities.

If no file argument is provided, the program reads from standard input. Output is written to standard output. For multi-image files, running without **-imagenum** displays information about the file's dimensions and image count.

By default, intensity values are scaled to span the full 0-255 range for better visual contrast.

# CAVEATS

If the output image appears upside down, pipe it through **pamflip -tb** to correct orientation. Output is in PGM format; use additional Netpbm tools like **pnmtojpeg** or **pnmtopng** to convert to common formats.

# HISTORY

Part of the Netpbm toolkit, **bioradtopgm** was developed to enable conversion of proprietary Bio-Rad confocal microscope data into open, interchangeable formats for scientific and medical research workflows.

# SEE ALSO

[pamflip](/man/pamflip)(1), [pnmtojpeg](/man/pnmtojpeg)(1), [pnmtopng](/man/pnmtopng)(1), [netpbm](/man/netpbm)(1)
