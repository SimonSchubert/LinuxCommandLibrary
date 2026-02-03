# TLDR

**Show disk usage via SNMP**

```snmpdf -v [2c] -c [public] [host]```

**Human readable output**

```snmpdf -v [2c] -c [public] -Ch [host]```

**Show all storage types**

```snmpdf -v [2c] -c [public] -Cu [host]```

# SYNOPSIS

**snmpdf** [_options_] _agent_

# PARAMETERS

**-v** _version_
> SNMP version (1, 2c, 3).

**-c** _community_
> Community string.

**-Ch**
> Human readable sizes.

**-Cu**
> Show all storage units.

# DESCRIPTION

**snmpdf** displays disk usage information from remote hosts via SNMP. Similar to df command but retrieves data over network using SNMP protocol. Part of Net-SNMP suite.

# SEE ALSO

[snmpget](/man/snmpget)(1), [df](/man/df)(1)

