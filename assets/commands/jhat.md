# TAGLINE

Java Heap Analysis Tool — parses HPROF heap dumps and serves them over HTTP

# TLDR

**Analyze a heap dump** (serves on http://localhost:7000)

```jhat [dump.hprof]```

**Use a custom HTTP port**

```jhat -port [8080] [dump.hprof]```

**Run with more heap** for the analyzer itself

```jhat -J-Xmx8g [dump.hprof]```

**Compare against a baseline dump**

```jhat -baseline [old.hprof] [new.hprof]```

**Disable object reference tracking** (faster, less memory)

```jhat -stack false -refs false [dump.hprof]```

# SYNOPSIS

**jhat** [_options_] _heap-dump-file_

# PARAMETERS

**-stack** _true|false_
> Track object allocation call stacks (default `true`). Disable to speed up load of large dumps.

**-refs** _true|false_
> Track object references (default `true`). Disable to reduce memory use; most reference queries will be unavailable.

**-port** _port_
> TCP port for the HTTP server (default 7000).

**-exclude** _file_
> Path to a file listing data members to exclude from reachability queries.

**-baseline** _file_
> Specify a baseline dump. Objects present in both dumps are marked "not new".

**-debug** _int_
> Debug level. `0` = off, `1` = parse HPROF, `2` = parse without starting server.

**-version**
> Print version and exit.

**-J**_flag_
> Pass _flag_ straight to the JVM running jhat (e.g. `-J-Xmx8g`).

**-help**
> Show help.

# DESCRIPTION

**jhat** parses a Java heap dump file in HPROF binary format and launches a small HTTP server for browsing the heap. The web UI exposes pre-built queries (instances of a class, reference chains, reachable objects, histograms) and an Object Query Language (OQL) prompt for arbitrary queries over the heap.

Heap dumps can be produced by `jmap -dump`, `jcmd <pid> GC.heap_dump`, `jconsole`, or via `-XX:+HeapDumpOnOutOfMemoryError` on a crashing JVM.

# CAVEATS

**jhat was deprecated in JDK 8 (JEP 241) and removed in JDK 9.** On modern JDKs, use **jcmd**, **jmap -histo**, **VisualVM**, **Eclipse MAT**, or **JProfiler** instead. The HTTP server binds to all interfaces by default — use firewall rules or SSH tunneling to avoid exposing heap contents on a network.

# HISTORY

**jhat** was introduced in **Java 6** as a replacement for the older `hat` tool. It was deprecated in Java 8 and removed in Java 9 in favor of more capable third-party analyzers.

# SEE ALSO

[jmap](/man/jmap)(1), [jstack](/man/jstack)(1), [jps](/man/jps)(1)
