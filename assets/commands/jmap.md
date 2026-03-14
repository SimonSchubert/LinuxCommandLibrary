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

# SYNOPSIS

**jmap** [_options_] _pid_

# PARAMETERS

_PID_
> Target Java process ID.

**-clstats** _pid_
> Print class loader statistics of the Java heap.

**-finalizerinfo** _pid_
> Print information on objects awaiting finalization.

**-histo**[**:live**]
> Print histogram of the Java object heap. With :live, counts only live objects.

**-dump:**_options_
> Dump the Java heap. Sub-options:

**:live**
> Only live objects.

**:format=b**
> Binary hprof format.

**:file=**_FILE_
> Output file path.

# DESCRIPTION

**jmap** prints memory-related statistics for Java processes. It generates heap dumps, object histograms, and class loader statistics.

The tool is essential for memory analysis and leak detection. Heap dumps can be analyzed with tools like Eclipse MAT or VisualVM.

# CAVEATS

Part of JDK. This command is experimental and unsupported; it may not be available in future JDK releases. May pause the application during heap dump. Large heaps create large dump files.

# HISTORY

jmap has been part of the **JDK** since Java 5, providing memory analysis capabilities for running Java processes.

# SEE ALSO

[jhat](/man/jhat)(1), [jstack](/man/jstack)(1), [jinfo](/man/jinfo)(1)
