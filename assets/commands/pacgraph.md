# TLDR

Produce an **SVG and PNG** graph

```pacgraph```

Produce an **SVG** graph only

```pacgraph -s```

Print **summary to console**

```pacgraph -c```

Override the default **filename/location**

```pacgraph -f [path/to/file]```

Change the color of **packages that are not dependencies**

```pacgraph -t [color]```

Change the color of **package dependencies**

```pacgraph -d [color]```

Change the **background color**

```pacgraph -b [color]```

Change the color of **links between packages**

```pacgraph -l [color]```

# SYNOPSIS

**pacgraph** [_options_]

# PARAMETERS

**-s**, **--svg**
> Produce SVG output only (no PNG)

**-c**, **--console**
> Print summary to console instead of generating graph

**-f**, **--file** _path_
> Output filename (without extension)

**-t**, **--top** _color_
> Color for explicitly installed packages

**-d**, **--dep** _color_
> Color for dependency packages

**-b**, **--background** _color_
> Background color of the graph

**-l**, **--link** _color_
> Color for dependency links

**-p**, **--point** _size_
> Font point size

**-n**, **--no-compression**
> Disable SVGZ compression

**-e**, **--explicits**
> Include only explicitly installed packages

**-o**, **--optdeps**
> Include optional dependencies

# DESCRIPTION

**pacgraph** visualizes the dependency relationships between installed packages on Arch-based systems. It generates a graph showing packages as nodes sized by their disk usage, with lines connecting packages to their dependencies.

The output can be an SVG image, PNG image, or console text summary. The tool helps users understand their system's package structure, identify large packages, and visualize dependency chains. Colors distinguish between explicitly installed packages and dependencies.

# CAVEATS

Large systems with many packages produce complex graphs that may be difficult to read. PNG generation requires additional dependencies (typically graphviz or PIL). Do not include file extension in the **-f** option.

# HISTORY

Developed for Arch Linux to provide visual insight into package relationships. Helps users understand disk usage distribution across packages and identify opportunities for cleanup by showing which packages have few dependents.

# SEE ALSO

[pacman](/man/pacman)(8), [pactree](/man/pactree)(8), [expac](/man/expac)(1)
