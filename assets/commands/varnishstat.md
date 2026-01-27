# TLDR

**Display live statistics**

```varnishstat```

**Print statistics once and exit**

```varnishstat -1```

**Output as JSON**

```varnishstat -j```

**Output as XML**

```varnishstat -x```

**Show specific fields**

```varnishstat -f [MAIN.cache_hit,MAIN.cache_miss]```

**List available fields**

```varnishstat -l```

**Connect to specific instance**

```varnishstat -n [instance_name]```

# SYNOPSIS

**varnishstat** [_options_]

# PARAMETERS

**-1**
> Print statistics once and exit.

**-j**
> Output as JSON format.

**-x**
> Output as XML format.

**-f** _field_
> Filter to specific fields (glob pattern).

**-I** _glob_
> Include fields matching glob.

**-X** _glob_
> Exclude fields matching glob.

**-l**
> List available field names.

**-n** _name_
> Connect to specified varnishd instance.

**-t** _seconds_
> Timeout for acquiring shared memory lock.

# CURSES INTERFACE

The default curses mode shows live statistics with columns:

**Current**: Current value.

**Change**: Per-second change rate.

**Average**: Runtime average.

**Avg_10/100/1000**: Moving averages over update intervals.

# DESCRIPTION

**varnishstat** displays real-time statistics from a running Varnish cache server. It shows cache hit/miss rates, connection counts, backend health, and numerous performance counters.

In curses mode, statistics update continuously with the selected counter's description at the bottom. One-shot mode (-1) prints all counters once for scripting. JSON and XML outputs enable integration with monitoring systems.

Key metrics include client requests, cache hit ratio, backend connections, and memory usage. Monitoring these helps identify performance bottlenecks and capacity issues.

# CAVEATS

Requires access to Varnish shared memory. Statistics reset on Varnish restart. Field names may change between versions. Some counters require interpretation (averages vs totals).

# HISTORY

**varnishstat** was developed by Poul-Henning Kamp as part of the Varnish Cache project. Varnish was created for the Norwegian newspaper VG in 2006 and has become one of the most widely deployed HTTP accelerators.

# SEE ALSO

[varnishd](/man/varnishd)(1), [varnishhist](/man/varnishhist)(1), [varnishlog](/man/varnishlog)(1), [varnishtop](/man/varnishtop)(1)
