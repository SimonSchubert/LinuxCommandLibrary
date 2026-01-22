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

**kubectl drain** evicts pods from a node for maintenance. It safely relocates workloads before node updates.

The command cordons and evicts pods. DaemonSet and mirror pods require special handling.

kubectl drain prepares nodes for maintenance.

# CAVEATS

Subcommand of kubectl. Respects PDBs. Use uncordon to restore.

# HISTORY

kubectl drain provides safe node evacuation for **Kubernetes** cluster maintenance operations.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-cordon](/man/kubectl-cordon)(1), [kubectl-uncordon](/man/kubectl-uncordon)(1)
