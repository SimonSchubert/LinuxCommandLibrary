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

**Batch-process many exports from stdin** (~800/sec)

```cat [jobs.txt] | sfsym batch```

# SYNOPSIS

**sfsym** _command_ [_options_]

# COMMANDS

**export** _NAME_ **-o** _FILE_
> Render a single SF Symbol. The output format (svg/pdf/png) is inferred from the file extension unless **-f** is given.

**batch**
> Read repeated _export_ invocations from stdin, one per line.

**list**
> Enumerate symbol names; supports **--search**, **--category**, **--limit**.

**info** _NAME_
> Dump geometry and layer metadata for a symbol as JSON.

**modes** _NAME_
> List the rendering modes supported by a symbol.

**colors**
> Print all named colors accepted by **--color**.

**categories**
> Print Apple's symbol taxonomy.

**schema**
> Machine-readable CLI description for automation.

# PARAMETERS

**-f** _FORMAT_
> Force output format: _svg_, _pdf_, or _png_.

**--mode** _MODE_
> Rendering mode: _monochrome_, _hierarchical_, _palette_, _multicolor_.

**--weight** _WEIGHT_
> Font weight of the symbol: _ultralight_, _thin_, _light_, _regular_, _medium_, _semibold_, _bold_, _heavy_, _black_.

**--size** _N_
> Canvas size in points (1–2048). PNG output uses 2× pixel density.

**--color** _HEX_|_NAME_
> Primary color. Accepts short and long hex (_#RGB_, _#RRGGBB_, _#RRGGBBAA_) or a named system color.

**--palette** _C1,C2,..._
> Comma-separated palette colors used with **--mode palette**.

**-o** _PATH_
> Output file; **-** writes to stdout.

**--json**
> Produce structured output for info/list/schema.

# DESCRIPTION

**sfsym** is a command-line tool that renders Apple's **SF Symbols** directly through the operating-system symbol renderer, no Xcode required. It produces crisp SVG, PDF, or PNG assets in any weight, mode, color, or size supported by the system — useful for design pipelines, documentation generation, icon build steps, and web exports.

The tool bundles a universal binary that runs on Apple Silicon and Intel Macs, so it can be dropped into CI. For batch workflows the **batch** subcommand accepts stdin requests and reaches roughly **800 exports per second** because it reuses a single rendering context. Machine-readable metadata is available through **info**, **modes**, and **schema**, making sfsym easy to wrap from scripts and editor plugins.

# CAVEATS

Requires **macOS 13 (Ventura) or later**; the symbol catalogue is whatever the host OS provides, so newer symbols only render on matching macOS versions. Apple's **SF Symbols license** restricts redistribution of the glyphs — exports are for use inside Apple platforms or with appropriate licensing.

# HISTORY

**sfsym** is developed by **Yap Studios** and released under the MIT license, building on the public SF Symbols rendering APIs introduced by Apple in 2019.

# SEE ALSO

[rsvg-convert](/man/rsvg-convert)(1), [inkscape](/man/inkscape)(1), [svgo](/man/svgo)(1), [imagemagick](/man/imagemagick)(1)
