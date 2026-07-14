# TAGLINE

diagram editor for flowcharts and diagrams

# TLDR

**Open the diagram editor**

```drawio```

**Open a specific file**

```drawio [diagram.drawio]```

**Export to PNG**

```drawio --export --format png [diagram.drawio]```

**Export every page** into one PDF

```drawio --export --format pdf --all-pages -o [out.pdf] [diagram.drawio]```

**Export one page** (page numbers are 1-based)

```drawio --export --page-index [1] [diagram.drawio]```

**Export a PNG** with a transparent background at 2x scale

```drawio --export --format png --transparent --scale [2] [diagram.drawio]```

**Convert a whole folder**, recursing into subfolders

```drawio --export --recursive --format svg [path/to/folder]```

**Export headlessly** in CI or a container

```xvfb-run -a drawio --no-sandbox --export --format png [diagram.drawio]```

# SYNOPSIS

**drawio** [_options_] [_file_|_folder_]

# DESCRIPTION

**drawio** (formerly diagrams.net) is a diagram editor for flowcharts, network diagrams, UML, org charts, and the like. The desktop application wraps the same editor that runs on the web in **Electron**, and works entirely offline.

Its headline design goal is isolation: the app makes no network connections except an update check, sends no telemetry, and never transmits diagram data. That is what makes it usable in environments where a cloud diagram tool is not an option.

Diagrams are stored as XML (`.drawio` or `.xml`), compressed by default but writable as plain text with **--uncompressed**, which makes them reviewable in a pull request. The command line can also **import** other formats: `.vsdx` (Visio), CSV, and Mermaid `.mmd` files can all be passed as input and exported to an image.

Export mode is what makes drawio scriptable. With **--export** the UI never appears: the app renders the file and exits, which is how diagrams get kept in sync with documentation in a build pipeline.

# PARAMETERS

**-x**, **--export**
> Export the input file or folder rather than opening the editor.

**-o**, **--output** _FILE_|_FOLDER_
> Output path. If omitted, the input name is reused with the format's extension.

**-f**, **--format** _FORMAT_
> Export format: `pdf` (the default), `png`, `jpg`/`jpeg`, `svg`, `xml`, or `html`. Ignored when **-o** already carries a known extension.

**-r**, **--recursive**
> For a folder input, also convert files in subfolders.

**-a**, **--all-pages**
> Export all pages. Applies to PDF and HTML.

**-p**, **--page-index** _N_
> Export a single page. **1-based.** Defaults to the first page for image formats.

**-g**, **--page-range** _FROM_**..**_TO_
> Export a range of pages, 1-based. PDF only.

**-l**, **--layers** _INDEXES_
> Comma-separated layer indexes to export. All layers by default.

**-t**, **--transparent**
> Transparent background. PNG and SVG only.

**-s**, **--scale** _N_
> Scale the diagram.

**--width** _N_ / **--height** _N_
> Fit the output into a given width or height, preserving the aspect ratio.

**-b**, **--border** _N_
> Border width around the diagram. Defaults to 0.

**--crop**
> Crop the PDF down to the diagram's size.

**-q**, **--quality** _N_
> JPEG quality. Defaults to 90.

**-e**, **--embed-diagram**
> Embed a copy of the editable diagram inside the output, so the exported PNG, SVG, or PDF can be reopened and edited.

**--embed-svg-images** / **--embed-svg-fonts**
> Inline images or fonts into an exported SVG. Fonts are embedded by default.

**-u**, **--uncompressed**
> Write uncompressed XML. Applies to XML and SVG output.

**--layout** _NAME_|_JSON_
> Apply a layout before exporting: `verticalFlow`, `horizontalFlow`, `verticalTree`, `horizontalTree`, `radialTree`, `organic`, or a custom layout JSON array.

**--svg-theme** _THEME_
> Theme for exported SVG: `dark`, `light`, or `auto` (the default).

**-c**, **--create** / **-k**, **--check**
> Create a new empty file if none is given, or refuse to overwrite existing files.

**--disable-update**
> Skip the startup update check. The `DRAWIO_DISABLE_UPDATE=true` environment variable does the same, which is what centrally-managed installs want.

# CAVEATS

**Page numbers are 1-based** on the command line, even though the underlying XML indexes them from zero. `--page-index 1` is the first page.

Export is not truly headless. Being an Electron app it still needs a display, so on a build server it has to be wrapped in **xvfb-run**, and running as root inside a container additionally requires **--no-sandbox**. Omitting either produces a crash that looks nothing like a missing display.

`vsdx`, `csv`, and Mermaid are **input** formats only; you cannot export to them. The export list is pdf, png, jpg, svg, xml, and html.

Note also that the project is closed to outside contributions by policy: bug reports are welcome, pull requests are not.

# HISTORY

**draw.io** was built by **JGraph Ltd** (Gaudenz Alder and David Benson) around **2012**, on top of the company's earlier mxGraph JavaScript library. The Electron desktop app came later, for users who could not or would not run a diagram editor in a browser tab connected to someone else's cloud.

The naming has been circular. The product was renamed **diagrams.net** in **2020**, partly because the `.io` top-level domain's association with the British Indian Ocean Territory had become awkward, and it has since drifted back to **drawio.com**, with the app still called draw.io by nearly everyone who uses it.

# SEE ALSO

[inkscape](/man/inkscape)(1), [plantuml](/man/plantuml)(1), [dot](/man/dot)(1), [dia](/man/dia)(1), [mermaid](/man/mermaid)(1)

# RESOURCES

```[Source code](https://github.com/jgraph/drawio-desktop)```

```[Homepage](https://www.drawio.com)```

<!-- verified: 2026-07-14 -->
