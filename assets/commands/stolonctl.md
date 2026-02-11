# TAGLINE

Stolon PostgreSQL HA cluster manager

# TLDR

**Get cluster status**

```stolonctl --cluster-name [cluster] status```

**Initialize cluster**

```stolonctl --cluster-name [cluster] init```

**Get cluster spec**

```stolonctl --cluster-name [cluster] spec```

**Update spec**

```stolonctl --cluster-name [cluster] update --patch '[{"key":"value"}]'```

**Failkeeper**

```stolonctl --cluster-name [cluster] failkeeper [keeper-id]```

# SYNOPSIS

**stolonctl** [_--cluster-name name_] _command_ [_options_]

# PARAMETERS

**--cluster-name** _NAME_
> Cluster name.

**status**
> Show status.

**init**
> Initialize cluster.

**spec**
> Show specification.

**update**
> Update configuration.

**--store-backend** _TYPE_
> Backend type.

# DESCRIPTION

**stolonctl** is the command-line management interface for Stolon, a cloud-native PostgreSQL high-availability manager. It provides administrative control over Stolon clusters, including viewing cluster status, initializing new clusters, updating configuration specifications, and triggering manual failovers.

The tool communicates with Stolon's store backend (typically etcd or Consul) to read and modify cluster state. The cluster specification defines replication settings, synchronous replication policies, automatic failover behavior, and PostgreSQL configuration parameters. Changes applied through stolonctl are picked up by the Stolon components (sentinels, keepers, and proxies) running in the cluster.

Stolonctl is essential for day-to-day operations such as inspecting which keeper is the current master, forcing a failover to a different keeper, and adjusting cluster parameters without downtime. It is commonly deployed alongside Kubernetes-based Stolon installations but also works with standalone deployments.

# CAVEATS

Stolon deployment required. Kubernetes or etcd. PostgreSQL specific.

# HISTORY

**stolonctl** is the CLI for **Stolon**, a cloud-native PostgreSQL high-availability manager.

# SEE ALSO

[psql](/man/psql)(1), [pg_ctl](/man/pg_ctl)(1), [kubectl](/man/kubectl)(1)
