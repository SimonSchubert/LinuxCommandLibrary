# TAGLINE

Benchmark Redis server performance

# TLDR

**Run default benchmark**

```redis-benchmark```

**Connect to host**

```redis-benchmark -h [localhost] -p [6379]```

**Set client count**

```redis-benchmark -c [100]```

**Set request count**

```redis-benchmark -n [10000]```

**Test specific command**

```redis-benchmark -t [get,set]```

**Test with specific data size**

```redis-benchmark -d [256]```

**Pipeline requests**

```redis-benchmark -P [16]```

**Quiet mode**

```redis-benchmark -q```

# SYNOPSIS

**redis-benchmark** [_-h host_] [_-p port_] [_-c clients_] [_-n requests_] [_options_]

# PARAMETERS

**-h** _HOST_
> Server hostname.

**-p** _PORT_
> Server port.

**-c** _N_
> Concurrent clients.

**-n** _N_
> Total requests.

**-t** _TESTS_
> Test commands.

**-d** _SIZE_
> Data size in bytes.

**-P** _N_
> Pipeline N requests.

**-q**
> Quiet, show query/sec.

**-a** _PASSWORD_
> Authentication password.

**--csv**
> CSV output.

# DESCRIPTION

**redis-benchmark** measures Redis server performance by simulating multiple clients concurrently executing various commands. By default it tests a standard set of operations including SET, GET, INCR, LPUSH, LPOP, and others, reporting requests per second for each command type.

The **-c** flag controls the number of concurrent client connections, while **-n** sets the total request count. Pipelining with **-P** batches multiple requests per round-trip, testing raw throughput independent of network latency. The **-d** flag adjusts the data payload size to benchmark different workload patterns, and **-t** limits testing to specific commands.

# CAVEATS

Results vary by hardware and network. Local testing eliminates network overhead. Production has different patterns.

# HISTORY

**redis-benchmark** is included with **Redis**, originally created by **Salvatore Sanfilippo** in **2009**. It provides standardized performance testing for Redis deployments.

# SEE ALSO

[redis-cli](/man/redis-cli)(1), [redis-server](/man/redis-server)(1), [memtier_benchmark](/man/memtier_benchmark)(1)
