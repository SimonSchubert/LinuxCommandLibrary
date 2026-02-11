# TAGLINE

Modify SNMP object values on agents

# TLDR

**Set an integer value** using SNMPv2c

```snmpset -v 2c -c [community] [host] [OID] i [value]```

**Set a string value**

```snmpset -v 2c -c [community] [host] [OID] s "[string_value]"```

**Set multiple values** in one request

```snmpset -v 2c -c [community] [host] [OID1] i [value1] [OID2] s "[value2]"```

**Set using SNMPv3** with authentication

```snmpset -v 3 -u [username] -l authNoPriv -a MD5 -A [password] [host] [OID] i [value]```

**Set using SNMPv3** with authentication and encryption

```snmpset -v 3 -u [username] -l authPriv -a SHA -A [authpass] -x AES -X [privpass] [host] [OID] i [value]```

# SYNOPSIS

**snmpset** [_options_] _agent_ _OID_ _type_ _value_ [_OID_ _type_ _value_...]

# PARAMETERS

**-v** _version_
> SNMP version: **1**, **2c**, or **3**.

**-c** _community_
> Community string for SNMPv1/v2c authentication.

**-u** _username_
> SNMPv3 security name (username).

**-l** _level_
> SNMPv3 security level: **noAuthNoPriv**, **authNoPriv**, or **authPriv**.

**-a** _protocol_
> SNMPv3 authentication protocol: **MD5** or **SHA**.

**-A** _passphrase_
> SNMPv3 authentication passphrase.

**-x** _protocol_
> SNMPv3 privacy protocol: **DES** or **AES**.

**-X** _passphrase_
> SNMPv3 privacy passphrase.

**-t** _timeout_
> Timeout in seconds before retransmitting.

**-r** _retries_
> Number of retries before giving up.

# VALUE TYPES

**i**
> Integer

**u**
> Unsigned integer

**s**
> String

**x**
> Hexadecimal string

**d**
> Decimal string

**n**
> Null

**o**
> Object identifier

**t**
> Timeticks

**a**
> IP address

**b**
> Bits

# DESCRIPTION

**snmpset** communicates with a network entity using SNMP SET requests to modify management information on the device. Each variable to set requires three arguments: the OID, the data type, and the value.

The tool supports SNMPv1, SNMPv2c, and SNMPv3. Write access typically requires a different community string than read-only access, and many devices restrict which OIDs can be modified. SNMPv3 with authentication and encryption is recommended for security.

Common use cases include changing device configurations, enabling/disabling interfaces, modifying system contact or location information, and triggering actions on network equipment.

# CAVEATS

Modifying SNMP values can affect device operation and network stability. Ensure you have proper authorization and understand the impact before using snmpset. Write community strings should be kept confidential. Many OIDs are read-only and cannot be modified. Incorrect type specifications will cause the request to fail.

# HISTORY

**snmpset** is part of the **Net-SNMP** project, an open-source suite of SNMP tools and libraries. Net-SNMP evolved from the CMU SNMP implementation and later UCD-SNMP. It provides comprehensive SNMP v1, v2c, and v3 support and is the standard SNMP toolkit on most Unix-like systems.

# SEE ALSO

[snmpget](/man/snmpget)(1), [snmpwalk](/man/snmpwalk)(1), [snmptranslate](/man/snmptranslate)(1), [snmpd](/man/snmpd)(8)
