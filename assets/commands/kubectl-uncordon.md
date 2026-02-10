# TAGLINE

marks a node as schedulable

# TLDR

**Uncordon node**

```kubectl uncordon [node-name]```

**Uncordon multiple nodes**

```kubectl uncordon [node1] [node2]```

**Uncordon with selector**

```kubectl uncordon -l [key=value]```

**Dry run**

```kubectl uncordon [node-name] --dry-run=client```

# SYNOPSIS

**kubectl uncordon** [_options_] _node_

# PARAMETERS

_NODE_
> Node name to uncordon.

**-l** _SELECTOR_
> Label selector.

**--dry-run** _MODE_
> Simulate operation.

**--help**
> Display help information.

# DESCRIPTION

**kubectl uncordon** marks a node as schedulable. It reverses the effect of cordon.

The command is used after node maintenance. New pods can be scheduled once uncordoned.

# CAVEATS

Subcommand of kubectl. Only marks schedulable. Pods don't automatically move back.

# HISTORY

kubectl uncordon provides node scheduling restoration for **Kubernetes** after maintenance.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-cordon](/man/kubectl-cordon)(1), [kubectl-drain](/man/kubectl-drain)(1)
