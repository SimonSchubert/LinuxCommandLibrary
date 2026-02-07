# TAGLINE

SQL query engine for CSV files

# TLDR

**Query a CSV file with SQL**

```csvq "SELECT * FROM [data.csv]"```

**Filter rows with WHERE**

```csvq "SELECT * FROM [data.csv] WHERE [column] = '[value]'"```

**Aggregate data**

```csvq "SELECT [category], COUNT(*) FROM [data.csv] GROUP BY [category]"```

**Join multiple CSV files**

```csvq "SELECT * FROM [a.csv] JOIN [b.csv] ON [a.id] = [b.id]"```

**Sort results**

```csvq "SELECT * FROM [data.csv] ORDER BY [column] DESC"```

**Output as JSON**

```csvq -f json "SELECT * FROM [data.csv]"```

**Start interactive mode**

```csvq```

# SYNOPSIS

**csvq** [_options_] [_query_]

# PARAMETERS

**-f**, **--format** _format_
> Output format: csv, tsv, json, text, fixed, ltsv, box.

**-d**, **--delimiter** _char_
> Field delimiter character.

**-o**, **--out** _file_
> Output to file instead of stdout.

**-e**, **--encoding** _encoding_
> Input file encoding.

**-w**, **--without-header**
> CSV has no header row.

**-n**, **--line-break** _type_
> Line break type: crlf, cr, lf.

**--write-encoding** _encoding_
> Output file encoding.

**-q**, **--quiet**
> Suppress output except results.

# DESCRIPTION

**csvq** is a command-line tool that enables SQL queries against CSV files. It treats CSV files as database tables, supporting SELECT, INSERT, UPDATE, DELETE, and complex queries with JOINs, subqueries, and aggregate functions.

Column names come from the CSV header row (or can be specified for headerless files). Standard SQL syntax is supported including WHERE, GROUP BY, HAVING, ORDER BY, LIMIT, UNION, and window functions.

Multiple CSV files can be queried together with JOINs. Results can be output in various formats including CSV, JSON, and formatted tables, making it useful for data transformation pipelines.

# SQL FEATURES

**Aggregates**: COUNT, SUM, AVG, MIN, MAX
**String**: CONCAT, SUBSTR, UPPER, LOWER, TRIM
**Date**: NOW, DATETIME, DATE_FORMAT
**Conditionals**: CASE, IF, COALESCE, NULLIF
**Window functions**: ROW_NUMBER, RANK, LAG, LEAD

# CAVEATS

Large CSV files are loaded into memory. Complex queries on big files may be slow compared to proper databases. Column names with spaces or special characters require quoting. The tool is single-threaded.

# HISTORY

csvq was created by **Mithrandie** and released as an open-source project written in Go. It was designed to bring the familiarity of SQL to ad-hoc CSV data analysis, filling a gap between simple command-line tools like awk and full database imports. The project continues to be maintained with regular updates adding SQL features.

# SEE ALSO

[q](/man/q)(1), [textql](/man/textql)(1), [sqlite3](/man/sqlite3)(1), [miller](/man/miller)(1)
