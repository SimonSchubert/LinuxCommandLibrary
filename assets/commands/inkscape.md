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

**Run without GUI**

```inkscape --export-type=[png] [input.svg]```

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
> Export format (png, pdf, eps, ps, svg).

**--export-area-page**
> Export entire page.

**--export-area-drawing**
> Export drawing bounds only.

**--export-id** _ID_
> Export specific object by ID.

**--batch-process**
> Process files without GUI.

**--help**
> Display help information.

# DESCRIPTION

**Inkscape** is a professional vector graphics editor. It supports SVG as native format and exports to PNG, PDF, EPS, and other formats.

The application provides comprehensive drawing tools, path operations, and text handling. It can run headless for batch conversions.

# CAVEATS

Large files may be slow. Some SVG features unsupported. Command line changed in 1.0.

# HISTORY

Inkscape was forked from **Sodipodi** in 2003. It became the leading open-source alternative to Adobe Illustrator.

# SEE ALSO

[inkview](/man/inkview)(1), [convert](/man/convert)(1), [rsvg-convert](/man/rsvg-convert)(1), [gimp](/man/gimp)(1)
