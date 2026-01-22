# TLDR

**Start interactive mode**

```gnuplot```

**Run script**

```gnuplot [script.gp]```

**Quick plot**

```gnuplot -e "plot sin(x)"```

**Persist window**

```gnuplot -p -e "plot sin(x)"```

**Set terminal**

```gnuplot -e "set terminal png; set output 'plot.png'; plot sin(x)"```

# SYNOPSIS

**gnuplot** [_options_] [_files_]

# PARAMETERS

_FILES_
> Script files to run.

**-e** _COMMAND_
> Execute command.

**-p**, **--persist**
> Keep window after script.

**-c** _FILE_
> Call script with args.

**--help**
> Display help information.

# DESCRIPTION

**gnuplot** is a command-driven graphing utility. It creates 2D and 3D plots of functions and data, supporting many output formats for publication-quality graphics.

The tool uses a scripting language for plot customization. It supports terminals for X11, PNG, PDF, SVG, and many others. It's widely used in scientific visualization.

gnuplot produces publication-quality plots and visualizations.

# CAVEATS

Learning curve for advanced features. Script syntax unique to gnuplot. Many terminal types available.

# HISTORY

gnuplot was created in **1986** by Thomas Williams and Colin Kelley, becoming a standard tool for scientific and technical plotting.

# SEE ALSO

[matplotlib](/man/matplotlib)(1), [feedgnuplot](/man/feedgnuplot)(1)
