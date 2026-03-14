# TAGLINE

java Heap Analysis Tool

# TLDR

**Analyze heap dump**

```jhat [dump.hprof]```

**Use custom port**

```jhat -port [8080] [dump.hprof]```

**Analyze with increased memory**

```jhat -J-Xmx8G [dump.hprof]```

**Compare with baseline**

```jhat -baseline [old.hprof] [new.hprof]```

**Analyze specific dump in multi-dump file**

```jhat [file.hprof#2]```

# SYNOPSIS

**jhat** [_options_] _heap-dump-file_

# PARAMETERS

**-port** _port_
> HTTP server port (default 7000).

**-baseline** _file_
> Baseline dump for comparison.

**-stack** _boolean_
> Track allocation call stacks.

**-refs** _boolean_
> Track object references.

**-debug** _int_
> Set debug level. 0 means no debug output. 1 parses hprof file. 2 parses hprof file without starting server.

**-exclude** _file_
> Exclude data members listed in file from reachability queries.

**-version**
> Report version number and exit.

**-J**_flag_
> Pass flag to JVM (e.g., -J-Xmx8G).

# DESCRIPTION

**jhat** is the Java Heap Analysis Tool. It parses Java heap dump files (in HPROF format) and launches an HTTP web server for browsing heap contents interactively. Supports pre-designed queries and OQL (Object Query Language) for custom analysis. Access the web interface at http://localhost:7000 by default.

# CAVEATS

Removed since JDK 9 (JEP 241). Use VisualVM, Eclipse MAT, or other heap analyzers instead. Only available in JDK 6, 7, and 8.

# SEE ALSO

[jmap](/man/jmap)(1), [jstack](/man/jstack)(1), [jps](/man/jps)(1)

