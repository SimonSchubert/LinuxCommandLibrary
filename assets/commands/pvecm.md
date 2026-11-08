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

**addnode** _node_
> Add node to cluster config (internal use)

**apiver**
> Show cluster join API version

**create** _name_
> Create new cluster with given name

**delnode** _node_
> Remove node from cluster configuration

**nodes**
> List cluster nodes

**status**
> Show cluster status

**expected** _votes_
> Tell corosync a new value of expected votes

**qdevice setup** _address_
> Set up the use of an external QDevice

**qdevice remove**
> Remove a configured QDevice

**updatecerts**
> Update node certificates

**--link**_N_ _address_
> Corosync link address, used with **create** and **add** (link0 to link7)

# DESCRIPTION

**pvecm** manages Proxmox VE cluster membership. It handles creating clusters, joining nodes to existing clusters, and removing nodes. The cluster provides high availability, live migration, and shared storage capabilities.

Proxmox clustering uses corosync for cluster communication and pmxcfs for distributed configuration storage. All cluster nodes share the same configuration.

# CAVEATS

Separating a node from a cluster without reinstalling it is possible but not recommended, and a removed node keeps access to any shared storage. Power off a node before removing it with **delnode**. All nodes must be able to reach each other on UDP ports 5405-5412.

# HISTORY

Part of **Proxmox VE**, enabling multi-node deployments with shared management. Built on corosync cluster engine and provides foundation for high-availability features.

# SEE ALSO

[pvesh](/man/pvesh)(1), [qm](/man/qm)(1), [pct](/man/pct)(1), [ha-manager](/man/ha-manager)(1)

# RESOURCES

```[Documentation](https://pve.proxmox.com/pve-docs/pvecm.1.html)```

```[Source code](https://git.proxmox.com/?p=pve-cluster.git)```

<!-- verified: 2026-11-08 -->
