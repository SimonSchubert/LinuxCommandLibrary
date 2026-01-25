# TLDR

**Plot data from file**

```graph [data.txt] > [plot.ps]```

**Plot with specific range**

```graph -x [0] [10] -y [0] [100] [data.txt] > [plot.ps]```

**Create PNG output**

```graph -T png [data.txt] > [plot.png]```

**Plot with title**

```graph --title-font-size [0.05] -L "[My Graph]" [data.txt] > [plot.ps]```

**Multiple datasets**

```graph [data1.txt] [data2.txt] > [plot.ps]```

# SYNOPSIS

**graph** [_options_] [_files_]

# PARAMETERS

**-T** _type_
> Output format: ps, png, gif, svg, X.

**-x** _min_ _max_
> X-axis range.

**-y** _min_ _max_
> Y-axis range.

**-L** _label_
> Top label (title).

**-X** _label_
> X-axis label.

**-Y** _label_
> Y-axis label.

**-m** _type_
> Line mode (0-5).

**-S** _type_
> Symbol type.

**-C**
> Use color.

**-g** _type_
> Grid type (0-3).

# DESCRIPTION

**graph** is part of GNU plotutils, creating 2D plots from data files. It reads x,y coordinates from input and generates publication-quality graphs in various formats.

The tool supports multiple datasets, various line and symbol styles, and extensive customization for scientific and technical plotting.

# INPUT FORMAT

```
# Comment line
1 2.5
2 3.7
3 4.2
# Blank line separates datasets

1 1.5
2 2.8
```

# CAVEATS

Part of plotutils package. Limited interactivity. For complex plots, consider gnuplot. PostScript is default output.

# HISTORY

graph is part of **GNU plotutils**, maintained by the GNU project. The package provides a collection of plotting utilities following the Unix philosophy of simple, composable tools.

# SEE ALSO

[gnuplot](/man/gnuplot)(1), [plotutils](/man/plotutils)(1), [plot](/man/plot)(1)
