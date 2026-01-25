# TLDR

**Migrate pages from one node to another**

```migratepages [pid] [from_node] [to_node]```

**Migrate all pages to specific node**

```migratepages [pid] all [2]```

**Migrate to closest node**

```migratepages [pid] [0] best```

# SYNOPSIS

**migratepages** _pid_ _from-nodes_ _to-nodes_

# PARAMETERS

**pid**
> Process ID.

**from-nodes**
> Source NUMA nodes (or 'all').

**to-nodes**
> Destination NUMA nodes (or 'best').

# DESCRIPTION

**migratepages** moves the physical memory pages of a process from one set of NUMA nodes to another. This is useful for optimizing memory placement on NUMA systems.

The command works on a running process and can migrate pages to improve memory locality.

# EXAMPLES

```bash
# Migrate PID 1234 from node 0 to node 1
migratepages 1234 0 1

# Migrate from all nodes to node 2
migratepages 1234 all 2

# Let kernel choose best destination
migratepages 1234 0 best
```

# CAVEATS

Requires numactl package. Process must be running. Migration can be slow. May require root. Only works on NUMA systems.

# HISTORY

migratepages is part of the **numactl** package, developed for controlling NUMA memory policies on Linux systems.

# SEE ALSO

[numactl](/man/numactl)(8), [numastat](/man/numastat)(8), [mbind](/man/mbind)(2), [set_mempolicy](/man/set_mempolicy)(2)
