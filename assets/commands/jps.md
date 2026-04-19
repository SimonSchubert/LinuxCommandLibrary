# TAGLINE

lists Java Virtual Machine processes

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
> Display the full package name of the main class or the full path to the JAR file.

**-v**
> Display arguments passed to the JVM.

**-m**
> Display arguments passed to the main method.

**-q**
> Suppress class name/arguments; show only local JVM identifiers (PIDs).

**-V**
> Same as -q: list only local JVM identifiers.

**-help**
> Display the help message for jps.

# DESCRIPTION

**jps** lists Java Virtual Machine processes. It shows running Java applications with their PIDs.

The tool is the Java equivalent of ps for Java processes. It provides quick identification of Java applications.

# CAVEATS

Part of JDK. Shows JVM processes only. Requires same user or permissions.

# HISTORY

jps has been part of the **JDK** since Java 5, providing process listing for Java application management.

# SEE ALSO

[java](/man/java)(1), [jstack](/man/jstack)(1), [jmap](/man/jmap)(1), [ps](/man/ps)(1)
