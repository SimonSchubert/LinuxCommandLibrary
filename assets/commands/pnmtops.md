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

**pnmtops** converts PNM images to PostScript. Part of Netpbm toolkit. Can create standalone PS or EPS files suitable for embedding.

# SEE ALSO

[pstopnm](/man/pstopnm)(1), [pnmtopng](/man/pnmtopng)(1)

