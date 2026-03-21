# TAGLINE

Graph language preprocessor for groff documents

# TLDR

**Process a grap script into PostScript via groff**

```grap [script.grap] | groff -Tps > [output.ps]```

**Pipe grap output through pic and groff**

```grap [script.grap] | pic | troff -Tps > [output.ps]```

**Define a variable from the command line**

```grap -d "[x=100]" [script.grap] | groff -Tps > [output.ps]```

**Read from standard input**

```cat [script.grap] | grap | groff -Tps > [output.ps]```

# SYNOPSIS

**grap** [_options_] [_file_]

# PARAMETERS

_FILE_
> Grap input file. If omitted, reads from standard input.

**-d** _VAR=VALUE_
> Define a variable and its value before processing.

**-l**
> Use the graph's default line thickness.

**-R**
> Do not load the default macro startup file.

**--help**
> Display help information.

# DESCRIPTION

**grap** is a preprocessor for creating graphs within groff/troff documents. Input is written in a simple declarative language enclosed between .G1 and .G2 macros, and the output is pic(1) code suitable for further processing by pic and troff/groff.

The tool creates publication-quality graphs for technical documents, supporting features like labeled axes, multiple data sets, logarithmic scales, and coordinate systems. It integrates seamlessly with the troff document processing pipeline.

# CAVEATS

Part of the groff ecosystem. Outputs pic format that must be further processed by pic(1) and troff/groff. Not installed by default on most distributions; often available as a separate package.

# HISTORY

grap was developed at **Bell Labs** as part of the Unix document preparation tools, described by Kernighan and Bentley.

# SEE ALSO

[groff](/man/groff)(1), [pic](/man/pic)(1), [troff](/man/troff)(1), [tbl](/man/tbl)(1), [eqn](/man/eqn)(1), [gnuplot](/man/gnuplot)(1)
