# TAGLINE

Inspect Apache Parquet files from the command line

# TLDR

**Print schema**

```pqrs schema [file.parquet]```

**Print contents**

```pqrs cat [file.parquet]```

**JSON lines output**

```pqrs cat [file.parquet] --json```

**CSV output**

```pqrs cat [file.parquet] --csv```

**First N records**

```pqrs head [file.parquet] --records [10] --json```

**Row count**

```pqrs rowcount [file.parquet]```

**File size breakdown**

```pqrs size [file.parquet]```

**Random sample**

```pqrs sample [file.parquet]```

# SYNOPSIS

**pqrs** [*flags*] *subcommand* [*args*]

# DESCRIPTION

**pqrs** is a Rust command-line utility for inspecting Apache Parquet files (roughly "parquet-tools in Rust"). It is built on the Arrow/Parquet Rust crates and replaces much of the deprecated Java **parquet-tools** workflow for schema, content, and size inspection.

Install from GitHub releases, **cargo install pqrs**, or Homebrew (**manojkarthick/tap/pqrs**).

# PARAMETERS

**cat** *files*...

> Print records. **--json**, **--csv**, **--csv-data-only** / **--no-header** control format. Recurses into directories.

**head** *file*

> First N records (**--records**). Supports **--json**.

**schema** *files*...

> Print Parquet schema.

**rowcount** *files*...

> Print row counts.

**size** *files*...

> Print size information.

**sample** *file*

> Random sample of records.

**merge** *files*...

> Merge files by concatenating row groups into another Parquet file.

**-d**, **--debug**

> Debug output.

# CAVEATS

CSV output is not supported for files with Struct or Byte fields. Nested data is better viewed as default or **--json**. Very large files may need sampling rather than full **cat**.

# SEE ALSO

[parquet-tools](/man/parquet-tools)(1), [duckdb](/man/duckdb)(1), [arrow-tools](/man/arrow-tools)(1)

# RESOURCES

```[Source code](https://github.com/manojkarthick/pqrs)```

<!-- verified: 2026-07-19 -->
