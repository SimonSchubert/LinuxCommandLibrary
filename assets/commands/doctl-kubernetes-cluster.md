# TAGLINE

manage DigitalOcean Kubernetes clusters

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

**doctl kubernetes cluster** manages DigitalOcean Kubernetes (DOKS) clusters. It provides complete lifecycle management for managed Kubernetes deployments including creation, configuration, upgrades, and deletion.

The command handles cluster provisioning with specified node pools, configures kubeconfig files for kubectl access, and manages version upgrades. DOKS abstracts control plane management, allowing users to focus on application deployment while DigitalOcean handles cluster infrastructure, etcd backups, and control plane updates.

Cluster operations include scaling node pools, managing worker node composition, and performing in-place Kubernetes version upgrades. The kubeconfig subcommand integrates clusters with local kubectl tooling for seamless cluster access.

# SEE ALSO

[doctl-kubernetes](/man/doctl-kubernetes)(1), [kubectl](/man/kubectl)(1)
