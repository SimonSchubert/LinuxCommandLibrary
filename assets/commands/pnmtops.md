# TAGLINE

Convert PNM images to PostScript

# TLDR

**Convert PNM to PostScript**

```pnmtops [input.pnm] > [output.ps]```

**Create EPS file**

```pnmtops -nocenter -noturn -nosetpage [input.pnm] > [output.eps]```

**Convert with specific DPI**

```pnmtops -dpi [300] [input.pnm] > [output.ps]```

**Scale to fit page**

```pnmtops -scale [0.5] [input.pnm] > [output.ps]```

# SYNOPSIS

**pnmtops** [_options_] [_file_]

# PARAMETERS

**-dpi** _n_
> Image resolution.

**-scale** _factor_
> Scale factor.

**-width** _inches_
> Maximum width.

**-height** _inches_
> Maximum height.

**-nocenter**
> Don't center on page.

**-noturn**
> Don't rotate.

**-nosetpage**
> Don't set page size.

# DESCRIPTION

**pnmtops** converts PNM images to PostScript format, suitable for printing or embedding in documents. The output can be either a full-page PostScript document or an Encapsulated PostScript (EPS) file.

The **-dpi** and **-scale** options control the output size, while **-width** and **-height** set maximum dimensions. Use **-nocenter**, **-noturn**, and **-nosetpage** together to create minimal EPS suitable for inclusion in other documents. Part of the Netpbm toolkit.

# SEE ALSO

[pstopnm](/man/pstopnm)(1), [pnmtopng](/man/pnmtopng)(1)

