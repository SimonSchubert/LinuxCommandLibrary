# TAGLINE

Trace Java method execution paths and timing.

# TLDR

**Trace** method execution

```trace [com.example.MyClass] [myMethod]```

Trace with **condition**

```trace [com.example.MyClass] [myMethod] '#cost > 100'```

Trace **all methods** in class

```trace [com.example.MyClass] *```

Trace with **invocation count**

```trace -n [5] [com.example.MyClass] [myMethod]```

Trace using **regex** class/method matching

```trace -E [com\.example\.(Foo|Bar)] [myMethod]```

# SYNOPSIS

**trace** [_-n count_] [_-E_] [_--skipJDKMethod value_] _class-pattern_ _method-pattern_ [_condition-express_]

# DESCRIPTION

**trace** is an Arthas command that traces method execution paths and timing. It shows the call hierarchy within a method invocation, highlighting which sub-methods consume the most time.

This is invaluable for identifying performance bottlenecks without adding logging or profiling instrumentation.

# PARAMETERS

**class-pattern**
> Class name (supports wildcards)

**method-pattern**
> Method name (supports wildcards)

**-n** _count_
> Stop after count invocations (default: 100)

**-E**
> Enable regular-expression matching for the class and method patterns (default is wildcard matching)

**--skipJDKMethod** _value_
> Skip tracing JDK methods (default: true)

**--exclude-class-pattern** _pattern_
> Exclude classes matching this pattern from the trace

**-m** _count_, **--maxMatch** _count_
> Maximum number of matched classes to instrument (default: 50)

**-v**
> Print verbose detail of the condition-express evaluation

**condition-express**
> OGNL condition (e.g., '#cost > 100' traces only invocations slower than 100ms)

# OUTPUT

Shows call tree with:
- Method names
- Execution time
- Nested call structure

# CAVEATS

Deep traces may produce verbose output. Performance overhead increases with trace depth. Use conditions to limit output.

# HISTORY

**trace** is a core diagnostic command in Arthas, essential for performance troubleshooting in production Java applications.

# INSTALL

```aur: yay -S arthas```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[arthas](/man/arthas)(1), [arthas-watch](/man/arthas-watch)(1)

# RESOURCES

```[Source code](https://github.com/alibaba/arthas)```

```[Homepage](https://arthas.aliyun.com)```

```[Documentation](https://arthas.aliyun.com/en/doc/trace.html)```

<!-- verified: 2026-06-16 -->
