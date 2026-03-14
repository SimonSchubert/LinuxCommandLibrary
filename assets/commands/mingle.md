# TAGLINE

fast edge bundling for graphs

# TLDR

**Bundle edges in a graph and write output**

```mingle -o [output.gv] [input.gv]```

**Bundle using force-directed method**

```mingle -m 0 [input.gv]```

**Set edge compatibility measure (distance-based)**

```mingle -c 0 [input.gv]```

**Set maximum turning angle in degrees**

```mingle -a [40] [input.gv]```

**Output in simple schematic format**

```mingle -T simple -o [output.gv] [input.gv]```

**Enable verbose tracing**

```mingle -v [input.gv]```

# SYNOPSIS

**mingle** [_options_] [_file_]

# PARAMETERS

**-m** _k_
> Bundling method: 0 = force-directed, 1 = agglomerative ink saving (default if available), 2 = cluster plus ink saving.

**-a** _k_
> Maximum turning angle in degrees (non-negative real, default 40).

**-c** _v_
> Compatibility measure: 0 = distance (default), 1 = full compatibility. Only used with force-directed bundling.

**-i** _k_
> Maximum iterative divisions in force-directed bundling.

**-r** _k_
> Maximum recursion level for agglomerative method (default 100).

**-T** _fmt_
> Output format: "gv" attaches drawing info to input graph, "simple" outputs schematic representation.

**-v** [_k_]
> Verbose level for tracing (default 1 if no value given).

**-?**
> Print usage and exit.

# DESCRIPTION

**mingle** performs fast edge bundling on graphs. It reduces visual clutter in dense graph visualizations by grouping similar edges together into bundles.

Part of the Graphviz suite, mingle reads a graph in DOT format and produces output with bundled edges. It supports multiple bundling algorithms including force-directed and agglomerative ink saving methods.

# CAVEATS

Part of Graphviz. Output is always in DOT format. May obscure individual edge paths in dense graphs.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [sfdp](/man/sfdp)(1), [fdp](/man/fdp)(1)

