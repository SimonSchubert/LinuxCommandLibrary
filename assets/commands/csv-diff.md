# TAGLINE

compare CSV files and show differences

# TLDR

**Diff two CSV files**

```csv-diff [old.csv] [new.csv]```

**Diff with specific key column**

```csv-diff [old.csv] [new.csv] --key [id]```

**Output as JSON**

```csv-diff [old.csv] [new.csv] --key [id] --json```

**Show unchanged fields** of rows that have at least one change

```csv-diff [old.csv] [new.csv] --key [id] --show-unchanged```

Compare **JSON files** (arrays of objects)

```csv-diff [old.json] [new.json] --key [id] --format json```

Use **custom nouns** in the summary

```csv-diff [old.csv] [new.csv] --key [id] --singular [tree] --plural [trees]```

Add a **templated extra field** to each reported row

```csv-diff [old.csv] [new.csv] --key [id] --extra [link] "[https://example.com/item/{id}]"```

# SYNOPSIS

**csv-diff** _previous_ _current_ [_options_]

# PARAMETERS

**--key** _column_
> Column to use as unique identifier.

**--format** _csv|tsv|json_
> Explicitly specify the input format instead of auto-detecting it.

**--json**
> Output changes as JSON.

**--show-unchanged**
> Show unchanged fields for rows with at least one change.

**--singular** _word_
> Singular word to use, e.g. "tree" for "1 tree".

**--plural** _word_
> Plural word to use, e.g. "trees" for "2 trees".

**--extra** _name_ _format_
> Display an extra field built from a Python format string such as "{id}". Can be repeated.

**--version**
> Show the version and exit.

# DESCRIPTION

**csv-diff** compares two CSV, TSV, or JSON files and shows added, removed, and changed rows. It's useful for tracking changes in data exports, database dumps, or any tabular data.

A **--key** column identifies rows across both files, so edited rows are reported as changed with per-field differences. Comma or tab separation is detected automatically. Output is human-readable by default, and machine-readable JSON is available via **--json**.

The tool is a standalone Python package by **Simon Willison**, installable via `pip install csv-diff`. It is distinct from csvkit.

# CAVEATS

Without **--key**, rows are identified by a hash of their whole content, so any edit shows up as one row removed and one row added. Choose a key column that is unique and present on both sides. Large files are loaded fully into memory.

# SEE ALSO

[csvkit](/man/csvkit)(1), [diff](/man/diff)(1), [jq](/man/jq)(1), [daff](/man/daff)(1)

# RESOURCES

```[Source code](https://github.com/simonw/csv-diff)```

<!-- verified: 2026-11-23 -->
