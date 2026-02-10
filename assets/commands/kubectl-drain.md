# TAGLINE

evicts pods from a node for maintenance

# TLDR

**Drain node**

```kubectl drain [node-name]```

**Drain ignoring DaemonSets**

```kubectl drain [node-name] --ignore-daemonsets```

**Drain with force**

```kubectl drain [node-name] --force```

**Drain and delete local data**

```kubectl drain [node-name] --delete-emptydir-data```

**Drain with timeout**

```kubectl drain [node-name] --timeout=[5m]```

**Dry run drain**

```kubectl drain [node-name] --dry-run=client```

# SYNOPSIS

**kubectl drain** [_options_] _node_

# PARAMETERS

_NODE_
> Node name to drain.

**--ignore-daemonsets**
> Ignore DaemonSet pods.

**--force**
> Continue despite errors.

**--delete-emptydir-data**
> Delete emptyDir data.

**--timeout** _DURATION_
> Drain timeout.

**--grace-period** _N_
> Pod termination grace.

**--help**
> Display help information.

# DESCRIPTION

**kubectl drain** safely evicts all pods from a node in preparation for maintenance operations such as kernel upgrades, hardware repairs, or Kubernetes version updates. It first cordons the node to prevent new pods from being scheduled, then uses the Eviction API to gracefully terminate each pod, allowing their controllers to reschedule them onto other available nodes.

The command respects PodDisruptionBudgets (PDBs), which means it will block if evicting a pod would violate the application's availability requirements. DaemonSet-managed pods are not evicted by default since they are expected to run on every node; use `--ignore-daemonsets` to proceed without error. Pods with local storage (emptyDir volumes) also require explicit acknowledgment via `--delete-emptydir-data`, as their data will be lost.

After maintenance is complete, the node must be uncordoned with `kubectl uncordon` to resume accepting new pod scheduling. A `--timeout` flag allows setting a maximum wait time for the drain to complete before it is aborted.

# CAVEATS

Subcommand of kubectl. Respects PDBs. Use uncordon to restore.

# HISTORY

kubectl drain provides safe node evacuation for **Kubernetes** cluster maintenance operations.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-cordon](/man/kubectl-cordon)(1), [kubectl-uncordon](/man/kubectl-uncordon)(1)
