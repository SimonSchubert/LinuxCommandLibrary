# TAGLINE

compare CSV files and show differences

# TLDR

**Diff two CSV files**

```csv-diff [old.csv] [new.csv]```

**Diff with specific key column**

```csv-diff [old.csv] [new.csv] --key [id]```

**Output as JSON**

```csv-diff [old.csv] [new.csv] --json```

**Show only changes**

```csv-diff [old.csv] [new.csv] --show-unchanged```

# SYNOPSIS

**csv-diff** [_options_] _old.csv_ _new.csv_

# PARAMETERS

**--key** _column_
> Column to use as unique identifier.

**--json**
> Output in JSON format.

**--show-unchanged**
> Include unchanged rows in output.

**--singular** _name_
> Singular noun for rows.

**--plural** _name_
> Plural noun for rows.

# DESCRIPTION

**csv-diff** compares two CSV, TSV, or JSON files and shows added, removed, and changed rows. It's useful for tracking changes in data exports, database dumps, or any tabular data.

A **--key** column must be specified so rows can be matched across files. Output is human-readable by default, and machine-readable JSON is available via **--json**.

The tool is a standalone Python package by **Simon Willison**, installable via `pip install csv-diff`. It is distinct from csvkit.

# CAVEATS

Rows without a stable unique key cannot be meaningfully compared; choose a column guaranteed to be present on both sides. Large files are loaded fully into memory.

# SEE ALSO

[csvkit](/man/csvkit)(1), [diff](/man/diff)(1), [jq](/man/jq)(1)
