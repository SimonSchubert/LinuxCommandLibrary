# TAGLINE

Interactive TUI for visualizing and analyzing Parquet and tabular files

# TLDR

**View a Parquet file**

```parqv [path/to/file.parquet]```

**View a CSV file**

```parqv [path/to/file.csv]```

**View a JSON file**

```parqv [path/to/file.json]```

# SYNOPSIS

**parqv** [_options_] _file_

# DESCRIPTION

**parqv** is an interactive Python TUI for visualizing and analyzing files in multiple formats including Parquet, JSON, NDJSON, CSV, and TSV. It provides a metadata panel with file information, an interactive schema view showing column names, data types, and nullability, a scrollable data preview, per-column statistics, and Parquet-specific row group details.

# CAVEATS

Requires Python 3.10 or higher.

# HISTORY

**parqv** was created by **sanspareilsmyn** and is written in **Python**.

# SEE ALSO

[parqeye](/man/parqeye)(1), [csvlens](/man/csvlens)(1), [visidata](/man/visidata)(1)
