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

**csv-diff** compares two CSV files and shows added, removed, and changed rows. It's useful for tracking changes in data exports, database dumps, or any tabular data.

Part of the csvkit tools or available as a standalone Python package.

# SEE ALSO

[csvformat](/man/csvformat)(1), [diff](/man/diff)(1)
