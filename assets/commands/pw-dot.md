# TAGLINE

Visualize PipeWire graph as Graphviz DOT

# TLDR

Generate a graph to **pw.dot** file

```pw-dot```

Read objects from **pw-dump JSON** file

```pw-dot -j [path/to/file.json]```

Specify **output file** and show all object types

```pw-dot -o [path/to/file.dot] -a```

Print graph to **stdout** with object properties

```pw-dot -o - -d```

Generate graph from **remote instance** showing linked objects

```pw-dot -r [remote_name] -s```

Lay graph from **left to right**

```pw-dot -L```

Use **90-degree angles** in edges

```pw-dot -9```

# SYNOPSIS

**pw-dot** [_options_]

# PARAMETERS

**-o**, **--output** _file_
> Output file (default: pw.dot, use - for stdout)

**-a**, **--all**
> Show all object types

**-s**, **--smart**
> Show only linked objects

**-d**, **--detail**
> Show all object properties

**-r**, **--remote** _name_
> Connect to remote PipeWire instance

**-j**, **--json** _file_
> Read objects from pw-dump JSON file

**-L**, **--lr**
> Lay graph left to right

**-9**, **--90**
> Use 90-degree angles for edges

**-h**, **--help**
> Display help message

# DESCRIPTION

**pw-dot** generates Graphviz DOT files from the PipeWire graph, visualizing the connections between nodes, ports, and devices. The output can be rendered to images using the **dot** command from Graphviz.

This is useful for understanding audio/video routing, debugging connection issues, and documenting system audio configurations.

# CAVEATS

Requires Graphviz to render the DOT file to images. Complex graphs with many objects can be difficult to read; use **--smart** to show only connected objects.

# HISTORY

Part of **PipeWire**, providing visualization of the multimedia graph. Useful for developers, system integrators, and users troubleshooting audio routing.

# SEE ALSO

[pw-dump](/man/pw-dump)(1), [pw-cli](/man/pw-cli)(1), [dot](/man/dot)(1)
