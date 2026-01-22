# TLDR

Run command on **node 0** with memory on nodes 0 and 1

```numactl --cpunodebind=0 --membind=0,1 -- command```

Run command on **specific CPUs**

```numactl --physcpubind=0-4,8-12 -- command```

Run with memory **interleaved** across all nodes

```numactl --interleave=all -- command```

Show **current NUMA policy**

```numactl --show```

Show **hardware NUMA configuration**

```numactl --hardware```

Prefer memory allocation on a **specific node**

```numactl --preferred=0 -- command```

# SYNOPSIS

**numactl** [_--interleave=nodes_] [_--membind=nodes_] [_--cpunodebind=nodes_] [_--physcpubind=cpus_] [_--_] _command_ [_arguments_]

# DESCRIPTION

**numactl** runs processes with a specific NUMA (Non-Uniform Memory Access) scheduling or memory placement policy. The policy is set for the command and inherited by all its children. It can also manage policies for shared memory segments.

# PARAMETERS

**-a, --all**
> Disable cpuset awareness for broader CPU/node access

**-i, --interleave=nodes**
> Round-robin memory allocation across specified nodes

**-m, --membind=nodes**
> Restrict memory allocation to specified nodes only

**-N, --cpunodebind=nodes**
> Limit CPU execution to processors on specified nodes

**-C, --physcpubind=cpus**
> Bind process to specific physical CPUs

**-l, --localalloc**
> Prefer allocation on current node with fallback

**-p, --preferred=node**
> Prefer single node for allocation with fallback

**-P, --preferred-many=nodes**
> Prefer multiple nodes based on proximity

**-b, --balancing**
> Enable kernel NUMA balancing

**-s, --show**
> Display current NUMA policy settings

**-H, --hardware**
> Show available nodes and CPUs

**--huge**
> Use huge pages for SYSV shared memory

**--shm, --shmid**
> Specify shared memory segment

**--touch**
> Enforce policy immediately rather than on access

# CAVEATS

NUMA policies only make sense on multi-node systems. Node numbering starts at 0. The special value "all" can be used to specify all nodes.

# HISTORY

**numactl** is part of the **numactl** package for Linux NUMA systems. It provides user-space control over NUMA memory and CPU policies that complement kernel automatic NUMA balancing.

# SEE ALSO

[migratepages](/man/migratepages)(8), [numastat](/man/numastat)(8), [set_mempolicy](/man/set_mempolicy)(2), [mbind](/man/mbind)(2)
