# TAGLINE

Multi-threaded system benchmark tool

# TLDR

**CPU benchmark**

```sysbench cpu run```

**CPU benchmark with threads**

```sysbench cpu --threads=[4] run```

**Memory benchmark**

```sysbench memory run```

**File I/O prepare**

```sysbench fileio --file-total-size=[10G] prepare```

**File I/O benchmark**

```sysbench fileio --file-total-size=[10G] --file-test-mode=[rndrw] run```

**MySQL benchmark**

```sysbench oltp_read_write --mysql-host=[localhost] --mysql-user=[user] --mysql-password=[pass] --mysql-db=[test] run```

**Cleanup files**

```sysbench fileio --file-total-size=[10G] cleanup```

# SYNOPSIS

**sysbench** [_test_] [_--threads n_] [_options_] [_prepare_|_run_|_cleanup_]

# PARAMETERS

**cpu**
> CPU test.

**memory**
> Memory test.

**fileio**
> File I/O test.

**oltp_read_write**
> Database OLTP test.

**oltp_read_only**
> Read-only database test.

**--threads** _N_
> Number of threads.

**--time** _SECONDS_
> Test duration.

**--events** _N_
> Max events.

**--file-total-size** _SIZE_
> Total file size.

**--file-test-mode** _MODE_
> I/O mode (seqwr, seqrd, rndrw, etc.).

**--mysql-host** _HOST_
> MySQL host.

**--mysql-user** _USER_
> MySQL user.

**--mysql-password** _PASS_
> MySQL password.

**prepare**
> Prepare test.

**run**
> Run test.

**cleanup**
> Clean up.

# DESCRIPTION

**sysbench** is a multi-threaded benchmarking tool for evaluating system performance across CPU, memory, file I/O, and database workloads. It provides consistent, reproducible measurements that allow meaningful comparisons between different hardware configurations, kernel versions, or tuning parameters.

The tool includes built-in test types for common benchmarks. CPU tests stress processors using prime number calculations to measure computational throughput. Memory tests measure bandwidth and latency across sequential and random access patterns. File I/O tests support multiple modes including sequential writes, sequential reads, and random read/write mixes, requiring a preparation step to create test files before running and a cleanup step afterward.

Database benchmarks simulate OLTP (Online Transaction Processing) workloads against MySQL or PostgreSQL, executing realistic mixes of select, insert, update, and delete queries. All test types support multi-threaded execution to measure how performance scales with parallelism, revealing bottlenecks and contention points. Custom Lua scripts can define additional workloads beyond the built-in tests.

# CAVEATS

Results depend on test parameters. Synthetic benchmarks don't reflect all workloads. File tests need disk space. Database tests need setup.

# HISTORY

**sysbench** was created by **Alexey Kopytov** at MySQL AB around **2004**. It became a standard tool for MySQL benchmarking and general system performance testing.

# SEE ALSO

[fio](/man/fio)(1), [stress-ng](/man/stress-ng)(1), [pgbench](/man/pgbench)(1), [iperf](/man/iperf)(1)
