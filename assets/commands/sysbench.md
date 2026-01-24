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

**sysbench** benchmarks system performance including CPU, memory, I/O, and databases. It provides consistent measurements for comparison.

CPU tests measure computational throughput. They use prime number calculations to stress processors.

Memory tests measure bandwidth and latency. Results show transfer rates for sequential and random access patterns.

File I/O tests require preparation to create test files. Different modes test sequential, random, and mixed patterns.

Database benchmarks test OLTP (Online Transaction Processing) workloads. They simulate real application queries against MySQL or PostgreSQL.

Multi-threaded tests show how performance scales with parallelism. This reveals bottlenecks and contention.

# CAVEATS

Results depend on test parameters. Synthetic benchmarks don't reflect all workloads. File tests need disk space. Database tests need setup.

# HISTORY

**sysbench** was created by **Alexey Kopytov** at MySQL AB around **2004**. It became a standard tool for MySQL benchmarking and general system performance testing.

# SEE ALSO

[fio](/man/fio)(1), [stress-ng](/man/stress-ng)(1), [pgbench](/man/pgbench)(1), [iperf](/man/iperf)(1)
