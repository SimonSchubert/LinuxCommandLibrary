# TLDR

**Trace method calls** in a running Java application

```btrace [pid] [script.java]```

**Trace with classpath**

```btrace -cp [/path/to/classes] [pid] [script.java]```

**Trace with unsafe mode** (allows more operations)

```btrace -u [pid] [script.java]```

**Compile a BTrace script**

```btracec [script.java]```

**Run with debug output**

```btrace -v [pid] [script.java]```

# SYNOPSIS

**btrace** [_options_] _pid_ _script_

**btracec** [_options_] _script_

# DESCRIPTION

**BTrace** is a safe, dynamic tracing tool for the Java platform. It allows attaching tracing scripts to running Java applications without restarting them. BTrace scripts are written in Java with annotations defining trace points.

BTrace works by instrumenting bytecode of the target application. Scripts can intercept method entries, exits, exceptions, and other events. The tracing is designed to be safe, preventing scripts from modifying application state or causing deadlocks.

Common use cases include performance profiling, debugging production issues, monitoring method call patterns, and tracking memory allocations without application restarts.

# PARAMETERS

**pid**
> Process ID of target Java application.

**script**
> BTrace script file (.java).

**-v**
> Verbose mode.

**-u**
> Unsafe mode (enables more operations).

**-d** _path_
> Dump instrumented classes to path.

**-pd** _path_
> Probe descriptor search path.

**-cp** _classpath_
> Classpath for script compilation.

**-I** _path_
> Preprocessor include path.

**-p** _port_
> Agent server port.

**-statsd** _host:port_
> Send metrics to StatsD server.

# CAVEATS

Target JVM must have similar or compatible Java version. Some operations are restricted in safe mode to prevent application harm. Cannot trace native methods. May have performance overhead on high-frequency methods. Requires write access to target application's process.

# HISTORY

**BTrace** was created by **A. Sundararajan** at Sun Microsystems around **2007-2008** as a DTrace-inspired tool for Java. After Oracle's acquisition of Sun, the project became open source and community-maintained. It has been used extensively for production debugging and performance analysis of Java applications, filling a gap for dynamic instrumentation in the JVM ecosystem.

# SEE ALSO

[jstack](/man/jstack)(1), [jmap](/man/jmap)(1), [java](/man/java)(1), [async-profiler](/man/async-profiler)(1)
