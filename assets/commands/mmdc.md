# TAGLINE

Mermaid CLI for generating diagrams from text

# TLDR

**Generate an SVG diagram from a file**

```mmdc -i [input.mmd] -o [output.svg]```

**Generate a PNG with a dark theme**

```mmdc -i [input.mmd] -o [output.png] -t dark```

**Generate a PDF scaled to fit the chart**

```mmdc -i [input.mmd] -o [output.pdf] -f```

**Set custom page dimensions and scale**

```mmdc -i [input.mmd] -o [output.png] -w [1200] -H [800] -s [2]```

**Use a custom Mermaid configuration file**

```mmdc -i [input.mmd] -o [output.svg] -c [config.json]```

**Read from stdin with transparent background**

```cat [diagram.mmd] | mmdc -i - -o [output.svg] -b transparent```

**Process a Markdown file** extracting embedded diagrams

```mmdc -i [document.md] -o [document-out.md]```

# SYNOPSIS

**mmdc** [_options_]

# PARAMETERS

**-i**, **--input** _FILE_
> Input file path. Use `-` for stdin. Files ending in .md or .markdown are treated as Markdown.

**-o**, **--output** _FILE_
> Output file path. Use `-` for stdout. Defaults to `{input}.svg`.

**-e**, **--outputFormat** _FORMAT_
> Output format: svg, png, or pdf. Inferred from output extension by default.

**-t**, **--theme** _THEME_
> Mermaid theme: default, dark, forest, or neutral.

**-b**, **--backgroundColor** _COLOR_
> Background color for PNG/SVG output (default: white).

**-w**, **--width** _WIDTH_
> Page width in pixels (default: 800).

**-H**, **--height** _HEIGHT_
> Page height in pixels (default: 600).

**-s**, **--scale** _FACTOR_
> Puppeteer scale factor for deviceScaleFactor (default: 1).

**-f**, **--pdfFit**
> Scale PDF output to fit chart dimensions.

**-c**, **--configFile** _FILE_
> JSON configuration file for Mermaid settings.

**-C**, **--cssFile** _FILE_
> Path to custom CSS file for injection into the page.

**-I**, **--svgId** _ID_
> ID attribute for the SVG element (default: my-svg).

**-p**, **--puppeteerConfigFile** _FILE_
> JSON configuration file for Puppeteer launch options.

**-a**, **--artefacts** _PATH_
> Output path for images when processing Markdown files.

**-q**, **--quiet**
> Suppress log output to stdout.

**-V**, **--version**
> Display version number.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**mmdc** is the CLI for the Mermaid diagramming library. It renders diagrams defined in Mermaid's text-based syntax into SVG, PNG, or PDF output using a headless Chromium browser via Puppeteer.

Supported diagram types include flowcharts, sequence diagrams, class diagrams, state diagrams, Gantt charts, pie charts, ER diagrams, and more. When given a Markdown file as input, mmdc extracts and renders embedded Mermaid code blocks, replacing them with generated images.

The **--configFile** option accepts a JSON file that configures Mermaid behavior and is merged with the **--theme** option, with the config file taking precedence.

# CAVEATS

Requires **Node.js** and downloads a Chromium browser via **Puppeteer** for rendering. The first run may take time due to the browser download. The scale factor (**-s**) only affects PNG output resolution.

# HISTORY

**mmdc** is the CLI for **Mermaid**, a JavaScript-based diagramming and charting tool created by **Knut Sveidqvist**. The CLI package is published as **@mermaid-js/mermaid-cli** on npm.

# SEE ALSO

[graphviz](/man/graphviz)(1), [plantuml](/man/plantuml)(1), [dot](/man/dot)(1)

