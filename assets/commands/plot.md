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

**Extract a single page** from a multi-page metafile

```plot -T png -p [3] [input.meta] > [page3.png]```

# SYNOPSIS

**plot** [_options_] [_file_...]

# PARAMETERS

**-T** _type_, **--output-format** _type_
> Output type: X, png, pnm, gif, svg, ai, ps, cgm, fig, pcl, hpgl, regis, tek, meta (default: meta).

**-p** _n_, **--page-number** _n_
> Output only page number n from the metafile.

**-s**, **--merge-pages**
> Combine all pages and frames into a single page.

**--page-size** _size_
> Page size for ps, svg, ai, cgm, fig, pcl, hpgl output (default: letter). Accepts ISO sizes (a0-a4) and ANSI sizes (a-e).

**--bg-color** _color_
> Background color name (default: white).

**--bitmap-size** _WxH_
> Bitmap size in pixels for X, png, pnm, gif output (default: 570x570).

**--pen-color** _color_
> Initial pen color (default: black).

**-f** _size_, **--font-size** _size_
> Font size as fraction of display width (default: 0.0525).

**-F** _name_, **--font-name** _name_
> Initial font name.

**-W** _width_, **--line-width** _width_
> Line width as fraction of display size. Negative value uses format default.

**--max-line-length** _length_
> Maximum points in a polygonal line before flushing (default: 500).

**--rotation** _angle_
> Rotate plot (0, 90, 180, 270 degrees).

**--emulate-color** _option_
> Replace colors with grayscale shades when set to yes.

**-O**, **--portable-output**
> Output human-readable GNU metafile format instead of binary.

**--help**
> Display help.

**--help-fonts**
> Show available fonts for the selected output format.

**--list-fonts**
> List available fonts in a single column.

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

