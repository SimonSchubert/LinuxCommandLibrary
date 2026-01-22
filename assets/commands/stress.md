# TLDR

Spawn 4 workers to stress test **CPU**

```stress -c 4```

Spawn 2 workers to stress test **IO** with timeout

```stress -i 2 -t 5```

Spawn 2 workers to stress test **memory**

```stress -m 2 --vm-bytes 256M```

Spawn 2 workers to stress test **disk**

```stress -d 2 --hdd-bytes 1GB```

Run with **verbose** output

```stress -v -c 2```

# SYNOPSIS

**stress** [_-c N_] [_-i N_] [_-m N_] [_-d N_] [_-t seconds_] [_OPTIONS_]

# DESCRIPTION

**stress** imposes a configurable amount of CPU, memory, I/O, or disk stress on a POSIX-compliant operating system and reports any errors it detects. It is useful for evaluating system scalability, performance characteristics, and exposing bugs that manifest under heavy load conditions.

# PARAMETERS

**-c, --cpu N**
> Spawn N workers calculating square roots

**-i, --io N**
> Spawn N workers calling sync()

**-m, --vm N**
> Spawn N workers allocating and freeing memory

**--vm-bytes B**
> Allocate B bytes per vm worker (default: 256MB)

**--vm-stride B**
> Touch bytes at B-byte intervals (default: 4096)

**--vm-hang N**
> Sleep N seconds before freeing memory

**--vm-keep**
> Redirty memory instead of reallocating

**-d, --hdd N**
> Spawn N workers writing and unlinking files

**--hdd-bytes B**
> Write B bytes per hdd worker (default: 1GB)

**-t, --timeout N**
> Terminate after N seconds

**--backoff N**
> Wait N microseconds before starting work

**-v, --verbose**
> Enable verbose output

**-q, --quiet**
> Suppress non-error messages

**-n, --dry-run**
> Display actions without executing them

# CAVEATS

This tool is explicitly not a benchmarking tool. Values support time suffixes (s, m, h, d, y) and size suffixes (B, K, M, G). Running excessive stress tests may cause system instability.

# HISTORY

**stress** was designed to test system stability under load conditions. The related **stress-ng** tool provides more stress test options and metrics.

# SEE ALSO

[stress-ng](/man/stress-ng)(1), [top](/man/top)(1), [free](/man/free)(1)
