# TAGLINE

prints memory-related statistics for Java processes

# TLDR

**Print class loader statistics**

```jmap -clstats [pid]```

**Dump heap to file**

```jmap -dump:format=b,file=[heap.hprof] [pid]```

**Dump live objects only**

```jmap -dump:live,format=b,file=[heap.hprof] [pid]```

**Histogram of objects**

```jmap -histo [pid]```

**Live objects histogram**

```jmap -histo:live [pid]```

**Write a histogram to a file**

```jmap -histo:live,file=[histo.txt] [pid]```

**Dump heap gzip-compressed** (fastest level)

```jmap -dump:live,format=b,gz=1,file=[heap.hprof.gz] [pid]```

**Show objects awaiting finalization**

```jmap -finalizerinfo [pid]```

# SYNOPSIS

**jmap** [_options_] _pid_

# PARAMETERS

_PID_
> Target Java process ID.

**-clstats** _pid_
> Print class loader statistics of the Java heap.

**-finalizerinfo** _pid_
> Print information on objects awaiting finalization.

**-histo**[**:**_options_]
> Print histogram of the Java object heap. Comma-separated sub-options: **live** or **all** (default: all), **file=**_FILE_ to write to a file, **parallel=**_N_ for heap inspection threads (0 lets the VM decide, 1 disables parallelism).

**-dump:**_options_
> Dump the Java heap. Sub-options:

**live**
> Only live objects.

**all**
> All objects (default).

**format=b**
> Binary hprof format.

**file=**_FILE_
> Output file path.

**gz=**_LEVEL_
> Write gzip-compressed output at level 1 (fastest, recommended) to 9 (strongest).

**-h**, **--help**
> Print help message.

# DESCRIPTION

**jmap** prints memory-related statistics for Java processes. It generates heap dumps, object histograms, and class loader statistics.

The tool is essential for memory analysis and leak detection. Heap dumps can be analyzed with tools like Eclipse MAT or VisualVM.

# CAVEATS

Part of JDK. This command is experimental and unsupported; it may not be available in future JDK releases. May pause the application during heap dump, and **live** forces a full GC first. Large heaps create large dump files. The older **-heap** view and core-file mode were moved to **jhsdb jmap**. **jhat** was removed in JDK 9.

# HISTORY

jmap has been part of the **JDK** since Java 5, providing memory analysis capabilities for running Java processes.

# SEE ALSO

[jhsdb](/man/jhsdb)(1), [jps](/man/jps)(1), [jstack](/man/jstack)(1), [jinfo](/man/jinfo)(1), [jhat](/man/jhat)(1)

# RESOURCES

```[Source code](https://github.com/openjdk/jdk)```

```[Homepage](https://openjdk.org/)```

```[Documentation](https://docs.oracle.com/en/java/javase/25/docs/specs/man/jmap.html)```

<!-- verified: 2026-11-09 -->
