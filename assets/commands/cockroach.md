# TAGLINE

distributed SQL database CLI

# TLDR

**Start single-node cluster**

```cockroach start-single-node --insecure```

**Start SQL shell**

```cockroach sql --insecure --host=[localhost]```

**Execute SQL statement**

```cockroach sql --insecure -e "[SELECT * FROM users]"```

**Start a node** of a multi-node cluster

```cockroach start --insecure --store=[node1] --listen-addr=[localhost:26257] --http-addr=[localhost:8080] --join=[localhost:26257,localhost:26258]```

**Initialize cluster**

```cockroach init --insecure --host=[localhost]```

**Show node status**

```cockroach node status --insecure```

**Drain a node** and shut it down

```cockroach node drain --self --shutdown --insecure --host=[localhost]```

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
> List, inspect, drain, decommission and recommission cluster nodes

**cert**
> Create CA, node, and client certificates

**debug**
> Debugging commands for inspecting cluster state

**workload**
> Generators for data and query loads (e.g., benchmarks)

**nodelocal upload**
> Upload a file to a node's local file system

**userfile**
> Upload, list, get and delete files in user-scoped storage

**gen**
> Generate man pages, bash completion, example data or an HAProxy config

**sqlfmt**
> Reformat SQL queries

**statement-diag**
> Manage and download statement diagnostics bundles

**convert-url**
> Convert a connection URL for a supported client driver

**auth-session**
> Manage web sessions and authentication tokens for the HTTP interface

**version**
> Show version

**demo**
> Start temporary demo cluster

# PARAMETERS

**--insecure**
> Disable TLS (development only)

**--host**=_address_
> Server address for client commands

**--port**=_port_
> Server port for client commands (default: 26257)

**--certs-dir**=_path_
> Certificate directory (default: ${HOME}/.cockroach-certs/)

**--store**=_path_
> Data storage location (default: cockroach-data)

**--join**=_addresses_
> Addresses of nodes to join; required by **start**

**-e**, **--execute**=_sql_
> Execute SQL statement

**--url**=_url_
> Connection URL

**--log-dir**=_path_
> Directory for log files

**--listen-addr**=_address_
> Address and port to listen on (default: all IP addresses on port 26257)

**--advertise-addr**=_address_
> Address and port to advertise to other nodes (default: value of --listen-addr)

**--http-addr**=_address_
> Address for the DB Console and HTTP API (default: port 8080)

**--locality**=_tiers_
> Key-value pairs describing the node location

**--cache**=_size_
> Storage engine cache size (default: 256 MiB)

**--max-sql-memory**=_size_
> Memory for SQL queries (default: 25%)

**--background**
> Start the node in the background

# ENVIRONMENT

Flags can be set via environment variables: COCKROACH_HOST, COCKROACH_PORT, COCKROACH_USER, COCKROACH_INSECURE

# CAVEATS

Use --insecure only for development. Production requires TLS certificates. Compatible with PostgreSQL wire protocol. For **cockroach start**, --host and --port are deprecated in favor of --listen-addr and --advertise-addr. The old **cockroach quit** command is replaced by **cockroach node drain --shutdown**.

# SEE ALSO

[psql](/man/psql)(1), [mysql](/man/mysql)(1), [sqlite3](/man/sqlite3)(1)

# RESOURCES

```[Source code](https://github.com/cockroachdb/cockroach)```

```[Homepage](https://www.cockroachlabs.com/)```

```[Documentation](https://docs.cockroachlabs.com/docs/stable/cockroach-commands)```

<!-- verified: 2026-11-09 -->
