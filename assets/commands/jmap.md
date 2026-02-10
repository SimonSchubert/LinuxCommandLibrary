# TAGLINE

prints memory maps for Java processes

# TLDR

**Print heap summary**

```jmap -heap [pid]```

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

**-heap**
> Print heap summary.

**-histo**
> Print object histogram.

**-dump:**_OPTIONS_
> Dump heap to file.

**:live**
> Only live objects.

**:format=b**
> Binary format.

**:file=**_FILE_
> Output file.

**--help**
> Display help information.

# DESCRIPTION

**jmap** prints memory maps for Java processes. It generates heap dumps and object histograms.

The tool is essential for memory analysis and leak detection. Heap dumps can be analyzed with tools like MAT.

# CAVEATS

Part of JDK. May pause application. Large heaps create large dumps.

# HISTORY

jmap has been part of the **JDK** since Java 5, providing memory analysis capabilities for running Java processes.

# SEE ALSO

[jhat](/man/jhat)(1), [jstack](/man/jstack)(1), [jinfo](/man/jinfo)(1), [jcmd](/man/jcmd)(1)
