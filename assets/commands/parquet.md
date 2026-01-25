# TLDR

**Show file schema**

```parquet-tools schema [file.parquet]```

**Show metadata**

```parquet-tools meta [file.parquet]```

**Show first rows**

```parquet-tools head [file.parquet]```

**Convert to JSON**

```parquet-tools cat --json [file.parquet]```

**Show row count**

```parquet-tools rowcount [file.parquet]```

**Merge files**

```parquet-tools merge [file1.parquet] [file2.parquet] [output.parquet]```

# SYNOPSIS

**parquet-tools** _command_ [_options_] _file_

# PARAMETERS

**schema**
> Show schema.

**meta**
> Show metadata.

**head**
> Show first rows.

**cat**
> Output all rows.

**rowcount**
> Count rows.

**merge**
> Merge files.

**--json**
> JSON output.

**-n** _num_
> Number of rows.

# DESCRIPTION

**Parquet** is a columnar storage format for big data. parquet-tools (or parquet-cli) inspects and manipulates Parquet files, showing schema, metadata, and contents.

Parquet provides efficient compression and encoding for analytics workloads.

# PARQUET FEATURES

```
- Columnar storage
- Schema embedded
- Compression (Snappy, GZIP, etc.)
- Predicate pushdown
- Nested data support
```

# PYTHON ALTERNATIVE

```python
import pyarrow.parquet as pq
table = pq.read_table('file.parquet')
print(table.schema)
```

# CAVEATS

Java-based tools require JVM. Consider pyarrow for Python workflows. Large files need memory.

# HISTORY

Apache Parquet was created as collaboration between **Twitter** and **Cloudera** in **2013** for efficient big data storage.

# SEE ALSO

[orc-tools](/man/orc-tools)(1), [avro-tools](/man/avro-tools)(1), [spark](/man/spark)(1)
