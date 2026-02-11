# TAGLINE

Draw graphs in the terminal

# TLDR

**Create bar chart from file**

```termgraph [data.txt]```

**Create chart with custom title**

```termgraph --title "[Monthly Sales]" [data.txt]```

**Create colored chart**

```termgraph --color [red] [data.txt]```

**Create vertical bar chart**

```termgraph --vertical [data.txt]```

**Create stacked bar chart**

```termgraph --stacked [data.txt]```

**Create histogram**

```termgraph --histogram --bins [10] [data.txt]```

**Customize chart width**

```termgraph --width [80] [data.txt]```

**Create chart from stdin**

```cat [data.txt] | termgraph```

# SYNOPSIS

**termgraph** [_options_] [_filename_]

# PARAMETERS

**--title** _title_
> Title displayed above the graph.

**--width** _n_
> Width of graph in characters (default: 50).

**--format** _format_
> Format specifier for values.

**--suffix** _suffix_
> String appended to all data points.

**--no-labels**
> Hide label column.

**--no-values**
> Hide values at end of bars.

**--space-between**
> Print newline after each row.

**--color** _color_
> Bar color(s): red, blue, green, magenta, yellow, black, cyan.

**--vertical**
> Display vertical bars.

**--stacked**
> Display stacked bar chart.

**--histogram**
> Display histogram from raw data.

**--bins** _n_
> Number of histogram bins.

**--different-scale**
> Use different scales per category.

**--calendar**
> Display calendar heatmap.

**--start-dt** _date_
> Start date for calendar chart.

**--custom-tick** _char_
> Custom tick mark character (emoji supported).

**--delim** _char_
> Custom delimiter (default: comma or space).

**--verbose**
> Enable verbose output.

# DESCRIPTION

**termgraph** is a Python command-line tool that draws basic graphs in the terminal. It supports bar charts, stacked charts, histograms, calendar heatmaps, and can display graphs horizontally or vertically.

Data is provided in a simple format with labels in the first column and numeric values in subsequent columns, separated by commas or spaces. Multiple value columns create grouped or stacked charts.

The tool supports emoji characters as tick marks, enabling creative visualizations. It can also be used as a Python library for programmatic chart generation.

Install via pip: `pip install termgraph`

# CAVEATS

Requires Python 3. Terminal width limits chart size. Color support depends on terminal capabilities. Complex charts may not render correctly in narrow terminals.

# HISTORY

**termgraph** was created by Marcus Kazmierczak as a simple way to visualize data directly in the terminal. It provides a quick alternative to graphical charting tools for command-line workflows and scripts.

# SEE ALSO

[gnuplot](/man/gnuplot)(1), [spark](/man/spark)(1), [asciichart](/man/asciichart)(1)
