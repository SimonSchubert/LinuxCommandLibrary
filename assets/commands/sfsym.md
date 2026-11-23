# TAGLINE

Export Apple SF Symbols as SVG, PDF, or PNG

# TLDR

**Install** from the project tap via Homebrew

```brew install yapstudios/tap/sfsym```

**Export a symbol as SVG** (format inferred from extension)

```sfsym export [heart.fill] -o [heart.svg]```

**Export a PNG** with a custom color and canvas size

```sfsym export [star.fill] --color [#FFD60A] --size [48] -o [star.png]```

**Render a palette (multi-color) symbol**

```sfsym export [person.2.fill] --mode [palette] --palette [#4F46E5,#22D3EE] -o [out.svg]```

**List every available symbol** (8,300+)

```sfsym list```

**Search the catalogue** for a keyword

```sfsym list --search [magnifyingglass]```

**Browse symbols in a category**

```sfsym list --category [weather] --limit [10]```

Export **inline-ready SVG** for HTML (tight viewBox, currentColor) to stdout

```sfsym export [star] --size [17] --web-inline -o -```

**Batch-process many exports from stdin** (~800/sec)

```cat [jobs.txt] | sfsym batch```

Export the **entire symbol library** as SVG

```sfsym list | awk '{print $1 " -f svg -o out/"$1".svg"}' | sfsym batch```

# SYNOPSIS

**sfsym** _command_ [_options_]

# COMMANDS

**export** _NAME_ **-o** _FILE_
> Render a single SF Symbol. The output format (svg/pdf/png) is inferred from the file extension unless **-f** is given.

**batch**
> Read repeated _export_ invocations from stdin, one per line. Exits with 2 if any line fails; **--fail-fast** stops at the first failure.

**list**
> Enumerate symbol names; supports **--prefix**, **--contains**, **--search**, **--category**, **--limit**, **--json**.

**info** _NAME_
> Dump geometry and layer metadata for a symbol as JSON.

**modes** _NAME_
> List the rendering modes supported by a symbol.

**colors**
> Print all named colors accepted by **--color**.

**categories**
> Print Apple's symbol taxonomy.

**schema**
> Machine-readable JSON description of every subcommand and flag, for automation.

**completions** _bash_|_zsh_|_fish_
> Print a shell completion script.

# PARAMETERS

**-f** _FORMAT_
> Force output format: _svg_, _pdf_, or _png_.

**--mode** _MODE_
> Rendering mode: _monochrome_, _hierarchical_, _palette_, _multicolor_.

**--weight** _WEIGHT_
> Font weight of the symbol: _ultralight_, _thin_, _light_, _regular_, _medium_, _semibold_, _bold_, _heavy_, _black_.

**--scale** _SCALE_
> Symbol scale: _small_, _medium_, _large_.

**--size** _N_
> Square canvas size in points (1 to 2048). PNG output uses 2x pixel density, so **--size 128** gives 256x256 pixels.

**--color** _HEX_|_NAME_
> Primary color. Accepts _#RGB_, _#RGBA_, _#RRGGBB_, _#RRGGBBAA_ or an Apple system color name such as _systemRed_.

**--palette** _C1,C2,..._
> Comma-separated palette colors used with **--mode palette**.

**--viewbox** _nominal_|_tight_
> SVG viewBox: the full symbol canvas (default) or cropped to the visible path bounds.

**--current-color**
> Emit SVG fills as currentColor so CSS controls the color.

**--no-dimensions**
> Omit SVG width and height attributes.

**--inline-svg**
> Omit the XML declaration and xmlns attribute for inline HTML/JSX.

**--web-inline**
> Preset for **--viewbox tight --current-color --no-dimensions --inline-svg**.

**-o** _PATH_
> Output file; **-** writes to stdout.

**--json**
> Produce structured output for export, batch, info, list, modes, colors and categories.

# DESCRIPTION

**sfsym** is a command-line tool that renders Apple's **SF Symbols** directly through the operating-system symbol renderer, no Xcode required. It produces crisp SVG, PDF, or PNG assets in any weight, mode, color, or size supported by the system, useful for design pipelines, documentation generation, icon build steps, and web exports.

The tool bundles a universal binary that runs on Apple Silicon and Intel Macs, so it can be dropped into CI. For batch workflows the **batch** subcommand accepts stdin requests and reaches roughly **800 exports per second** because it reuses a single rendering context. Machine-readable metadata is available through **info**, **modes**, and **schema**, making sfsym easy to wrap from scripts and editor plugins.

# CAVEATS

Requires **macOS 13 (Ventura) or later**. **multicolor** mode is not supported for SVG (use PNG, or palette mode for vector output) and is rasterized in PDF. The symbol catalogue is whatever the host OS provides, so newer symbols only render on matching macOS versions. **list --category**, **list --search** and **categories** read metadata from **SF Symbols.app** and fail if it is not installed. The renderer relies on a **private AppKit API**, so a future macOS release could break it (sfsym fails fast rather than producing wrong output). Apple's **SF Symbols license** only permits using the glyphs in artwork for apps on Apple platforms, not in Android apps or generic websites.

# HISTORY

**sfsym** is developed by **Yap Studios** and was first published in **2026** under the MIT license. It extracts vector geometry from the macOS symbol renderer, which has drawn Apple's **SF Symbols** (introduced in 2019) since macOS 11.

# SEE ALSO

[rsvg-convert](/man/rsvg-convert)(1), [inkscape](/man/inkscape)(1), [svgo](/man/svgo)(1), [imagemagick](/man/imagemagick)(1)

# RESOURCES

```[Source code](https://github.com/yapstudios/sfsym)```

<!-- verified: 2026-11-23 -->
