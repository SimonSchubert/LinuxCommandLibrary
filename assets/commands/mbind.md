# TAGLINE

system call that sets the NUMA memory policy for a specified memory range

# TLDR

**Bind a memory range to node 0** (C code, link with **-lnuma**)

```unsigned long mask = 1UL << 0; mbind([addr], [size], MPOL_BIND, &mask, sizeof(mask) * 8, 0);```

**Bind and migrate already allocated pages** to the target nodes

```mbind([addr], [size], MPOL_BIND, &mask, [maxnode], MPOL_MF_MOVE | MPOL_MF_STRICT);```

**Interleave pages round-robin** across nodes 0 and 1

```unsigned long mask = 0x3; mbind([addr], [size], MPOL_INTERLEAVE, &mask, sizeof(mask) * 8, 0);```

**Prefer a node** but fall back to others when it is full

```mbind([addr], [size], MPOL_PREFERRED, &mask, [maxnode], 0);```

**Remove an explicit policy** from a range

```mbind([addr], [size], MPOL_DEFAULT, NULL, 0, 0);```

# SYNOPSIS

**#include <numaif.h>**

**long mbind**(void *_addr_, unsigned long _size_, int _mode_, const unsigned long *_nodemask_, unsigned long _maxnode_, unsigned int _flags_);

# PARAMETERS

**addr**
> Start of the memory range. Must be page-aligned.

**size**
> Length of the range in bytes (rounded up to whole pages).

**mode**
> Policy mode (see **POLICIES**), optionally OR-ed with a mode flag: **MPOL_F_STATIC_NODES**, **MPOL_F_RELATIVE_NODES** (since 2.6.26), or **MPOL_F_NUMA_BALANCING** (since 5.15, **MPOL_BIND** only).

**nodemask**
> Bitmask of NUMA node IDs the policy applies to. Must be NULL or empty for **MPOL_DEFAULT**.

**maxnode**
> Number of bits in _nodemask_. The kernel only reads _maxnode_ - 1 bits, so it must be at least the highest node number + 2.

**flags**
> **MPOL_MF_STRICT**: fail with EIO if existing pages do not follow the policy. **MPOL_MF_MOVE**: migrate existing pages used only by this process. **MPOL_MF_MOVE_ALL**: migrate all pages, even shared ones (needs **CAP_SYS_NICE**).

# DESCRIPTION

**mbind** is a system call that sets the NUMA memory policy for a specified memory range. It controls which NUMA nodes are used for memory allocation within that range.

This is used for performance optimization on NUMA systems by controlling memory locality. Returns 0 on success, or -1 with _errno_ set (EINVAL, EFAULT, ENOMEM, EIO, EPERM).

The wrapper is provided by **libnuma** (header **numaif.h**), not glibc. Unless migration flags are given, the policy only applies to pages allocated after the call.

# POLICIES

```
MPOL_DEFAULT             - Fall back to thread policy
MPOL_BIND                - Allocate only from nodes
MPOL_INTERLEAVE          - Round-robin across nodes
MPOL_WEIGHTED_INTERLEAVE - Weighted round-robin (6.9+)
MPOL_PREFERRED           - Prefer one node, fall back
MPOL_PREFERRED_MANY      - Prefer node set (5.15+)
MPOL_LOCAL               - Allocate on local node (3.8+)
```

# CAVEATS

Only meaningful on NUMA hardware. The policy is ignored for **MAP_SHARED** file mappings. **MPOL_DEFAULT** on a range does not mean local allocation: it reverts to the thread policy set by **set_mempolicy**(2); use **MPOL_LOCAL** for explicit local allocation. Policies are subject to the cpuset the task runs in.

# HISTORY

mbind was added to Linux kernel **2.6.7** as part of NUMA memory policy support, developed primarily by **Andi Kleen** at SUSE. Page migration flags arrived in **2.6.16**.

# SEE ALSO

[numactl](/man/numactl)(8), [numastat](/man/numastat)(8), [migratepages](/man/migratepages)(8), [taskset](/man/taskset)(1)

# RESOURCES

```[Source code](https://git.kernel.org/pub/scm/docs/man-pages/man-pages.git)```

```[Homepage](https://www.kernel.org/doc/man-pages/)```

```[Documentation](https://man7.org/linux/man-pages/man2/mbind.2.html)```

<!-- verified: 2026-11-23 -->
