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

**trdsql** queries structured files. It uses SQL syntax.

Multiple formats. CSV, JSON, LTSV.

SQL queries. Full SQL support.

Join support. Combine files.

Various databases. SQLite, PostgreSQL, MySQL.

# CAVEATS

Go-based tool. Large files in memory. SQL knowledge needed.

# HISTORY

**trdsql** was created to execute SQL queries against various structured data formats like CSV and JSON.

# SEE ALSO

[textql](/man/textql)(1), [q](/man/q)(1), [miller](/man/miller)(1)
