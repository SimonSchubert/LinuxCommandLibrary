# TAGLINE

Proxmox cluster membership management

# TLDR

**Add** the current node to an existing cluster

```pvecm add [hostname_or_ip]```

Add a node to the **cluster configuration**

```pvecm addnode [node]```

Display the **API version** available on this node

```pvecm apiver```

Generate **new cluster** configuration

```pvecm create [clustername]```

**Remove** a node from the cluster

```pvecm delnode [node]```

Display the **nodes** in the cluster

```pvecm nodes```

Display the cluster **status**

```pvecm status```

# SYNOPSIS

**pvecm** _command_ [_options_]

# PARAMETERS

**add** _host_
> Join this node to existing cluster

**addnode**, **addn** _node_
> Add node to cluster config (internal use)

**apiver**, **ap**
> Show cluster join API version

**create**, **c** _name_
> Create new cluster with given name

**delnode**, **d** _node_
> Remove node from cluster configuration

**nodes**, **n**
> List cluster nodes

**status**, **s**
> Show cluster status

**expected** _votes_
> Set expected votes for quorum

# DESCRIPTION

**pvecm** manages Proxmox VE cluster membership. It handles creating clusters, joining nodes to existing clusters, and removing nodes. The cluster provides high availability, live migration, and shared storage capabilities.

Proxmox clustering uses corosync for cluster communication and pmxcfs for distributed configuration storage. All cluster nodes share the same configuration.

# CAVEATS

Creating a cluster is irreversible without reinstalling. Removing nodes requires the node to be offline and clean shutdown procedures. Network configuration must allow cluster communication (default port 5405-5412).

# HISTORY

Part of **Proxmox VE**, enabling multi-node deployments with shared management. Built on corosync cluster engine and provides foundation for high-availability features.

# SEE ALSO

[pvesh](/man/pvesh)(1), [qm](/man/qm)(1), [pct](/man/pct)(1), [ha-manager](/man/ha-manager)(1)
