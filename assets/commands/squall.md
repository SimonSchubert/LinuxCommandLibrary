# TAGLINE

TUI SQLite viewer and editor

# TLDR

**Open a database file**

```squall -f [path/to/database.sqlite]```

**Launch the TUI without a file**

```squall```

# SYNOPSIS

**squall** [**-f** _database_path_]

# PARAMETERS

**-f**, **--filepath** _PATH_
> Path to a SQLite database to load.

**-h**, **--help**
> Show the help message and exit.

# DESCRIPTION

**squall** is a terminal-based SQLite database viewer and editor. It displays tables and query results in panes with syntax highlighting, supports browsing tables, executing SQL queries, and editing records directly.

# CAVEATS

The upstream README documents the long option as **--filename**, but the program's argument parser defines **--filepath**. The short form **-f** avoids the mismatch. The package is published on PyPI as **squall_sql**, while the command is **squall**.

# HISTORY

**squall** was created by **Mike Driscoll** (driscollis) and is written in **Python** using the Textual framework.

# SEE ALSO

[litecli](/man/litecli)(1), [sqlite3](/man/sqlite3)(1), [sqlit](/man/sqlit)(1)

# RESOURCES

```[Source code](https://github.com/driscollis/squall)```

<!-- verified: 2026-11-09 -->
