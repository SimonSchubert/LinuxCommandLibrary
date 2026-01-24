# TLDR

**Generate diagram from file**

```mmdc -i [input.mmd] -o [output.png]```

**Output as SVG**

```mmdc -i [input.mmd] -o [output.svg]```

**Output as PDF**

```mmdc -i [input.mmd] -o [output.pdf]```

**Use specific theme**

```mmdc -i [input.mmd] -o [output.png] -t [dark]```

**Set background color**

```mmdc -i [input.mmd] -o [output.png] -b [white]```

**Read from stdin**

```echo "graph LR; A-->B" | mmdc -o [diagram.png]```

# SYNOPSIS

**mmdc** [_options_]

# DESCRIPTION

**mmdc** (Mermaid CLI) renders Mermaid diagrams from text definitions to images. Mermaid is a diagramming language for flowcharts, sequence diagrams, class diagrams, and more.

The tool enables automated diagram generation in documentation pipelines and scripts.

# PARAMETERS

**-i** _file_
> Input mermaid file.

**-o** _file_
> Output file.

**-t** _theme_
> Theme (default, forest, dark, neutral).

**-b** _color_
> Background color.

**-c** _file_
> Config JSON file.

**-w** _width_
> Width in pixels.

**-H** _height_
> Height in pixels.

**-p** _file_
> Puppeteer config file.

**-s** _scale_
> Scale factor.

# DIAGRAM TYPES

**graph/flowchart**: Flow diagrams
**sequenceDiagram**: Sequence diagrams
**classDiagram**: Class diagrams
**stateDiagram**: State machines
**gantt**: Gantt charts
**pie**: Pie charts

# CAVEATS

Requires Puppeteer/Chromium. Complex diagrams may need tuning. PDF quality varies. Large diagrams can be slow.

# HISTORY

**Mermaid** was created by **Knut Sveidqvist** around **2014** to provide a simple text-based diagramming language. The CLI tool enables command-line rendering, complementing web-based rendering in browsers and documentation tools.

# SEE ALSO

[graphviz](/man/graphviz)(1), [plantuml](/man/plantuml)(1), [ditaa](/man/ditaa)(1), [drawio](/man/drawio)(1)
