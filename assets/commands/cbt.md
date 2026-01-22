# TLDR

**List all tables in an instance**

```cbt -project [project_id] -instance [instance_id] ls```

**Read rows from a table**

```cbt -project [project_id] -instance [instance_id] read [table_name]```

**Count rows in a table**

```cbt -project [project_id] -instance [instance_id] count [table_name]```

**Create a new table**

```cbt -project [project_id] -instance [instance_id] createtable [table_name]```

**Create a column family**

```cbt -project [project_id] -instance [instance_id] createfamily [table_name] [family_name]```

**Write a value to a cell**

```cbt -project [project_id] -instance [instance_id] set [table_name] [row_key] [family]:[column]=[value]```

# SYNOPSIS

**cbt** [**-project** _project_] [**-instance** _instance_] [**-creds** _file_] [**-timeout** _duration_] _command_ [_arguments..._]

# DESCRIPTION

**cbt** is a command-line interface for Google Cloud Bigtable, a fully managed NoSQL database service. It allows performing administrative and data operations on Bigtable instances, tables, column families, and rows.

The tool can be configured via a **~/.cbtrc** file containing project and instance defaults, or by passing flags directly.

# PARAMETERS

**-project** _project_id_
> Google Cloud project ID. Uses gcloud default if unset

**-instance** _instance_id_
> Cloud Bigtable instance name

**-creds** _file_
> Path to credentials JSON file

**-timeout** _duration_
> Operation timeout (e.g., 10s, 5m)

**Common commands:**

**ls** - List tables
**read** _table_ - Read rows from table
**count** _table_ - Count rows in table
**createtable** _table_ - Create a table
**deletetable** _table_ - Delete a table
**createfamily** _table_ _family_ - Create column family
**set** _table_ _row_ _family:col=val_ - Write cell value
**deleterow** _table_ _row_ - Delete a row
**help** - Print help text

# CAVEATS

The cbt CLI does not implement smart retries or advanced error handling. For production environments, use a Bigtable client library or the Google Cloud console instead.

Bash shell syntax rules apply: values with spaces or operators require quotes, and arbitrary byte values need dollar-sign prefix with single quotes.

# HISTORY

The **cbt** tool was developed by Google as part of the Cloud Bigtable ecosystem, written in Go using the official Go client library for Bigtable. It provides a quick way to interact with Bigtable for development and debugging purposes.

# SEE ALSO

[gcloud](/man/gcloud)(1), [bq](/man/bq)(1)
