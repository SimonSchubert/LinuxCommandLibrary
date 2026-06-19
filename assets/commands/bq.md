# TAGLINE

Google BigQuery command-line interface

# TLDR

**Query** data with standard SQL

```bq query --use_legacy_sql=false "SELECT * FROM [dataset.table] LIMIT 10"```

**List** datasets in the current project

```bq ls```

**List** tables in a dataset

```bq ls [dataset]```

**Show** table schema and metadata

```bq show [dataset.table]```

**Load** a CSV file into a table

```bq load --source_format=CSV [dataset.table] [data.csv] [schema.json]```

**Extract** a table to Cloud Storage

```bq extract [dataset.table] gs://[bucket]/[file.csv]```

**Estimate** the bytes a query would process without running it

```bq query --dry_run --use_legacy_sql=false "[SELECT ...]"```

# SYNOPSIS

**bq** [_options_] _command_

# DESCRIPTION

**bq** is the Python-based command-line interface for Google BigQuery, shipped as part of the Google Cloud CLI (gcloud). It enables querying massive datasets, managing tables and datasets, loading data, and controlling access through a unified interface.

Resources are addressed as **PROJECT:DATASET.TABLE**; the project prefix can be omitted when a default project is configured. Commands take the form **bq COMMAND [FLAGS] [ARGUMENTS]**, where global flags (such as **--project_id**) work across commands and command-specific flags apply to a single command.

# PARAMETERS

**--project_id** _id_
> Project ID

**--dataset_id** _id_
> Dataset ID

**--format** _format_
> Output format (json, csv, prettyjson)

**--max_rows** _n_
> Maximum rows to return

**--use_legacy_sql=false**
> Use GoogleSQL (standard SQL) instead of the legacy dialect. Recommended.

**--location** _region_
> Region or multi-region for the job or resource (for example US, EU, asia-northeast1).

**--dry_run**
> Validate the query and report bytes processed without executing it.

**--apilog** _file_
> Log API requests and responses to a file (use - for stdout) for debugging.

# COMMON COMMANDS

**query** _sql_
> Execute SQL query

**ls** [_dataset_]
> List datasets or tables

**show** _resource_
> Show resource details

**mk** _dataset_
> Create dataset

**rm** _resource_
> Delete resource

**load** _table_ _source_
> Load data into table

**extract** _table_ _destination_
> Export table data

**cp** _source_ _destination_
> Copy table

# WORKFLOW

```bash
# Run query
bq query --use_legacy_sql=false \
  'SELECT name, count FROM `project.dataset.table` LIMIT 10'

# Create dataset
bq mk --dataset project:mydataset

# Create table
bq mk --table mydataset.mytable schema.json

# Load CSV
bq load --source_format=CSV \
  mydataset.mytable \
  gs://bucket/data.csv \
  name:STRING,age:INTEGER

# Export to GCS
bq extract mydataset.mytable gs://bucket/export.csv
```

# FEATURES

- Interactive and batch queries
- Dataset and table management
- Data loading from multiple sources
- Data export to Cloud Storage
- Access control management
- Scheduled queries
- Data transfer service

# CONFIGURATION

**~/.bigqueryrc**
> Default configuration file for default project, dataset, format, and per-command flag values. Override its location with **--bigqueryrc**.

# CAVEATS

Requires Google Cloud project and authentication. Queries cost based on data processed. Large exports require Cloud Storage. Legacy SQL vs Standard SQL differences. Query costs can accumulate quickly.

# HISTORY

**bq** was released by Google with BigQuery around **2011** as the primary command-line interface for the data warehouse service.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gsutil](/man/gsutil)(1), [psql](/man/psql)(1)

# RESOURCES

```[Homepage](https://cloud.google.com/bigquery/docs/bq-command-line-tool)```

```[Documentation](https://cloud.google.com/bigquery/docs/reference/bq-cli-reference)```

<!-- verified: 2026-06-19 -->
