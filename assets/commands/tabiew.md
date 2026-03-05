# TAGLINE

Lightweight TUI for viewing and querying tabular data

# TLDR

**Open a CSV file in the viewer**

```tw [data.csv]```

**Open with a custom delimiter**

```tw [data.csv] --separator '|'```

**Pipe data from stdin**

```curl -s "[https://example.com/data.csv]" | tw```

# SYNOPSIS

**tw** [_options_] _file_...

# DESCRIPTION

**tabiew** is a terminal application for viewing and querying tabular data files including CSV, TSV, Parquet, JSON, JSONL, Arrow, SQLite, Excel, and Logfmt. It features SQL query capabilities, Vim-style navigation, fuzzy search, and automatic file format detection.

# HISTORY

**tabiew** was created by **shshemi** and is written in **Rust**.

# SEE ALSO

[csvlens](/man/csvlens)(1), [xsv](/man/xsv)(1), [visidata](/man/visidata)(1)
