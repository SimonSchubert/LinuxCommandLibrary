# TAGLINE

Convert HP PaintJet format to PPM

# TLDR

**Convert an HP PaintJet file to PPM**

```pjtoppm [input.pj] > [output.ppm]```

**Read PaintJet data from stdin**

```cat [input.pj] | pjtoppm > [output.ppm]```

**Pipe into another Netpbm tool** (e.g. to PNG via pnmtopng)

```pjtoppm [input.pj] | pnmtopng > [output.png]```

# SYNOPSIS

**pjtoppm** [_paintjetfile_]

# DESCRIPTION

**pjtoppm** reads an HP PaintJet printer file and writes a PPM (Portable Pixmap) image to standard output. If no filename is given, input is read from stdin.

It is a quick hack that handles only the subset of PaintJet escape sequences needed to decode most raster images; it is not a full PCL interpreter. The resulting PPM can be converted to other formats by the rest of the Netpbm toolchain (for example, **pnmtopng** or **pnmtojpeg**).

# CAVEATS

Only a limited subset of PaintJet commands is supported, so complex PCL documents may not convert correctly. There are no command-line options other than the optional input file. **ppmtopj** performs the reverse conversion.

# HISTORY

**pjtoppm** was written by Christos Zoulas in 1991 and has shipped as part of the **Netpbm** package ever since. It references the HP PaintJet XL Color Graphics Printer User's Guide.

# SEE ALSO

[ppmtopj](/man/ppmtopj)(1), [pcxtoppm](/man/pcxtoppm)(1), [pnmtops](/man/pnmtops)(1)

