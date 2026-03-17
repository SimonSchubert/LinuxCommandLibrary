# TAGLINE

Display remote disk usage via SNMP

# TLDR

**Show disk usage via SNMP**

```snmpdf -v [2c] -c [public] [host]```

**Human readable output**

```snmpdf -v [2c] -c [public] -Ch [host]```

**Human readable SI format output**

```snmpdf -v [2c] -c [public] -CH [host]```

**Use UCD-SNMP-MIB dskTable instead of default**

```snmpdf -v [2c] -c [public] -Cu [host]```

# SYNOPSIS

**snmpdf** [_options_] _agent_

# PARAMETERS

**-v** _version_
> SNMP version (1, 2c, 3).

**-c** _community_
> Community string.

**-Ch**
> Human readable sizes (MiB, GiB, TiB).

**-CH**
> Human readable sizes in SI format (MB, GB, TB).

**-Cu**
> Use UCD-SNMP-MIB dskTable instead of default HOST-RESOURCES-MIB hrStorageTable.

# DESCRIPTION

**snmpdf** displays disk space and storage usage from remote hosts by querying SNMP agents, providing functionality similar to the **df** command but over the network. It reads the Host Resources MIB (hrStorageTable) to report filesystem sizes, used space, and availability.

The tool queries storage entries including physical disks, RAM, virtual memory, and other storage types reported by the SNMP agent. The **-Ch** flag formats output in human-readable sizes, and **-Cu** forces use of the UCD-SNMP-MIB dskTable instead of the default hrStorageTable.

snmpdf is part of the **Net-SNMP** suite and is useful for monitoring disk usage across many hosts from a central location without requiring SSH access or agents beyond the standard SNMP daemon.

# CAVEATS

Requires a running SNMP agent on the remote host. The default hrStorageTable may report virtual memory and other non-disk storage types. Community strings and SNMP credentials must match the agent configuration. SNMPv3 authentication adds complexity but is recommended for security.

# HISTORY

**snmpdf** is part of the **Net-SNMP** suite, which evolved from the UCD-SNMP project originally developed at the University of California, Davis.

# SEE ALSO

[snmpget](/man/snmpget)(1), [snmpwalk](/man/snmpwalk)(1), [snmpset](/man/snmpset)(1), [df](/man/df)(1)
