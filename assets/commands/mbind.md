# TLDR

**Set NUMA policy for memory range (C code)**

```mbind([addr], [length], MPOL_BIND, [&nodemask], [maxnode], 0)```

**Bind memory to specific node**

```mbind([ptr], [size], MPOL_BIND, [&mask], [maxnode], MPOL_MF_MOVE)```

**Interleave memory across nodes**

```mbind([addr], [len], MPOL_INTERLEAVE, [&nodemask], [maxnode], 0)```

# SYNOPSIS

**long mbind**(void *_addr_, unsigned long _len_, int _mode_, const unsigned long *_nodemask_, unsigned long _maxnode_, unsigned _flags_)

# PARAMETERS

**addr**
> Starting address of memory range.

**len**
> Length of memory range.

**mode**
> MPOL_DEFAULT, MPOL_BIND, MPOL_INTERLEAVE, MPOL_PREFERRED.

**nodemask**
> Bitmask of NUMA nodes.

**maxnode**
> Maximum node number + 1.

**flags**
> MPOL_MF_STRICT, MPOL_MF_MOVE, MPOL_MF_MOVE_ALL.

# DESCRIPTION

**mbind** is a system call that sets the NUMA memory policy for a specified memory range. It controls which NUMA nodes are used for memory allocation within that range.

This is used for performance optimization on NUMA systems by controlling memory locality.

# POLICIES

```
MPOL_DEFAULT    - Use process default
MPOL_BIND       - Strict binding to nodes
MPOL_INTERLEAVE - Round-robin across nodes
MPOL_PREFERRED  - Prefer specified node
```

# CAVEATS

Requires NUMA hardware. Only affects future allocations unless flags specify migration. Privileged flags may require CAP_SYS_NICE.

# HISTORY

mbind was added to Linux kernel **2.6.7** as part of NUMA memory policy support, developed primarily by **Andi Kleen** at SUSE.

# SEE ALSO

[set_mempolicy](/man/set_mempolicy)(2), [get_mempolicy](/man/get_mempolicy)(2), [numactl](/man/numactl)(8), [numa](/man/numa)(7)
