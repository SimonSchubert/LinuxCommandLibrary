# TAGLINE

execute SQL queries through Cradle framework

# TLDR

**Execute a SQL query**

```cradle sql "[SELECT * FROM users]"```

**Run queries from a SQL file**

```cradle sql --file [queries.sql]```

**Execute on a specific database** connection

```cradle sql --connection [mysql] "[query]"```

**Export table to SQL file**

```cradle sql --export [table_name] > [backup.sql]```

**Import SQL file** into database

```cradle sql --import [backup.sql]```

**Show all tables**

```cradle sql "SHOW TABLES"```

# SYNOPSIS

**cradle sql** [_options_] [_query_]

# PARAMETERS

_QUERY_
> SQL query to execute. Wrap in quotes.

**--file** _FILE_
> Execute SQL commands from a file.

**--connection** _NAME_
> Use a specific database connection.

**--export** _TABLE_
> Export table data as SQL statements.

**--import** _FILE_
> Import SQL file into the database.

**--database** _NAME_
> Override the default database.

**--format** _FORMAT_
> Output format: table, json, csv.

**--help**
> Display help information.

# DESCRIPTION

**cradle sql** provides direct SQL access to databases configured in the Cradle framework. It allows executing queries, importing/exporting data, and performing database operations without needing a separate client.

The command uses the framework's database configuration, supporting multiple connections defined in the application settings. Results can be output in various formats suitable for display or processing by other tools.

This tool is useful for debugging, data inspection, and quick database operations during development. It maintains consistent authentication and connection handling with the rest of the Cradle application.

# CAVEATS

Direct SQL access bypasses application-level validations. Destructive queries (DROP, DELETE, TRUNCATE) execute without confirmation unless the framework adds safeguards. Always backup data before running potentially destructive operations.

# HISTORY

cradle sql was developed as part of the Cradle PHP framework's CLI tools to provide convenient database access. It follows the pattern of framework-integrated database commands found in other PHP frameworks like Laravel's Artisan.

# SEE ALSO

[cradle](/man/cradle)(1), [mysql](/man/mysql)(1), [psql](/man/psql)(1), [sqlite3](/man/sqlite3)(1)
