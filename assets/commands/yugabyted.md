# TLDR

**Start local cluster**

```yugabyted start```

**Start with specific data directory**

```yugabyted start --base_dir=[/data/yb]```

**Check cluster status**

```yugabyted status```

**Stop the cluster**

```yugabyted stop```

**Connect with PostgreSQL client**

```ysqlsh```

**Connect with Cassandra client**

```ycqlsh```

**Add a node to cluster**

```yugabyted start --join=[existing-node]```

**Destroy cluster data**

```yugabyted destroy```

# SYNOPSIS

**yugabyted** _command_ [_options_]

**ysqlsh** [_options_]

**ycqlsh** [_options_] [_host_] [_port_]

# YUGABYTED COMMANDS

**start**
> Start YugabyteDB node.

**stop**
> Stop YugabyteDB node.

**status**
> Show cluster status.

**destroy**
> Remove cluster data.

**configure**
> Configure cluster settings.

**collect_logs**
> Gather logs for troubleshooting.

**version**
> Show version information.

# YUGABYTED OPTIONS

**--base_dir** _path_
> Data directory.

**--listen** _address_
> Listen address for the node.

**--join** _host_
> Existing node to join cluster.

**--cloud_location** _region.zone_
> Cloud placement information.

**--fault_tolerance** _level_
> Fault tolerance: none, zone, region.

**--ui** _bool_
> Enable admin UI. Default: true.

# YSQLSH PARAMETERS

**-h**, **--host** _host_
> Database server host.

**-p**, **--port** _port_
> Database port. Default: 5433.

**-U**, **--username** _user_
> Database username.

**-d**, **--dbname** _database_
> Database name.

**-c** _command_
> Execute single command.

**-f** _file_
> Execute commands from file.

# DESCRIPTION

**yugabyted** manages YugabyteDB clusters, a distributed SQL database compatible with PostgreSQL. It simplifies single-node and multi-node deployments.

YugabyteDB offers two APIs: YSQL (PostgreSQL-compatible) and YCQL (Cassandra-compatible). Use **ysqlsh** for SQL workloads and **ycqlsh** for wide-column workloads.

**yugabyted start** runs YB-Master and YB-TServer processes. The admin UI (default port 15433) shows cluster health, tables, and metrics. Connect YSQL on port 5433.

For multi-node clusters, start the first node normally, then use **--join** on additional nodes. **--fault_tolerance** configures replication for zone or region failure survival.

YSQL supports most PostgreSQL features including extensions, stored procedures, and common ORMs. Connection strings follow PostgreSQL format.

# CAVEATS

Some PostgreSQL features are unsupported or behave differently in distributed context. Minimum 3 nodes for fault tolerance. RF3 replication triples storage requirements. Clock synchronization important for consistency.

# HISTORY

YugabyteDB was created by **Yugabyte, Inc.** founded by former Facebook engineers **Kannan Muthukkaruppan** and **Karthik Ranganathan** in **2016**. First released in **2017**, it was designed as an open-source alternative to Google Spanner. The database combines Spanner-like architecture with PostgreSQL and Cassandra compatibility. YugabyteDB is Apache-licensed with enterprise features available separately.

# SEE ALSO

[psql](/man/psql)(1), [cqlsh](/man/cqlsh)(1), [cockroach](/man/cockroach)(1), [tidb](/man/tidb)(1)
