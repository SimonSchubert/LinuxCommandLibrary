# TAGLINE

hierarchical directed graph renderer

# TLDR

**Render graph to** PNG image

```dot -Tpng [graph.dot] -o [output.png]```

**Render to SVG**

```dot -Tsvg [graph.dot] -o [output.svg]```

**Render to PDF**

```dot -Tpdf [graph.dot] -o [output.pdf]```

**Render from stdin**

```echo "digraph { A -> B }" | dot -Tpng -o [output.png]```

**Use specific layout** engine

```dot -Kneato [graph.dot] -Tpng -o [output.png]```

**Render with custom** DPI

```dot -Gdpi=[300] -Tpng [graph.dot] -o [output.png]```

**Name outputs automatically** from the input files

```dot -Tpng -O [graph1.dot] [graph2.dot]```

**Print the computed layout** back out as DOT, with coordinates

```dot -Tdot [graph.dot] -o [laid_out.dot]```

**List the output formats** this build supports

```dot -T?```

# SYNOPSIS

**dot** [**-K**_engine_] [**-T**_format_] [**-o**_outfile_] [_files_...]

# PARAMETERS

_FILES_
> Input files in the DOT language. Reads standard input when none are given.

**-T**_FORMAT_[**:**_RENDERER_]
> Output format: `png`, `svg`, `pdf`, `ps`, `json`, `dot`, `plain`, and many more. **-T?** lists the ones your build supports.

**-o** _FILE_
> Write output to _FILE_ instead of standard output.

**-O**
> Derive each output file name from the input name plus the format suffix. Useful for batches.

**-K**_ENGINE_
> Layout engine to use instead of the default: `dot`, `neato`, `fdp`, `sfdp`, `circo`, `twopi`, `osage`, `patchwork`. This is what lets one binary act as any of them.

**-G**_NAME_=_VALUE_
> Set a graph attribute, e.g. **-Grankdir=LR** or **-Gdpi=300**.

**-N**_NAME_=_VALUE_
> Set a default node attribute, e.g. **-Nshape=box**.

**-E**_NAME_=_VALUE_
> Set a default edge attribute, e.g. **-Ecolor=blue**.

**-n**[**1**|**2**]
> No-op layout: take node positions from the input's `pos` attributes rather than computing them.

**-x**
> Reduce the graph before laying it out.

**-y**
> Invert the y coordinate in the output.

**-v**
> Verbose: report timing and progress.

**-q**[_LEVEL_]
> Suppress warnings.

**-V**
> Print the Graphviz version and exit.

# DESCRIPTION

**dot** draws **directed** graphs using a hierarchical, layered layout: it assigns nodes to ranks so that edges point consistently in one direction, then orders nodes within each rank to reduce crossings. That makes it the right choice for anything with a natural flow, such as call graphs, build dependencies, state machines, and org charts.

It reads the **DOT language**, a small declarative syntax where `digraph { a -> b }` is a complete program, and writes to a wide range of formats: raster (`png`, `jpg`), vector (`svg`, `pdf`, `ps`), and data (`json`, `plain`, and `dot` itself, which round-trips the graph with computed coordinates so another tool can render it).

dot is one face of the Graphviz layout family. The others differ only in algorithm, and any of them can be selected from this binary with **-K**: `neato` and `fdp` use force-directed placement for undirected graphs, `circo` a circular layout, `twopi` a radial one, and `sfdp` a scalable multilevel variant for very large graphs.

# CAVEATS

Hierarchical layout scales poorly: past a few thousand nodes, dot becomes slow and the result is usually unreadable regardless: reach for `sfdp` and filtering instead. Layout is deterministic but not stable, so a small edit to the input can rearrange the whole picture, which makes rendered diagrams awkward to diff. Which output formats and fonts are available depends on how the package was built, hence **-T?**. Note also that `dot` is both the program and the name of the language, so "a dot file" may mean either.

# HISTORY

dot grew out of graph-drawing research at **AT&T Bell Labs**, and later AT&T Labs Research, beginning around **1991**; the layered algorithm it implements descends from the work of Sugiyama and, in this lineage, from Gansner, Koutsofios, North, and Vo. Graphviz was released as open source in **2000**, and its DOT language has since become a lingua franca for graph description, emitted by profilers, compilers, documentation generators, and countless ad-hoc scripts.

# INSTALL

```apt: sudo apt install graphviz```

```dnf: sudo dnf install graphviz```

```pacman: sudo pacman -S graphviz```

```apk: sudo apk add graphviz```

```zypper: sudo zypper install graphviz```

```brew: brew install graphviz```

```nix: nix profile install nixpkgs#graphviz```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[neato](/man/neato)(1), [circo](/man/circo)(1), [fdp](/man/fdp)(1), [twopi](/man/twopi)(1), [graphviz](/man/graphviz)(7)

# RESOURCES

```[Source code](https://gitlab.com/graphviz/graphviz)```

```[Homepage](https://graphviz.org)```

```[Documentation](https://graphviz.org/doc/info/command.html)```

<!-- verified: 2026-07-14 -->

