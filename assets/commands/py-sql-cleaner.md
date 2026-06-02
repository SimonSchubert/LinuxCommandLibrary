# TAGLINE

Format and extract SQL strings embedded in Python source files

# TLDR

**List** embedded SQL blocks in a Python file

```py-sql-cleaner list jobs/load_users.py```

**Format** SQL in place using the generic dialect

```py-sql-cleaner format jobs/load_users.py```

**Preview** formatting changes without writing

```py-sql-cleaner format jobs/load_users.py --dry-run```

**Format** using a specific dialect (mysql, postgres, redshift)

```py-sql-cleaner format jobs/load_users.py -d postgres```

**Extract** SQL to standalone .sql files

```py-sql-cleaner extract jobs/load_users.py --out-dir sql```

**Check** SQL formatting in CI (non-zero exit on diff)

```py-sql-cleaner check jobs/load_users.py```

**List** supported SQL dialects

```py-sql-cleaner dialects```

# SYNOPSIS

**py-sql-cleaner** _command_ [_options_] _file_

# DESCRIPTION

**py-sql-cleaner** is a Python CLI that finds triple-quoted SQL strings inside Python files and reformats or extracts them using **SQLGlot**. It is intended for ETL and data-engineering projects where SQL is embedded in `.py` files rather than kept in separate `.sql` files.

The tool is conservative by default. f-strings, Jinja templates and other runtime placeholders are detected but skipped instead of being rewritten, so formatting cannot silently change a query that depends on interpolation.

py-sql-cleaner never connects to a database and never executes SQL. The supported dialects (`generic`, `mysql`, `postgres`, `redshift`) only select SQLGlot's parser and formatter mode, not full database validation.

The `check` subcommand exits non-zero when formatting would change a file, making it suitable as a pre-commit hook or CI gate next to `black`, `ruff` and similar formatters.

# PARAMETERS

**list** _file_
> Show every embedded SQL block found in the file.

**format** _file_
> Reformat embedded SQL in place.

**extract** _file_
> Write each SQL block to a separate `.sql` file.

**check** _file_
> Exit non-zero if formatting would change the file.

**dialects**
> Print supported SQL dialects.

**-d**, **--dialect** _NAME_
> Select dialect: `generic`, `mysql`, `postgres`, `redshift`.

**--dry-run**
> Print the formatted result instead of writing it.

**--out-dir** _DIR_
> Output directory for `extract`.

**--version**
> Print the installed version.

# INSTALLATION

```pip install py-sql-cleaner```

Or with pipx for isolated installation:

```pipx install py-sql-cleaner```

Run without installing:

```uvx py-sql-cleaner --help```

# CAVEATS

The project is an early MVP. f-strings and templating syntax are intentionally skipped to avoid breaking queries that build SQL at runtime. Dialect selection affects parsing only and does not guarantee a query will execute on the target database.

# SEE ALSO

[black](/man/black), [ruff](/man/ruff), [sqlfluff](/man/sqlfluff)
