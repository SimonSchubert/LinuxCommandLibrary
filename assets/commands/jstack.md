# TLDR

**Print thread dump for Java process**

```jstack [pid]```

**Force thread dump on hung process**

```jstack -F [pid]```

**Print concurrent locks info**

```jstack -l [pid]```

**Print mixed mode stack traces**

```jstack -m [pid]```

# SYNOPSIS

**jstack** [_options_] _pid_

# PARAMETERS

**-F**
> Force thread dump when process is hung.

**-l**
> Long listing with lock information.

**-m**
> Print mixed mode (Java and native) stack traces.

**-h**, **--help**
> Display help message.

# DESCRIPTION

**jstack** prints Java thread stack traces for a given Java process. It is useful for diagnosing deadlocks, performance issues, and analyzing thread states. Part of the JDK diagnostic tools suite.

# CAVEATS

The target process must be running with the same user or you need root privileges. The -F option should only be used when the process is not responding.

# SEE ALSO

[jps](/man/jps)(1), [jmap](/man/jmap)(1), [jcmd](/man/jcmd)(1)

