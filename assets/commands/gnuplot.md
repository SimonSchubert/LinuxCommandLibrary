# TAGLINE

command-driven graphing and plotting utility

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

**gnuplot** is a command-driven graphing utility for creating 2D and 3D plots of functions and data. It supports many output formats for publication-quality graphics.

The tool uses its own scripting language for plot customization. It supports terminals for X11, PNG, PDF, SVG, and many others. It is widely used in scientific visualization and data analysis.

# CONFIGURATION

**~/.gnuplot**
> Initialization file executed on startup, used for default settings and custom functions.

# CAVEATS

Learning curve for advanced features. Script syntax unique to gnuplot. Many terminal types available.

# HISTORY

gnuplot was created in **1986** by Thomas Williams and Colin Kelley, becoming a standard tool for scientific and technical plotting.

# SEE ALSO

[matplotlib](/man/matplotlib)(1), [feedgnuplot](/man/feedgnuplot)(1)
