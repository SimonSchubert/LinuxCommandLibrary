# TAGLINE

prints and modifies Java VM configuration

# TLDR

**Show JVM flags**

```jinfo [pid]```

**Show system properties**

```jinfo -sysprops [pid]```

**Show specific flag**

```jinfo -flag [HeapDumpOnOutOfMemoryError] [pid]```

**Set flag dynamically**

```jinfo -flag +[HeapDumpOnOutOfMemoryError] [pid]```

**Unset flag**

```jinfo -flag -[PrintGC] [pid]```

**Print all flags**

```jinfo -flags [pid]```

# SYNOPSIS

**jinfo** [_options_] _pid_

# PARAMETERS

_PID_
> Target Java process ID.

**-flags**
> Print VM flags.

**-sysprops**
> Print system properties.

**-flag** _NAME_
> Print or modify specific flag.

**+**_FLAG_
> Enable boolean flag.

**-**_FLAG_
> Disable boolean flag.

**--help**
> Display help information.

# DESCRIPTION

**jinfo** prints and modifies Java VM configuration. It shows system properties and VM flags for running processes.

The tool can dynamically change manageable flags. Useful for tuning JVM behavior without restart.

# CAVEATS

Part of JDK. Not all flags modifiable. May require same user as target process.

# HISTORY

jinfo has been part of the **JDK** since Java 5, providing runtime configuration inspection and modification.

# SEE ALSO

[java](/man/java)(1), [jps](/man/jps)(1), [jstack](/man/jstack)(1), [jcmd](/man/jcmd)(1)
