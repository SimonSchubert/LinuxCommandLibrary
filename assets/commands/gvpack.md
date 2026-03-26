# TAGLINE

Merge and pack disjoint graphs

# TLDR

**Merge laid-out graphs**

```gvpack [graph1.dot] [graph2.dot] > [merged.dot]```

**Pack at graph level** (prevents interleaving)

```gvpack -g [graph1.dot] [graph2.dot] > [merged.dot]```

**Pack at node level** (ignoring clusters)

```gvpack -n [graph1.dot] [graph2.dot] > [merged.dot]```

**Combine without packing**

```gvpack -u [graph1.dot] [graph2.dot] > [merged.dot]```

**Arrange in array layout with margin**

```gvpack -array -m [20] [graph1.dot] [graph2.dot] > [merged.dot]```

**Set graph attributes on output**

```gvpack -G "label=[My Graph]" [graph1.dot] [graph2.dot] > [merged.dot]```

**Full pipeline: decompose, layout, pack, render**

```ccomps -x [graph.dot] | dot | gvpack | neato -s -n2 -Tpng -o [output.png]```

# SYNOPSIS

**gvpack** [_options_] [_files_]

# PARAMETERS

**-g**
> Pack at graph level. Uses more space but prevents parts of one graph from occurring between parts of another.

**-n**
> Pack at node level, ignoring clusters.

**-u**
> Combine without packing. Just merge into a single graph.

**-array**[_flags_][_n_]
> Arrange graphs in an array layout. Optional flags: c (column-major), t/b/l/r (align top/bottom/left/right), u (use sortv attribute). Optional _n_ sets columns (or rows with c).

**-m** _margin_
> Packing margin in points around each part.

**-o** _file_
> Output to file instead of stdout.

**-s** _name_
> Root graph name (default: root).

**-G** _name=value_
> Add attributes to the resulting union graph.

**-v**
> Verbose mode.

# DESCRIPTION

**gvpack** reads in a stream of graphs, combines them into a single layout, and produces a single graph serving as the union of the input graphs. Input must be in dot format with layout information (produced by a layout engine like dot or neato without the -T flag). By default, packing is at cluster level, preventing graph parts from overlapping. Output can be rendered with **neato -s -n2** and the desired output format.

# CAVEATS

All input graphs must be either all directed or all undirected. Nodes with the same names across graphs are automatically renamed to avoid conflicts.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [ccomps](/man/ccomps)(1), [fdp](/man/fdp)(1), [twopi](/man/twopi)(1)