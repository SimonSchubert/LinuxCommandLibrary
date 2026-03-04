# TAGLINE

Cross-platform TUI database management tool

# TLDR

**Connect** to a database

```gobang [connection-string]```

**Connect** with saved connection

```gobang -c [connection-name]```

**List** saved connections

```gobang --list-connections```

# SYNOPSIS

**gobang** [_options_] [_connection-string_]

# PARAMETERS

**-c, --connection** _NAME_
> Use saved connection

**--list-connections**
> List all saved connections

**--add-connection**
> Add new connection interactively

**--delete-connection** _NAME_
> Delete saved connection

**-v, --version**
> Display version and exit

**-h, --help**
> Display help and exit

# DESCRIPTION

**gobang** is a terminal-based database management tool supporting MySQL, PostgreSQL, and SQLite. It provides an interactive TUI for browsing databases, running queries, and managing tables.

The tool features a query editor with syntax highlighting, result display in table format, and saved connection management.

# KEYBINDINGS

**↑/↓**
> Navigate tables/columns

**Enter**
> Select table/view columns

**Tab**
> Switch between panels

**e**
> Edit connection

**d**
> Delete record

**q**
> Quit

**>**
> Open query editor

**?**
> Show help

# CAVEATS

Requires database credentials. Large query results may impact performance. Some database-specific features may not be supported.

# HISTORY

**gobang** was created as a universal terminal-based database client, similar to GUI tools like DBeaver but for the terminal.

# SEE ALSO

[psql](/man/psql)(1), [mysql](/man/mysql)(1), [litecli](https://litecli.com/), [pgcli](https://www.pgcli.com/)