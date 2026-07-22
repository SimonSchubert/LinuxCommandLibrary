# TAGLINE

graphviz filter that colors nodes in a ranked directed graph

# TLDR

**Color a graph by rank**

```dot -Tcanon [graph.gv] | gvcolor | dot -Tpng -o [output.png]```

**Color and output to file**

```dot -Tcanon [graph.gv] | gvcolor > [colored.gv]```

# SYNOPSIS

**gvcolor** [_files_]

# PARAMETERS

_FILES_
> Input graph files already laid out by dot. Reads stdin if none given.

# DESCRIPTION

**gvcolor** (formerly **colorize**) is a Graphviz filter that sets node colors from initial seed values on a ranked digraph. Colors flow along edges from tail to head and are averaged, as HSB vectors, at each node, producing a visual gradient across the graph.

The graph must already be laid out by **dot** (so nodes carry position/rank information), and initial colors are set via the **color** attribute on seed nodes. The graph attribute **flow=back** reverses the direction colors propagate, **saturation=**_min_**,**_max_ adjusts saturation linearly across ranks, and **Defcolor** sets a fallback color for uncolored nodes.

# CAVEATS

Requires a graph already processed by dot; exits with status 1 if nodes lack position information. Related but distinguishable seed colors (e.g., blue-green, green, light yellow) work best.

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

[dot](/man/dot)(1), [gc](/man/gc)(1), [gvpr](/man/gvpr)(1), [ccomps](/man/ccomps)(1), [sccmap](/man/sccmap)(1), [tred](/man/tred)(1)

# RESOURCES

```[Homepage](https://graphviz.org/)```

```[Source code](https://gitlab.com/graphviz/graphviz)```

```[Documentation](https://graphviz.org/doc/info/command.html)```

<!-- verified: 2026-07-17 -->

