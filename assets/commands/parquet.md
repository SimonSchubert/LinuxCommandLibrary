# TAGLINE

command-line tool for inspecting and converting Apache Parquet files

# TLDR

**Show file schema**

```parquet schema [file.parquet]```

**Show metadata**

```parquet meta [file.parquet]```

**Show the first 10 rows**

```parquet head -n [10] [file.parquet]```

**Print selected columns**

```parquet cat -c [col1,col2] [file.parquet]```

**Show the size of each column**

```parquet column-size [file.parquet]```

**Convert CSV to Parquet**

```parquet convert-csv [input.csv] -o [output.parquet]```

**Rewrite files into one**

```parquet rewrite -i [file1.parquet] [file2.parquet] -o [output.parquet]```

**Show help** for a command

```parquet help [command]```

# SYNOPSIS

**parquet** [**-v**] _command_ [_options_] _file_

# COMMANDS

**schema**
> Print the Avro schema for a file.

**meta**
> Print a file's metadata.

**footer**
> Print the file footer in JSON format.

**pages**
> Print page summaries.

**dictionary**
> Print dictionaries for a column.

**head**, **cat**
> Print the first N records from a file.

**scan**
> Scan all records from a file.

**column-size**
> Print the column sizes.

**column-index**
> Print the column and offset indexes.

**size-stats**
> Print size statistics.

**bloom-filter**
> Check bloom filters for a column.

**check-stats**
> Check for corrupt page and column stats.

**csv-schema**
> Build a schema from a CSV sample.

**convert-csv**
> Create a Parquet file from CSV data.

**convert**
> Create a Parquet file from a data file.

**to-avro**
> Create an Avro file from a data file.

**rewrite**
> Rewrite one or more Parquet files to a new file.

# PARAMETERS

**-v**, **--verbose**, **--debug**
> Print extra debugging information.

**-n**, **--num-records** _num_
> Number of records to print (head, cat).

**-c**, **--column**, **--columns** _names_
> Columns to read.

**-o**, **--output** _file_
> Output file.

**-s**, **--schema** _file_
> Avro schema file to use.

**--compression-codec** _codec_
> Compression codec for the output file.

**--overwrite**
> Replace an existing output file.

**--delimiter** _char_
> CSV delimiter character.

**--no-header**
> Do not use the first CSV line as a header.

# DESCRIPTION

**parquet** is the command-line interface from the Apache Parquet Java project, packaged as **parquet-cli**. It inspects and manipulates Parquet files, showing schema, metadata, and contents, and converts data to and from CSV and Avro.

**Parquet** is a columnar storage format that provides efficient compression and encoding for analytics workloads.

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

Requires a JVM. Without a packaged launcher, it runs through **hadoop jar** or **java -cp** with the parquet-cli jar. The older Java **parquet-tools** is deprecated upstream and its commands are not identical; **rowcount** and **merge** have no direct equivalent here. **prune**, **trans-compression** and **masking** are deprecated in favor of **rewrite**.

# HISTORY

Apache Parquet was created as collaboration between **Twitter** and **Cloudera** in **2013** for efficient big data storage.

# SEE ALSO

[parquet-tools](/man/parquet-tools)(1), [pqrs](/man/pqrs)(1), [duckdb](/man/duckdb)(1), [orc-tools](/man/orc-tools)(1), [avro-tools](/man/avro-tools)(1), [spark](/man/spark)(1)

# RESOURCES

```[Source code](https://github.com/apache/parquet-java/tree/master/parquet-cli)```

```[Homepage](https://parquet.apache.org/)```

```[Documentation](https://parquet.apache.org/docs/file-format/)```

<!-- verified: 2026-11-08 -->
