# TAGLINE

Java Heap Analysis Tool: parses HPROF heap dumps and serves them over HTTP (removed in JDK 9)

# TLDR

**Analyze a heap dump** (serves on http://localhost:7000)

```jhat [dump.hprof]```

**Use a custom HTTP port**

```jhat -port [8080] [dump.hprof]```

**Run with more heap** for the analyzer itself

```jhat -J-Xmx8g [dump.hprof]```

**Compare against a baseline dump**

```jhat -baseline [old.hprof] [new.hprof]```

**Pick one dump** from a file containing several

```jhat "[dump.hprof]#[2]"```

**Disable object reference tracking** (faster, less memory)

```jhat -stack false -refs false [dump.hprof]```

**Create a heap dump** to analyze (on any JDK)

```jmap -dump:live,format=b,file=[dump.hprof] [pid]```

# SYNOPSIS

**jhat** [_options_] _heap-dump-file_[**#**_n_]

# PARAMETERS

**-stack** _true|false_
> Track object allocation call stacks (default `true`). Must be set to `false` if the dump contains no allocation site information.

**-refs** _true|false_
> Track references to objects (default `true`). By default back pointers (referrers) are computed for every object; disabling this reduces memory use but loses referrer queries.

**-port** _port_
> TCP port for the HTTP server (default 7000).

**-exclude** _file_
> Path to a file listing data members (e.g. `java.lang.String.value`) to ignore in the reachable-objects query.

**-baseline** _file_
> Specify a baseline dump. Objects with the same object ID in both dumps are marked as not new, all others as new.

**-debug** _int_
> Debug level. `0` means no debug output; higher values are more verbose.

**-version**
> Print version and exit.

**-J**_flag_
> Pass _flag_ straight to the JVM running jhat (e.g. `-J-Xmx8g`).

**-h**, **-help**
> Show help.

# DESCRIPTION

**jhat** parses a Java heap dump file in HPROF binary format and launches a small HTTP server for browsing the heap. The web UI exposes pre-built queries (instances of a class, reference chains, reachable objects, histograms) and an Object Query Language (OQL) prompt, a SQL-like language for arbitrary queries over the heap. With the default port, OQL help is at `http://localhost:7000/oqlhelp/`. If the file holds several dumps, append `#n` to the name to select one.

Heap dumps can be produced by `jmap -dump`, `jcmd <pid> GC.heap_dump`, `jconsole` (HotSpotDiagnosticMXBean), or via `-XX:+HeapDumpOnOutOfMemoryError` on a crashing JVM.

# CAVEATS

**jhat was an experimental, unsupported tool and was removed in JDK 9 (JEP 241).** It only exists in JDK 6 to 8. On modern JDKs, capture dumps with **jcmd** or **jmap** and analyze them with **VisualVM**, **Eclipse MAT**, or a commercial profiler. Heap dumps contain all in-memory data (passwords, tokens, personal data); do not expose the jhat web server on an untrusted network. Analyzing large dumps needs a lot of memory, so raise the analyzer heap with `-J-Xmx`.

# HISTORY

**jhat** was added to the JDK in **Java 6**, based on the earlier standalone HAT (Heap Analysis Tool). It was removed in **Java 9** by JEP 241 as an out-of-date tool, since superior heap analyzers had been available for years.

# SEE ALSO

[jmap](/man/jmap)(1), [jstack](/man/jstack)(1), [jps](/man/jps)(1)

# RESOURCES

```[Documentation](https://docs.oracle.com/javase/8/docs/technotes/tools/unix/jhat.html)```

<!-- verified: 2026-11-23 -->
