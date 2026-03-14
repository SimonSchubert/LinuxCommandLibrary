# TAGLINE

professional vector graphics editor

# TLDR

**Open file in GUI**

```inkscape [file.svg]```

**Export to PNG**

```inkscape [input.svg] -o [output.png]```

**Export with specific size**

```inkscape [input.svg] -w [1024] -h [768] -o [output.png]```

**Export to PDF**

```inkscape [input.svg] -o [output.pdf]```

**Convert SVG to EPS**

```inkscape [input.svg] -o [output.eps]```

**Export specific area**

```inkscape [input.svg] --export-area-page -o [output.png]```

**Export drawing area only (crop to content)**

```inkscape [input.svg] -D -o [output.png]```

**Run without GUI**

```inkscape --export-type=[png] [input.svg]```

**Run batch actions from command line**

```inkscape --actions="open:[input.svg];export-filename:[output.png];export-do" --batch-process```

# SYNOPSIS

**inkscape** [_options_] [_file_...]

# PARAMETERS

**-o** _FILE_
> Output filename.

**-w** _WIDTH_
> Export width in pixels.

**-h** _HEIGHT_
> Export height in pixels.

**-d** _DPI_
> Export resolution.

**--export-type** _TYPE_
> Export format (png, pdf, eps, ps, svg, emf, wmf). Comma-separated for multiple.

**-C**, **--export-area-page**
> Export entire page area.

**-D**, **--export-area-drawing**
> Export drawing bounding box only (crop to content).

**-i**, **--export-id** _ID_
> Export specific object by ID. Semicolon-separated for multiple.

**-l**, **--export-plain-svg**
> Export as plain SVG without Inkscape-specific namespaces.

**-T**, **--export-text-to-path**
> Convert text objects to paths on export.

**--actions** _ACTIONS_
> Execute semicolon-separated actions for batch processing.

**--shell**
> Enter interactive command line shell mode.

**--batch-process**
> Process files and close without GUI.

**--pdf-page** _N_
> Page number to import from multi-page PDF (starting from 1).

**--help**
> Display help information.

# DESCRIPTION

**Inkscape** is a professional vector graphics editor. It supports SVG as native format and exports to PNG, PDF, EPS, and other formats.

The application provides comprehensive drawing tools, path operations, and text handling. It can run headless for batch conversions.

# CAVEATS

Large files may be slow. Some SVG features are unsupported. The command-line interface changed significantly in version 1.0 (old flags like `-e` and `-A` were replaced).

# HISTORY

Inkscape was forked from **Sodipodi** in 2003. It became the leading open-source alternative to Adobe Illustrator.

# SEE ALSO

[inkview](/man/inkview)(1), [convert](/man/convert)(1), [rsvg-convert](/man/rsvg-convert)(1), [svgo](/man/svgo)(1), [gimp](/man/gimp)(1)
