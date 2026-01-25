# TLDR

**Show NUMA statistics**

```numastat```

**Show per-process NUMA memory**

```numastat -p [pid]```

**Show per-node memory info**

```numastat -m```

**Show compact output**

```numastat -c```

**Show statistics for command**

```numastat -p $(pgrep [process_name])```

# SYNOPSIS

**numastat** [_options_] [_pattern_|_pid_...]

# PARAMETERS

**-p** _pid_
> Show per-process stats.

**-m**
> Show memory info.

**-c**
> Compact output.

**-n**
> Show original format.

**-s** _node_
> Sort by node.

**-z**
> Skip zero values.

# DESCRIPTION

**numastat** displays memory statistics for NUMA (Non-Uniform Memory Access) systems. It shows per-node memory allocation, hits, misses, and process memory distribution.

Understanding NUMA statistics helps optimize application performance on multi-socket systems.

# STATISTICS EXPLAINED

```
numa_hit   - Allocation on intended node
numa_miss  - Allocation on different node
numa_foreign - Other node allocations here
interleave_hit - Interleave policy success
local_node - Local allocations
other_node - Remote allocations
```

# EXAMPLE OUTPUT

```
                 node0       node1
numa_hit        1234567      987654
numa_miss           100         200
local_node      1234467      987454
other_node          100         200
```

# CAVEATS

Only relevant on NUMA systems. Statistics cumulative since boot. Requires /sys/devices/system/node/.

# HISTORY

numastat is part of **numactl**, providing NUMA statistics similar to the original SGI IRIX numastat command.

# SEE ALSO

[numactl](/man/numactl)(8), [migratepages](/man/migratepages)(8), [numa](/man/numa)(7)
