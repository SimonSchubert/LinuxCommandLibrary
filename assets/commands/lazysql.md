# TAGLINE

Cross-platform TUI database management tool

# TLDR

**Launch the database TUI**

```lazysql```

**Connect to a database**

```lazysql -u [connection_string]```

# SYNOPSIS

**lazysql** [_options_]

# DESCRIPTION

**lazysql** is a cross-platform TUI database management tool that supports MySQL, PostgreSQL, and SQLite. It provides an SQL query editor with syntax highlighting, clipboard support, tab-based navigation, and Vim-style keybindings.

Features include an interactive query editor, sortable result tables, clipboard integration for copying query results or cell values, and a user-friendly interface for browsing database schemas and executing queries without leaving the terminal.

# CAVEATS

Requires a running database server for MySQL and PostgreSQL connections. SQLite works with local files.

# HISTORY

**lazysql** was created by **Jorge Rojas** (jorgerojas26) and is written in **Go**. It was inspired by lazygit.

# SEE ALSO

[mysql](/man/mysql)(1), [psql](/man/psql)(1), [sqlite3](/man/sqlite3)(1)
