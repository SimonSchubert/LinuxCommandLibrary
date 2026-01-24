# TLDR

**Query CSV**

```textql -sql "[SELECT * FROM file]" [data.csv]```

**With header**

```textql -header -sql "[SELECT name FROM file]" [data.csv]```

**Custom delimiter**

```textql -dlm=";" -sql "[query]" [data.csv]```

**Save to SQLite**

```textql -save-to [output.db] [data.csv]```

**Output to file**

```textql -output-file [result.csv] -sql "[query]" [data.csv]```

# SYNOPSIS

**textql** [_-sql query_] [_-header_] [_-dlm delim_] [_options_] _files_

# PARAMETERS

**-sql** _QUERY_
> SQL query.

**-header**
> First row is header.

**-dlm** _CHAR_
> Field delimiter.

**-save-to** _FILE_
> Save to SQLite.

**-output-file** _FILE_
> Output file.

**-output-dlm** _CHAR_
> Output delimiter.

# DESCRIPTION

**textql** queries text files with SQL. It treats files as tables.

SQL against CSV. Familiar query syntax.

Header support. Column names.

SQLite backend. Full SQL support.

Multiple files. Join tables.

# CAVEATS

Memory for large files. SQLite limitations. Go-based tool.

# HISTORY

**textql** was created to execute SQL queries against structured text files like CSV using SQLite.

# SEE ALSO

[sqlite3](/man/sqlite3)(1), [csvq](/man/csvq)(1), [q](/man/q)(1), [miller](/man/miller)(1)
