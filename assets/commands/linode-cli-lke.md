# TAGLINE

manages Linode Kubernetes Engine clusters

# TLDR

**List clusters**

```linode-cli lke clusters-list```

**Create cluster**

```linode-cli lke cluster-create --label [my-cluster] --region [us-east] --k8s_version [1.28]```

**View cluster**

```linode-cli lke cluster-view [cluster_id]```

**Get kubeconfig**

```linode-cli lke kubeconfig-view [cluster_id] --text```

**List node pools**

```linode-cli lke pools-list [cluster_id]```

**Delete cluster**

```linode-cli lke cluster-delete [cluster_id]```

**Add a node pool to a cluster**

```linode-cli lke pool-create [cluster_id] --type [g6-standard-2] --count [3]```

**Recycle all nodes in a cluster**

```linode-cli lke cluster-nodes-recycle [cluster_id]```

# SYNOPSIS

**linode-cli lke** _subcommand_ [_options_]

# PARAMETERS

_SUBCOMMAND_
> LKE operation.

**clusters-list**
> List all clusters.

**cluster-create**
> Create new cluster.

**cluster-view** _ID_
> View cluster details.

**kubeconfig-view** _ID_
> Get kubeconfig.

**pools-list** _ID_
> List node pools.

**cluster-delete** _ID_
> Delete cluster.

**pool-create** _ID_
> Add a node pool to a cluster.

**cluster-nodes-recycle** _ID_
> Recycle all nodes in a cluster.

**--label** _NAME_
> Cluster name.

**--region** _REGION_
> Datacenter region.

**--k8s_version** _VERSION_
> Kubernetes version for the cluster.

**--type** _TYPE_
> Linode instance type for node pool nodes.

**--count** _N_
> Number of nodes in a node pool.

**--text**
> Output in plain text format.

**--json**
> Output in JSON format.

**--help**
> Display help information.

# DESCRIPTION

**linode-cli lke** manages Linode Kubernetes Engine clusters. LKE provides managed Kubernetes.

The tool creates clusters, manages node pools, and retrieves kubeconfig for kubectl access.

# CAVEATS

Requires authentication. Node pools incur charges. Kubernetes version support varies.

# HISTORY

linode-cli lke is part of the **Linode CLI** for managing Linode Kubernetes Engine (LKE) clusters.

# SEE ALSO

[linode-cli](/man/linode-cli)(1), [kubectl](/man/kubectl)(1), [helm](/man/helm)(1), [linode-cli-linodes](/man/linode-cli-linodes)(1), [linode-cli-volumes](/man/linode-cli-volumes)(1)

