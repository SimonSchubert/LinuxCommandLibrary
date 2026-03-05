# TAGLINE

CSV magician for terminal data manipulation

# TLDR

**Preview a CSV file in the terminal**

```xan view [data.csv]```

**Search for records in a column**

```xan search -s [name] "[pattern]" [data.csv]```

**Plot a bar chart from frequency data**

```xan frequency -s [column] [data.csv] | xan plot bar```

# SYNOPSIS

**xan** _command_ [_options_] [_input_]

# DESCRIPTION

**xan** is a powerful CSV processor forked from xsv that reads, manipulates, and visualizes CSV data directly in the terminal. It supports filtering, sorting, aggregating, deduplication, parallel processing, and can render scatter plots, histograms, and heatmaps. Handles gigabyte-scale files.

# HISTORY

**xan** was created by **Guillaume Plique** and **medialab Sciences Po** and is written in **Rust**.

# SEE ALSO

[xsv](/man/xsv)(1), [csvkit](/man/csvkit)(1), [miller](/man/miller)(1)
