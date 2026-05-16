# TAGLINE

color edges of a laid-out graph for visual distinction

# TLDR

**Color edges** and write the result

```edgepaint [graph.dot] -o [colored.dot]```

**Set the minimum** incidence angle (degrees)

```edgepaint --angle=15 [graph.dot] -o [out.dot]```

**Use a specific** color scheme

```edgepaint --color_scheme=accent8 [graph.dot] -o [out.dot]```

**Allow edges sharing an endpoint** to keep the same color

```edgepaint --share_endpoint [graph.dot] -o [out.dot]```

**Pipe through dot** to render a PNG

```dot graph.dot | edgepaint | dot -Tpng -o out.png```

# SYNOPSIS

**edgepaint** [_options_] [_input_] [**-o** _output_]

# PARAMETERS

_input_
> Input DOT file with node positions already laid out. Reads stdin if omitted.

**-o** _FILE_
> Write output to FILE instead of stdout.

**--accuracy**=_e_
> Precision for finding maximally different coloring at each node. Default 0.01.

**--angle**=_a_
> Color two edges differently if their incidence angle is less than _a_ degrees. Default 15.

**--color_scheme**=_c_
> Color palette: `rgb`, `gray`, `lab` (default), a list of hex colors, or any Brewer scheme name (e.g. `accent8`, `set19`).

**--lightness**=_l1,l2_
> Lightness range, only with `lab`. Integers 0-100. Default `0,70`.

**--random_seed**=_s_
> Seed for the randomized coloring. Negative values run multiple iterations with different seeds.

**--share_endpoint**
> Edges that share a node and are nearly anti-parallel (~180 degrees apart) are not treated as conflicting.

**-v**
> Verbose output.

**-?**
> Print usage and exit.

# DESCRIPTION

**edgepaint** assigns colors to the edges of a graph so that adjacent or near-parallel edges receive maximally distinct colors. It expects a graph that has already been laid out (for example by **dot** or **neato**), since the algorithm uses the geometric positions of edges to decide which pairs should differ.

Colors are written into each edge's `color` attribute and the modified DOT is emitted on stdout (or to the file given with **-o**). The default `lab` color scheme produces perceptually distinct hues; alternative Brewer schemes give a fixed small palette.

# CAVEATS

Input must already contain edge geometry from a layout engine; otherwise edgepaint cannot determine angles. Very dense graphs may exhaust the palette and still produce visually similar edges. The Brewer schemes have a fixed number of colors, so large graphs should prefer `lab`.

# HISTORY

**edgepaint** is part of **Graphviz**, originally developed at **AT&T Labs Research**. It implements ideas from Yifan Hu's work on edge coloring for graph readability.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [graphviz](/man/graphviz)(7)
