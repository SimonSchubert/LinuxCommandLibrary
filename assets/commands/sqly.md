# TAGLINE

Execute SQL against CSV, TSV, JSON, and Excel files

# TLDR

**Open an interactive SQL shell with a CSV file**

```sqly [user.csv]```

**Run a query directly**

```sqly --sql "[SELECT * FROM user WHERE age > 30]" [user.csv]```

**Output results as CSV**

```sqly --sql "[SELECT * FROM user LIMIT 2]" --csv [user.csv]```

# SYNOPSIS

**sqly** [**--sql** _query_] [**--csv**|**--tsv**] [_files_...]

# DESCRIPTION

**sqly** imports CSV, TSV, LTSV, JSON, and Excel files into an in-memory SQLite3 database, letting you run SQL queries against them. It supports both an interactive shell mode with SQL completion and command history, and direct one-shot query execution. Output can be formatted as ASCII table, CSV, TSV, or LTSV.

# HISTORY

**sqly** was created by **nao1215** and is written in **Go**.

# SEE ALSO

[csvq](/man/csvq)(1), [qsv](/man/qsv)(1), [miller](/man/miller)(1)
