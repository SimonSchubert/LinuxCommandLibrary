# TAGLINE

Lightweight terminal-based database management TUI

# TLDR

**Connect to a PostgreSQL database**

```rainfrog --url postgres://[user]:[password]@[host]/[database]```

**Connect to a MySQL database**

```rainfrog --url mysql://[user]:[password]@[host]/[database]```

**Connect to a SQLite database**

```rainfrog --url sqlite://[path/to/db.sqlite]```

**Connect with a specific driver**

```rainfrog --url [connection_string] --driver [postgres]```

# SYNOPSIS

**rainfrog** [_options_]

# PARAMETERS

**--url** _CONNECTION_STRING_
> Database connection string.

**--driver** _DRIVER_
> Database driver to use (postgres, mysql, sqlite).

**--username** _USER_
> Database username.

**--password** _PASS_
> Database password.

**--host** _HOST_
> Database host.

**--port** _PORT_
> Database port.

**--database** _NAME_
> Database name.

# DESCRIPTION

**rainfrog** is a lightweight, terminal-based database management tool designed as an alternative to pgAdmin and DBeaver. It features vim-like keybindings, a query editor with keyword highlighting, session history, favorites, and the ability to quickly copy data, filter tables, and switch between schemas. It supports PostgreSQL, MySQL, and SQLite.

# CAVEATS

Under active development with expected breaking changes. Not recommended for write access on production databases. Connection strings with special characters in passwords may need URL encoding.

# HISTORY

**rainfrog** was created by **achristmascarl** and is written in **Rust**.

# SEE ALSO

[psql](/man/psql)(1), [lazysql](/man/lazysql)(1), [mycli](/man/mycli)(1)
