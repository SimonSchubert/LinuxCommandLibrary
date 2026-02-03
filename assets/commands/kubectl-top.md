# TLDR

**Show node resource usage**

```kubectl top nodes```

**Show pod resource usage**

```kubectl top pods```

**Show pod usage in namespace**

```kubectl top pods -n [namespace]```

**Show container-level usage**

```kubectl top pods --containers```

**Sort by CPU**

```kubectl top pods --sort-by=cpu```

# SYNOPSIS

**kubectl** **top** _type_ [_options_]

# PARAMETERS

**nodes**
> Display node resource usage.

**pods**
> Display pod resource usage.

**--containers**
> Show container-level metrics.

**--sort-by** _field_
> Sort by cpu or memory.

**-n**, **--namespace** _name_
> Kubernetes namespace.

**-A**, **--all-namespaces**
> Show all namespaces.

# DESCRIPTION

**kubectl top** displays resource usage (CPU and memory) for nodes or pods. Requires metrics-server to be running in the cluster. Useful for monitoring resource consumption and identifying resource-hungry workloads.

# CAVEATS

Requires metrics-server installed in the cluster. Metrics may have a delay of up to one minute.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kube-capacity](/man/kube-capacity)(1)

