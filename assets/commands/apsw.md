# TAGLINE

SQLite shell from the APSW Python binding

# TLDR

**Open or create** a database (the prompt is `sqlite>`)

```apsw [database.db]```

**Run one statement** and exit

```apsw [database.db] "[SELECT * FROM people]"```

**CSV** with a header row

```apsw -csv -header [database.db] "[SELECT * FROM people]" > [people.csv]```

**JSON Lines**, one object per row

```apsw -jsonl [database.db] "[SELECT * FROM people]"```

**List tables**

```apsw [database.db] ".tables"```

**Show the schema** of one table (the name is a LIKE pattern)

```apsw [database.db] ".schema [people]"```

**Import** a CSV or TSV, detecting the dialect and column types

```apsw [database.db] ".autoimport [people.csv]"```

**Search** every column for a value

```apsw [database.db] ".find [winchester]"```

Open an **in-memory** database

```apsw```

Print the **SQLite version**

```apsw -version```

The same shell is **python3 -m apsw** with the same arguments.

# SYNOPSIS

**apsw** [_options_] [_filename_] [_sql|cmd_]...

# PARAMETERS

**-init** _filename_
> Read and process this file before anything else

**-echo**
> Print each command before it runs

**-header**, **-noheader**
> Turn column names in the output on or off. Off is the default

**-bail**
> Exit at the first error in SQL or in a dot command

**-interactive**
> Force interactive input: command editing and colour

**-batch**
> Force batch input: no banner and no line editing

**-column**, **-csv**, **-html**, **-line**, **-list**, **-python**, **-jsonl**
> Set the output mode. **-csv** uses commas; the default separator for list mode is `|`

**-separator** _text_
> Field separator for list output and **.import**. The default is `|`

**-nullvalue** _text_
> Text to print for SQL NULL in textual modes. The default is an empty string. Insert mode and dumps ignore this

**-encoding** _name_
> Encoding for files opened by **.import**, **.read**, and **.output**. Default is `utf8`. An error handler can be appended, as in `cp437:replace` (`strict`, `ignore`, `replace`, `xmlcharrefreplace`)

**-nocolour**
> Disable colour. **-nocolor**, **-no-colour**, and **-no-color** are the same flag

**-version**
> Print the SQLite version and exit

**-help**
> Print the usage text to standard error and exit

_filename_
> SQLite database file. A missing file is created. Omit it, or pass an empty string, for an in-memory database

# DOT COMMANDS

Commands start with a period. **.help** lists them; **.help** _command_ shows one; **.help all** shows every description.

**.tables** [_pattern_]: Tables and views whose names match a LIKE pattern
**.schema** [_table_...]: `CREATE` statements. Each name is a LIKE pattern (`%` is the wildcard)
**.headers on|off**: Column names in output
**.mode** _mode_ [_option_]: Output mode: `box`, `column`, `columns`, `csv`, `html`, `insert`, `json`, `jsonl`, `line`, `lines`, `list`, `python`, `qbox`, `table`, `tabs`, `tcl`. `insert` uses the table name `table` unless a second argument sets it
**.separator** _text_: Separator for list output and **.import**
**.nullvalue** _text_: Text shown for NULL
**.width** _num_...: Column widths in `column` mode. Negative right-justifies; zero is the default width
**.import** _file_ _table_: Load separated text into an existing table. Values are passed as strings
**.autoimport** _filename_ [_table_]: Detect the separator and column types, create the table, and import. The file needs at least two columns and two rows. The table name defaults to the file's basename
**.dump** [_table_...]: SQL text dump. Names are LIKE patterns. An FTS5 table named `recipes` also needs its shadow tables: **.dump recipes recipes_%**
**.find** _value_ [_table_]: Scan columns for a value. The table argument is a LIKE pattern. `%` or `_` in the value makes it a LIKE pattern too
**.ftsq** _table_ _query_: Run the rest of the line as an FTS5 query and show the top 20 hits
**.open** [_options_] [_file_]: Open a connection. No file means in-memory. **--wipe** closes other connections to that file and deletes it first. **--vfs** _name_ and **--flags** _flags_ (default `READWRITE|CREATE|URI`) select how it is opened
**.close**: Close the current database
**.connection** [_number_]: List APSW connections in this process, or switch to one
**.backup** [_db_] _file_: Page-level copy of a database (default `main`) onto _file_
**.restore** [_db_] _file_: Page-level copy of _file_ into a database (default `main`)
**.output** _filename_: Send output to a file, or `stdout`
**.read** _file_: Run commands from a file. A `.py` file can patch the shell
**.py** [_statement_]: Python REPL, or one statement. Names in scope: `apsw`, `shell`, `db`
**.parameter** _subcommand_: Named bindings for queries (`list`, `clear`, `unset` _name_, `set` _name_ _sql_)
**.timer on|off**: Time and resource use after each query
**.bail on|off**: Exit at the first error (default off)
**.echo on|off**: Print commands before execution
**.changes on|off**: Print rows changed by the last statement, and the running total
**.dbinfo** [_name_]: Table counts and file-header fields (default database `main`)
**.dbconfig** [_name_ _value_]: List `dbconfig` settings, or set one (**.dbconfig enable_fkey 1**)
**.exit** [_code_]: Leave the shell. Control-D does the same (Control-Z on Windows)

# DESCRIPTION

**apsw** is the command-line shell that ships with APSW (Another Python SQLite Wrapper), Roger Binns' binding of the SQLite C API for CPython. It follows the shell that comes with SQLite and is meant for administration and for typing SQL. A `pip install` of the **apsw** package installs this console script; **python3 -m apsw** starts the same program.

Compared with **sqlite3**, the shell colours its output, completes SQL and dot commands with Tab, and can switch among every APSW connection open in the process. **.py** drops into Python with the current connection bound to `db`. **.autoimport** guesses CSV dialect and column types; **.find** scans tables for a value.

The default prompt is `sqlite> `, and a statement that is not finished yet continues at ` ..> `. **.prompt** changes both. Control-C interrupts the current work. Errors and diagnostics go to standard error, so they stay out of redirected output.

Release numbers follow SQLite and add one more component: SQLite 3.42.1 corresponds to APSW 3.42.1.0. Current releases need CPython 3.10 or later. PyPI builds include SQLite and its extra extensions; **python3 -m apsw.sqlite_extra** runs those extra programs (for example `sqlite3_showstat4`) and is a separate entry point from this shell.

# CAVEATS

This is not the **sqlite3** binary. Dot commands and several output modes exist only in this shell. **-bail** stops on the first error in SQL or in a dot command; the SQLite shell applies bail only to SQL.

A filename that does not exist is created. Omit the filename, or pass an empty string, to get an in-memory database.

**.autoimport** needs at least two columns and two rows. It reads the file twice, once to detect the dialect and types, so large files are slow. Dates are recognized only with a four-digit year. Leading zeros keep a column as text, so phone numbers are not stored as integers.

On Windows, line editing and Tab completion need a readline module such as **pyreadline3**. Colour uses the Windows console. **-nocolour** turns it off. The help text also names **NO_COLOR**, but the shell only reads that variable while parsing an option it does not already recognize, and it then skips that option. The shell object is one block of state and is not safe to use from several threads at once.

# HISTORY

Roger Binns first released APSW in 2004 as a thin wrapper that exposes SQLite's own API instead of Python's DB-API. The interactive shell, modelled on SQLite's, was added in APSW 3.6.19-r1 (October 2009). Since the 3.39.2.1 release in 2022 the shell is started with **python3 -m apsw**; current packages also install an **apsw** console script.

# INSTALL

```apt: sudo apt install python3-apsw```

```dnf: sudo dnf install python3-apsw```

```pacman: sudo pacman -S python-apsw```

```zypper: sudo zypper install python313-apsw```

```nix: nix profile install nixpkgs#python313Packages.apsw```

<!-- packages: 2026-10-11 -->

# SEE ALSO

[sqlite3](/man/sqlite3)(1), [litecli](/man/litecli)(1), [sqlite-utils](/man/sqlite-utils)(1)

# RESOURCES

```[Source code](https://github.com/rogerbinns/apsw)```

```[Homepage](https://rogerbinns.github.io/apsw/)```

```[Documentation](https://rogerbinns.github.io/apsw/shell.html)```

<!-- verified: 2026-10-11 -->
