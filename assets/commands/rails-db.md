# TLDR

**Open a database console** for the current environment

```rails db```

**Open a database console** for production

```rails db -e production```

**Open a database console** with a specific database configuration

```rails db --database=[database_name]```

# SYNOPSIS

**rails db** [**-e** _environment_] [**--database** _name_] [**-h**]

# PARAMETERS

**-e**, **--environment** _ENV_
> Specify the Rails environment (development, test, production)

**--database** _name_
> Connect to a specific database when multiple databases are configured

**-h**, **--help**
> Show help information

# DESCRIPTION

**rails db** (also known as **rails dbconsole**) opens an interactive session with the database configured for your Rails application. It automatically detects the database adapter and launches the appropriate client (psql for PostgreSQL, mysql for MySQL, sqlite3 for SQLite, etc.).

The command reads database configuration from **config/database.yml** and connects using the credentials and connection details specified there. This provides quick access to the database without manually remembering connection strings.

# CAVEATS

Requires the corresponding database client to be installed on the system (psql, mysql, sqlite3, etc.). The command will fail if the client is not in the PATH.

Database credentials are read from the configuration file. Ensure sensitive credentials are properly secured, especially in production environments.

# SEE ALSO

[rails](/man/rails)(1), [rails-console](/man/rails-console)(1), [psql](/man/psql)(1), [mysql](/man/mysql)(1), [sqlite3](/man/sqlite3)(1)
