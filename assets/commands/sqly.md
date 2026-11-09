# TAGLINE

Execute SQL against CSV, TSV, JSON, Parquet, and Excel files

# TLDR

**Open an interactive SQL shell with a CSV file**

```sqly [user.csv]```

**Run a query directly**

```sqly --sql "[SELECT * FROM user WHERE age > 30]" [user.csv]```

**Output results as CSV**

```sqly --sql "[SELECT * FROM user LIMIT 2]" --output-format csv [user.csv]```

**Join files** of different formats

```sqly --sql "[SELECT u.name, o.total FROM user u JOIN orders o ON u.id = o.user_id]" [user.csv] [orders.parquet]```

**Convert a file** to another format

```sqly --output [user.json] --sql "[SELECT * FROM user]" [user.csv]```

**Inspect** tables, columns and row counts as JSON

```sqly --inspect [user.csv]```

**Query data from stdin**

```cat [user.csv] | sqly --stdin-format csv --sql "[SELECT COUNT(*) FROM stdin]"```

**Load every file** in a directory

```sqly [path/to/directory] --sql "[SELECT * FROM users]"```

**Write the query in another SQL dialect**

```sqly --dialect [postgresql] --sql "[SELECT id::text FROM users]" [users.csv]```

# SYNOPSIS

**sqly** [_options_] [_files_...]

# PARAMETERS

**-s**, **--sql** _SQL_
> Run one statement, then exit.

**-f**, **--sql-file** _FILE_
> Run every SQL statement in a file, then exit.

**--script-file** _FILE_
> Run a file of SQL and dot-commands, then exit.

**-o**, **--output** _FILE_
> Write the query result to a file instead of stdout. The extension picks the format.

**--output-format** _FORMAT_
> Output format: table (default), vertical, csv, tsv, ltsv, json, jsonl, markdown, excel, or parquet. Excel and Parquet require **--output** or **.dump**.

**--stdin-format** _FORMAT_
> Read stdin as a dataset: csv, tsv, ltsv, json, or jsonl.

**--stdin-table** _NAME_
> Table name for the stdin dataset (default: stdin).

**--inspect**
> Print schema, row counts and source metadata as JSON, then exit.

**--inspect-sample** _N_
> Include up to N sample rows per table with **--inspect** (default: 0).

**--dialect** _NAME_
> Write the query in sqlite (default), mysql, postgresql, or googlesql and translate it.

**--encoding** _ENCODING_
> Decode text inputs without a BOM using this encoding (default: utf-8).

**--row-mismatch** _POLICY_
> Handle CSV/TSV rows with the wrong field count: error, skip, or pad.

**--include-hidden-sheets**
> Also import hidden Excel sheets.

**--allow-remote**
> Allow downloading http(s) inputs, which are refused by default.

**-h**, **--help**
> Print the option list and exit.

**-v**, **--version**
> Print the version and exit.

# DESCRIPTION

**sqly** imports CSV, TSV, LTSV, JSON, JSONL, Parquet, Excel, ACH, and Fedwire files into an in-memory SQLite3 database, letting you run SQL queries against them. Compressed inputs such as **.gz**, **.bz2**, **.xz** and **.zst** are read transparently. Each file becomes a table named after it, and JSON files become one table with a **data** column queried through **json_extract()**.

It supports both an interactive shell mode with SQL completion and command history, and direct one-shot query execution. Inside the shell, dot-commands such as **.import**, **.mode**, **.edit** and **.help** cover everything SQL has no syntax for, and **.save** writes changed tables back out.

# CAVEATS

A session is in-memory only, so changes are lost unless written with **.save**. Each statement runs in its own transaction, so **BEGIN**, **COMMIT**, **ROLLBACK**, **VACUUM** and **ATTACH** are rejected. The older **--csv** and **--tsv** style output flags do not exist in current versions: use **--output-format**.

# HISTORY

**sqly** was created by **nao1215** and is written in **Go**.

# SEE ALSO

[csvq](/man/csvq)(1), [qsv](/man/qsv)(1), [miller](/man/miller)(1), [trdsql](/man/trdsql)(1), [sqlite3](/man/sqlite3)(1)

# RESOURCES

```[Source code](https://github.com/nao1215/sqly)```

```[Documentation](https://nao1215.github.io/sqly/)```

<!-- verified: 2026-11-09 -->
