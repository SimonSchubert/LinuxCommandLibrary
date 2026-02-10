# TAGLINE

load generation and benchmarking tool for Redis and Memcached

# TLDR

**Benchmark Redis**

```memtier_benchmark -s [localhost] -p [6379]```

**Benchmark with clients and threads**

```memtier_benchmark -s [host] -c [50] -t [4]```

**Custom key pattern**

```memtier_benchmark -s [host] --key-pattern=S:S```

**Set data size**

```memtier_benchmark -s [host] -d [128]```

**Run for specific duration**

```memtier_benchmark -s [host] --test-time=[60]```

**Benchmark memcached**

```memtier_benchmark -s [host] -p [11211] --protocol=memcache_text```

# SYNOPSIS

**memtier_benchmark** [_options_]

# PARAMETERS

**-s** _host_
> Server hostname.

**-p** _port_
> Server port.

**-c** _clients_
> Clients per thread.

**-t** _threads_
> Number of threads.

**-d** _size_
> Data size in bytes.

**--protocol** _proto_
> redis, memcache_text, memcache_binary.

**--ratio** _get:set_
> GET:SET ratio.

**--test-time** _secs_
> Test duration.

**--key-pattern** _pattern_
> Key access pattern.

# DESCRIPTION

**memtier_benchmark** is a load generation and benchmarking tool for Redis and Memcached. It measures throughput and latency under various load conditions.

The tool supports multiple protocols and provides detailed statistics including percentile latencies.

# KEY PATTERNS

```
S:S - Sequential
R:R - Random
G:G - Gaussian
```

# CAVEATS

Benchmarks only; doesn't test data integrity. Results depend on network. Use multiple instances for high-throughput testing.

# HISTORY

memtier_benchmark was developed by **Redis Labs** (now Redis Inc.) as a comprehensive benchmarking tool for in-memory data stores.

# SEE ALSO

[redis-benchmark](/man/redis-benchmark)(1), [redis-cli](/man/redis-cli)(1), [memcached](/man/memcached)(1)
