# TAGLINE

Retrieve next SNMP OID value sequentially

# TLDR

**Get next OID value**

```snmpgetnext -v [2c] -c [public] [host] [OID]```

**Get next with SNMPv3**

```snmpgetnext -v [3] -u [user] -l authPriv -a SHA -A [authpass] -x AES -X [privpass] [host] [OID]```

# SYNOPSIS

**snmpgetnext** [_options_] _agent_ _oid_...

# PARAMETERS

**-v** _version_
> SNMP version (1, 2c, 3).

**-c** _community_
> Community string.

**-u** _user_
> SNMPv3 username.

**-l** _level_
> Security level (noAuthNoPriv, authNoPriv, authPriv).

**-O** _opts_
> Output format options.

# DESCRIPTION

**snmpgetnext** retrieves the lexicographically next OID value from an SNMP agent. Used for walking MIB trees and discovering available OIDs. Part of Net-SNMP suite.

# SEE ALSO

[snmpget](/man/snmpget)(1), [snmpwalk](/man/snmpwalk)(1), [snmpbulkget](/man/snmpbulkget)(1)

