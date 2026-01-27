# TLDR

**Display request histogram**

```varnishhist```

**Connect to specific instance**

```varnishhist -n [instance_name]```

**Read from log file**

```varnishhist -r [/var/log/varnish.log]```

**Set update delay**

```varnishhist -d [2]```

**Filter by pattern**

```varnishhist -q "[RespStatus == 200]"```

**Exclude pattern**

```varnishhist -x "[BogoHeader]"```

# SYNOPSIS

**varnishhist** [_options_]

# PARAMETERS

**-n** _name_
> Specify varnishd instance name.

**-r** _file_
> Read log from file instead of shared memory.

**-d** _delay_
> Delay between updates in seconds (default: 1).

**-q** _query_
> Filter log entries with VSL query.

**-x** _regex_
> Exclude entries matching regular expression.

**-T** _seconds_
> Transaction timeout (default: 120).

**-h**
> Display help.

**-V**
> Display version.

# DISPLAY

The histogram shows distribution of request processing times. The horizontal axis uses a logarithmic scale. The vertical scale and number of requests (N) appear in the top left corner.

**|**: Cache hit.

**#**: Cache miss.

# DESCRIPTION

**varnishhist** reads Varnish shared memory logs and displays a live histogram of request processing times. It visualizes the distribution of cache hits and misses, helping identify performance patterns.

The display updates continuously, showing how request latencies distribute across logarithmic time buckets. Cache hits (|) and misses (#) use different characters, making it easy to compare their performance characteristics.

Useful for real-time monitoring of Varnish cache performance and identifying latency issues. Filter options allow focusing on specific request types or excluding noise.

# CAVEATS

Requires access to Varnish shared memory (typically needs appropriate group membership). Large log volumes may affect system resources. Historical analysis requires logged data.

# HISTORY

**varnishhist** was developed by Poul-Henning Kamp as part of the Varnish Cache project. Varnish was created for Verdens Gang (VG.no) in 2006 and has become one of the most popular HTTP accelerators, with varnishhist providing essential visual performance monitoring.

# SEE ALSO

[varnishd](/man/varnishd)(1), [varnishstat](/man/varnishstat)(1), [varnishlog](/man/varnishlog)(1), [varnishtop](/man/varnishtop)(1)
