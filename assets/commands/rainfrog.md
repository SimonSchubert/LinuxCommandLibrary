# TAGLINE

Lightweight terminal-based database management TUI

# TLDR

**Connect to a PostgreSQL database**

```rainfrog --url postgres://[user]:[password]@[host]/[database]```

# SYNOPSIS

**rainfrog** [_options_]

# PARAMETERS

**--url** _CONNECTION_STRING_
> Database connection string.

# DESCRIPTION

**rainfrog** is a lightweight, terminal-based database management tool designed as an alternative to pgAdmin and DBeaver. It features vim-like keybindings, a query editor with keyword highlighting, session history, favorites, and the ability to quickly copy data, filter tables, and switch between schemas. It supports PostgreSQL, MySQL, SQLite, Oracle, and DuckDB.

# CAVEATS

Under active development with expected breaking changes. Not recommended for write access on production databases.

# HISTORY

**rainfrog** was created by **achristmascarl** and is written in **Rust**.

# SEE ALSO

[psql](/man/psql)(1), [lazysql](/man/lazysql)(1), [pspg](/man/pspg)(1)
