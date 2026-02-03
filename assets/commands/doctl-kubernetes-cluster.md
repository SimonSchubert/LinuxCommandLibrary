# TLDR

**List Kubernetes clusters**

```doctl kubernetes cluster list```

**Create a cluster**

```doctl kubernetes cluster create [name] --region [nyc1] --node-pool "name=pool;size=s-2vcpu-4gb;count=3"```

**Get cluster info**

```doctl kubernetes cluster get [cluster_id]```

**Delete a cluster**

```doctl kubernetes cluster delete [cluster_id]```

**Get kubeconfig**

```doctl kubernetes cluster kubeconfig save [cluster_id]```

**Upgrade cluster version**

```doctl kubernetes cluster upgrade [cluster_id] --version [1.28]```

# SYNOPSIS

**doctl** **kubernetes** **cluster** _command_ [_options_]

# SUBCOMMANDS

**list**
> List clusters.

**create**
> Create a cluster.

**get**
> Get cluster details.

**delete**
> Delete a cluster.

**kubeconfig**
> Manage kubeconfig.

**upgrade**
> Upgrade cluster version.

**node-pool**
> Manage node pools.

# DESCRIPTION

**doctl kubernetes cluster** manages DigitalOcean Kubernetes (DOKS) clusters. Provides lifecycle management, kubeconfig access, and node pool configuration.

# SEE ALSO

[doctl-kubernetes](/man/doctl-kubernetes)(1), [kubectl](/man/kubectl)(1)

