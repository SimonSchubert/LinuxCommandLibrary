# TAGLINE

generate sparkline graphs from numbers in the terminal

# TLDR

**Generate a sparkline from numbers**

```spark [1] [5] [22] [13] [53]```

**Generate a sparkline from comma-separated input via stdin**

```echo "[1,2,3,4,5]" | spark```

**Generate a sparkline from a file**

```spark < [data.txt]```

**Visualize random data from a sequence**

```seq [100] | sort -R | head -20 | spark```

**Display help**

```spark -h```

# SYNOPSIS

**spark** [**-h**] [_numbers_...]

# DESCRIPTION

**spark** generates sparkline graphs from a list of numbers, rendering them as Unicode block characters (▁▂▃▄▅▆▇█) in the terminal. Values are mapped proportionally across eight height levels, with the minimum value getting the shortest bar and the maximum the tallest.

Numbers can be provided as command-line arguments, piped via stdin, or read from a file. Input supports comma-separated, space-separated, and newline-separated formats, making it easy to integrate with other Unix tools through pipes.

The output is plain text using standard Unicode characters, so it works in any terminal that supports Unicode. Sparklines are useful for visualizing trends in data at a glance without requiring a full graphing tool.

# CAVEATS

Terminal must support Unicode. Limited resolution (8 levels). No axes or labels. Written as a bash shell script with no dependencies beyond bash.

# HISTORY

**spark** was created by **Zach Holman** as a simple bash script for command-line data visualization. The concept inspired many alternative implementations in Ruby, Python, Haskell, Java, and other languages.

# SEE ALSO

[gnuplot](/man/gnuplot)(1), [termgraph](/man/termgraph)(1)
