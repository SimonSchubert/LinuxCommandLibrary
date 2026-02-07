# TAGLINE

Diagnose and troubleshoot Java applications in real time.

# TLDR

**Attach** to Java process

```java -jar arthas-boot.jar [PID]```

Select process **interactively**

```java -jar arthas-boot.jar```

Attach with **specific port**

```java -jar arthas-boot.jar --telnet-port [3658] --http-port [8563] [PID]```

# SYNOPSIS

**arthas-boot.jar** [_--telnet-port port_] [_--http-port port_] [_pid_]

# DESCRIPTION

**Arthas** is an Alibaba open-source Java diagnostic tool. It enables real-time monitoring and troubleshooting of Java applications without stopping them or modifying code.

Features include method tracing, class decompilation, monitoring metrics, and OGNL expression evaluation on live JVMs.

# PARAMETERS

**pid**
> Java process ID to attach

**--telnet-port** _port_
> Telnet console port

**--http-port** _port_
> HTTP API port

**--target-ip** _ip_
> IP to bind

**--tunnel-server** _url_
> Tunnel server URL

# COMMON COMMANDS

**dashboard**
> System overview

**trace** _class_ _method_
> Trace method execution

**watch** _class_ _method_
> Watch method input/output

**jad** _class_
> Decompile class

**sc** _pattern_
> Search loaded classes

**thread**
> Show thread info

**monitor** _class_ _method_
> Monitor method stats

# CONFIGURATION

**~/.arthas/arthas.properties**
> Default configuration for telnet port, HTTP port, target IP, and tunnel server settings.

# CAVEATS

Attaching to production JVMs should be done carefully. Some features may impact performance. Requires compatible JVM version.

# HISTORY

**Arthas** was developed by Alibaba and open-sourced in **2018**. It has become a popular Java diagnostic tool, especially in the Chinese developer community.

# SEE ALSO

[jstack](/man/jstack)(1), [jmap](/man/jmap)(1), [jconsole](/man/jconsole)(1)
