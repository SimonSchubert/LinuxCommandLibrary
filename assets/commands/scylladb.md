# TLDR

**Start CQL shell**

```cqlsh```

**Connect to ScyllaDB node**

```cqlsh [hostname] [9042]```

**Connect with authentication**

```cqlsh -u [username] -p [password]```

**Execute CQL from file**

```cqlsh -f [script.cql]```

**Check node status**

```nodetool status```

**View ScyllaDB info**

```scylla --version```

**Check cluster status**

```nodetool describecluster```

**Flush memtables**

```nodetool flush```

# SYNOPSIS

**cqlsh** [_options_] [_host_] [_port_]

**nodetool** [_options_] _command_ [_args_]

# CQLSH PARAMETERS

**-u**, **--username** _user_
> Authentication username.

**-p**, **--password** _pass_
> Authentication password.

**-k**, **--keyspace** _keyspace_
> Initial keyspace.

**-f** _file_
> Execute CQL file.

**-e** _statement_
> Execute single CQL statement.

**--ssl**
> Use SSL connection.

**--request-timeout** _secs_
> Query timeout.

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

**nodetool toppartitions** _keyspace_ _table_ _duration_
> Identify hot partitions causing load.

**nodetool setlogginglevel** _logger_ _level_
> Adjust logging dynamically.

**scylla --developer-mode** _mode_
> Development mode flag.

**scylla --smp** _cores_
> Number of CPU cores to use.

**scylla --memory** _amount_
> Memory allocation.

# DESCRIPTION

**ScyllaDB** uses Cassandra-compatible tools (**cqlsh** and **nodetool**) with the same commands and CQL syntax. ScyllaDB is a C++ rewrite of Cassandra designed for lower latency and higher throughput.

**cqlsh** executes CQL statements. Keyspaces, tables, and query syntax match Cassandra. ScyllaDB adds lightweight transactions (LWT) improvements and materialized views.

**nodetool** manages cluster operations. ScyllaDB extends it with **toppartitions** for identifying hot spots that cause load imbalance.

ScyllaDB's shard-per-core architecture eliminates locking between CPU cores. The **--smp** flag controls core allocation. Configuration differs from Cassandra, using scylla.yaml.

ScyllaDB Alternator provides DynamoDB-compatible API, accessible via AWS SDK tools instead of cqlsh.

# CAVEATS

While CQL-compatible, some Cassandra features differ or are unsupported. Configuration files differ from Cassandra. Repair is faster but still resource-intensive. Check compatibility matrix for drivers.

# HISTORY

ScyllaDB was founded in **2015** by **Avi Kivity** (KVM creator) and **Dor Laor**. The first release came in **2015** as a drop-in Cassandra replacement written in C++ using the Seastar framework. Version 2.0 (2017) added materialized views. ScyllaDB Open Source is Apache-licensed; Enterprise adds features like encryption and LDAP.

# SEE ALSO

[cqlsh](/man/cqlsh)(1), [nodetool](/man/nodetool)(1), [cassandra](/man/cassandra)(1)
