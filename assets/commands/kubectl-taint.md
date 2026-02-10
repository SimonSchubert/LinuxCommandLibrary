# TAGLINE

adds or removes node taints

# TLDR

**Add taint to node**

```kubectl taint nodes [node-name] [key=value:NoSchedule]```

**Remove taint**

```kubectl taint nodes [node-name] [key:NoSchedule-]```

**Add NoExecute taint**

```kubectl taint nodes [node-name] [key=value:NoExecute]```

**Add PreferNoSchedule**

```kubectl taint nodes [node-name] [key=value:PreferNoSchedule]```

**Taint multiple nodes**

```kubectl taint nodes [node1] [node2] [key=value:NoSchedule]```

# SYNOPSIS

**kubectl taint** [_options_] _node_ _key=value:effect_

# PARAMETERS

_NODE_
> Node name.

_KEY=VALUE:EFFECT_
> Taint specification.

**NoSchedule**
> Prevent scheduling.

**NoExecute**
> Evict existing pods.

**PreferNoSchedule**
> Soft no-schedule.

**-**
> Remove taint (suffix).

**--help**
> Display help information.

# DESCRIPTION

**kubectl taint** adds or removes node taints. Taints repel pods unless they have matching tolerations.

The command controls workload placement. Effects determine scheduling behavior and eviction.

# CAVEATS

Subcommand of kubectl. Requires matching tolerations. NoExecute evicts running pods.

# HISTORY

kubectl taint provides taint management for **Kubernetes** advanced scheduling control.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-cordon](/man/kubectl-cordon)(1), [kubectl-label](/man/kubectl-label)(1)
