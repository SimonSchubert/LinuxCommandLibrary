# TLDR

**Trace** method execution

```trace [com.example.MyClass] [myMethod]```

Trace with **condition**

```trace [com.example.MyClass] [myMethod] '#cost > 100'```

Trace **all methods** in class

```trace [com.example.MyClass] *```

Trace with **invocation count**

```trace -n [5] [com.example.MyClass] [myMethod]```

# SYNOPSIS

**trace** [_-n count_] [_--skipJDKMethod_] _class-pattern_ _method-pattern_ [_condition-express_]

# DESCRIPTION

**trace** is an Arthas command that traces method execution paths and timing. It shows the call hierarchy within a method invocation, highlighting which sub-methods consume the most time.

This is invaluable for identifying performance bottlenecks without adding logging or profiling instrumentation.

# PARAMETERS

**class-pattern**
> Class name (supports wildcards)

**method-pattern**
> Method name (supports wildcards)

**-n** _count_
> Stop after count invocations

**--skipJDKMethod**
> Skip tracing JDK methods

**condition-express**
> OGNL condition (e.g., '#cost > 100')

# OUTPUT

Shows call tree with:
- Method names
- Execution time
- Nested call structure

# CAVEATS

Deep traces may produce verbose output. Performance overhead increases with trace depth. Use conditions to limit output.

# HISTORY

**trace** is a core diagnostic command in Arthas, essential for performance troubleshooting in production Java applications.

# SEE ALSO

[arthas](/man/arthas)(1), [arthas-watch](/man/arthas-watch)(1)
