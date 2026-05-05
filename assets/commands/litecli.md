# TAGLINE

SQLite CLI with auto-completion

# TLDR

**Connect to database**

```litecli [database.db]```

**Create new database**

```litecli [new.db]```

**Execute query**

```litecli [database.db] -e "[SELECT * FROM table]"```

**Use specific output format**

```litecli [database.db] --table```

**Connect to in-memory database**

```litecli :memory:```

**Run SQL file**

```litecli [database.db] < [script.sql]```

# SYNOPSIS

**litecli** [_options_] [_database_]

# PARAMETERS

_DATABASE_
> SQLite database file path.

**-e**, **--execute** _QUERY_
> Execute query and exit.

**--table**
> Output as table format.

**--csv**
> Output as CSV.

**--auto-vertical-output**
> Automatically switch to vertical output for wide rows.

**-l**, **--list-dsn**
> List configured DSNs.

**--llm-api-key** _KEY_
> API key for AI-assisted SQL features.

**--help**
> Display help information.

# DESCRIPTION

**litecli** is a SQLite CLI with auto-completion. It provides syntax highlighting and intelligent suggestions.

The tool offers a better interactive experience than sqlite3 with multiline editing and history.

# CAVEATS

Python-based. Requires pip install. For SQLite databases only.

# HISTORY

litecli was inspired by **pgcli** and **mycli**, bringing similar enhanced CLI features to SQLite.

# SEE ALSO

[sqlite3](/man/sqlite3)(1), [mycli](/man/mycli)(1), [pgcli](/man/pgcli)(1)

