# TAGLINE

Interactive minimalist TUI to query JSON and CSV using SQL

# TLDR

**Query a JSON file interactively**

```cat [file.json] | qo```

**Query a CSV file** passing it directly as an argument

```qo [file.csv]```

**Run a SQL query directly** without entering the TUI

```cat [file.json] | qo -q "SELECT [column] FROM tmp WHERE [condition]"```

**Convert JSON to CSV** using a direct query

```qo -o csv [file.json] -q "SELECT * FROM [table]"```

**Specify input and output formats**

```qo -i tsv -o json [file.tsv]```

# SYNOPSIS

**qo** [_options_] [_file_...]

_command_ | **qo** [_options_]

# PARAMETERS

**-i**, **--input** _format_
> Input format: `json`, `csv`, `tsv`, or `psv` (pipe-separated). Auto-detected from file extension if not specified.

**-o**, **--output** _format_
> Output format: `json`, `jsonl`, `csv`, `tsv`, `psv`, or `table`.

**-q**, **--query** _sql_
> Run a SQL query directly and skip the interactive TUI.

**--no-header**
> Treat the first row as data rather than a header row.

# DESCRIPTION

**qo** is a minimalist terminal UI for querying JSON and CSV data using SQL. It reads from standard input or file arguments and provides an interactive TUI for exploring structured data with SQL queries.

The internal table is always named **tmp**. Results are sent to standard output on exit, allowing **qo** to be used in pipelines.

# KEYBOARD SHORTCUTS

**Tab**
> Switch between query input and table view

**Enter**
> Execute the current query

**Esc**
> Output results to stdout and quit

**Ctrl+C**
> Quit without producing output

**j/k** or **↑/↓**
> Scroll rows in table view

**h/l** or **←/→**
> Scroll columns in table view

# HISTORY

**qo** was created by **kiki-ki** and is written in **Go**. The project is hosted as **go-qo** on GitHub.

# SEE ALSO

[jq](/man/jq)(1), [q](/man/q)(1), [miller](/man/miller)(1), [trdsql](/man/trdsql)(1), [sqlite3](/man/sqlite3)(1)
