# TAGLINE

exports Cloud SQL data to storage

# TLDR

**Export database to Cloud Storage**

```gcloud sql export sql [instance] [gs://bucket/file.sql] --database [db_name]```

**Export all databases**

```gcloud sql export sql [instance] [gs://bucket/file.sql]```

**Export asynchronously**

```gcloud sql export sql [instance] [gs://bucket/file.sql] --async```

# SYNOPSIS

**gcloud** **sql** **export** **sql** _instance_ _uri_ [_options_]

# PARAMETERS

**--database** _name_
> Database to export.

**--table** _name_
> Tables to export.

**--async**
> Don't wait for completion.

**--offload**
> Offload to replica.

# DESCRIPTION

**gcloud sql export sql** exports data from a Cloud SQL instance to a SQL dump file stored in Google Cloud Storage. The command creates a database backup in standard SQL format that can be imported into other database systems or restored to Cloud SQL instances.

The tool supports both MySQL and PostgreSQL instances. Exports can target specific databases or tables, or dump all databases at once. The async mode allows long-running exports to continue in the background without blocking the terminal. Offloading exports to read replicas minimizes performance impact on production instances.

# SEE ALSO

[gcloud-sql-import-sql](/man/gcloud-sql-import-sql)(1), [gcloud-sql](/man/gcloud-sql)(1)

