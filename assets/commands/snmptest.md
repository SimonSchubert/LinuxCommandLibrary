# TLDR

**Start interactive SNMP session**

```snmptest -v [2c] -c [public] [host]```

**Test with SNMPv3**

```snmptest -v [3] -u [user] -l authPriv -a SHA -A [authpass] [host]```

# SYNOPSIS

**snmptest** [_options_] _agent_

# PARAMETERS

**-v** _version_
> SNMP version (1, 2c, 3).

**-c** _community_
> Community string.

**-u** _user_
> SNMPv3 username.

**-l** _level_
> Security level.

# DESCRIPTION

**snmptest** provides an interactive SNMP session for testing and debugging. Send arbitrary SNMP requests interactively. Part of Net-SNMP suite for development and troubleshooting.

# SEE ALSO

[snmpget](/man/snmpget)(1), [snmpwalk](/man/snmpwalk)(1)

