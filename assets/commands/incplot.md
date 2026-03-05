# TAGLINE

CLI tool for drawing plots in the terminal using Unicode

# TLDR

**Plot data from stdin**

```echo "1 2 3 4 5" | incplot```

**Plot from a CSV file**

```cat [data.csv] | incplot```

**Plot with a specific chart type**

```cat [data.csv] | incplot --chart [bar]```

# SYNOPSIS

**incplot** [_options_]

# DESCRIPTION

**incplot** is a command-line tool for drawing attractive plots in the terminal using **Unicode characters**. It automatically infers what to display and how based on the data piped in, with smart features like automatic color scheme detection from the terminal, automatic filtering of extreme values, automatic sizing, and value labels with metric prefix scaling.

The tool is designed for user ergonomics and simplicity — pipe data in and get a readable chart with minimal configuration.

# CAVEATS

Requires a terminal with Unicode support for proper rendering. Output quality depends on terminal font and character support. Designed for quick visualization rather than publication-quality charts.

# HISTORY

**incplot** was created by **InCom-0** and is written in **C++**. It was designed as a quick visualization tool that prioritizes ergonomics and automatic formatting over manual configuration.

# SEE ALSO

[gnuplot](/man/gnuplot)(1), [youplot](/man/youplot)(1)
