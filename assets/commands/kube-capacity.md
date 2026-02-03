# TLDR

**Show cluster capacity**

```kube-capacity```

**Show pod resource usage**

```kube-capacity --pods```

**Show utilization percentages**

```kube-capacity --util```

**Show specific namespace**

```kube-capacity --namespace [default]```

**Show containers detail**

```kube-capacity --containers```

# SYNOPSIS

**kube-capacity** [_options_]

# PARAMETERS

**--pods**
> Show pod-level resource usage.

**--containers**
> Show container-level details.

**--util**
> Show utilization percentages.

**--namespace** _name_
> Filter by namespace.

**--node-labels** _selector_
> Filter by node labels.

**--sort** _field_
> Sort output by field.

# DESCRIPTION

**kube-capacity** provides a simple view of Kubernetes resource requests, limits, and utilization. Displays CPU and memory allocation across nodes, pods, and containers. Helps identify over-provisioned or under-utilized resources.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-top](/man/kubectl-top)(1)

