# TAGLINE

distributed SQL database CLI

# TLDR

**Start single-node cluster**

```cockroach start-single-node --insecure```

**Start SQL shell**

```cockroach sql --insecure --host=[localhost]```

**Execute SQL statement**

```cockroach sql --insecure -e "[SELECT * FROM users]"```

**Initialize cluster**

```cockroach init --insecure --host=[localhost]```

**Show node status**

```cockroach node status --insecure```

**Create database**

```cockroach sql --insecure -e "CREATE DATABASE [mydb]"```

**Import CSV data into a table**

```cockroach sql --insecure -e "IMPORT INTO [table] CSV DATA ('[file_url]')"```

**Start a temporary demo cluster**

```cockroach demo```

**Show cluster settings**

```cockroach sql --insecure -e "SHOW CLUSTER SETTINGS"```

# SYNOPSIS

**cockroach** _command_ [_options_]

# DESCRIPTION

**cockroach** is the command-line interface for CockroachDB, a distributed SQL database designed for cloud-native applications. It provides comprehensive tools for managing multi-node clusters, executing SQL queries, performing backups and restores, and monitoring cluster health and performance.

CockroachDB combines the scalability of NoSQL systems with the consistency guarantees and SQL interface of traditional relational databases. The CLI handles cluster initialization, node management, certificate generation for secure deployments, and direct SQL execution either interactively or programmatically.

The tool supports both secure production deployments with TLS certificates and insecure development environments. It includes a demo mode for experimentation and testing without requiring persistent storage or cluster setup.

# COMMANDS

**start**
> Start a CockroachDB node

**start-single-node**
> Start single-node cluster

**init**
> Initialize multi-node cluster

**sql**
> Open SQL shell or execute statements

**node**
> Manage cluster nodes

**quit**
> Drain and shut down node

**cert**
> Create CA, node, and client certificates

**debug**
> Debugging commands for inspecting cluster state

**workload**
> Generators for data and query loads (e.g., benchmarks)

**nodelocal upload**
> Upload a file to a node's local file system

**version**
> Show version

**demo**
> Start temporary demo cluster

# PARAMETERS

**--insecure**
> Disable TLS (development only)

**--host**=_address_
> Server address

**--port**=_port_
> Server port (default: 26257)

**--certs-dir**=_path_
> Certificate directory

**--store**=_path_
> Data storage location

**-e**, **--execute**=_sql_
> Execute SQL statement

**--url**=_url_
> Connection URL

**--log-dir**=_path_
> Directory for log files

**--listen-addr**=_address_
> Address and port to listen on (default: localhost:26257)

# ENVIRONMENT

Flags can be set via environment variables: COCKROACH_HOST, COCKROACH_PORT, COCKROACH_USER, COCKROACH_INSECURE

# CAVEATS

Use --insecure only for development. Production requires TLS certificates. Compatible with PostgreSQL wire protocol.

# SEE ALSO

[psql](/man/psql)(1), [mysql](/man/mysql)(1), [sqlite3](/man/sqlite3)(1)
