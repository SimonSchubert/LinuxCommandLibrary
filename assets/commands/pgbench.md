# TAGLINE

runs TPC-B-like benchmarks on PostgreSQL databases

# TLDR

**Initialize benchmark database**

```pgbench -i [database]```

**Run benchmark**

```pgbench -c [10] -t [100] [database]```

**Run benchmark for duration**

```pgbench -c [10] -T [60] [database]```

**Run with custom script**

```pgbench -f [script.sql] [database]```

**Run read-only benchmark**

```pgbench -S -c [10] -T [30] [database]```

**Run with multiple threads**

```pgbench -c [20] -j [4] -T [60] [database]```

**Initialize with scale factor**

```pgbench -i -s [10] [database]```

# SYNOPSIS

**pgbench** [_-i_] [_-c clients_] [_-t transactions_] [_-T seconds_] [_-f script_] [_options_] _database_

# PARAMETERS

**-i**
> Initialize benchmark tables.

**-s** _SCALE_
> Scale factor for initialization.

**-c** _CLIENTS_
> Number of concurrent clients.

**-t** _TRANSACTIONS_
> Transactions per client.

**-T** _SECONDS_
> Duration in seconds.

**-j** _THREADS_
> Number of threads.

**-f** _FILE_
> Custom SQL script.

**-S**
> Select-only (read-only).

**-N**
> Skip updates to pgbench_tellers and branches.

**-r**
> Report latency per statement.

**-P** _SECONDS_
> Show progress every N seconds.

**-l**
> Log transactions to file.

**-h** _HOST_
> Database host.

**-p** _PORT_
> Database port.

**-U** _USER_
> Database user.

# DESCRIPTION

**pgbench** runs TPC-B-like benchmarks on PostgreSQL databases. It measures transaction throughput under concurrent load.

Initialization (-i) creates benchmark tables. Scale factor multiplies data size: scale 10 creates 1 million rows. Larger scales test different workload characteristics.

The benchmark simulates banking transactions: updates to accounts, tellers, and branches. It measures transactions per second (TPS) under concurrent client load.

Client count affects concurrency. More clients test parallel execution and locking. Thread count should match available CPU cores.

Custom scripts test specific workloads. They can use variables, conditionals, and multiple statements to simulate application behavior.

Progress output shows real-time TPS and latency. Final report includes average TPS, latency distribution, and any errors.

# CAVEATS

Not a full TPC-B implementation. Results depend on hardware, configuration, and workload. Initialize with appropriate scale for meaningful tests.

# HISTORY

**pgbench** has been part of **PostgreSQL** since version 7.0, originally written by **Tatsuo Ishii**. It provides a standard way to test PostgreSQL performance and compare configurations.

# SEE ALSO

[psql](/man/psql)(1), [pg_dump](/man/pg_dump)(1), [postgres](/man/postgres)(1)
