# TAGLINE

Cross-platform TUI database management tool

# TLDR

**Launch gobang** with default config

```gobang```

**Launch with a custom config file**

```gobang -c [path/to/config.toml]```

**Display help**

```gobang -h```

# SYNOPSIS

**gobang** [_options_]

# PARAMETERS

**-c**, **--config-path** _PATH_
> Set the config file path.

**-h**, **--help**
> Display help and exit.

**-V**, **--version**
> Display version and exit.

# DESCRIPTION

**gobang** is a cross-platform terminal-based database management tool written in Rust, supporting MySQL, PostgreSQL, and SQLite. It provides an interactive TUI for browsing databases, running queries, and managing tables.

Database connections are configured in a TOML config file (default: **~/.config/gobang/config.toml**). The tool features a SQL editor with syntax highlighting and result display in table format.

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

[psql](/man/psql)(1), [mysql](/man/mysql)(1), [litecli](/man/litecli)(1), [pgcli](/man/pgcli)(1)