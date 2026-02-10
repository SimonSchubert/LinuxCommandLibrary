# TAGLINE

java HotSpot Serviceability Agent debugger

# TLDR

**Attach debugger to process**

```jhsdb clhsdb --pid [pid]```

**Analyze core dump**

```jhsdb hsdb --core [core] --exe [java]```

**Print Java stack traces**

```jhsdb jstack --pid [pid]```

**Heap analysis**

```jhsdb jmap --pid [pid] --heap```

**Mixed stack traces**

```jhsdb jstack --mixed --pid [pid]```

**Launch GUI debugger**

```jhsdb hsdb --pid [pid]```

# SYNOPSIS

**jhsdb** _command_ [_options_]

# PARAMETERS

**clhsdb**
> Command-line HotSpot debugger.

**hsdb**
> GUI HotSpot debugger.

**jstack**
> Print stack traces.

**jmap**
> Memory map tool.

**jinfo**
> Configuration info.

**--pid** _PID_
> Target process ID.

**--core** _FILE_
> Core dump file.

**--help**
> Display help information.

# DESCRIPTION

**jhsdb** is the Java HotSpot Serviceability Agent debugger. It analyzes JVM processes and core dumps.

The tool provides low-level JVM debugging capabilities. It can inspect heap, stack, and internal structures.

# CAVEATS

Part of JDK. Requires same JDK version as target. May need symbols for full analysis.

# HISTORY

jhsdb was introduced in **JDK 9** as a unified tool replacing separate serviceability agent commands.

# SEE ALSO

[jstack](/man/jstack)(1), [jmap](/man/jmap)(1), [jinfo](/man/jinfo)(1), [jcmd](/man/jcmd)(1)
