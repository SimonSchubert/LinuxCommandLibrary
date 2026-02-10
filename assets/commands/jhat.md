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

**-exclude** _file_
> Exclude data members from queries.

**-J**_flag_
> Pass flag to JVM (e.g., -J-Xmx8G).

# DESCRIPTION

**jhat** is the Java Heap Analysis Tool. It parses heap dump files and launches a web server for browsing heap contents. Supports pre-designed queries and OQL (Object Query Language) for custom analysis. Access the web interface at http://localhost:7000 by default.

# CAVEATS

Deprecated since JDK 9. Use VisualVM, Eclipse MAT, or other heap analyzers instead. Still works with JDK 8.

# SEE ALSO

[jmap](/man/jmap)(1), [jstack](/man/jstack)(1)

