# TLDR

**Show schema**

```parquet-tools schema [file.parquet]```

**View data**

```parquet-tools cat [file.parquet]```

**Show metadata**

```parquet-tools meta [file.parquet]```

**View first N rows**

```parquet-tools head -n [10] [file.parquet]```

**Show row count**

```parquet-tools rowcount [file.parquet]```

**Convert to JSON**

```parquet-tools cat --json [file.parquet]```

**Show column info**

```parquet-tools column-index [file.parquet]```

# SYNOPSIS

**parquet-tools** _command_ [_options_] _file_

# PARAMETERS

**cat**
> Print file contents.

**head**
> Print first rows.

**schema**
> Show schema.

**meta**
> Show file metadata.

**rowcount**
> Count rows.

**column-index**
> Show column index.

**-n** _N_
> Number of rows.

**--json**
> JSON output format.

**--columns** _COLS_
> Specific columns.

# DESCRIPTION

**parquet-tools** inspects Apache Parquet files. Parquet is a columnar storage format used in big data systems.

Schema inspection shows column names, types, and nesting. This helps understand data structure without reading contents.

Cat and head commands display actual data. JSON output integrates with other tools.

Metadata shows compression, encoding, and statistics. Row groups and column chunks reveal physical layout.

Parquet files from Spark, Hive, and other systems can be examined. Useful for debugging data pipelines.

# CAVEATS

Large files may be slow to fully read. Some complex types display differently. Requires Java runtime.

# HISTORY

**Parquet** format was developed by **Twitter** and **Cloudera** around **2013**. parquet-tools provides command-line inspection for the widely-adopted columnar format.

# SEE ALSO

[parquet](/man/parquet)(1), [avro-tools](/man/avro-tools)(1), [orc-tools](/man/orc-tools)(1)
