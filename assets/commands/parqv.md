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

**parqv** [_options_] _file_

# DESCRIPTION

**parqv** is an interactive Python TUI for visualizing and analyzing files in multiple formats including Parquet, JSON, NDJSON, CSV, and TSV. It provides a metadata panel with file information (path, format, size, total rows, column count), an interactive schema view showing column names, data types, and nullability, a scrollable data preview that preserves data types, per-column statistics (counts, min/max, mean, stddev, distinct counts), and Parquet-specific row group details.

# CAVEATS

Requires Python 3.10 or higher.

# HISTORY

**parqv** was created by **sanspareilsmyn** and is written in **Python**.

# SEE ALSO

[parqeye](/man/parqeye)(1), [csvlens](/man/csvlens)(1), [visidata](/man/visidata)(1)
