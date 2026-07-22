# TAGLINE

GML to Graphviz DOT format converter

# TLDR

**Convert GML to DOT**

```gml2gv [input.gml] -o [output.gv]```

**Convert to stdout**

```gml2gv [input.gml]```

# SYNOPSIS

**gml2gv** [_options_] [_files_]

# PARAMETERS

_FILES_
> GML input files. Reads from stdin if omitted.

**-o** _FILE_
> Output file. Writes to stdout if omitted.

**-g** _NAME_
> Name for the generated graph. Subsequent graphs get an appended integer.

**-v**
> Verbose mode.

**-?**
> Display usage information and exit.

# DESCRIPTION

**gml2gv** converts graphs from GML (Graph Modelling Language) format to DOT format used by Graphviz. It enables using GML graphs with Graphviz visualization tools.

GML is a portable format for graph description. The converter preserves graph structure for rendering with dot, neato, or other Graphviz layout engines.

# CAVEATS

Part of Graphviz. Some GML features may not have DOT equivalents. Check attribute preservation.

# HISTORY

gml2gv is part of **Graphviz**, providing format conversion between common graph description languages.

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

[dot](/man/dot)(1), [gv2gml](/man/gv2gml)(1), [graphml2gv](/man/graphml2gv)(1)

# RESOURCES

```[Source code](https://gitlab.com/graphviz/graphviz)```

```[Homepage](https://graphviz.org/docs/cli/gml2gv/)```

<!-- verified: 2026-07-17 -->
