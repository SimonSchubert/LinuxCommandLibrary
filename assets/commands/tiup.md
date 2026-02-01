# TLDR

**Start local TiDB playground**

```tiup playground```

**Start with specific version**

```tiup playground v[7.1.0]```

**Start with multiple components**

```tiup playground --db [3] --pd [3] --kv [3]```

**Deploy a cluster**

```tiup cluster deploy [cluster-name] v[7.1.0] [topology.yaml]```

**Start a cluster**

```tiup cluster start [cluster-name]```

**Show cluster status**

```tiup cluster display [cluster-name]```

**Connect to TiDB** (MySQL client)

```mysql -h [127.0.0.1] -P [4000] -u root```

**Install a component**

```tiup install tidb:v[7.1.0]```

# SYNOPSIS

**tiup** _component_ [_args_...]

**tiup** [_command_] [_options_]

# COMMANDS

**playground**
> Start local test cluster.

**cluster** deploy|start|stop|destroy|display|scale-out|scale-in
> Manage production clusters.

**install** _component_
> Install a TiUP component.

**update** _component_
> Update a component.

**list**
> List available components.

**status**
> Show running components.

**clean**
> Clean component data.

**uninstall** _component_
> Remove a component.

**--version**
> Show TiUP version.

# PLAYGROUND OPTIONS

**--db** _count_
> Number of TiDB instances.

**--pd** _count_
> Number of PD instances.

**--kv** _count_
> Number of TiKV instances.

**--tiflash** _count_
> Number of TiFlash instances.

**--host** _address_
> Bind address.

**--db.port** _port_
> TiDB port. Default: 4000.

**--pd.port** _port_
> PD port. Default: 2379.

# CLUSTER OPTIONS

**deploy** _name_ _version_ _topology_
> Deploy cluster from topology file.

**start** _name_
> Start cluster.

**stop** _name_
> Stop cluster.

**destroy** _name_
> Remove cluster.

**scale-out** _name_ _topology_
> Add nodes.

**scale-in** _name_ --node _host:port_
> Remove nodes.

**upgrade** _name_ _version_
> Upgrade cluster.

# DESCRIPTION

**tiup** is the component manager for TiDB, a MySQL-compatible distributed database. It manages installation, deployment, and operations of TiDB clusters.

**tiup playground** starts a local development cluster with TiDB, PD (placement driver), and TiKV (storage) components. Connect using any MySQL client on port 4000.

Production deployments use **tiup cluster** with YAML topology files. The topology defines hosts, ports, directories, and component placement. **deploy** creates the cluster; **start** runs it.

TiDB is MySQL-compatible; use standard MySQL clients and drivers. TiFlash provides columnar storage for analytics workloads.

TiUP components include monitoring (Prometheus, Grafana), diagnostic tools, and utilities. **tiup list** shows available components.

# CAVEATS

TiDB is mostly MySQL-compatible but some features differ or are unsupported. Minimum 3-node PD for production high availability. TiKV requires SSD storage. Resource requirements scale with data size.

# HISTORY

TiDB was created by **PingCAP** and first released in **2015**. Inspired by Google Spanner and F1, it combines MySQL compatibility with horizontal scalability. TiKV, the storage layer, joined CNCF and graduated in **2020**. TiDB is widely used for HTAP (hybrid transactional/analytical) workloads, especially in Asia. Major versions release annually with LTS support.

# SEE ALSO

[mysql](/man/mysql)(1), [cockroach](/man/cockroach)(1), [yugabyte](/man/yugabyte)(1)
