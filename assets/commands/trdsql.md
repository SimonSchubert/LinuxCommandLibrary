# TAGLINE

SQL queries on structured data files

# TLDR

**Query CSV**

```trdsql "SELECT * FROM [file.csv]"```

**Query JSON**

```trdsql -ijson "SELECT * FROM [file.json]"```

**Output as JSON**

```trdsql -ojson "SELECT * FROM [file.csv]"```

**With header**

```trdsql -ih "SELECT name FROM [file.csv]"```

**Join files**

```trdsql "SELECT * FROM [a.csv] JOIN [b.csv] ON [a.id]=[b.id]"```

**Query LTSV**

```trdsql -iltsv "SELECT * FROM [file.ltsv]"```

# SYNOPSIS

**trdsql** [_-i format_] [_-o format_] [_options_] _query_

# PARAMETERS

**-i** _FORMAT_
> Input format (csv, json, ltsv).

**-o** _FORMAT_
> Output format.

**-ih**
> Input has header.

**-oh**
> Output header.

**-d** _DELIM_
> Delimiter.

# DESCRIPTION

**trdsql** executes SQL queries directly against structured data files such as CSV, JSON, and LTSV without importing them into a database first. File names are used as table names in SQL statements, making it straightforward to filter, aggregate, and transform data using familiar SQL syntax.

The tool supports joining data across multiple files, enabling relational queries between different data sources in a single command. Input and output formats can be specified independently, allowing conversion between formats as a side effect of querying.

Under the hood, trdsql uses SQLite as the default query engine but can also connect to PostgreSQL and MySQL for more advanced SQL features. Headers in CSV files can be used as column names with the **-ih** flag.

# CAVEATS

Go-based tool. Large files in memory. SQL knowledge needed.

# HISTORY

**trdsql** was created to execute SQL queries against various structured data formats like CSV and JSON.

# SEE ALSO

[textql](/man/textql)(1), [q](/man/q)(1), [miller](/man/miller)(1)
