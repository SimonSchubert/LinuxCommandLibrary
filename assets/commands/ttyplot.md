# TLDR

**Plot** values from stdin

```echo "1 2 3" | ttyplot```

Set **title and unit**

```echo "1 2 3" | ttyplot -t "Title" -u "ms"```

**Continuously** plot random values

```while true; do echo $RANDOM; sleep 1; done | ttyplot```

**Plot ping** latency

```ping 8.8.8.8 | sed -u 's/^.*time=//g; s/ ms//g' | ttyplot -t "Ping" -u ms```

Plot with **two values** (dual plot)

```command | ttyplot -2```

# SYNOPSIS

**ttyplot** [_options_]

# DESCRIPTION

**ttyplot** is a real-time terminal plotting utility that reads numeric values from stdin and displays them as a scrolling graph in the terminal. It is useful for visualizing streaming data like network latency, CPU usage, or sensor readings.

# PARAMETERS

**-t TITLE**
> Set the plot title

**-u UNIT**
> Set the unit label for values

**-s SCALE**
> Set the vertical scale (max value)

**-m MIN**
> Set the minimum value

**-2**
> Enable dual/two value plotting mode

**-c COLOR**
> Set the plot color

**-e**
> Exit when stdin closes

**-r**
> Rate mode (values per second)

# CAVEATS

Input must be numeric values, one per line. Use sed or awk to extract numeric values from command output. The plot resizes automatically with terminal size changes.

# HISTORY

**ttyplot** was created as a simple way to visualize streaming numeric data directly in the terminal without requiring a graphical environment.

# SEE ALSO

[gnuplot](/man/gnuplot)(1), [termgraph](/man/termgraph)(1)
