# TAGLINE

Convert PPM to HP LaserJet format

# TLDR

**Convert PPM to HP LaserJet format**

```ppmtolj [input.ppm] > [output.lj]```

**Specify resolution**

```ppmtolj -resolution [300] [input.ppm] > [output.lj]```

# SYNOPSIS

**ppmtolj** [_options_] [_file_]

# PARAMETERS

**-resolution** _n_
> Print resolution in DPI.

**-delta**
> Use delta row compression.

# DESCRIPTION

**ppmtolj** converts PPM color images to HP LaserJet PCL format for direct printing. Part of Netpbm toolkit.

# SEE ALSO

[pbmtolj](/man/pbmtolj)(1), [pnmtopclxl](/man/pnmtopclxl)(1)

