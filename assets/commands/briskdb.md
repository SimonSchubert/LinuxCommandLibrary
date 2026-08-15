# TAGLINE

Sharded SQLite engine with HTTP and PostgreSQL listeners

# TLDR

**Start the server** with four shard files

```briskdb --data-dir [./briskdb-data] --shards [4]```

**Listen on a custom HTTP address**

```briskdb --listen [127.0.0.1:7654] --data-dir [./briskdb-data]```

**Enable the PostgreSQL listener** (loopback, unauthenticated)

```briskdb --data-dir [./briskdb-data] --postgres-listen [127.0.0.1:5433]```

**Connect with psql** to the local listener

```psql -h [127.0.0.1] -p [5433] -d [default]```

**Check health** of a running instance

```curl http://127.0.0.1:7654/health```

**Query a registered table** over HTTP

```curl -X POST http://127.0.0.1:7654/v1/query -H 'content-type: application/json' -d '{"sql":"SELECT id, name FROM widgets WHERE id = ?1","params":["widget-1"]}'```

**Show version**

```briskdb --version```

# SYNOPSIS

**briskdb** [_options_]

# DESCRIPTION

**briskdb** is the standalone server for **BriskDB**, a Rust engine that presents many ordinary SQLite WAL files as one logical database. Writes to different shards use independent WAL locks, so they can proceed in parallel. A virtual-bucket router (4,096 buckets) assigns rows to shards; each shard remains a normal SQLite file that existing tools can inspect.

The same engine is also available as a Rust crate and a Python extension. The **briskdb** binary starts the HTTP listener (default **127.0.0.1:7654**) and optionally a PostgreSQL wire-protocol listener. HTTP serves **/health**, **/metrics**, **/admin** (a read-only data browser), and JSON query/write endpoints. The PostgreSQL listener is off by default (`--postgres-listen disabled`); an unauthenticated bind is loopback-only. TLS plus single-identity SCRAM-SHA-256 is required for any remote PostgreSQL bind.

A companion offline binary, **briskdb-import**, converts one read-only SQLite database into a new BriskDB data directory. It is not a live server endpoint and will not overwrite an existing destination.

BriskDB is an **alpha**. There is no general atomic transaction across shard files. Storage format and public APIs can change before 1.0.

# PARAMETERS

**--data-dir** _path_
> Directory for the manifest and shard files (default **./briskdb-data**; env **BRISKDB_DATA_DIR**).

**--shards** _n_
> Shard count when creating a new database, 2–64 (default **4**; env **BRISKDB_SHARDS**). Later opens detect the count from the manifest and reject a mismatch.

**--listen** _addr_
> HTTP listen address (default **127.0.0.1:7654**; env **BRISKDB_LISTEN**). Unauthenticated HTTP is loopback-only.

**--postgres-listen** _addr_|**disabled**
> PostgreSQL TCP listen address, or **disabled** (default; env **BRISKDB_POSTGRES_LISTEN**).

**--postgres-tls-cert** _path_
> PEM certificate chain for TLS on the PostgreSQL listener (env **BRISKDB_POSTGRES_TLS_CERT**). Must be set together with **--postgres-tls-key** and **--postgres-password-file**.

**--postgres-tls-key** _path_
> PEM private key for the PostgreSQL listener (env **BRISKDB_POSTGRES_TLS_KEY**).

**--postgres-user** _name_
> SCRAM-SHA-256 identity (default **briskdb**; env **BRISKDB_POSTGRES_USER**).

**--postgres-password-file** _path_
> File containing the PostgreSQL SCRAM password; do not pass the password on the command line (env **BRISKDB_POSTGRES_PASSWORD_FILE**).

**--connections-per-shard** _n_
> Maximum active SQLite connections per shard, 1–16 (env **BRISKDB_CONNECTIONS_PER_SHARD**).

**--queue-capacity-per-shard** _n_
> Maximum queued operations per shard, 1–1024 (env **BRISKDB_QUEUE_CAPACITY_PER_SHARD**).

**--max-result-rows** _n_
> Maximum rows materialized by one query (env **BRISKDB_MAX_RESULT_ROWS**).

**--max-result-bytes** _n_
> Maximum logical bytes materialized by one query (env **BRISKDB_MAX_RESULT_BYTES**).

**--request-timeout-ms** _n_
> Engine request timeout in milliseconds; **0** disables the default deadline (env **BRISKDB_REQUEST_TIMEOUT_MS**).

**--shutdown-grace-ms** _n_
> Graceful-shutdown drain period in milliseconds (env **BRISKDB_SHUTDOWN_GRACE_MS**).

**-h**, **--help**
> Show usage and exit.

**-V**, **--version**
> Print the version and exit.

# CAVEATS

This is pre-1.0 software: the on-disk layout and library API can change between releases. HTTP has no authentication and refuses non-loopback addresses. PostgreSQL TLS/SCRAM has a single identity and no roles. Cross-shard writes are not one atomic transaction. The supported backup is a stopped-server copy of the entire data directory after every server and embedder has exited. Multi-process access is same-host and local-filesystem only; schema and recovery work requires sole-process ownership.

# HISTORY

**BriskDB** is a 2026 alpha project by **schapman1974**, written in **Rust**. It keeps SQLite as the storage engine and adds shard routing, shard-safe generated IDs, HTTP and PostgreSQL protocol adapters, and a Debian/systemd package. MongoDB and MySQL listeners are planned.

# SEE ALSO

[sqlite3](/man/sqlite3)(1), [psql](/man/psql)(1), [duckdb](/man/duckdb)(1)

# RESOURCES

```[Source code](https://github.com/schapman1974/briskdb)```

```[Documentation](https://github.com/schapman1974/briskdb/blob/main/docs/ARCHITECTURE.md)```

<!-- verified: 2026-08-16 -->
