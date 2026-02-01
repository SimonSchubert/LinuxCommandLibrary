# TLDR

**Read and display CSV file**

```polars read [file.csv]```

**Query with SQL**

```polars sql "SELECT * FROM '[file.csv]' WHERE value > 100"```

**Convert CSV to Parquet**

```polars convert [input.csv] [output.parquet]```

**Show schema of file**

```polars schema [file.parquet]```

**Filter and output as JSON**

```polars sql "SELECT name, score FROM '[data.csv]' ORDER BY score DESC LIMIT 10" -o json```

**Join two files**

```polars sql "SELECT * FROM '[a.csv]' JOIN '[b.csv]' ON a.id = b.id"```

# SYNOPSIS

**polars** _command_ [_options_] [_args_...]

# COMMANDS

**read** _file_
> Read and display data file.

**sql** _query_
> Execute SQL query on file(s).

**schema** _file_
> Display schema/column information.

**convert** _input_ _output_
> Convert between formats (CSV, Parquet, JSON, Arrow).

# PARAMETERS

**-o**, **--output** _format_
> Output format: csv, json, parquet, table.

**--delimiter** _char_
> CSV delimiter character.

**--no-header**
> CSV has no header row.

**-n**, **--limit** _rows_
> Limit output rows.

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version information.

# DESCRIPTION

**polars** is the command-line interface for Polars, a fast DataFrame library. It provides SQL querying and format conversion for data files without writing code.

The **sql** command executes SQL queries directly on files. Reference files as table names in quotes within the query. Polars' query engine optimizes execution for large datasets.

Supported formats include CSV, Parquet, JSON, and Arrow. The **convert** command transforms between formats, useful for creating optimized Parquet files from CSV sources.

Polars uses Apache Arrow columnar format internally, enabling efficient processing of large datasets with minimal memory overhead. Query optimization includes predicate pushdown and projection.

# CAVEATS

The CLI provides a subset of Polars library features. Complex transformations may require the Python or Rust API. Very large files benefit from Parquet format. SQL dialect has some differences from standard SQL.

# HISTORY

Polars was created by **Ritchie Vink** in **2020** as a fast alternative to pandas. Written in Rust with Python bindings, it quickly gained popularity for performance-critical data processing. The DataFrame library leverages Apache Arrow and lazy evaluation. The CLI tool was added to enable command-line data workflows. Polars has become a leading choice for large-scale data analysis.

# SEE ALSO

[duckdb](/man/duckdb)(1), [datafusion-cli](/man/datafusion-cli)(1), [xsv](/man/xsv)(1), [miller](/man/miller)(1)
