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

**gobang** is a cross-platform terminal-based database management tool written in Rust, supporting MySQL, PostgreSQL, and SQLite. It provides a keyboard-only TUI for browsing databases, tables, and records, with filtering and cell copying.

# CONFIGURATION

Connections are defined in **~/.config/gobang/config.toml** (**%APPDATA%/gobang/config.toml** on Windows).

```
[[conn]]
type = "mysql"
user = "root"
host = "localhost"
port = 3306
database = "foo"
name = "mysql Foo DB"

[[conn]]
type = "sqlite"
path = "/path/to/baz.db"
```

# KEYBINDINGS

**h**, **j**, **k**, **l**
> Scroll left/down/up/right

**Ctrl-u**, **Ctrl-d**
> Scroll up/down multiple lines

**g**, **G**
> Scroll to top/bottom

**H**, **J**, **K**, **L**
> Extend selection by one cell

**y**
> Copy a cell value

**←**, **→**
> Move focus left/right

**c**
> Move focus to connections

**/**
> Filter

**1**-**5**
> Switch to records/columns/constraints/foreign keys/indexes tab

**Esc**
> Hide popup

**?**
> Show help

**q**
> Quit

# CAVEATS

Still in alpha, with no release since 0.1.0-alpha.5 and little development since 2023. Connections must be added by editing the config file. The unreleased main branch adds extra tabs and changes the number key assignments.

# HISTORY

**gobang** was created by **Takayuki Maeda** (TaKO8Ki). The name refers to the Japanese game played on a goban, whose grid resembles a table.

# SEE ALSO

[psql](/man/psql)(1), [mysql](/man/mysql)(1), [litecli](/man/litecli)(1), [pgcli](/man/pgcli)(1)

# RESOURCES

```[Source code](https://github.com/TaKO8Ki/gobang)```

<!-- verified: 2026-11-09 -->
