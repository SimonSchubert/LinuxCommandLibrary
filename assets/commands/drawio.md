# TAGLINE

diagram editor for flowcharts and diagrams

# TLDR

**Open diagram editor**

```drawio```

**Open specific file**

```drawio [diagram.drawio]```

**Export to PNG**

```drawio --export --format png [diagram.drawio]```

**Export to PDF**

```drawio --export --format pdf [diagram.drawio]```

**Export specific page**

```drawio --export --page-index [0] [diagram.drawio]```

**Export with transparent background**

```drawio --export --transparent [diagram.drawio]```

**Export at specific scale**

```drawio --export --scale [2] [diagram.drawio]```

# SYNOPSIS

**drawio** [_options_] [_file_]

# DESCRIPTION

**drawio** (draw.io) is a diagram editor for creating flowcharts, network diagrams, UML, and various other diagrams. The desktop application is based on Electron and works offline.

The tool supports multiple export formats including PNG, SVG, PDF, and various XML formats. Diagrams can also be embedded in other documents.

# PARAMETERS

**--export**
> Export mode (don't show UI).

**--format** _fmt_
> Export format (png, jpg, svg, pdf, vsdx, xml).

**--output** _file_
> Output file name.

**--page-index** _n_
> Page to export (0-based).

**--page-range** _range_
> Pages to export.

**--transparent**
> Transparent background.

**--scale** _n_
> Scale factor for export.

**--width** _n_
> Output width.

**--height** _n_
> Output height.

**--border** _n_
> Border width.

**--crop**
> Crop to diagram bounds.

# CAVEATS

Desktop app requires Electron. Large diagrams may be slow. Some features differ from web version. Command-line export needs display or xvfb.

# HISTORY

**draw.io** was created by **JGraph Ltd** (Gaudenz Alder and David Benson) around **2012**. Originally web-only, the desktop application was released later. The tool became popular for its free availability and integration with cloud storage services. In 2020, it was rebranded to diagrams.net.

# SEE ALSO

[inkscape](/man/inkscape)(1), [plantuml](/man/plantuml)(1), [graphviz](/man/graphviz)(1), [dia](/man/dia)(1)
