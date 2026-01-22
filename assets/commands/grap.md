# TLDR

**Create graph**

```grap [script.grap] | groff -Tps > output.ps```

**Process inline**

```echo ".G1 ... .G2" | grap | groff -Tps```

# SYNOPSIS

**grap** [_options_] [_file_]

# PARAMETERS

_FILE_
> Grap script file.

**-d** _VAR=VALUE_
> Define variable.

**--help**
> Display help information.

# DESCRIPTION

**grap** is a language for creating graphs, designed for use with groff. It describes graphs using a simple language that produces pic output for troff/groff processing.

The tool creates publication-quality graphs for technical documents. It integrates with the troff document processing system.

grap creates graphs for groff documents.

# CAVEATS

Part of groff ecosystem. Outputs to pic format. Requires groff for rendering.

# HISTORY

grap was developed at **Bell Labs** as part of the Unix document preparation tools, described by Kernighan and Bentley.

# SEE ALSO

[groff](/man/groff)(1), [pic](/man/pic)(1), [gnuplot](/man/gnuplot)(1)
