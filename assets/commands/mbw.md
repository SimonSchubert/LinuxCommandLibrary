# TAGLINE

Memory bandwidth benchmark tool

# TLDR

Run **3 iterations** of all tests with 512 MiB arrays

```mbw -n 3 512```

Run tests with 512 MiB, **quiet mode** suppressing averages

```mbw -n 3 -q -a 512```

Run **memcpy test** 3 times with 512 MiB, only display statistics

```mbw -n 3 -q -t0 512```

Run **mcblock test** 10 times with **1024 byte blocks** using 8192 MiB arrays

```mbw -n 10 -q -t2 -b 1024 8192```

Run dumb test with 2048 MiB, **run forever**

```mbw -n 0 -t1 -q 2048```

# SYNOPSIS

**mbw** [_options_] _size_in_MiB_

# PARAMETERS

**-n _count_**
> Number of test iterations (0 for infinite)

**-q**
> Quiet mode; show only statistics, suppress per-iteration output

**-a**
> Suppress printing averages

**-t _type_**
> Test type: 0=memcpy, 1=dumb (byte-by-byte), 2=mcblock (block copy)

**-b _bytes_**
> Block size in bytes for mcblock test (-t2)

**-h**
> Show quick help

# DESCRIPTION

**mbw** (Memory Bandwidth) is a benchmark tool that measures memory copy performance by allocating two memory regions and timing how fast data can be copied between them.

Three test methods are available: **memcpy** uses the C library's optimized memcpy function, **dumb** copies byte-by-byte to measure raw memory access speed, and **mcblock** copies in user-specified block sizes to analyze cache behavior.

Results are reported in MB/s, helping identify memory subsystem performance, compare different systems, or detect issues with memory configuration.

# CAVEATS

Results can vary significantly based on system load, CPU frequency scaling, and memory access patterns. For consistent benchmarks, ensure the system is idle and consider disabling CPU frequency scaling. The dumb test is intentionally slow and useful for measuring worst-case memory latency.

# HISTORY

mbw was written by Andras Horvath as a simple tool to test memory bandwidth, particularly useful for comparing RAM performance across different systems or configurations.

# SEE ALSO

[memtester](/man/memtester)(1), [stress-ng](/man/stress-ng)(1), [sysbench](/man/sysbench)(1)
