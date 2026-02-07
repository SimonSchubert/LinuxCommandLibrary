# TAGLINE

Manage serverless ETL jobs and data catalog

# TLDR

**Create a crawler** to discover data schema

```aws glue create-crawler --name [my-crawler] --role [arn:aws:iam::account:role/glue-role] --database-name [my-database] --targets S3Targets=[{Path=s3://my-bucket/data/}]```

**Start a crawler**

```aws glue start-crawler --name [my-crawler]```

**List all databases** in the Data Catalog

```aws glue get-databases```

**Get table schema** from the catalog

```aws glue get-table --database-name [my-database] --name [my-table]```

**Create and start a Glue job**

```aws glue create-job --name [my-job] --role [arn:aws:iam::account:role/glue-role] --command Name=glueetl,ScriptLocation=s3://my-bucket/scripts/job.py```

**Start a job run** with arguments

```aws glue start-job-run --job-name [my-job] --arguments '{"--input_path":"s3://bucket/input","--output_path":"s3://bucket/output"}'```

**Get job run status**

```aws glue get-job-run --job-name [my-job] --run-id [jr_abc123]```

# SYNOPSIS

**aws glue** _command_ [_options_]

# DESCRIPTION

**aws glue** is the AWS CLI interface for AWS Glue, a serverless data integration service for ETL (extract, transform, load) workloads. Glue discovers, prepares, and combines data for analytics, machine learning, and application development.

Key components include the **Data Catalog** (central metadata repository), **Crawlers** (automatic schema discovery), **Jobs** (ETL scripts in Python or Scala), and **Triggers** (job orchestration). Glue integrates with S3, Redshift, RDS, and other data stores.

# COMMANDS

**create-crawler**
> Create a crawler for schema discovery

**start-crawler**
> Run a crawler to populate the catalog

**get-databases**
> List databases in the Data Catalog

**get-tables**
> List tables in a database

**get-table**
> Get schema details for a table

**create-job**
> Create an ETL job

**start-job-run**
> Execute a job

**get-job-run**
> Check job run status

**create-trigger**
> Create a job trigger

**get-crawlers**
> List all crawlers

# CAVEATS

Crawlers can take significant time on large datasets. Job cold start adds latency; use job bookmarks for incremental processing. DPU (Data Processing Unit) costs accumulate during job runs. The Data Catalog has limits on tables per database (200,000).

# HISTORY

AWS Glue launched in **August 2017** as a serverless ETL service. Glue Studio for visual ETL authoring came in **2020**. Data Quality features were added in **2022**, and Glue for Ray (distributed Python) launched in **2023** for data science workloads.

# SEE ALSO

[aws](/man/aws)(1), [aws-athena](/man/aws-athena)(1), [aws-s3](/man/aws-s3)(1), [aws-redshift](/man/aws-redshift)(1)
