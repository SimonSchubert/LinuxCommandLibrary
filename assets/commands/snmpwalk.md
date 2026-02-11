# TAGLINE

Walk SNMP MIB trees retrieving all values

# TLDR

**Walk entire MIB**

```snmpwalk -v2c -c [community] [host]```

**Walk specific OID**

```snmpwalk -v2c -c [public] [host] [1.3.6.1.2.1.1]```

**SNMPv3 with auth**

```snmpwalk -v3 -u [user] -l authPriv -A [authpass] -X [privpass] [host]```

**Show numeric OIDs**

```snmpwalk -On -v2c -c [community] [host]```

**Walk system tree**

```snmpwalk -v2c -c [public] [host] system```

**Output values only**

```snmpwalk -Oqv -v2c -c [public] [host] [oid]```

# SYNOPSIS

**snmpwalk** [_-v version_] [_-c community_] [_options_] _host_ [_oid_]

# PARAMETERS

**-v** _VERSION_
> SNMP version (1, 2c, 3).

**-c** _COMMUNITY_
> Community string.

**-u** _USER_
> SNMPv3 username.

**-l** _LEVEL_
> Security level.

**-A** _PASS_
> Auth passphrase.

**-X** _PASS_
> Privacy passphrase.

**-On**
> Numeric OIDs.

**-Oq**
> Quick output.

**-Ov**
> Values only.

# DESCRIPTION

**snmpwalk** retrieves a subtree of management values from an SNMP agent by issuing successive GETNEXT requests. Starting from a specified OID, it walks through the MIB tree and displays all values until it reaches the end of the subtree, providing a comprehensive view of device management data.

The tool supports SNMPv1, v2c, and v3. For v1 and v2c, community strings provide authentication, with "public" being a common read-only default. SNMPv3 adds robust security through username-based authentication (MD5/SHA) and encryption (DES/AES).

The starting OID determines the scope of the walk. Walking from the root retrieves all available data, while specifying a subtree like **system** or **interfaces** limits results. Output formatting options like **-On** (numeric OIDs) and **-Oq** (quick print) make output easier to parse in scripts.

# CAVEATS

Community strings are plaintext. v3 recommended for security. Large walks may be slow.

# HISTORY

**snmpwalk** is part of **Net-SNMP**, the standard open-source SNMP implementation. It's essential for network device monitoring and discovery.

# SEE ALSO

[snmpget](/man/snmpget)(1), [snmpset](/man/snmpset)(1), [snmptranslate](/man/snmptranslate)(1)
