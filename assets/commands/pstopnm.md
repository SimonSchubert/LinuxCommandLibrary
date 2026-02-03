# TLDR

**Convert PostScript to PNM**

```pstopnm [input.ps]```

**Convert with resolution**

```pstopnm -dpi [300] [input.ps]```

**Convert to specific format**

```pstopnm -ppm [input.ps]```

**Convert PDF**

```pstopnm [input.pdf]```

# SYNOPSIS

**pstopnm** [_options_] _file_

# PARAMETERS

**-dpi** _n_
> Output resolution.

**-xsize** _n_
> Output width.

**-ysize** _n_
> Output height.

**-ppm**
> Force PPM output.

**-pgm**
> Force PGM output.

**-pbm**
> Force PBM output.

**-stdout**
> Write to stdout.

# DESCRIPTION

**pstopnm** converts PostScript and PDF files to PNM format. Uses Ghostscript for rendering. Part of Netpbm toolkit for document conversion.

# SEE ALSO

[gs](/man/gs)(1), [pnmtops](/man/pnmtops)(1)

