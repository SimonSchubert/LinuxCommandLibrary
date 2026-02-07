# TAGLINE

Exoscale managed Kubernetes cluster management

# TLDR

**List SKS clusters**

```exo compute sks list```

**Create SKS cluster**

```exo compute sks create [cluster_name] --zone [ch-gva-2]```

**Get kubeconfig**

```exo compute sks kubeconfig [cluster_name]```

**Add nodepool**

```exo compute sks nodepool add [cluster_name] [nodepool_name]```

**Scale nodepool**

```exo compute sks nodepool scale [cluster_name] [nodepool_name] [5]```

**Delete cluster**

```exo compute sks delete [cluster_name]```

# SYNOPSIS

**exo compute sks** _action_ [_options_]

# PARAMETERS

_ACTION_
> Operation: list, create, delete, kubeconfig, nodepool.

**create** _NAME_
> Create new SKS cluster.

**kubeconfig** _NAME_
> Get kubeconfig for cluster.

**nodepool add** _CLUSTER_ _POOL_
> Add nodepool to cluster.

**nodepool scale** _CLUSTER_ _POOL_ _SIZE_
> Scale nodepool.

**--zone** _ZONE_
> Availability zone.

**--help**
> Display help information.

# DESCRIPTION

**exo compute sks** manages Exoscale SKS (Scalable Kubernetes Service) clusters. SKS provides managed Kubernetes with automatic control plane management.

Commands handle cluster lifecycle, nodepool management, and kubeconfig retrieval. Nodepools allow different instance configurations within a cluster.

SKS integrates with Exoscale's infrastructure for storage, networking, and load balancing.

# CAVEATS

Kubernetes clusters incur costs. Control plane is managed but workers are billable. Zone determines available features. kubeconfig provides full cluster access.

# HISTORY

SKS is Exoscale's managed Kubernetes offering, providing CNCF-certified Kubernetes clusters on Exoscale's European cloud infrastructure.

# SEE ALSO

[exo](/man/exo)(1), [exo-compute](/man/exo-compute)(1), [kubectl](/man/kubectl)(1)
