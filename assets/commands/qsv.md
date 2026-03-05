# TAGLINE

Blazing-fast data-wrangling toolkit for CSV and tabular data

# TLDR

**Count rows in a CSV file**

```qsv count [data.csv]```

**Search for a pattern**

```qsv search '[pattern]' [data.csv]```

**Select specific columns**

```qsv select [col1,col2] [data.csv]```

**Run SQL queries on a CSV file**

```qsv sqlp "SELECT * FROM data WHERE value > 100" [data.csv]```

**Get summary statistics**

```qsv stats [data.csv]```

# SYNOPSIS

**qsv** _command_ [_options_] [_file_]

# DESCRIPTION

**qsv** is a comprehensive command-line toolkit for querying, transforming, validating, and analyzing CSV and tabular data. It provides over 50 commands including sort, join, dedup, frequency, stats, search, validate, and an embedded Luau scripting DSL. It supports CSV, JSON, JSONL, Parquet, Arrow, Avro, and Excel formats with streaming, multithreaded processing for arbitrarily large files.

# HISTORY

**qsv** was created by **jqnatividad** (dathere) and is written in **Rust**.

# SEE ALSO

[csvlens](/man/csvlens)(1), [xsv](/man/xsv)(1), [miller](/man/miller)(1), [cut](/man/cut)(1)
