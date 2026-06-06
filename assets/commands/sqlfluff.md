# TAGLINE

Modular SQL linter and auto-formatter with dialect support

# TLDR

**Lint** a SQL file with a specific dialect

```sqlfluff lint --dialect [postgres] [path/to/query.sql]```

**Auto-fix** lint violations in place

```sqlfluff fix --dialect [bigquery] [path/to/queries/]```

**Format** SQL via stdin

```cat [query.sql] | sqlfluff format --dialect [snowflake] -```

**Show parsed token tree** for a query

```sqlfluff parse --dialect [mysql] [query.sql]```

**Lint only specific rules**

```sqlfluff lint --rules [LT01,LT02,CP01] [path/to/file.sql]```

**Exclude noisy rules** from a run

```sqlfluff lint --exclude-rules [L034,L036] [path/to/file.sql]```

**Render** a templated query (expand Jinja/dbt) without linting

```sqlfluff render --dialect [ansi] [query.sql]```

# SYNOPSIS

**sqlfluff** _command_ [_options_] _PATH_...

Commands: **lint**, **fix**, **format**, **parse**, **render**, **rules**, **dialects**, **fluff** (legacy alias)

# PARAMETERS

**--dialect** _NAME_
> SQL dialect to parse against (e.g. **ansi**, **postgres**, **mysql**, **bigquery**, **snowflake**, **redshift**, **tsql**, **sqlite**, **duckdb**, **databricks**). Run **sqlfluff dialects** for the full list.

**--templater** _NAME_
> Templating engine to use before parsing: **raw**, **jinja**, **python**, **placeholder**, or **dbt**.

**--rules** _LIST_
> Comma-separated list of rules (or rule groups) to enable.

**--exclude-rules** _LIST_
> Comma-separated list of rules to skip.

**-f**, **--force**
> For **fix**: apply changes without asking for confirmation.

**--FIX-EVEN-UNPARSABLE**
> Allow **fix** to operate on files with templating or parse errors (dangerous).

**--processes** _N_
> Number of parallel workers; **0** means all CPUs, negative means cpus + N.

**-v**, **-vv**, **-vvv**
> Increase verbosity; stackable.

**--nocolor**
> Disable ANSI color in output.

**--format** _FMT_
> Output format: **human**, **json**, **yaml**, **github-annotation**, **github-annotation-native**.

**--config** _FILE_
> Path to an explicit **.sqlfluff** configuration file.

**--encoding** _ENC_
> File encoding to use when reading sources (default **autodetect**).

**--disable-noqa**
> Ignore **-- noqa:** comments embedded in SQL.

# DESCRIPTION

**sqlfluff** is a dialect-aware linter and auto-formatter for SQL. It parses queries into an abstract syntax tree, applies a configurable set of rules, and reports or rewrites violations. Unlike text-based linters, the AST approach lets it enforce structural rules such as comma placement, keyword casing, ambiguous joins, and column-reference qualification.

The tool supports a wide range of dialects (PostgreSQL, MySQL, BigQuery, Snowflake, Redshift, T-SQL, SQLite, DuckDB, Databricks, ANSI, and more) and integrates with templating engines so it can lint queries written in **Jinja**, **dbt**, or custom placeholder syntaxes without first rendering them.

Operation is split into commands: **lint** reports violations, **fix** rewrites the source in place, **format** applies layout-only fixes, **parse** dumps the token tree, and **render** expands templating without linting. Configuration is layered: built-in defaults are overridden by **.sqlfluff** files discovered up the directory tree, **pyproject.toml** sections, then command-line flags.

# CONFIGURATION

**.sqlfluff**
> Per-project INI-style configuration; the search walks upward from the linted file. Example:

```
[sqlfluff]
dialect = postgres
templater = jinja
exclude_rules = L034,L036

[sqlfluff:rules:capitalisation.keywords]
capitalisation_policy = upper

[sqlfluff:indentation]
tab_space_size = 2
indent_unit = space
```

**pyproject.toml**
> Settings live under **[tool.sqlfluff.*]** sections that mirror the INI layout.

**~/.sqlfluff**
> User-level fallback applied to projects without their own config.

**-- noqa:** comments
> Inline directives to disable rules on a line or block, e.g. **SELECT * -- noqa: L044**.

# RULE GROUPS

Rules are namespaced by area: **LT** layout, **CP** capitalisation, **CV** convention, **RF** references, **ST** structure, **AM** ambiguity, **AL** aliasing, **JJ** Jinja. Use **sqlfluff rules** to print the complete catalog with codes, names, and descriptions.

# CAVEATS

Templated SQL must parse after rendering; unresolved variables raise template errors that suppress most lint output. **fix** rewrites files even when the underlying SQL has subtle semantic implications (e.g. column-order changes from re-aliasing); review diffs before committing. Dialect parsers vary in coverage; very recent vendor syntax may not yet be recognized. Older numeric rule codes (**L001**, **L002**, ...) were renamed to mnemonic codes (**LT01**, **CP01**, ...) in **2.0**; legacy codes are aliased but deprecated.

# HISTORY

**SQLFluff** was started by **Alan Cruickshank** in **2019** as an open-source dialect-aware alternative to text-based SQL linters. Version **1.0** shipped in **2022**, and **2.0** in **2023** brought a redesigned rule taxonomy with mnemonic codes and a templating-aware fix engine. The project is maintained on **github.com/sqlfluff/sqlfluff** under the MIT license.

# SEE ALSO

[dbt](/man/dbt)(1), [psql](/man/psql)(1)
