# TAGLINE

Translate GNU metafiles to other graphics formats

# TLDR

**Convert a metafile to PNG**

```plot -T png [input.meta] > [output.png]```

**Convert a metafile to SVG**

```plot -T svg [input.meta] > [output.svg]```

**Convert to PostScript** with a specific page size

```plot -T ps --page-size [a4] [input.meta] > [output.ps]```

**Display a metafile** in an X Window

```plot -T X [input.meta]```

**Read from stdin** and output as PNM

```cat [input.meta] | plot -T pnm > [output.pnm]```

# SYNOPSIS

**plot** [_options_] [_file_...]

# PARAMETERS

**-T** _type_
> Output type: X, png, pnm, gif, svg, ai, ps, cgm, fig, pcl, hpgl, regis, tek, meta (default: meta).

**--page-size** _size_
> Page size for ps, svg, ai, cgm, fig, pcl, hpgl output (e.g. a, letter, a4).

**--bg-color** _color_
> Background color name.

**--bitmap-size** _WxH_
> Bitmap size in pixels for png/pnm/gif output.

**--pen-color** _color_
> Pen color for metafile rendering.

**--rotation** _angle_
> Rotate plot (0, 90, 180, 270 degrees).

**--help**
> Display help.

**--version**
> Display version.

# DESCRIPTION

**plot** is part of the GNU **plotutils** package. It translates GNU graphics metafiles (produced by tools like **graph**) into other graphics formats. Input files may be specified on the command line or read from stdin. The **-T** option selects the output format.

Supported output formats include X Window System display, PNG, PNM (PBM/PGM/PPM), pseudo-GIF, SVG, Adobe Illustrator, PostScript, WebCGM, xfig, HP-GL/2, PCL 5, ReGIS, and Tektronix.

# CAVEATS

The **plot** command converts metafiles; it does not plot data directly. Use **graph** from plotutils to generate metafiles from data, then pipe to **plot** for format conversion. For interactive data plotting, use gnuplot.

# HISTORY

**plot** is part of GNU **plotutils**, originally written by **Robert Maier**. The plotutils package provides tools for generating 2-D vector graphics and is based on the traditional Unix plotting utilities.

# SEE ALSO

[gnuplot](/man/gnuplot)(1), [graph](/man/graph)(1)

