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

**vcluster** creates virtual clusters. It runs on Kubernetes.

Virtual clusters. K8s in K8s.

Lightweight. Share host resources.

Isolated. Separate control plane.

Multi-tenancy. Team separation.

# CAVEATS

Kubernetes required. Host cluster needed. Loft Labs product.

# HISTORY

**vcluster** was created by **Loft Labs** for running lightweight virtual Kubernetes clusters inside existing clusters.

# SEE ALSO

[kubectl](/man/kubectl)(1), [k3s](/man/k3s)(1), [kind](/man/kind)(1)
