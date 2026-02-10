# TAGLINE

mermaid CLI

# TLDR

**Generate diagram**

```mmdc -i [input.mmd] -o [output.svg]```

**Generate PNG**

```mmdc -i [input.mmd] -o [output.png]```

**Generate PDF**

```mmdc -i [input.mmd] -o [output.pdf]```

**Custom theme**

```mmdc -i [input.mmd] -o [output.svg] -t [dark]```

**Set width**

```mmdc -i [input.mmd] -o [output.png] -w [800]```

**From stdin**

```cat [diagram.mmd] | mmdc -o [output.svg]```

# SYNOPSIS

**mmdc** [_options_]

# PARAMETERS

**-i** _FILE_
> Input file.

**-o** _FILE_
> Output file.

**-t** _THEME_
> Theme (default, dark, forest).

**-w** _WIDTH_
> Output width.

**-H** _HEIGHT_
> Output height.

**--help**
> Display help information.

# DESCRIPTION

**mmdc** is the Mermaid CLI. It generates diagrams from Mermaid markdown.

The tool creates flowcharts, sequence diagrams, and other visualizations from text.

# CAVEATS

Node.js required. Puppeteer for rendering. Various output formats.

# HISTORY

mmdc is the CLI for **Mermaid**, a JavaScript-based diagramming and charting tool.

# SEE ALSO

[graphviz](/man/graphviz)(1), [plantuml](/man/plantuml)(1)

