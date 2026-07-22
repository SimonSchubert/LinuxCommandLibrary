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

**-** (suffix on the taint key)
> Remove a taint matching the given _key:effect_ pair (e.g. **node1 dedicated:NoSchedule-**).

**--all**
> Apply the taint operation to every node in the cluster.

**-l**, **--selector** _SELECTOR_
> Apply only to nodes matching the label selector (e.g. `--selector=role=worker`).

**--overwrite**
> Allow updating the value of an existing taint (without it, attempting to add a taint with the same key produces an error).

**--dry-run** _client|server|none_
> Print what would change without modifying the cluster.

**--help**
> Display help information.

# DESCRIPTION

**kubectl taint** adds, updates, or removes node taints. A taint is a _key=value:effect_ tuple attached to a node; pods are scheduled or kept on the node only if they carry a matching **toleration** in their pod spec. The supported effects are **NoSchedule** (block new pods that don't tolerate it), **PreferNoSchedule** (best-effort avoid), and **NoExecute** (evict running pods that don't tolerate it).

Taints are the standard mechanism for dedicating nodes to a workload class (e.g., GPU nodes), keeping pods off control-plane nodes, and gracefully draining nodes for maintenance in conjunction with **kubectl drain**.

# CAVEATS

**NoExecute** evicts already-scheduled pods that lack a matching toleration; ensure tolerations are in place before tainting a populated node. Overwriting an existing taint requires **--overwrite**. Removing a taint uses a trailing **-** on the taint key (no value needed).

# HISTORY

kubectl taint provides taint management for **Kubernetes** advanced scheduling control.

# INSTALL

```apt: sudo apt install kubectl```

```pacman: sudo pacman -S kubectl```

```apk: sudo apk add kubectl```

```brew: brew install kubectl```

```nix: nix profile install nixpkgs#kubectl```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-cordon](/man/kubectl-cordon)(1), [kubectl-label](/man/kubectl-label)(1)
