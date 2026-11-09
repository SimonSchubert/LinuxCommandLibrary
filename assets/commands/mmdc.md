# TAGLINE

Mermaid CLI for generating diagrams from text

# TLDR

**Generate an SVG diagram from a file**

```mmdc -i [input.mmd] -o [output.svg]```

**Generate a PNG with a dark theme**

```mmdc -i [input.mmd] -o [output.png] -t dark```

**Generate a PDF** on a fixed paper size

```mmdc -i [input.mmd] -o [output.pdf] --pdf-paper-format [A4]```

**Set the diagram size and scale**

```mmdc -i [input.mmd] -o [output.png] --size [1200] -s [2]```

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
> Input file path. Use `-` for stdin; if omitted, stdin is read with a warning. Files ending in .md or .markdown are treated as Markdown.

**-o**, **--output** _FILE_
> Output file path, ending in md, svg, png, or pdf. Use `-` for stdout. Defaults to `{input}.svg`.

**-e**, **--outputFormat** _FORMAT_
> Output format: svg, png, or pdf. Inferred from output extension by default.

**-t**, **--theme** _THEME_
> Mermaid theme: base, dark, default, forest, neutral, neo, neo-dark, redux, redux-dark, redux-color, redux-dark-color, or null.

**-b**, **--backgroundColor** _COLOR_
> Background color for PNG/SVG output, not PDF (default: white).

**--size** _SIZE_
> Diagram size: maximum height or width of a PNG, `max-width` of an SVG, or CSS pixels for a PDF.

**-s**, **--scale** _FACTOR_
> Puppeteer scale factor for deviceScaleFactor (default: 1).

**--pdf-paper-format** _FORMAT_
> Output a PDF on a paper size (Letter, Legal, Tabloid, Ledger, A0 to A6) instead of fitting the diagram.

**-c**, **--configFile** _FILE_
> JSON configuration file for Mermaid settings.

**-C**, **--cssFile** _FILE_
> CSS file for the page, used as Mermaid's `themeCSS`.

**-I**, **--svgId** _ID_
> ID attribute for the SVG element.

**-p**, **--puppeteerConfigFile** _FILE_
> JSON configuration file for Puppeteer launch options.

**-a**, **--artefacts** _PATH_
> Output path for images when processing Markdown files (default: output directory).

**-j**, **--jobs** _N_
> Number of parallel jobs when rendering multiple diagrams (default: half the available CPUs).

**--no-font-embed**
> Do not embed fonts into the SVG, reducing its size.

**--iconPacks** _PACKAGES_
> Installed Iconify NPM icon packs to use, e.g. `@iconify-json/logos`.

**--iconPacksNamesAndUrls** _PREFIX#URL_
> Icon packs to download by URL, with the prefix before the `#`.

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

Requires **Node.js** 22.13 or later (mermaid-cli 12) and downloads a Chromium browser via **Puppeteer** for rendering. The first run may take time due to the browser download. The scale factor (**-s**) only affects PNG output resolution. The **-w**, **-H**, and **-f** (**--pdfFit**) options of older releases are gone in mermaid-cli 12; use **--size** and **--pdf-paper-format**, as PDFs fit the diagram by default.

# HISTORY

**mmdc** is the CLI for **Mermaid**, a JavaScript-based diagramming and charting tool created by **Knut Sveidqvist**. The CLI package is published as **@mermaid-js/mermaid-cli** on npm.

# SEE ALSO

[mermaid](/man/mermaid)(1), [graphviz](/man/graphviz)(1), [plantuml](/man/plantuml)(1), [dot](/man/dot)(1)

# RESOURCES

```[Source code](https://github.com/mermaid-js/mermaid-cli)```

```[Homepage](https://mermaid.js.org)```

<!-- verified: 2026-11-09 -->
