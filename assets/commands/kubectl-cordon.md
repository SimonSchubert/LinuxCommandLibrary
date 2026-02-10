# TAGLINE

marks a node as unschedulable

# TLDR

**Cordon node**

```kubectl cordon [node-name]```

**Cordon multiple nodes**

```kubectl cordon [node1] [node2]```

**Cordon with selector**

```kubectl cordon -l [key=value]```

**Dry run**

```kubectl cordon [node-name] --dry-run=client```

# SYNOPSIS

**kubectl cordon** [_options_] _node_

# PARAMETERS

_NODE_
> Node name to cordon.

**-l** _SELECTOR_
> Label selector.

**--dry-run** _MODE_
> Simulate operation.

**--help**
> Display help information.

# DESCRIPTION

**kubectl cordon** marks one or more Kubernetes nodes as unschedulable by setting the `node.kubernetes.io/unschedulable` taint on the node object. Once cordoned, the scheduler will not place any new pods on the node, but existing pods already running on it continue to operate normally and are not affected.

Cordoning is typically the first step in a node maintenance workflow, followed by `kubectl drain` to gracefully evict the running pods. It is also useful for isolating a node that is exhibiting problems -- such as high resource usage or hardware errors -- while you investigate, without disrupting workloads already running there.

To return a cordoned node to normal scheduling, use `kubectl uncordon`. The cordon state can be verified by checking the node's status with `kubectl get nodes`, where cordoned nodes display a `SchedulingDisabled` status.

# CAVEATS

Subcommand of kubectl. Use with drain for maintenance. Uncordon to restore.

# HISTORY

kubectl cordon provides node scheduling control for **Kubernetes** cluster maintenance.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-drain](/man/kubectl-drain)(1), [kubectl-uncordon](/man/kubectl-uncordon)(1)
