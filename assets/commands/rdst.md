# TAGLINE

Diagnose and tune PostgreSQL and MySQL queries from the terminal

# TLDR

**Run the first-time setup wizard**

```rdst init```

**Add a database target** whose password comes from an environment variable

```rdst configure add --target [prod] --host [db.example.com] --user [admin] --database [mydb] --password-env [PROD_DB_PASS]```

**List saved targets**

```rdst configure list```

**Watch the slowest queries** on a target

```rdst top --target [mydb]```

**Read aggregated statistics** from `pg_stat_statements` or MySQL `performance_schema`

```rdst top --historical --target [mydb]```

**Analyze one statement** with `EXPLAIN`

```rdst analyze -q "[SELECT * FROM users WHERE active = true]" --target [mydb]```

**Analyze a query already stored** in the registry

```rdst analyze --hash [abc123] --target [mydb]```

**Ask a question** and print the SQL without running it

```rdst ask "[How many customers are there?]" --target [mydb] --dry-run```

**Audit one database**

```rdst audit --target [mydb]```

**Open the local web UI**

```rdst web```

**Show the version**

```rdst version```

# SYNOPSIS

**rdst** [**--config** _FILE_] [**-v** | **--verbose**] [**--version**] _COMMAND_ [_ARGS_]

# DESCRIPTION

**rdst** is the Readyset Data and SQL Toolkit, a command-line tool for PostgreSQL and MySQL diagnostics. It stores named connection profiles (targets), watches which statements consume database time, and runs `EXPLAIN` so it can suggest indexes, rewrites, and Readyset cache checks.

Targets point at PostgreSQL or MySQL. A password is read from an environment variable named with **--password-env**, or from the operating-system keychain. SSH jump hosts, TLS, and proxies (`readyset`, `proxysql`, `pgbouncer`, `tunnel`, `custom`) can be stored on a target. **rdst init** walks through the first target. **rdst configure** adds, edits, tests, and removes targets after that.

**rdst top** ranks statements by frequency, total time, average time, or load. On PostgreSQL the historical source is `pg_stat_statements`. On MySQL it can read `performance_schema` digests, the process list, or `mysql.slow_log` when that table is enabled. Statements it sees are saved in a local query registry and can be passed to **rdst analyze** by hash or name.

**rdst analyze** runs `EXPLAIN ANALYZE` by default and can ask Readyset-hosted inference, or Anthropic when `ANTHROPIC_API_KEY` is set, for index and rewrite suggestions. **--fast** stops at `EXPLAIN`. **--readyset-cache** checks the statement against a temporary Readyset cache. **rdst ask** turns a natural-language question into SQL. The project describes that path as guarded and read-only; **--dry-run** prints the statement and leaves it unexecuted.

**rdst audit** collects a health report for one target. **rdst fleet** imports or discovers many targets (including Amazon RDS) and can audit them together. **rdst schema** keeps a semantic layer of table and column notes that **rdst ask** uses. **rdst query** manages the saved-query registry. **rdst scan** looks through a tree for SQLAlchemy, Django, Prisma, and Drizzle queries.

**rdst web** serves the browser UI on `127.0.0.1:8787`. **rdst claude add** registers RDST as an MCP server for Claude Code, using the `rdst-mcp` entry point. **rdst agent** and **rdst guard** wrap a target with safety policies and can expose it over HTTP, MCP, or Slack. **rdst demo** starts a Dockerized PostgreSQL database loaded with a sample data set.

The same toolkit ships inside the RDST desktop app. The CLI is also published on PyPI as `rdst` and through a Readyset install script for macOS and glibc Linux.

# COMMANDS

**account** _login_|_status_|_logout_

> Sign in to Readyset for capped hosted AI inference, show the session, or sign out on this machine.

**configure** _add_|_list_|_edit_|_remove_|_default_|_test_|_llm_

> Manage database targets. **add** accepts a connection URL or separate **--host**, **--port**, **--user**, **--database**, and **--engine** (`postgresql` or `mysql`) fields.

**tunnel** _list_|_close_|_test_

> List or close SSH tunnels held by the local **rdst web** server, or test a target through its tunnel.

**top**

> Show the slowest queries. **--limit** defaults to 10. **--sort** is `total_time`, `freq`, `avg_time`, or `load`.

**analyze**

> Explain a query given with **-q**, **--file**, **--stdin**, **--hash**, **--name**, or a positional SQL string.

**ask** _QUESTION_

> Generate SQL for a question. **--timeout** defaults to 600 seconds.

**agent** _create_|_list_|_show_|_delete_|_chat_|_serve_|_mcp_|_slack_

> Create a named data agent on a target and talk to it, or serve it over HTTP, MCP, or Slack.

**init**

> First-time setup wizard. **--force** runs it again when configuration already exists.

**query** _add_|_import_|_edit_|_list_|_show_|_delete_|_rm_|_export_|_run_|_cache-compare_

> Manage the saved-query registry. **cache-compare** runs a temporary Readyset comparison.

**schema** _show_|_init_|_edit_|_annotate_|_export_|_delete_|_list_|_refresh_|_profile_

> Manage the semantic layer used by **rdst ask**.

**guard** _create_|_list_|_show_|_delete_|_edit_|_check_

> Reusable safety policies (masking, query restrictions, execution limits) for data agents.

**scan** _DIRECTORY_

> Find ORM queries in a tree. **--analyze** explains them. **--check** is a CI mode that exits 1 when issues are found. Marked experimental upstream.

**fleet** _configure_|_import_|_discover_|_list_|_status_|_audit_|_diff_|_snapshots_

> Manage and audit a group of database targets.

**audit**

> Deep health audit of one target. **list** and **show** read saved runs. **--duration** adds a live capture window such as `5m`.

**demo** _setup_|_load_|_tour_|_teardown_

> Start, load, tour, and remove the Docker demo database.

**claude** _add_|_remove_

> Register or unregister RDST with Claude Code.

**slack** _setup_|_start_|_list_|_status_

> Run a Slack bot that answers questions against a configured target. Socket Mode, so no public URL is required.

**web**

> Start the local API and browser UI. **--port** defaults to 8787 and **--host** defaults to `127.0.0.1`. **--no-browser** leaves the UI unopened.

**report**

> Send feedback about RDST. Non-interactive use needs **-e** / **--email**.

**help** [_QUESTION_]

> Show command help, or answer a short question from the built-in docs (`rdst help "find slow queries"`).

**update**

> Check or install a release for an installer-managed copy. **--check** only reports. **--version** _VER_ installs that release.

**version**

> Print the RDST version.

With no command, **rdst** opens a numbered menu of these commands. **rdst** _COMMAND_ **--help** prints that command's options.

# PARAMETERS

**--config** _FILE_

> Path to the configuration file.

**-v**, **--verbose**

> Verbose output.

**--version**

> Print the version and exit. **rdst version** does the same.

**--target** _NAME_

> Which saved database target to use. Accepted by **top**, **analyze**, **ask**, **audit**, and most other database commands. **configure add** also treats **--name** as an alias.

**--source** _SOURCE_

> For **top**: `auto` (default), `pg_stat`, `activity`, `slowlog`, `digest`, `rds`, or `pmm`. Choosing a source implies **--historical**. For **audit**: `auto`, `pg_stat_statements`, or `activity`.

**--limit** _N_

> How many queries to show. Default 10 for **top**, 50 for **audit**.

**--historical**

> Read aggregated statistics instead of a live sample.

**--duration** _SECONDS_

> For **top**, sample live activity for _N_ seconds and then print a snapshot. For **audit** and **fleet audit**, a window such as `30s`, `5m`, or `1h`.

**--watch**

> Refresh **rdst top** continuously.

**--json**

> Machine-readable JSON output, where the command supports it.

**-q** _SQL_, **--query** _SQL_

> Inline SQL for **analyze** (and **query add**). Mutually exclusive with **--file**, **--stdin**, **--hash**, and **--name**.

**-f** _FILE_, **--file** _FILE_

> Read the statement from a file.

**--stdin**

> Read the statement from standard input.

**--hash** _HASH_, **--name** _NAME_

> Load a registry query into **analyze**.

**--fast**

> Use `EXPLAIN` and skip `EXPLAIN ANALYZE`.

**--readyset-cache**

> Verify the statement with a temporary Readyset cache.

**--skip-warning**

> Skip the confirmation prompt before `EXPLAIN ANALYZE`.

**--dry-run**

> For **ask**, generate SQL and do not execute it. For fleet import and discover, preview changes.

**--password-env** _VAR_

> Environment variable that holds the database password. The password is kept out of the config file.

**--read-only**

> Mark a **configure add** target as read-only.

**-p** _PORT_, **--port** _PORT_

> Listen port for **rdst web** (default 8787).

**--host** _HOST_

> Bind address for **rdst web** (default `127.0.0.1`). On **configure add**, the database host.

**--no-browser**

> Do not open a browser when **rdst web** starts.

**--check**

> For **update**, report whether a newer installer release exists. For **scan**, CI mode.

# CONFIGURATION

User data and configuration live in **~/.rdst** on Linux and macOS, and in **%USERPROFILE%\\.rdst** on Windows. **--config** selects a configuration file. Uninstalling an installer-managed copy leaves **~/.rdst** in place.

Passwords are not written into the config file. Name an environment variable with **--password-env**, or let RDST use the OS keychain. **rdst configure llm** and **rdst account login** set up Readyset-hosted inference. If `ANTHROPIC_API_KEY` is set, AI-assisted commands call Anthropic directly. `RDST_ANTHROPIC_MODEL` overrides that model.

Interactive editors use `EDITOR` or `VISUAL`.

# CAVEATS

**rdst analyze** runs `EXPLAIN ANALYZE` unless **--fast** is set, so the statement is executed on the target to collect timing. A confirmation prompt is shown unless **--skip-warning** is passed. **--readyset-cache** creates a temporary Readyset cache for the check.

Historical PostgreSQL rankings need `pg_stat_statements`. The MySQL `slowlog` source needs the slow query log written to `TABLE` (`slow_query_log`, `long_query_time`, and `log_output`).

The Readyset install script supports macOS and glibc Linux on x86_64 and arm64. **rdst update** replaces installations created by that script. Copies installed with `uv`, `pipx`, or `pip` stay under those tools (`uv tool upgrade rdst`, `pipx upgrade rdst`).

AI-assisted commands send SQL text, plans, and schema to Readyset-hosted inference, or to Anthropic when `ANTHROPIC_API_KEY` is set. The project states that those calls do not include table rows. **rdst ask** without **--dry-run** still executes the generated statement on the database. **rdst demo** requires Docker. **rdst scan** is experimental. The project classifies the 0.1 line as beta.

# HISTORY

Readyset published the **rdst** repository in **April 2026** under the Apache License 2.0. The command is versioned on the 0.1 line. A desktop application embeds this CLI and adds a graphical client for the same database targets.

# SEE ALSO

[psql](/man/psql)(1), [mysql](/man/mysql)(1), [pgcli](/man/pgcli)(1), [mycli](/man/mycli)(1)

# RESOURCES

```[Source code](https://github.com/readysettech/rdst)```

```[Homepage](https://readyset.io)```

```[Documentation](https://readyset.io/docs/readyset-ai/rdst/cli)```

<!-- verified: 2026-10-16 -->
