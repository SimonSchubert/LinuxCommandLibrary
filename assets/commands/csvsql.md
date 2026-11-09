# TAGLINE

SQL query executor and database importer for CSV

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

**Generate a CREATE TABLE** for a specific SQL dialect

```csvsql -i [postgresql] [data.csv]```

**Replace an existing table**

```csvsql --db [sqlite:///data.db] --insert --overwrite [data.csv]```

**Query with aggregation**

```csvsql --query "[SELECT category, COUNT(*) FROM data GROUP BY category]" [data.csv]```

# SYNOPSIS

**csvsql** [_options_] _file_...

# PARAMETERS

**--query** _SQL_
> Execute one or more SQL queries delimited by **--sql-delimiter** and output the result of the last query as CSV. May be a filename, and may be given multiple times.

**--db** _CONNECTION_
> Database connection string (SQLAlchemy format).

**--insert**
> Insert data into database (requires --db).

**--create-if-not-exists**
> Create the table if it does not exist, otherwise keep going. Requires **--insert**.

**--overwrite**
> Drop the table if it already exists. Requires **--insert**. Cannot be used with **--no-create**.

**-i** _DIALECT_, **--dialect** _DIALECT_
> Dialect of SQL to generate (mssql, mysql, oracle, postgresql, sqlite, duckdb, crate, ingres). Cannot be used with **--db**.

**--prefix** _EXPR_
> Add an expression following the INSERT keyword, like OR IGNORE or OR REPLACE.

**--before-insert** _SQL_, **--after-insert** _SQL_
> Execute SQL queries before or after the INSERT. Requires **--insert**.

**--no-constraints**
> Generate a schema without length limits or null checks.

**--unique-constraint** _COLUMNS_
> Column names to include in a UNIQUE constraint.

**--db-schema** _SCHEMA_
> Name of the database schema to create tables in.

**--chunk-size** _N_
> Chunk size for batch insert. Requires **--insert**.

**--tables** _NAMES_
> Comma-separated table names (default: filenames without extensions, or "stdin").

**--no-create**
> Skip creating the table. Requires **--insert**.

**-d** _CHAR_, **--delimiter** _CHAR_
> Delimiting character of the input CSV file.

**-e** _ENCODING_, **--encoding** _ENCODING_
> Input file encoding.

**-I**, **--no-inference**
> Disable type inference when parsing the input.

# DESCRIPTION

**csvsql** is part of csvkit that enables SQL queries on CSV files or imports CSV data into databases. It creates an in-memory SQLite database for queries or connects to external databases for import operations.

Without **--query**, it outputs CREATE TABLE statements suitable for the data, useful for generating schema. With **--query**, it executes SQL against the CSV data, supporting joins, aggregations, and all SQL operations.

For database import, csvsql supports various databases through SQLAlchemy connection strings, including PostgreSQL, MySQL, SQLite, and others. It handles type inference to create appropriate column definitions.

# CAVEATS

In-memory queries load all data into RAM. Complex queries on large files may be slow. Type inference can misidentify columns. Database imports require appropriate drivers installed.

# HISTORY

csvsql is part of **csvkit**, created by Christopher Groskopf in **2011**. It bridges the gap between CSV files and databases, enabling SQL-powered data analysis without manual database setup.

# SEE ALSO

[csvkit](/man/csvkit)(1), [csvlook](/man/csvlook)(1), [csvstack](/man/csvstack)(1), [in2csv](/man/in2csv)(1), [sqlite3](/man/sqlite3)(1)

# RESOURCES

```[Source code](https://github.com/wireservice/csvkit)```

```[Documentation](https://csvkit.readthedocs.io/en/latest/scripts/csvsql.html)```

<!-- verified: 2026-11-09 -->
