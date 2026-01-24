# TLDR

**Import JSON into SQLite**

```sqlite-utils insert [database.db] [table] [data.json]```

**Import CSV into SQLite**

```sqlite-utils insert [database.db] [table] [data.csv] --csv```

**Query with SQL**

```sqlite-utils [database.db] "[SELECT * FROM table]"```

**Query and output as JSON**

```sqlite-utils [database.db] "[SELECT * FROM table]" --json```

**List tables**

```sqlite-utils tables [database.db]```

**Show schema**

```sqlite-utils schema [database.db]```

**Create FTS search index**

```sqlite-utils enable-fts [database.db] [table] [column1] [column2]```

**Export table to JSON**

```sqlite-utils rows [database.db] [table] > [data.json]```

# SYNOPSIS

**sqlite-utils** _command_ [_database_] [_options_] [_arguments_]

# PARAMETERS

**insert** _DB_ _TABLE_ [_FILE_]
> Insert data from JSON, CSV, or stdin.

**rows** _DB_ _TABLE_
> Output rows as JSON.

**tables** _DB_
> List tables.

**schema** _DB_
> Show database schema.

**query** _DB_ _SQL_
> Run SQL query.

**memory** _SQL_
> Run against in-memory database.

**enable-fts** _DB_ _TABLE_ _COLUMNS_
> Enable full-text search.

**search** _DB_ _TABLE_ _QUERY_
> Full-text search.

**create-table** _DB_ _TABLE_ _COLUMNS_
> Create table with columns.

**drop-table** _DB_ _TABLE_
> Drop table.

**add-column** _DB_ _TABLE_ _COL_ [_TYPE_]
> Add column to table.

**indexes** _DB_ [_TABLE_]
> List indexes.

**--csv**
> Input is CSV.

**--tsv**
> Input is TSV.

**--nl**
> Input is newline-delimited JSON.

**--pk** _COLUMN_
> Primary key column.

**--json**
> Output as JSON.

**--table**
> Output as table.

**-c**, **--csv**
> Output as CSV.

# DESCRIPTION

**sqlite-utils** provides a CLI and Python library for working with SQLite databases. It simplifies common tasks: importing data, running queries, and managing schema.

Data import handles JSON, CSV, TSV, and newline-delimited JSON. Types are inferred automatically. Primary keys and foreign keys can be specified. Existing tables are updated or replaced as configured.

Querying supports SQL with multiple output formats. The memory subcommand runs queries against in-memory databases, useful for quick data processing without persistent files.

Full-text search (FTS) enables fast text searching. Enable-fts creates virtual tables for specified columns. Search queries use SQLite's FTS5 syntax for relevance ranking.

Table management includes creation, alteration, and inspection. Schema command shows CREATE statements. Columns can be added without recreating tables.

The tool integrates well with Unix pipelines. Data flows in from curl or other tools, gets processed, and outputs to further commands.

# CAVEATS

Large inserts may need --batch-size adjustment. FTS increases database size. Type inference may not always be correct. Some features require SQLite version 3.25+. Memory usage grows with large datasets.

# HISTORY

**sqlite-utils** was created by **Simon Willison** around **2019** as part of the Datasette ecosystem. It provides command-line access to SQLite manipulation that previously required Python scripting or separate tools. The library is also usable from Python for programmatic database work.

# SEE ALSO

[sqlite3](/man/sqlite3)(1), [datasette](/man/datasette)(1), [csvkit](/man/csvkit)(1), [jq](/man/jq)(1)
