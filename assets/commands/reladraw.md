# TAGLINE

Render SVG diagrams from stated placement

# TLDR

**Render a diagram** to an SVG beside the source

```reladraw [diagram.reladraw]```

**Write the SVG** to a chosen path

```reladraw [diagram.reladraw] -o [out/diagram.svg]```

**Print the SVG** on standard output

```reladraw [diagram.reladraw] --out -```

**Show usage**

```reladraw --help```

# SYNOPSIS

**reladraw** [_options_] _input_

# PARAMETERS

_INPUT_
> Path to a reladraw source file. The diagram is not read from standard input.

**-o**, **--out** _PATH_
> Where to write the SVG. Defaults to the input path with its extension replaced by `.svg`. Use `-` to write the SVG to standard output. Parent directories are created. When writing a file, the resolved output path is printed on standard error.

**-h**, **--help**
> Print usage and exit 0. With no arguments, **reladraw** prints the same usage and exits 1.

# DESCRIPTION

**reladraw** compiles a text file into a standalone SVG. Each node is placed relative to another (`below`, `right of`, `level with`, `between`, or a diagonal such as `above-left of`). The file contains no coordinates, and the tool does not pick the arrangement the way Graphviz or D2 do. A gap is a minimum distance. The resolver finds the tightest layout that satisfies every statement.

One statement per line. `node` names a box and the label drawn in it. A dotted name such as `server.docker` puts that node inside `server`. `edge` draws an arrow (`->`, `<-`, or `<->`), with an optional label. `from:` and `to:` name the side the line leaves and the side it arrives on. `//` comments run to the end of the line. Blank lines and indentation do not change the meaning.

The command is the npm package **reladraw** (version **0.4.0**). It needs Node.js 18 or newer and has no runtime dependencies. Install it with `npm install -g reladraw`, or run `npx reladraw` without a global install. The same repository ships a browser editor; the shell tool only writes SVG.

# CAVEATS

The language is early and the syntax is expected to change. A render that succeeds does not yet report overlapping nodes, crossed edges, or text that overflowed its box. An edge that names no route is a straight line between centers and can pass through other nodes. Routing that goes around nodes is not implemented yet.

Unknown options are an error. Only SVG is produced. The code is Apache-2.0. The project name and logo are not covered by that license.

# SEE ALSO

[d2](/man/d2)(1), [dot](/man/dot)(1), [mermaid](/man/mermaid)(1), [plantuml](/man/plantuml)(1)

# RESOURCES

```[Source code](https://github.com/reladraw/reladraw)```

```[Documentation](https://github.com/reladraw/reladraw/blob/main/SYNTAX.md)```

<!-- verified: 2026-09-26 -->
