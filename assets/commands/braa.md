# TAGLINE

Mass SNMP scanner for querying multiple hosts

# TLDR

**Walk the SNMP tree** of a host

```braa public@[ip_address]:[.1.3.6.*]```

**Query a subnet** for a specific OID

```braa public@[ip_range]:[.1.3.6.1.2.1.1.6.0]```

**Set a value** using SNMP write

```braa private@[ip_address]:[.1.3.6.1.2.1.1.6.0]=s'[workgroup]'```

# SYNOPSIS

**braa** [**-2**] [**-v**] [**-t** _secs_] [**-a** _secs_] [**-r** _retries_] [**-d** _usecs_] [**-f** _file_] _community@host:oid_...

# PARAMETERS

**-2**
> Use SNMPv2C (supports Counter64).

**-t** _SECS_
> Response wait time in seconds (default: 2).

**-a** _SECS_
> Deadline/overall timeout.

**-r** _N_
> Retry count before giving up (default: 3).

**-d** _USECS_
> Microsecond delay between packets.

**-f** _FILE_
> Load queries from file.

**-v**
> Verbose output.

# DESCRIPTION

**braa** is an ultra-fast mass SNMP scanner that can query multiple hosts simultaneously. Unlike traditional SNMP tools that process hosts sequentially, braa sends queries asynchronously, dramatically improving scan speed for large networks. It implements its own SNMP stack and requires numerical OIDs rather than symbolic names.

The tool supports SNMP GET, SET, and WALK operations across multiple hosts in a single command.

# SYNTAX

Queries use the format: **[community@]host[-host2][:port]:OID[/id][,OID2...]**

- **community**: SNMP community string (e.g., public, private)
- **host**: IP address or hostname (supports ranges like 10.0.0.1-10.0.0.50)
- **OID**: Object Identifier, use * suffix for walks

For SET operations, append **=type'value'** where type is:
- **s**: String
- **i**: Integer
- **a**: IP address
- **o**: OID

# CAVEATS

SNMP v1/v2c community strings are transmitted in plain text. Mass scanning may trigger security alerts or rate limiting. Ensure you have authorization before scanning networks. Not suitable for SNMPv3.

# SEE ALSO

[snmpwalk](/man/snmpwalk)(1), [snmpget](/man/snmpget)(1), [snmpset](/man/snmpset)(1)
