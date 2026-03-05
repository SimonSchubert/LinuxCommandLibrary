# TAGLINE

Draw plots on the terminal from command-line data

# TLDR

**Draw a bar chart from TSV data**

```cat [data.tsv] | uplot bar```

**Draw a line plot from CSV**

```cat [data.csv] | uplot line -d,```

**Plot a histogram**

```seq 100 | awk '{print rand()}' | uplot hist```

# SYNOPSIS

**uplot** _subcommand_ [_options_]

# DESCRIPTION

**YouPlot** is a CLI tool that renders bar charts, line plots, scatter plots, histograms, and boxplots directly in the terminal using Unicode characters. It reads tab-separated or custom-delimited data from stdin, making it ideal for piping output from other commands.

# HISTORY

**YouPlot** was created by **kojix2** (Red Data Tools) and is written in **Ruby**.

# SEE ALSO

[gnuplot](/man/gnuplot)(1), [termgraph](/man/termgraph)(1)
