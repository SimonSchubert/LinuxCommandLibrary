# TLDR

**Create treemap visualization**

```patchwork -Tpng [data.gv] -o [treemap.png]```

**Generate SVG treemap**

```patchwork -Tsvg [data.gv] -o [treemap.svg]```

**Generate PDF output**

```patchwork -Tpdf [data.gv] -o [treemap.pdf]```

# SYNOPSIS

**patchwork** [_options_] [_files_...]

# PARAMETERS

**-T** _format_
> Output format (png, svg, pdf, etc.).

**-o** _file_
> Output file.

**-G** _attr=val_
> Set graph attribute.

**-N** _attr=val_
> Set node attribute.

# DESCRIPTION

**patchwork** is a Graphviz layout program for squarified treemaps. Displays hierarchical data as nested rectangles with areas proportional to values. Part of the Graphviz visualization suite.

# SEE ALSO

[dot](/man/dot)(1), [osage](/man/osage)(1), [neato](/man/neato)(1)

