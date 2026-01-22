# TLDR

**Execute SQL query** on a CSV file

```csvsql --query "[SELECT * FROM data WHERE id > 10]" [data.csv]```

**Generate CREATE TABLE** statement for a CSV

```csvsql [data.csv]```

**Import CSV into database**

```csvsql --db [postgresql:///mydb] --insert [data.csv]```

**Query multiple files** (tables named after filenames)

```csvsql --query "[SELECT * FROM file1 JOIN file2 ON file1.id = file2.id]" [file1.csv] [file2.csv]```

**Create table and insert** data into SQLite

```csvsql --db [sqlite:///data.db] --insert --create-if-not-exists [data.csv]```

**Query with aggregation**

```csvsql --query "[SELECT category, COUNT(*) FROM data GROUP BY category]" [data.csv]```

# SYNOPSIS

**csvsql** [_options_] _file_...

# PARAMETERS

**--query** _SQL_
> Execute SQL query on the CSV data.

**--db** _CONNECTION_
> Database connection string (SQLAlchemy format).

**--insert**
> Insert data into database (requires --db).

**--create-if-not-exists**
> Create table if it doesn't exist.

**--tables** _NAMES_
> Comma-separated table names (default: filenames).

**--no-create**
> Don't generate CREATE TABLE statement.

**-d** _CHAR_, **--delimiter** _CHAR_
> Field delimiter (default: comma).

**-e** _ENCODING_, **--encoding** _ENCODING_
> Input file encoding.

**--no-inference**
> Disable type inference.

# DESCRIPTION

**csvsql** is part of csvkit that enables SQL queries on CSV files or imports CSV data into databases. It creates an in-memory SQLite database for queries or connects to external databases for import operations.

Without **--query**, it outputs CREATE TABLE statements suitable for the data, useful for generating schema. With **--query**, it executes SQL against the CSV data, supporting joins, aggregations, and all SQL operations.

For database import, csvsql supports various databases through SQLAlchemy connection strings, including PostgreSQL, MySQL, SQLite, and others. It handles type inference to create appropriate column definitions.

# CAVEATS

In-memory queries load all data into RAM. Complex queries on large files may be slow. Type inference can misidentify columns. Database imports require appropriate drivers installed.

# HISTORY

csvsql is part of **csvkit**, created by Christopher Groskopf in **2011**. It bridges the gap between CSV files and databases, enabling SQL-powered data analysis without manual database setup.

# SEE ALSO

[csvkit](/man/csvkit)(1), [sqlite3](/man/sqlite3)(1), [sql2csv](/man/sql2csv)(1)
