# TAGLINE

renders Mermaid diagrams from text definitions to images

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

```echo "graph LR; A-->B" | mmdc -i - -o [diagram.png]```

**Render all diagrams in a Markdown file** (replaced by image links)

```mmdc -i [README.template.md] -o [README.md]```

**Transparent PNG at a given size**

```mmdc -i [input.mmd] -o [output.png] -b transparent --size [1600]```

**Run via npx without installing**

```npx -p @mermaid-js/mermaid-cli mmdc -i [input.mmd] -o [output.svg]```

# SYNOPSIS

**mmdc** [_options_]

# DESCRIPTION

**mmdc** (Mermaid CLI) renders Mermaid diagrams from text definitions to images. Mermaid is a diagramming language for flowcharts, sequence diagrams, class diagrams, and more.

The tool enables automated diagram generation in documentation pipelines and scripts.

# PARAMETERS

**-i**, **--input** _file_
> Input mermaid file, or **-** for stdin. Files ending in **.md** are treated as Markdown and every mermaid code block is rendered.

**-o**, **--output** _file_
> Output file (**.svg**, **.png**, **.pdf**, **.md**), or **-** for stdout. Default: input name + **.svg**.

**-a**, **--artefacts** _dir_
> Where to write images generated from Markdown input (default: output directory).

**-t**, **--theme** _theme_
> Theme: _default_, _base_, _dark_, _forest_, _neutral_, _neo_, _neo-dark_, _redux_, and variants.

**-b**, **--backgroundColor** _color_
> Background color for PNG/SVG, e.g. _transparent_, _red_, _'#F0F0F0'_ (default: _white_).

**-c**, **--configFile** _file_
> Mermaid JSON config file.

**-C**, **--cssFile** _file_
> CSS file applied as Mermaid's **themeCSS**.

**--size** _px_
> Maximum width or height of the diagram (replaces **-w**/**-H** since v12).

**-p**, **--puppeteerConfigFile** _file_
> Puppeteer JSON config file.

**-s**, **--scale** _factor_
> Puppeteer scale factor (default: _1_).

**-e**, **--outputFormat** _format_
> Output format: _svg_, _png_, or _pdf_ (default: from output extension).

**--pdf-paper-format** _format_
> Render the PDF on a fixed paper size (_A4_, _Letter_, ...) instead of fitting the diagram. Replaces **--pdfFit** since v12.

**-j**, **--jobs** _n_
> Parallel jobs when rendering multiple diagrams (default: half the CPUs).

**--no-font-embed**
> Do not embed fonts into SVG output (smaller files).

**--iconPacks** _package..._
> Use locally installed Iconify icon packs, e.g. _@iconify-json/logos_.

**-q**, **--quiet**
> Suppress log output.

**-I**, **--svgId** _id_
> Set the `id` attribute on the generated SVG element.

# DIAGRAM TYPES

**graph/flowchart**: Flow diagrams
**sequenceDiagram**: Sequence diagrams
**classDiagram**: Class diagrams
**stateDiagram**: State machines
**gantt**: Gantt charts
**pie**: Pie charts
**erDiagram**: Entity relationship diagrams
**mindmap**, **timeline**, **gitGraph**: Mind maps, timelines, Git history

# CAVEATS

Requires Node.js (v22.13+ for mmdc 12) and a headless Chromium downloaded by Puppeteer; in containers or as root, a Puppeteer config with **--no-sandbox** may be needed. Version 12 removed **-w**, **-H** and **--pdfFit**. Large diagrams can be slow.

# HISTORY

**Mermaid** was created by **Knut Sveidqvist** around **2014** to provide a simple text-based diagramming language. The CLI tool (**@mermaid-js/mermaid-cli**) enables command-line rendering, complementing web-based rendering in browsers and documentation tools. Version **12.0** (2026) followed Mermaid 12 and reworked sizing, PDF and icon options.

# SEE ALSO

[graphviz](/man/graphviz)(1), [plantuml](/man/plantuml)(1), [ditaa](/man/ditaa)(1), [drawio](/man/drawio)(1), [d2](/man/d2)(1), [mmdc](/man/mmdc)(1)

# RESOURCES

```[Source code](https://github.com/mermaid-js/mermaid-cli)```

```[Homepage](https://mermaid.js.org)```

```[Documentation](https://mermaid.js.org/intro/)```

<!-- verified: 2026-11-23 -->
