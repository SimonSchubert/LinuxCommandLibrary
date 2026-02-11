# TAGLINE

Create virtual Kubernetes clusters

# TLDR

**Create cluster**

```vcluster create [name]```

**Connect to cluster**

```vcluster connect [name]```

**List clusters**

```vcluster list```

**Delete cluster**

```vcluster delete [name]```

**Disconnect**

```vcluster disconnect```

**Pause cluster**

```vcluster pause [name]```

# SYNOPSIS

**vcluster** _command_ [_options_] [_name_]

# PARAMETERS

**create**
> Create virtual cluster.

**connect**
> Connect kubectl.

**list**
> List clusters.

**delete**
> Remove cluster.

**disconnect**
> Disconnect kubectl.

**--namespace** _NS_
> Kubernetes namespace.

# DESCRIPTION

**vcluster** creates lightweight virtual Kubernetes clusters that run inside existing Kubernetes clusters. Each virtual cluster has its own API server and control plane but shares the underlying host cluster's compute resources and networking.

This approach provides full Kubernetes isolation for multi-tenancy, development, and testing without the overhead of separate physical clusters. Virtual clusters are created in seconds and can be paused to free resources when not in use.

# CAVEATS

Kubernetes required. Host cluster needed. Loft Labs product.

# HISTORY

**vcluster** was created by **Loft Labs** for running lightweight virtual Kubernetes clusters inside existing clusters.

# SEE ALSO

[kubectl](/man/kubectl)(1), [k3s](/man/k3s)(1), [kind](/man/kind)(1)
