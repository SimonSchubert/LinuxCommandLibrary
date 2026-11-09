# TAGLINE

Stolon PostgreSQL HA cluster manager

# TLDR

**Get cluster status**

```stolonctl --cluster-name [cluster] --store-backend [etcdv3] status```

**Initialize a cluster**

```stolonctl --cluster-name [cluster] --store-backend [etcdv3] init```

**Initialize from a spec file without confirmation**

```stolonctl --cluster-name [cluster] --store-backend [etcdv3] init -f [spec.json] -y```

**Show the cluster spec**

```stolonctl --cluster-name [cluster] --store-backend [etcdv3] spec```

**Patch the cluster spec**

```stolonctl --cluster-name [cluster] --store-backend [etcdv3] update --patch -f [patch.json]```

**Force a keeper to be treated as failed**

```stolonctl --cluster-name [cluster] --store-backend [etcdv3] failkeeper [keeper-uid]```

**Remove a keeper from cluster data**

```stolonctl --cluster-name [cluster] --store-backend [etcdv3] removekeeper [keeper-uid]```

# SYNOPSIS

**stolonctl** **--cluster-name** _name_ **--store-backend** _type_ [_options_] _command_

# PARAMETERS

**status**
> Display the current cluster status.

**init**
> Initialize a new cluster (**-f** spec file, **-y** skip confirmation).

**spec**
> Retrieve the current cluster specification.

**update**
> Update the cluster specification (**-f** file, **-p**, **--patch** apply as a patch).

**failkeeper** _UID_
> Force a keeper to be temporarily considered failed.

**removekeeper**
> Remove a keeper from cluster data.

**promote**
> Promote a standby cluster to a primary cluster.

**clusterdata**
> Manage current cluster data.

**register**
> Register stolon keepers for service discovery.

**--cluster-name** _NAME_
> Cluster name.

**--store-backend** _TYPE_
> Store backend: etcdv2/etcd, etcdv3, consul or kubernetes.

**--store-endpoints** _LIST_
> Comma-delimited store endpoints. Defaults to http://127.0.0.1:2379 for etcd and http://127.0.0.1:8500 for consul.

**--store-prefix** _PREFIX_
> Store base prefix (default: stolon/cluster).

**--kube-resource-kind** _KIND_
> Kubernetes resource used to store cluster data (only configmap is supported).

**--log-level** _LEVEL_
> debug, info, warn or error (default: info).

# DESCRIPTION

**stolonctl** is the command-line management interface for Stolon, a cloud-native PostgreSQL high-availability manager. It provides administrative control over Stolon clusters, including viewing cluster status, initializing new clusters, updating configuration specifications, and triggering manual failovers.

The tool communicates with Stolon's store backend (typically etcd or Consul) to read and modify cluster state. The cluster specification defines replication settings, synchronous replication policies, automatic failover behavior, and PostgreSQL configuration parameters. Changes applied through stolonctl are picked up by the Stolon components (sentinels, keepers, and proxies) running in the cluster.

Stolonctl is essential for day-to-day operations such as inspecting which keeper is the current master, forcing a failover to a different keeper, and adjusting cluster parameters without downtime. It is commonly deployed alongside Kubernetes-based Stolon installations but also works with standalone deployments.

# CAVEATS

Requires a running Stolon deployment with a supported store backend. PostgreSQL only. **failkeeper** is a one-shot operation: if no new master can be elected, a healthy failed keeper may be re-elected.

# HISTORY

**stolonctl** is the CLI for **Stolon**, a cloud-native PostgreSQL high-availability manager.

# SEE ALSO

[psql](/man/psql)(1), [pg_ctl](/man/pg_ctl)(1), [kubectl](/man/kubectl)(1)

# RESOURCES

```[Source code](https://github.com/sorintlab/stolon)```

<!-- verified: 2026-11-09 -->
