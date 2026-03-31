# TAGLINE

Convert PPM to NCSA ICR format

# TLDR

**Convert PPM to NCSA ICR format**

```ppmtoicr [input.ppm] > [output.icr]```

**Convert with a custom window name**

```ppmtoicr -windowname [myimage] [input.ppm] > [output.icr]```

**Convert with pixel expansion factor**

```ppmtoicr -expand [2] [input.ppm] > [output.icr]```

**Read from stdin via pipe**

```cat [input.ppm] | ppmtoicr > [output.icr]```

# SYNOPSIS

**ppmtoicr** [_options_] [_file_]

# PARAMETERS

**-windowname** _name_
> Set the name of the window in the ICR output. Default is "untitled".

**-expand** _n_
> Expand each pixel by factor _n_. Each pixel becomes an _n_ x _n_ block of pixels. Default is 1 (no expansion).

**-rle**
> Use run-length encoding compression in the output.

# DESCRIPTION

**ppmtoicr** reads a PPM image and converts it to NCSA ICR (Image Capture Raster) format. The ICR format was used by NCSA Telnet to display raster images in an X11 window on a remote display. The output is written to standard output. Part of the Netpbm toolkit.

If no input file is specified, the image is read from standard input.

# SEE ALSO

[ppmtoxpm](/man/ppmtoxpm)(1), [pnmtops](/man/pnmtops)(1)

