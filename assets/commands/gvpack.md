# TLDR

**Merge layout graphs**

```gvpack [graph1.dot] [graph2.dot] > [merged.dot]```

**Pack at graph level**

```gvpack -g [graph1.dot] [graph2.dot] > [merged.dot]```

**Pack at node level**

```gvpack -n [graph1.dot] [graph2.dot] > [merged.dot]```

**Combine without packing**

```gvpack -u [graph1.dot] [graph2.dot] > [merged.dot]```

**Array layout**

```gvpack -array [graph1.dot] [graph2.dot] > [merged.dot]```

**Full pipeline**

```ccomps -x [graph.dot] | dot | gvpack | neato -s -n2 -Tpng -o [output.png]```

# SYNOPSIS

**gvpack** [_options_] [_files_]

# PARAMETERS

**-g**
> Pack at graph level.

**-n**
> Pack at node level, ignoring clusters.

**-u**
> Combine without packing.

**-array**
> Arrange in array layout.

**-o** _file_
> Output to file.

**-s** _name_
> Root graph name (default: root).

# DESCRIPTION

**gvpack** merges multiple laid-out graphs into a single combined graph. Input must be in dot format with layout information (produced by dot or neato without -T flag). By default, packing is at cluster level, preventing graph parts from overlapping. Output can be rendered with **neato -s -n2** and desired output format.

# CAVEATS

All input graphs must be either all directed or all undirected. Nodes with same names are automatically renamed.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [ccomps](/man/ccomps)(1)

