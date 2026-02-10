# TAGLINE

data warehouse system for Hadoop

# TLDR

**Start Hive shell**

```hive```

**Execute query**

```hive -e "SELECT * FROM [table]"```

**Run script file**

```hive -f [script.hql]```

**Set configuration**

```hive --hiveconf [key=value]```

**Silent mode**

```hive -S -e "[query]"```

# SYNOPSIS

**hive** [_options_]

# PARAMETERS

**-e** _QUERY_
> Execute query.

**-f** _FILE_
> Execute script file.

**-S**, **--silent**
> Silent mode.

**--hiveconf** _KEY=VALUE_
> Set configuration.

**--database** _DB_
> Use database.

**-i** _FILE_
> Initialization file.

**--help**
> Display help information.

# DESCRIPTION

**Hive** is a data warehouse system for Hadoop. It provides SQL-like query language (HiveQL) for querying large datasets stored in HDFS.

The tool translates queries to MapReduce, Tez, or Spark jobs. It's used for data analysis and ETL on big data platforms.

# CAVEATS

Requires Hadoop cluster. Query latency higher than RDBMS. Schema on read.

# HISTORY

Apache Hive was developed at **Facebook** and contributed to the **Apache** project for SQL-based big data analytics.

# SEE ALSO

[beeline](/man/beeline)(1), [hadoop](/man/hadoop)(1), [spark-sql](/man/spark-sql)(1)
