# TLDR

**Show network connections**

```snmpnetstat -v [2c] -c [public] [host]```

**Show routing table**

```snmpnetstat -v [2c] -c [public] -Cr [host]```

**Show interface statistics**

```snmpnetstat -v [2c] -c [public] -Ci [host]```

# SYNOPSIS

**snmpnetstat** [_options_] _agent_

# PARAMETERS

**-v** _version_
> SNMP version (1, 2c, 3).

**-c** _community_
> Community string.

**-Ci**
> Interface statistics.

**-Cr**
> Routing table.

**-Cs**
> Protocol statistics.

# DESCRIPTION

**snmpnetstat** displays network status from remote hosts via SNMP. Similar to netstat but retrieves data over network using SNMP protocol. Part of Net-SNMP suite.

# SEE ALSO

[snmpget](/man/snmpget)(1), [netstat](/man/netstat)(1)

