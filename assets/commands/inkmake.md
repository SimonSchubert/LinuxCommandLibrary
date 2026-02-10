# TAGLINE

automates Inkscape exports for batch processing

# TLDR

**Export all layers**

```inkmake [input.svg]```

**Export specific size**

```inkmake -w [1024] [input.svg]```

**Export to directory**

```inkmake -o [output/] [input.svg]```

**Export specific format**

```inkmake -f [png|pdf|svg] [input.svg]```

**Export specific layers**

```inkmake -l "[layer1,layer2]" [input.svg]```

# SYNOPSIS

**inkmake** [_options_] _file_

# PARAMETERS

**-w** _WIDTH_
> Output width in pixels.

**-h** _HEIGHT_
> Output height in pixels.

**-o** _DIR_
> Output directory.

**-f** _FORMAT_
> Output format (png, pdf, svg).

**-l** _LAYERS_
> Comma-separated layer names.

**-d** _DPI_
> Output resolution.

**--help**
> Display help information.

# DESCRIPTION

**inkmake** automates Inkscape exports for batch processing. It exports layers or objects from SVG files to various formats.

The tool is useful for generating icons, assets, or multiple sizes from a single source. It wraps Inkscape's export capabilities.

# CAVEATS

Requires Inkscape installed. SVG layer naming important. Wrapper script.

# HISTORY

inkmake was created to simplify batch exporting from **Inkscape** SVG files for asset generation workflows.

# SEE ALSO

[inkscape](/man/inkscape)(1), [convert](/man/convert)(1), [rsvg-convert](/man/rsvg-convert)(1)
