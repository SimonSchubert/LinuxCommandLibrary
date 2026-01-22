# TLDR

**Convert grap to image**

```grap2graph [file.grap] > output.png```

**Specify output format**

```grap2graph -Tpng [file.grap] > output.png```

**Create SVG output**

```grap2graph -Tsvg [file.grap] > output.svg```

**Process from stdin**

```echo ".G1 ... .G2" | grap2graph > output.png```

# SYNOPSIS

**grap2graph** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input file containing grap code.

**-T** _FORMAT_
> Output format (png, svg, pdf, etc.).

**-resolution** _DPI_
> Set image resolution.

**--help**
> Display help information.

# DESCRIPTION

**grap2graph** converts grap graphs to image formats. It's a wrapper that pipes grap output through groff and converts the result to various image formats.

The tool is part of the groff suite and facilitates converting grap language graphs into standalone images. It handles the intermediate processing steps automatically.

grap2graph converts grap graphs to images.

# CAVEATS

Requires groff and grap. Image quality depends on resolution settings. Part of groff package.

# HISTORY

grap2graph was developed as part of the **GNU groff** project to facilitate graph image creation from grap source.

# SEE ALSO

[grap](/man/grap)(1), [groff](/man/groff)(1), [pic2graph](/man/pic2graph)(1)
