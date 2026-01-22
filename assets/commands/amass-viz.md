# TLDR

**Generate** D3.js visualization

```amass viz -d3 -d [example.com]```

Generate **Graphistry** visualization

```amass viz -graphistry -d [example.com]```

Export to **DOT** format

```amass viz -dot -d [example.com] -o [graph.dot]```

Generate **GEXF** for Gephi

```amass viz -gexf -d [example.com] -o [graph.gexf]```

# SYNOPSIS

**amass viz** [_-d3_|_-dot_|_-gexf_|_-graphistry_] [_-d domain_] [_options_]

# DESCRIPTION

**amass viz** generates visualizations from enumeration data stored in the amass database. It can create interactive web-based graphs, export to standard graph formats, or integrate with visualization platforms.

Visual representations help understand the relationships between discovered assets, identify patterns, and communicate findings to stakeholders.

# PARAMETERS

**-d3**
> Generate D3.js HTML visualization

**-dot**
> Export in Graphviz DOT format

**-gexf**
> Export in GEXF format (for Gephi)

**-graphistry**
> Generate Graphistry visualization

**-maltego**
> Export for Maltego

**-d** _domain_
> Filter by domain

**-enum** _index_
> Use specific enumeration

**-o** _file_
> Output file path

**-dir** _path_
> Database directory

# CAVEATS

Large enumerations produce complex visualizations that may be slow to render. D3 visualizations require a web browser. Some formats require specific software to view.

# HISTORY

**amass viz** was added to help security professionals visualize and communicate enumeration results, supporting multiple output formats for different use cases.

# SEE ALSO

[amass](/man/amass)(1), [amass-db](/man/amass-db)(1), [dot](/man/dot)(1)
