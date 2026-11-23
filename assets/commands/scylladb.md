# TAGLINE

High-performance Cassandra-compatible NoSQL database

# TLDR

**Start CQL shell**

```cqlsh```

**Connect to ScyllaDB node**

```cqlsh [hostname] [9042]```

**Connect with authentication**

```cqlsh -u [username] -p [password]```

**Execute CQL from file**

```cqlsh -f [script.cql]```

**Execute a single statement** and exit

```cqlsh -e "[DESCRIBE KEYSPACES;]"```

**Check node status**

```nodetool status```

**View ScyllaDB info**

```scylla --version```

**Check cluster status**

```nodetool describecluster```

**Flush memtables**

```nodetool flush```

**Find the hottest partitions** of a table over 5 seconds

```nodetool toppartitions [keyspace] [table] [5000]```

# SYNOPSIS

**cqlsh** [_options_] [_host_] [_port_]

**nodetool** [_options_] _command_ [_args_]

**scylla** [_options_]

# CQLSH PARAMETERS

**-u**, **--username** _user_
> Authentication username.

**-p**, **--password** _pass_
> Authentication password.

**-k**, **--keyspace** _keyspace_
> Initial keyspace.

**-f**, **--file** _file_
> Execute commands from a CQL file, then exit.

**-e**, **--execute** _statement_
> Execute a single CQL statement, then exit.

**--ssl**
> Use SSL connection.

**--cqlshrc** _file_
> Use a non-default cqlshrc file.

**--connect-timeout** _secs_
> Connection timeout (default: 2).

**--request-timeout** _secs_
> Request timeout (default: 10).

# NODETOOL COMMANDS

**status**
> Show cluster node status.

**info**
> Node information and metrics.

**ring**
> Token ring information.

**repair** [_keyspace_]
> Run repair operation.

**compact** [_keyspace_]
> Force compaction.

**flush** [_keyspace_]
> Flush memtables to SSTables.

**snapshot** [_name_]
> Take snapshot backup.

**drain**
> Drain node for shutdown.

**version**
> Show ScyllaDB version.

**describecluster**
> Cluster information.

**toppartitions**
> Show hot partitions.

# SCYLLADB-SPECIFIC

**nodetool toppartitions** _keyspace_ _table_ _duration_ms_
> Sample reads and writes for the given time and report the most active partitions.

**nodetool setlogginglevel** _logger_ _level_
> Adjust logging dynamically.

**scylla --developer-mode** _1_|_0_
> Skip production checks (I/O tuning, XFS, etc.), for development and testing only.

**scylla --smp** _cores_
> Number of CPU cores (shards) to use.

**scylla --memory** _amount_
> Amount of memory to use, e.g. **4G**.

# DESCRIPTION

**ScyllaDB** uses Cassandra-compatible tools (**cqlsh** and **nodetool**) with the same commands and CQL syntax. ScyllaDB is a C++ rewrite of Cassandra designed for lower latency and higher throughput.

**cqlsh** executes CQL statements. Keyspaces, tables, and query syntax match Cassandra. ScyllaDB adds lightweight transactions (LWT) improvements and materialized views.

**nodetool** manages cluster operations through the node's REST API (port 10000, set with **-p**). Current releases ship a native C++ implementation built into the server binary, also invocable as **scylla nodetool**; operations not listed in the ScyllaDB docs are unsupported.

ScyllaDB's shard-per-core architecture eliminates locking between CPU cores. The **--smp** flag controls core allocation. Configuration differs from Cassandra, using scylla.yaml.

ScyllaDB Alternator provides DynamoDB-compatible API, accessible via AWS SDK tools instead of cqlsh.

# CONFIGURATION

**/etc/scylla/scylla.yaml**
> Main ScyllaDB configuration file for cluster settings, networking, storage, and tuning parameters.

**/etc/scylla/cassandra-rackdc.properties**
> Datacenter and rack configuration for topology-aware replication.

**~/.cassandra/cqlshrc**
> CQL shell configuration file for connection defaults, formatting, and authentication.

# CAVEATS

While CQL-compatible, some Cassandra features differ or are unsupported. Configuration files differ from Cassandra. Repair is faster but still resource-intensive. Check compatibility matrix for drivers.

# HISTORY

The company behind ScyllaDB was founded in **2013** (as Cloudius Systems) by **Avi Kivity** (KVM creator) and **Dor Laor**. The first public release came in **2015** as a drop-in Cassandra replacement written in C++ using the Seastar framework. Version 2.0 (2017) added materialized views. ScyllaDB Open Source was licensed under the **AGPL**, with a separate Enterprise edition; starting with **2025.1** both were merged into a single release under the **ScyllaDB Source Available License**.

# SEE ALSO

[cqlsh](/man/cqlsh)(1)

# RESOURCES

```[Source code](https://github.com/scylladb/scylladb)```

```[Homepage](https://www.scylladb.com)```

```[Documentation](https://docs.scylladb.com)```

<!-- verified: 2026-11-23 -->
