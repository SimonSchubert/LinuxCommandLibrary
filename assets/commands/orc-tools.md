# TAGLINE

collection of utilities for working with Apache ORC files

# TLDR

**Show ORC file metadata**

```orc-metadata [file.orc]```

**Show file contents**

```orc-contents [file.orc]```

**Get file statistics**

```orc-statistics [file.orc]```

**Convert CSV to ORC**

```orc-tools convert [data.csv] -o [output.orc]```

**Scan ORC file**

```orc-scan [file.orc]```

**Merge ORC files**

```orc-tools merge [file1.orc] [file2.orc] -o [merged.orc]```

# SYNOPSIS

**orc-tools** _command_ [_options_] _files_...

# PARAMETERS

**metadata**
> Show file metadata.

**contents**
> Display contents.

**statistics**
> Show statistics.

**convert**
> Convert to ORC.

**scan**
> Scan and validate.

**merge**
> Merge files.

**-o** _file_
> Output file.

# DESCRIPTION

**orc-tools** is a collection of utilities for working with Apache ORC (Optimized Row Columnar) files. ORC is a columnar storage format optimized for Hadoop workloads.

The tools allow inspection, conversion, and manipulation of ORC files.

# ORC FEATURES

```
- Columnar storage
- Compression (ZLIB, Snappy, LZO)
- Predicate pushdown
- Type evolution
- ACID support
```

# CAVEATS

Java required. Large files may need memory tuning. Part of Apache ORC project.

# HISTORY

Apache ORC was created at **Hortonworks** for Hive, later becoming a top-level Apache project for efficient columnar storage.

# SEE ALSO

[parquet-tools](/man/parquet-tools)(1), [hive](/man/hive)(1), [spark](/man/spark)(1)
