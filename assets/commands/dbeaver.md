# TLDR

**Launch DBeaver** GUI

```dbeaver```

**Open specific database** connection

```dbeaver -con "name=[connection_name]"```

**Connect with inline parameters**

```dbeaver -con "driver=postgresql|host=localhost|database=mydb"```

**Execute SQL file** on connection

```dbeaver -con "name=[connection]" -f [script.sql]```

**Export data** to file

```dbeaver -export "name=[connection]|table=[tablename]|file=[output.csv]"```

**Run in headless mode** for scripting

```dbeaver-cli -con "name=[connection]" -f [script.sql]```

# SYNOPSIS

**dbeaver** [_options_]

# PARAMETERS

**-con** _CONNECTION_
> Connection parameters (name, driver, host, database, user, etc.).

**-f** _FILE_
> SQL script file to execute.

**-export** _PARAMS_
> Export data with specified parameters.

**-nosplash**
> Start without splash screen.

**-data** _DIR_
> Workspace directory location.

**-nl** _LOCALE_
> Override system locale.

**-clean**
> Clear cached data and start fresh.

**--help**
> Display help information.

# DESCRIPTION

**DBeaver** is a free, universal database tool and SQL client for developers and database administrators. It supports a wide range of databases including PostgreSQL, MySQL, MariaDB, SQLite, Oracle, SQL Server, and many others through JDBC drivers.

The application provides a graphical interface for database management including SQL editing with syntax highlighting and autocomplete, visual query builder, ER diagrams, data export/import, and schema comparison. It also supports NoSQL databases like MongoDB and Cassandra.

DBeaver includes a command-line interface for automation tasks such as running SQL scripts, exporting data, and managing connections without the GUI.

# CAVEATS

Requires Java Runtime Environment. Some enterprise features require the paid Enterprise Edition. Large result sets may consume significant memory. Connection configurations are stored in workspace and may need migration between versions.

# HISTORY

DBeaver was created by **Serge Rider** and first released in **2010**. It started as a simple database viewer and evolved into a comprehensive database management tool. The project is maintained by DBeaver Corp with both community and enterprise editions.

# SEE ALSO

[mysql](/man/mysql)(1), [psql](/man/psql)(1), [sqlite3](/man/sqlite3)(1)
