# TAGLINE

Scriptable benchmark for sorted key-value stores

# TLDR

**Run a workload** against the default in-memory engine

```keybench [path/to/workload.lua]```

**Benchmark several engines** in one run (persistent engines need a data directory)

```keybench --backend [skiplist,rocksdb,tidesdb] --data-dir [path/to/data] [path/to/workload.lua]```

**Sweep a range of thread counts** to test scaling

```keybench --threads [1,2,4,8] [path/to/workload.lua]```

**Run for a fixed duration** instead of a fixed number of operations

```keybench --secs [30] [path/to/workload.lua]```

**Repeat each measurement** and report the median

```keybench --repeat [5] [path/to/workload.lua]```

**Write results** to the console and a TSV file

```keybench --report [console,tsv:results.tsv] [path/to/workload.lua]```

# SYNOPSIS

**keybench** [_options_] _workload_file_ [_workload_file ..._]

# DESCRIPTION

**keybench** is a benchmarking harness that measures throughput and latency across multiple **sorted key-value storage engines**. Workloads are written once in **Lua** and run unchanged against every backend, so engines can be compared fairly under identical access patterns.

Each workload is a Lua table with a required **run** function (the measured unit of work) and an optional **load** function that seeds the store before timing begins. A workload may also declare a **sweep** to repeat the run across a list of parameter values. The harness reports two throughput figures, workload units per second (**wu/s**) and primitive operations per second (**ops/s**), along with p50, p99, p99.9 and max latency per operation type.

keybench is compiled with **make**; the resulting binary embeds an in-memory skiplist engine by default. Persistent engines are enabled at build time, for example **make ROCKSDB=1 TIDESDB=1**.

# OPTIONS

**--ops** _N_
> Total workload units to run across all threads (default 200000).

**--secs** _S_
> Run for _S_ seconds instead of a fixed operation count.

**--users** _N_
> User population size passed to the workload context.

**--items** _N_
> Catalog or keyspace size passed to the workload context.

**--seed** _N_
> Base RNG seed; thread _t_ uses seed + _t_.

**--backend** _LIST_
> Comma-separated list of engines to test (for example skiplist,rocksdb,tidesdb).

**--threads** _LIST_
> Comma-separated thread counts to sweep for scaling tests.

**--seed-once**
> Seed the dataset once per engine and reuse it across the thread sweep.

**--repeat** _N_
> Run each grid point _N_ times and report the median.

**--data-dir** _DIR_
> Directory for persistent engines such as rocksdb and tidesdb (required for them).

**--report** _LIST_
> Output sinks: console, tsv:file, or timeline:file.

**--report-dir** _DIR_
> Create a timestamped directory and bundle all run artifacts in it.

**--auto-plot**
> Generate plots after the run completes.

**--config** _FILE_
> Load run parameters from an INI file.

**--save-config** _FILE_
> Write the effective run parameters out as a replayable config.

# STORAGE ENGINES

**skiplist**
> In-memory probabilistic skiplist with a reader-writer lock. The reference engine; no persistence.

**rocksdb**
> Persistent LSM-tree store, configured via a [rocksdb] section in the INI config.

**tidesdb**
> Persistent, transactional LSM-tree store, configured via a [tidesdb] section.

# CAVEAT

Persistent engines (rocksdb, tidesdb) are only available when compiled in (**make ROCKSDB=1 TIDESDB=1**) and require **--data-dir**. Results depend heavily on hardware, allocator and build flags, so compare runs only on the same machine and build.

# HISTORY

**keybench** is an open-source benchmarking tool written mainly in **C** (with Lua workloads and Python helpers) by developer **guycipher**. It is distributed under the **GPL-2.0** license.

# SEE ALSO

[redis-benchmark](/man/redis-benchmark)(1), [memtier_benchmark](/man/memtier_benchmark)(1), [sysbench](/man/sysbench)(1), [fio](/man/fio)(1), [hyperfine](/man/hyperfine)(1)
