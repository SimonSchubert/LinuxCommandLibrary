# TAGLINE

Stream PostgreSQL changes to Apache Iceberg tables on S3

# TLDR

**Sync** Postgres WAL to Iceberg and serve queries

```streambed sync --source-url=[postgres://user:pass@host:5432/db] --s3-bucket=[bucket] --s3-endpoint=[https://s3] --s3-prefix=[path] --query-addr=:5433```

**Backfill** an Iceberg table with a one-shot snapshot

```streambed resync --source-url=[postgres://...] --s3-bucket=[bucket] --s3-prefix=[path]```

**Serve queries** against existing Iceberg tables (no Postgres connection)

```streambed query --s3-bucket=[bucket] --s3-prefix=[path] --query-addr=:5433```

**Delete** S3 objects and state for a table

```streambed cleanup --s3-bucket=[bucket] --s3-prefix=[path] --table=[name]```

**Inspect** sync flags

```streambed sync --help```

# SYNOPSIS

**streambed** _sync_|_resync_|_query_|_cleanup_ [_flags_]

# DESCRIPTION

**streambed** is a change data capture (CDC) tool written in Go. It tails the **PostgreSQL** write-ahead log using logical replication, writes the resulting changes as **Parquet** files to **S3**, and commits **Apache Iceberg** metadata so the data is queryable as a versioned analytical table.

The `sync` subcommand runs as a long-lived daemon and can optionally expose a query endpoint compatible with the **PostgreSQL wire protocol**, so existing Postgres clients can read Iceberg tables without changes. `resync` performs a one-shot backfill under a consistent snapshot using `COPY`. `query` runs the wire-protocol server alone against tables that were already populated. `cleanup` deletes S3 objects and tracking state for a given table.

Streambed targets the use case of offloading analytical workloads from a production Postgres instance to an Iceberg-on-S3 lakehouse while still letting tools that speak the Postgres protocol query the result.

# PARAMETERS

**sync**
> Stream WAL changes, write Iceberg, optionally serve queries.

**resync**
> One-shot backfill via `COPY` under a consistent snapshot.

**query**
> Postgres-wire query server for existing Iceberg tables.

**cleanup**
> Delete S3 objects and state for a table.

**--source-url** _URL_
> Postgres connection string (or `STREAMBED_SOURCE_URL`).

**--s3-bucket** _NAME_
> Destination S3 bucket (or `STREAMBED_S3_BUCKET`).

**--s3-endpoint** _URL_
> S3 endpoint (use MinIO or other S3-compatible storage).

**--s3-prefix** _PATH_
> Key prefix within the bucket.

**--query-addr** _HOST:PORT_
> Bind address for the Postgres-wire query server.

# CONFIGURATION

Every flag has an environment-variable equivalent with a `STREAMBED_` prefix (for example `STREAMBED_SOURCE_URL`).

# INSTALLATION

The project is built from source:

```go build -o streambed ./cmd/streambed```

# CAVEATS

Streambed needs Postgres logical replication to be enabled (`wal_level = logical`) and a replication slot. Like any CDC pipeline it can fall behind if the WAL grows faster than it is consumed, which keeps WAL segments on the primary until they are processed.

# SEE ALSO

[pg_basebackup](/man/pg_basebackup)(1), [pg_recvlogical](/man/pg_recvlogical)(1), [trino](/man/trino), [duckdb](/man/duckdb)
