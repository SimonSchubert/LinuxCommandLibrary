# TAGLINE

embedded analytical database engine

# TLDR

**Start an interactive SQL shell**

```duckdb```

**Open or create a database file**

```duckdb [path/to/database.db]```

**Execute a SQL query**

```duckdb -c "[SELECT * FROM table_name]"```

**Query a CSV file directly**

```duckdb -c "[SELECT * FROM 'data.csv']"```

**Query a Parquet file**

```duckdb -c "[SELECT * FROM 'data.parquet']"```

**Execute SQL from a file**

```duckdb < [path/to/script.sql]```

**Export query results to CSV**

```duckdb -c "[COPY (SELECT * FROM table) TO 'output.csv' (HEADER)]"```

**Start in read-only mode**

```duckdb -readonly [database.db]```

# SYNOPSIS

**duckdb** [_options_] [_database_file_] [_sql_commands_]

# PARAMETERS

**-c**, **-cmd** _command_
> Execute the specified SQL command and exit.

**-init** _file_
> Execute SQL commands from file before starting shell.

**-readonly**
> Open database in read-only mode.

**-no-stdin**
> Don't read from stdin.

**-json**
> Output results in JSON format.

**-csv**
> Output results in CSV format.

**-table**
> Output results as ASCII table (default).

**-box**
> Output results with box-drawing characters.

**-markdown**
> Output results as Markdown table.

**-line**
> Output results in line mode (one value per line).

**-separator** _char_
> Set field separator for CSV mode.

**-header**
> Include column headers in output.

**-noheader**
> Exclude column headers from output.

**-unsigned**
> Allow loading of unsigned extensions.

**-version**
> Print version and exit.

# CONFIGURATION

**~/.duckdbrc**
> Initialization file with SQL commands executed on shell startup, used for setting preferences and defaults.

# DESCRIPTION

**DuckDB** is an embedded analytical database designed for fast online analytical processing (OLAP) workloads. It can run entirely in-process without a separate server, making it ideal for data analysis and scripting.

A key feature is the ability to query files directly without importing: CSV, Parquet, JSON, and other formats can be used in SQL queries with automatic type detection. This makes DuckDB excellent for exploratory data analysis and ETL tasks.

The database supports standard SQL with analytical extensions including window functions, CTEs, and complex aggregations. It provides high performance through vectorized execution and columnar storage, optimized for aggregation queries over large datasets.

In interactive mode, DuckDB provides a full-featured SQL shell with tab completion, command history, and dot-commands for settings. Results can be output in various formats including tables, JSON, CSV, and Markdown.

DuckDB can be used as a library in Python, R, Java, Node.js, and other languages, or standalone via the CLI. Database files are portable across platforms and versions.

# CAVEATS

In-memory databases are lost when the process exits. Write operations lock the database file, limiting concurrent write access. Very large datasets may exceed available memory without proper configuration. Some SQL syntax differs slightly from other databases.

# HISTORY

**DuckDB** was created by Mark Raasveldt and Hannes Mühleisen at CWI Amsterdam (the research institute where PostgreSQL originated). Development started around **2018** with the goal of creating an embeddable analytical database akin to "SQLite for analytics." The project gained significant adoption in the data science community starting in **2020**.

# SEE ALSO

[sqlite3](/man/sqlite3)(1), [psql](/man/psql)(1), [clickhouse-client](/man/clickhouse-client)(1), [csvq](/man/csvq)(1)
