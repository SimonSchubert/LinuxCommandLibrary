# TAGLINE

creates geographical-style maps from graphs

# TLDR

**Create map from graph**

```gvmap [input.gv] > map.gv```

**Cluster similar nodes**

```gvmap -e [input.gv] > clustered.gv```

**Add color**

```gvmap -c [input.gv] > colored.gv```

**Specify output**

```gvmap -o [output.gv] [input.gv]```

# SYNOPSIS

**gvmap** [_options_] [_files_]

# PARAMETERS

_FILES_
> Input DOT files.

**-o** _FILE_
> Output file.

**-e**
> Group similar nodes.

**-c**
> Add coloring.

**-a** _K_
> Grouping strength.

**-?**
> Display help information.

# DESCRIPTION

**gvmap** creates geographical-style maps from graphs. It groups related nodes into regions and generates map-like visualizations.

The tool analyzes graph structure to cluster nodes into countries or regions. It adds visual styling to create appealing map layouts.

# CAVEATS

Part of Graphviz package. Works best with clustered graphs. May require layout preprocessing.

# HISTORY

gvmap was developed as part of **Graphviz** at **AT&T Labs** for creating geographical-style graph visualizations.

# SEE ALSO

[dot](/man/dot)(1), [neato](/man/neato)(1), [sfdp](/man/sfdp)(1)
