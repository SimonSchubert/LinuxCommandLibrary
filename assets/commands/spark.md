# TAGLINE

Generate sparkline graphs from numbers

# TLDR

**Generate sparkline**

```spark [1] [5] [22] [13] [53]```

**From stdin**

```echo "[1,2,3,4,5]" | spark```

**From file**

```spark < [data.txt]```

**With sequence**

```seq [100] | sort -R | head -20 | spark```

# SYNOPSIS

**spark** [_numbers_...]

# DESCRIPTION

**spark** generates sparkline graphs from a list of numbers, rendering them as Unicode block characters (▁▂▃▄▅▆▇█) in the terminal. Values are mapped proportionally across eight height levels, with the minimum value getting the shortest bar and the maximum the tallest.

Numbers can be provided as command-line arguments, piped via stdin, or read from a file. Input supports comma-separated, space-separated, and newline-separated formats, making it easy to integrate with other Unix tools through pipes.

The output is plain text using standard Unicode characters, so it works in any terminal that supports Unicode. Sparklines are useful for visualizing trends in data at a glance without requiring a full graphing tool.

# CHARACTERS

The sparkline uses these Unicode blocks:
▁ ▂ ▃ ▄ ▅ ▆ ▇ █

# EXAMPLES

```
$ spark 1 5 22 13 53
▁▁▃▂█

$ echo "1 2 3 4 5 6 7" | spark
▁▂▃▄▅▆█
```

# CAVEATS

Terminal must support Unicode. Limited resolution (8 levels). No axes or labels.

# HISTORY

**spark** was created by **Zach Holman** for simple command-line data visualization. It's become a popular way to add sparklines to terminal workflows.

# SEE ALSO

[gnuplot](/man/gnuplot)(1), [termgraph](/man/termgraph)(1)
