# TAGLINE

Create simple plots from data files

# TLDR

**Plot from file**

```plot [datafile]```

**Plot with title**

```plot -T "[Title]" [datafile]```

**Specify output format**

```plot -T png [datafile] > [plot.png]```

# SYNOPSIS

**plot** [_options_] [_file_]

# PARAMETERS

_FILE_
> Data file to plot.

**-T** _TYPE_
> Output type.

**-o** _FILE_
> Output file.

**--help**
> Display help.

# DESCRIPTION

**plot** is a simple command-line utility for creating graphs and charts from tabular text data. It reads data from files or stdin and renders plots in various output formats including PNG and terminal display.

For basic data visualization needs, plot provides a quick way to generate graphs without the complexity of full-featured tools like gnuplot.

# CAVEATS

Simple plotting. For complex graphs use gnuplot.

# HISTORY

plot provides **simple command-line** data visualization.

# SEE ALSO

[gnuplot](/man/gnuplot)(1), [graph](/man/graph)(1)

