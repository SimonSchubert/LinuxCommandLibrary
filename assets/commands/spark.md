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

**spark** generates sparklines from numbers. It creates mini bar charts in the terminal.

Numbers convert to Unicode block characters. Higher values show taller bars.

Stdin support enables piping. Numbers can be comma or newline separated.

Visual data representation in text. Useful for quick trend visualization.

Output uses standard text. Works in any terminal.

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
