# TAGLINE

creates geographical-style maps from graphs

# TLDR

**Create map from graph**

```gvmap [input.gv] > map.gv```

**Include edges in the output**

```gvmap -e [input.gv] > map.gv```

**Specify a color scheme** (1: pastel, 2: blue-yellow, 3: white-red)

```gvmap -c [2] [input.gv] > colored.gv```

**Specify output file**

```gvmap -o [output.gv] [input.gv]```

**Use top-level cluster subgraphs for clustering**

```gvmap -D [input.gv] > map.gv```

# SYNOPSIS

**gvmap** [_options_] [_files_]

# PARAMETERS

_FILES_
> Input DOT files.

**-o** _FILE_
> Output file.

**-e**
> Include edges in the final output.

**-c** _K_
> Use color scheme K (1: pastel, 2: blue-yellow, 3: white-red, etc.).

**-C** _K_
> Maximum number of clusters. Default 0 (no limit).

**-D**
> Use top-level cluster subgraphs to determine clustering.

**-O**
> Do NOT do color assignment optimization.

**-a** _K_
> Average number of artificial points added along bounding box of labels.

**-m** _V_
> Generate a margin of V points around the drawing.

**-r** _K_
> Number of random points used to define sea and lake boundaries. 0 for auto.

**-s** _V_
> Depth of sea and lake shores in points. 0 for auto.

**-t** _N_
> Make N attempts to improve cluster contiguity.

**-v**
> Verbose mode.

**-z** _COLOR_
> Set polygon line color. Default is black.

**-h**
> Print usage and exit.

# DESCRIPTION

**gvmap** takes as input a graph in DOT format with node position information (produced by a Graphviz layout engine such as sfdp) and groups related nodes into clusters, drawing them as geographical-style map regions.

The tool analyzes graph structure to cluster nodes into countries or regions, adds visual styling with color schemes, and can include edges in the output. It is typically used as part of a pipeline with **sfdp** and **gvmap.sh**.

# CAVEATS

Part of Graphviz package. Input graphs must have node position information; run a layout engine like **sfdp** first. The **gvmap.sh** wrapper script handles the full pipeline automatically.

# HISTORY

gvmap was developed as part of **Graphviz** at **AT&T Labs** for creating geographical-style graph visualizations.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [sfdp](/man/sfdp)(1)
