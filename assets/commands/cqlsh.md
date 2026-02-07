# TAGLINE

interactive Cassandra Query Language shell

# TLDR

**Start CQL shell**

```cqlsh```

**Connect to remote host**

```cqlsh [hostname] [9042]```

**Connect with authentication**

```cqlsh -u [username] -p [password]```

**Execute CQL from file**

```cqlsh -f [script.cql]```

**Execute single statement**

```cqlsh -e "SELECT * FROM [keyspace].[table]"```

**Check node status**

```nodetool status```

**View cluster info**

```nodetool info```

**Repair a node**

```nodetool repair```

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

**--connect-timeout** _secs_
> Connection timeout.

**--request-timeout** _secs_
> Query timeout.

# NODETOOL COMMANDS

**status**
> Show cluster node status.

**info**
> Node information.

**ring**
> Token ring information.

**repair** [_keyspace_]
> Run anti-entropy repair.

**cleanup** [_keyspace_]
> Remove data not belonging to node.

**compact** [_keyspace_]
> Force compaction.

**flush** [_keyspace_]
> Flush memtables to SSTables.

**snapshot** [_name_]
> Take snapshot backup.

**decommission**
> Decommission the node.

**drain**
> Drain node for shutdown.

**describecluster**
> Cluster information.

# CONFIGURATION

**~/.cassandra/cqlshrc**
> User-specific cqlsh settings including connection defaults, display formatting, and authentication credentials.

**/etc/cassandra/cassandra.yaml**
> Main Cassandra configuration file controlling cluster behavior, data directories, network settings, and replication.

# DESCRIPTION

**cqlsh** is the Cassandra Query Language shell for executing CQL statements interactively or from scripts. **nodetool** manages Cassandra node operations.

CQL resembles SQL with some differences. Keyspaces are like databases; tables have partition keys and clustering columns. Queries must include partition key for efficient lookups.

**nodetool status** shows cluster health with Up/Down/Normal/Leaving/Joining states and token ownership. **nodetool repair** ensures data consistency across replicas.

Snapshots create hard-linked backups of SSTables for point-in-time recovery. **cleanup** removes data after topology changes. **compact** forces SSTable compaction.

Node lifecycle operations: **drain** prepares for shutdown, **decommission** removes node from cluster streaming data to others.

# CAVEATS

CQL is not SQL; avoid joins and complex queries. Wide partitions impact performance. Repair is resource-intensive; schedule appropriately. Decommission before removing nodes. Authentication default is off.

# HISTORY

Apache Cassandra was initially developed at **Facebook** for inbox search and open-sourced in **2008**. It became an Apache project in **2009** and top-level in **2010**. Cassandra combines Dynamo's distribution model with Bigtable's data model. DataStax was founded in **2010** to provide commercial support. Version 4.0 (2021) brought major improvements after extensive testing.

# SEE ALSO

[scylladb](/man/scylladb)(1), [cockroach](/man/cockroach)(1), [mongo](/man/mongo)(1)
