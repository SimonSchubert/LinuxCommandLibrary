# TAGLINE

Google BigQuery command-line interface

# TLDR

**Query** data

```bq query ["SELECT * FROM dataset.table LIMIT 10"]```

**List** datasets

```bq ls```

**Show** table schema

```bq show [dataset.table]```

**Load** data

```bq load --source_format=CSV [dataset.table] [data.csv] [schema.json]```

**Extract** data

```bq extract [dataset.table] gs://[bucket/file.csv]```

# SYNOPSIS

**bq** [_options_] _command_

# DESCRIPTION

**bq** is the command-line interface for Google BigQuery. It enables querying massive datasets, managing tables and datasets, loading data, and controlling access through a unified interface.

The tool provides programmatic access to BigQuery's data warehouse capabilities.

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
> Use standard SQL (recommended)

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
> User configuration file for default project, dataset, format, and query settings.

# CAVEATS

Requires Google Cloud project and authentication. Queries cost based on data processed. Large exports require Cloud Storage. Legacy SQL vs Standard SQL differences. Query costs can accumulate quickly.

# HISTORY

**bq** was released by Google with BigQuery around **2011** as the primary command-line interface for the data warehouse service.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gsutil](/man/gsutil)(1), [psql](/man/psql)(1)
