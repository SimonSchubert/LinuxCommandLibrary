# TAGLINE

ASCII line graphs from the command line

# TLDR

**Plot** comma-separated numbers from stdin

```echo "[1,2,5,4,3,8,7]" | asciigraph```

**Plot** with height and width

```seq 1 20 | asciigraph -h [10] -w [40]```

**Add a caption**

```echo "[3,4,9,6,2,4,5,8]" | asciigraph -c "CPU load"```

**Realtime graph** from a stream

```[your-metrics-command] | asciigraph -r -w [60] -h [15]```

**Multiple series** with legends

```asciigraph -sn [2] -sl "a,b" -sc "blue,red"```

**Color points** above/below a threshold

```echo "[1,2,5,9,3]" | asciigraph -ca "red,4" -cb "green,2"```

# SYNOPSIS

**asciigraph** [*options*]

# DESCRIPTION

**asciigraph** is a small command-line utility (from the Go **asciigraph** package) that renders lightweight ASCII line graphs in the terminal. It reads numeric data points from standard input, optionally split into multiple series, and prints a text plot with configurable size, caption, axis bounds, colors, legends, and realtime refresh for streaming data.

Install with **go install github.com/guptarohit/asciigraph/cmd/asciigraph@latest**, from release binaries, or via the published container image.

# PARAMETERS

**-w** *width*

> Graph width in columns.

**-h** *height*

> Graph height in text rows (0 for auto-scaling).

**-c** *caption*

> Caption text under the graph.

**-d** *delimiter*

> Delimiter for splitting data points in the input stream (default **,**).

**-sn** *n*

> Number of series (columns) in the input data (default 1).

**-sl** *legends*

> Comma-separated series legends.

**-sc** *colors*

> Comma-separated series colors.

**-r**

> Enable realtime graphing for streaming input.

**-f** *fps*

> Frames per second when realtime is enabled (default 24).

**-b** *buffer*

> Data points buffer size for realtime mode (default equals width).

**-lb** / **-ub** *value*

> Lower / upper bound for the vertical axis.

**-p** *precision*

> Precision of Y-axis labels (default 2).

**-o** *offset*

> Column offset for labels (default 3).

**-ca** / **-cb** *color,value*

> Color points above / below a threshold (for example **red,4**).

**-g** *palette*

> Gradient coloring (**spectrum** or comma-separated color stops).

**-ac** / **-lc** / **-cc** *color*

> Axis, label, and caption colors.

Run **asciigraph --help** for the complete option list of your build.

# CAVEATS

Requires a terminal that displays monospace ASCII/Unicode box-drawing characters well. Color options need a color-capable terminal. Realtime mode is for continuous streams; finite piped input is usually plotted once.

# SEE ALSO

[gnuplot](/man/gnuplot)(1), [termgraph](/man/termgraph)(1), [youplot](/man/youplot)(1)

# RESOURCES

```[Source code](https://github.com/guptarohit/asciigraph)```

<!-- verified: 2026-07-19 -->
