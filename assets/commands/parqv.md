# TAGLINE

Interactive TUI for visualizing and analyzing Parquet and tabular files

# TLDR

**View a Parquet file**

```parqv [path/to/file.parquet]```

**View a CSV file**

```parqv [path/to/file.csv]```

**View a JSON or NDJSON file**

```parqv [path/to/file.json]```

**View a TSV file**

```parqv [path/to/file.tsv]```

# SYNOPSIS

**parqv** _file_

# DESCRIPTION

**parqv** is an interactive Python TUI for visualizing and analyzing files in multiple formats including Parquet, JSON, NDJSON, CSV, and TSV. It provides a metadata panel with file information (path, format, size, total rows, column count), an interactive schema view showing column names, data types, and nullability, a scrollable data preview that preserves data types, per-column statistics (counts, min/max, mean, stddev, distinct counts), and Parquet-specific row group details.

Navigate with the arrow keys or **j**/**k**, press **Enter** on a column to view its statistics, switch tabs with **Ctrl+N** and **Ctrl+P**, and quit with **q** or **Ctrl+C**. Mouse input also works in supported terminals.

# CAVEATS

Requires Python 3.10 or higher. Takes a single file path and has no command-line options.

# HISTORY

**parqv** was created by **sanspareilsmyn**, is written in **Python** and built on the Textual TUI framework.

# SEE ALSO

[parqeye](/man/parqeye)(1), [csvlens](/man/csvlens)(1), [visidata](/man/visidata)(1)

# RESOURCES

```[Source code](https://github.com/sanspareilsmyn/parqv)```

<!-- verified: 2026-11-09 -->
