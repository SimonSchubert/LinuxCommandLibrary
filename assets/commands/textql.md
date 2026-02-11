# TAGLINE

Execute SQL queries on CSV files

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

**textql** allows running SQL queries against structured text files such as CSV and TSV. It loads files into an in-memory SQLite database, treating each file as a table, and executes standard SQL queries against them.

When **-header** is specified, the first row is used for column names; otherwise columns are named c0, c1, etc. Multiple files can be loaded simultaneously and joined using SQL JOIN syntax. The **-save-to** option persists the imported data to a SQLite database file for further analysis. Custom delimiters are supported with the **-dlm** flag.

# CAVEATS

Memory for large files. SQLite limitations. Go-based tool.

# HISTORY

**textql** was created to execute SQL queries against structured text files like CSV using SQLite.

# SEE ALSO

[sqlite3](/man/sqlite3)(1), [csvq](/man/csvq)(1), [q](/man/q)(1), [miller](/man/miller)(1)
