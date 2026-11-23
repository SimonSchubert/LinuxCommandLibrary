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

**Bundle all results** with a live timeline into a timestamped directory

```keybench --timeline [1] --report-dir [./results] --auto-plot [path/to/workload.lua]```

**Replay** a saved run configuration

```keybench --config [run.cnf]```

# SYNOPSIS

**keybench** [_options_] _workload_file_ [_workload_file ..._]

**keybench** **--config** _file_ [_options_]

# DESCRIPTION

**keybench** is a benchmarking harness that measures throughput and latency across multiple **sorted key-value storage engines**. Workloads are written once in **Lua** and run unchanged against every backend, so engines can be compared fairly under identical access patterns.

Each workload is a Lua table with a required **run** function (the measured unit of work) and an optional **load** function that seeds the store before timing begins. A workload may also declare a **sweep** to repeat the run across a list of parameter values. The harness reports two throughput figures, workload units per second (**wu/s**) and primitive operations per second (**ops/s**), along with p50, p99, p99.9 and max latency per operation type.

keybench is compiled with **make**; the resulting binary embeds an in-memory skiplist engine by default. Persistent engines are enabled at build time, for example **make ROCKSDB=1 TIDESDB=1** (optionally **ALLOC=jemalloc**). Additional engines can be added in C by implementing the engine interface and registering it with KV_REGISTER_BACKEND.

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

**--pin**
> Pin worker _t_ to the _t_-th CPU of the inherited CPU set (respects taskset, cgroups and container limits).

**--backend** _LIST_
> Comma-separated list of engines to test (for example skiplist,rocksdb,tidesdb).

**--threads** _LIST_
> Comma-separated thread counts to sweep for scaling tests.

**--seed-threads** _N_
> Number of threads used to seed the dataset (0, the default, uses the current **--threads** value).

**--seed-once**
> Seed the dataset once per engine and reuse it across the thread sweep.

**--repeat** _N_
> Run each grid point _N_ times and report the median.

**--data-dir** _DIR_
> Directory for persistent engines such as rocksdb and tidesdb (required for them).

**--report** _LIST_
> Comma-separated output sinks, each _name_ or _name_:_path_: console, tsv, timeline. A bare name or a path of - writes to stdout.

**--timeline** _S_
> Sample throughput, CPU, memory, disk and engine internals every _S_ seconds during the run (feeds the timeline sink).

**--report-dir** _DIR_
> Create _DIR_/_timestamp_/ and bundle the console report, points TSV, timeline TSV and a replay config there. Overrides **--report**.

**--auto-plot**
> Plot the **--report-dir** results into a figures/ subdirectory after the run. Best effort: needs python3 and matplotlib.

**--probe** _LIST_
> Context probes to record (system, build), **none** to disable, or **all** (default).

**--config** _FILE_
> Load run parameters from the [bench] section of an INI file, and engine tuning from engine-named sections. Command-line flags override it.

**--save-config** _FILE_
> Write the effective run parameters out as a replayable config.

# STORAGE ENGINES

**skiplist**
> In-memory probabilistic skiplist with a reader-writer lock. The reference engine; no persistence.

**rocksdb**
> Persistent LSM-tree store, configured via a [rocksdb] section in the INI config.

**tidesdb**
> Persistent, transactional LSM-tree store, configured via a [tidesdb] section.

# CAVEATS

Persistent engines (rocksdb, tidesdb) are only available when compiled in (**make ROCKSDB=1 TIDESDB=1**) and require **--data-dir**. keybench is POSIX-only. Results depend heavily on hardware, allocator and build flags, so compare runs only on the same machine and build.

# HISTORY

**keybench** is an open-source benchmarking tool written mainly in **C** (with Lua workloads and Python helpers) by developer **guycipher**. It is distributed under the **GPL-2.0** license.

# SEE ALSO

[redis-benchmark](/man/redis-benchmark)(1), [memtier_benchmark](/man/memtier_benchmark)(1), [sysbench](/man/sysbench)(1), [fio](/man/fio)(1), [hyperfine](/man/hyperfine)(1)

# RESOURCES

```[Source code](https://github.com/guycipher/keybench)```

<!-- verified: 2026-11-23 -->
