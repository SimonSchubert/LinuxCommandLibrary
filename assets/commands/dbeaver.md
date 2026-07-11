# TAGLINE

universal database tool and SQL client

# TLDR

**Launch DBeaver** GUI

```dbeaver```

**Open specific database** connection

```dbeaver -con "name=[connection_name]"```

**Connect with inline parameters**

```dbeaver -con "driver=postgresql|host=localhost|database=mydb"```

**Open a SQL file** and connect it to a datasource

```dbeaver -con "name=[connection]" -f [script.sql]```

**Run a saved task** (e.g. a data export task)

```dbeaver -runTask "@[project]:[task]"```

**Stop a running DBeaver** instance

```dbeaver -stop```

# SYNOPSIS

**dbeaver** [_options_]

# PARAMETERS

**-con** _CONNECTION_
> Connection parameters (name, driver, host, database, user, etc.).

**-f** _FILE_
> Open the file in the DBeaver UI; with -con, connect it to the datasource.

**-runTask** _@PROJECT:TASK_
> Execute a saved task; returns an exit code indicating success or failure.

**-var** _NAME=VALUE_
> Set a variable for -runTask (repeatable).

**-stop**
> Quit a running DBeaver instance.

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

DBeaver's command line can open connections and files in the UI and execute saved tasks (such as data export or backup tasks) via -runTask, which is the supported way to automate DBeaver operations.

# CAVEATS

Requires Java Runtime Environment. Some enterprise features require the paid Enterprise Edition. Large result sets may consume significant memory. Connection configurations are stored in workspace and may need migration between versions.

# HISTORY

DBeaver was created by **Serge Rider** and first released in **2010**. It started as a simple database viewer and evolved into a comprehensive database management tool. The project is maintained by DBeaver Corp with both community and enterprise editions.

# SEE ALSO

[mysql](/man/mysql)(1), [psql](/man/psql)(1), [sqlite3](/man/sqlite3)(1)

# RESOURCES

```[Source code](https://github.com/dbeaver/dbeaver)```

```[Homepage](https://dbeaver.io)```

```[Documentation](https://dbeaver.com/docs/dbeaver/)```

<!-- verified: 2026-07-11 -->
