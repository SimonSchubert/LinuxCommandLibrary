# TLDR

**List Java processes**

```jps```

**Show full class names**

```jps -l```

**Show JVM arguments**

```jps -v```

**Show main class arguments**

```jps -m```

**Show all information**

```jps -lvm```

**Query remote host**

```jps -l [hostname]```

# SYNOPSIS

**jps** [_options_] [_hostid_]

# PARAMETERS

_HOSTID_
> Remote host to query.

**-l**
> Show full main class name.

**-v**
> Show JVM arguments.

**-m**
> Show main method arguments.

**-q**
> Show only PIDs.

**--help**
> Display help information.

# DESCRIPTION

**jps** lists Java Virtual Machine processes. It shows running Java applications with their PIDs.

The tool is the Java equivalent of ps for Java processes. It provides quick identification of Java applications.

jps lists Java processes.

# CAVEATS

Part of JDK. Shows JVM processes only. Requires same user or permissions.

# HISTORY

jps has been part of the **JDK** since Java 5, providing process listing for Java application management.

# SEE ALSO

[java](/man/java)(1), [jstack](/man/jstack)(1), [jmap](/man/jmap)(1), [ps](/man/ps)(1)
