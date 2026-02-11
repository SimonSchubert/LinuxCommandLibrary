# TAGLINE

Retrieve SNMP agent status summary

# TLDR

**Show host status**

```snmpstatus -v [2c] -c [public] [host]```

**Show status with SNMPv3**

```snmpstatus -v [3] -u [user] -l authPriv -a SHA -A [authpass] [host]```

# SYNOPSIS

**snmpstatus** [_options_] _agent_

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

**snmpstatus** retrieves status information from an SNMP agent. Shows system description, uptime, and interface summary. Quick health check for network devices. Part of Net-SNMP suite.

# SEE ALSO

[snmpget](/man/snmpget)(1), [snmpwalk](/man/snmpwalk)(1)

