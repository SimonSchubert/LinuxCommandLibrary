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

**kubectl cordon** marks a node as unschedulable. New pods won't be scheduled to cordoned nodes.

The command is used before maintenance. Existing pods continue running until drained.

kubectl cordon prevents new scheduling.

# CAVEATS

Subcommand of kubectl. Use with drain for maintenance. Uncordon to restore.

# HISTORY

kubectl cordon provides node scheduling control for **Kubernetes** cluster maintenance.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-drain](/man/kubectl-drain)(1), [kubectl-uncordon](/man/kubectl-uncordon)(1)
