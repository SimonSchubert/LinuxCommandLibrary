# TLDR

**Start a query execution**

```aws athena start-query-execution --query-string "[SELECT * FROM table LIMIT 10]" --work-group [primary]```

**Start a query** with output location

```aws athena start-query-execution --query-string "[SELECT * FROM logs]" --result-configuration OutputLocation=s3://[bucket/results/]```

**Get query execution status**

```aws athena get-query-execution --query-execution-id [query-id]```

**Get query results**

```aws athena get-query-results --query-execution-id [query-id]```

**List query executions**

```aws athena list-query-executions --work-group [primary]```

**Create a database**

```aws athena start-query-execution --query-string "CREATE DATABASE [mydb]" --work-group [primary]```

**List databases** in a catalog

```aws athena list-databases --catalog-name AwsDataCatalog```

# SYNOPSIS

**aws athena** _command_ [_options_]

# PARAMETERS

**start-query-execution**
> Execute a SQL query asynchronously

**get-query-execution**
> Get information about a query execution

**get-query-results**
> Retrieve results of a completed query

**stop-query-execution**
> Cancel a running query

**list-query-executions**
> List query execution IDs

**list-databases**
> List databases in a data catalog

**list-table-metadata**
> List tables in a database

**create-work-group**
> Create a workgroup for queries

**get-work-group**
> Get workgroup configuration

**--query-string** _sql_
> SQL statement to execute

**--query-execution-id** _id_
> Identifier of query execution

**--work-group** _name_
> Workgroup to run the query in

**--query-execution-context** _context_
> Database and catalog context (Database=db,Catalog=catalog)

**--result-configuration** _config_
> Output location and encryption settings (OutputLocation=s3://path/)

**--max-results** _n_
> Maximum results to return

# DESCRIPTION

**aws athena** manages Amazon Athena, an interactive query service for analyzing data in Amazon S3 using standard SQL. Athena is serverless, requiring no infrastructure setup.

Queries are executed asynchronously via **start-query-execution**, which returns a query execution ID. Use **get-query-execution** to check status and **get-query-results** to retrieve results once complete. Results are also stored in the specified S3 output location.

Workgroups organize queries and control settings like result locations, encryption, and query limits. The **--query-execution-context** parameter specifies which database and data catalog to query against.

Athena uses the AWS Glue Data Catalog to store table metadata, or you can use an external Hive metastore. Tables are created over data in S3 using DDL statements like CREATE EXTERNAL TABLE.

# CAVEATS

Queries are charged based on data scanned; use partitioning and columnar formats (Parquet, ORC) to reduce costs. Query results expire after a configured period. Long-running queries may timeout. Requires appropriate IAM permissions for S3 data access and Glue catalog.

# HISTORY

**Amazon Athena** was launched in **November 2016** as a serverless query service based on Presto. It enables SQL queries on S3 data without provisioning infrastructure. Athena integrates with AWS Glue for schema discovery and supports ANSI SQL with extensions for nested data types common in analytics workloads.

# SEE ALSO

[aws](/man/aws)(1), [aws-s3](/man/aws-s3)(1), [aws-glue](/man/aws-glue)(1)
