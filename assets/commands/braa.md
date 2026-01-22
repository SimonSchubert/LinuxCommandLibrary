# TLDR

**Walk the SNMP tree** of a host

```braa public@[ip_address]:[.1.3.6.*]```

**Query a subnet** for a specific OID

```braa public@[ip_range]:[.1.3.6.1.2.1.1.6.0]```

**Set a value** using SNMP write

```braa private@[ip_address]:[.1.3.6.1.2.1.1.6.0]=s'[workgroup]'```

# SYNOPSIS

**braa** _community@host:oid_...

# DESCRIPTION

**braa** is an ultra-fast mass SNMP scanner that can query multiple hosts simultaneously. Unlike traditional SNMP tools that process hosts sequentially, braa sends queries asynchronously, dramatically improving scan speed for large networks.

The tool supports SNMP GET, SET, and WALK operations across multiple hosts in a single command.

# SYNTAX

Queries use the format: **community@host:OID**

- **community**: SNMP community string (e.g., public, private)
- **host**: IP address or hostname (supports CIDR ranges)
- **OID**: Object Identifier, use * suffix for walks

For SET operations, append **=type'value'** where type is:
- **s**: String
- **i**: Integer
- **a**: IP address

# CAVEATS

SNMP v1/v2c community strings are transmitted in plain text. Mass scanning may trigger security alerts or rate limiting. Ensure you have authorization before scanning networks. Not suitable for SNMPv3.

# SEE ALSO

[snmpwalk](/man/snmpwalk)(1), [snmpget](/man/snmpget)(1), [snmpset](/man/snmpset)(1)
