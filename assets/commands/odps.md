# TAGLINE

command-line client for Alibaba Cloud MaxCompute (ODPS)

# TLDR

**Start the interactive client**

```odps```

**Execute a single SQL statement**

```odps -e "[SELECT * FROM table LIMIT 10;]"```

**Run a SQL script file**

```odps -f [query.sql]```

**Specify the target project** and endpoint

```odps --project [my_project] --endpoint [https://service.cn-shanghai.maxcompute.aliyun.com/api]```

**Set output format** to CSV

```odps -e "[SELECT * FROM table;]" --format csv```

# SYNOPSIS

**odps** [_options_]

# PARAMETERS

**-e** _SQL_
> Execute a single statement and exit. Multiple statements may be separated with semicolons.

**-f** _FILE_
> Execute the SQL script read from _FILE_.

**--project** _NAME_
> MaxCompute project to use for the session. Overrides the value in **odps_config.ini**.

**--endpoint** _URL_
> MaxCompute service endpoint URL. Required when not set in the configuration file.

**--access-id** _ID_
> Alibaba Cloud Access Key ID. Reads from **odps_config.ini** by default.

**--access-key** _KEY_
> Alibaba Cloud Access Key Secret.

**--format** _FORMAT_
> Output format: text (default), csv, json.

**-r**, **--retry** _N_
> Number of times to retry a failed network call.

**--help**
> Display usage information.

# DESCRIPTION

**odps** is the official command-line client for Alibaba Cloud's MaxCompute service (formerly Open Data Processing Service, abbreviated ODPS). It opens an interactive SQL prompt against a MaxCompute project where the user can run SQL queries, manage tables, partitions, resources, and functions, and submit MapReduce or Spark jobs.

Non-interactive use is supported through **-e** for one-off statements and **-f** for SQL files, which is the common pattern in scheduled pipelines. The client reads endpoint URLs and credentials from **conf/odps_config.ini** so the same binary can target multiple regions by swapping configuration files.

# CAVEATS

Requires a valid Alibaba Cloud Access Key pair with permissions on the target MaxCompute project. Each statement consumes billable compute and storage resources. Endpoint URLs are region-specific; cross-region access is generally not permitted. Java 8 or later is required because the client is a Java JAR wrapped in a shell script.

# HISTORY

The MaxCompute service launched as **ODPS** within Alibaba's internal infrastructure and was opened to public cloud customers around **2014**. The client retained the **odps** name even after the service was rebranded as MaxCompute, so legacy scripts and documentation often refer to either name interchangeably.

# SEE ALSO

[odpscmd](/man/odpscmd)(1), [odps-tunnel](/man/odps-tunnel)(1)
