# TAGLINE

Retrieve SNMP object values from agents

# TLDR

**Get a single OID value** using SNMPv2c

```snmpget -v 2c -c [community] [host] [OID]```

**Get system description** from a device

```snmpget -v 2c -c [public] [192.168.1.1] sysDescr.0```

**Get multiple OID values** in one request

```snmpget -v 2c -c [community] [host] [OID1] [OID2] [OID3]```

**Query using SNMPv3** with authentication

```snmpget -v 3 -u [username] -l authNoPriv -a MD5 -A [password] [host] [OID]```

**Query using SNMPv3** with authentication and encryption

```snmpget -v 3 -u [username] -l authPriv -a SHA -A [authpass] -x AES -X [privpass] [host] [OID]```

**Set timeout and retries**

```snmpget -v 2c -c [community] -t [5] -r [3] [host] [OID]```

# SYNOPSIS

**snmpget** [_options_] _agent_ _OID_ [_OID_...]

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
> Timeout in seconds before retransmitting. Default: 1.

**-r** _retries_
> Number of retries before giving up. Default: 5.

**-p** _port_
> UDP port of the SNMP agent. Default: 161.

**-m** _MIBLIST_
> Colon-separated list of MIB modules to load. Use **ALL** for all MIBs.

**-M** _PATHLIST_
> Colon-separated list of directories to search for MIBs.

**-O** _options_
> Output format options (e.g., **n** for numeric OIDs, **q** for quick print).

# DESCRIPTION

**snmpget** communicates with a network entity using SNMP GET requests to retrieve specific management information. It queries one or more Object Identifiers (OIDs) and returns their current values from the SNMP agent.

The tool supports SNMPv1, SNMPv2c, and SNMPv3. SNMPv1 and v2c use community strings for simple authentication, while SNMPv3 provides robust security with authentication (MD5/SHA) and encryption (DES/AES) options.

OIDs can be specified numerically (e.g., **.1.3.6.1.2.1.1.1.0**) or using MIB names (e.g., **sysDescr.0**). Scalar values require a **.0** index suffix. Without it, snmpget will return an error.

# CONFIGURATION

**/etc/snmp/snmp.conf**
> System-wide SNMP client configuration including default version, community strings, and MIB search paths.

**~/.snmp/snmp.conf**
> Per-user SNMP client configuration overriding system defaults.

**MIBS**
> Environment variable specifying which MIB modules to load (colon-separated list, or ALL).

**MIBDIRS**
> Environment variable specifying directories to search for MIB files.

# CAVEATS

Scalar OIDs require a **.0** index suffix; omitting it is a common error. SNMPv1/v2c community strings are transmitted in plaintext and should only be used on trusted networks. For secure environments, use SNMPv3 with authentication and encryption. MIB files must be installed for symbolic OID names to work.

# HISTORY

**snmpget** is part of the **Net-SNMP** project, an open-source suite of SNMP tools and libraries. Net-SNMP evolved from the CMU SNMP implementation in the 1990s and later the UCD-SNMP project. The project provides comprehensive SNMP v1, v2c, and v3 support and is widely used for network monitoring and management on Unix-like systems.

# SEE ALSO

[snmpwalk](/man/snmpwalk)(1), [snmpset](/man/snmpset)(1), [snmptranslate](/man/snmptranslate)(1), [snmptrap](/man/snmptrap)(1), [snmpd](/man/snmpd)(8)
