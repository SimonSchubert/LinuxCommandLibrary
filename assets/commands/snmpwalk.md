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

**snmpwalk** retrieves SNMP data from network devices. It walks MIB trees fetching all values.

Community strings authenticate v1/v2c. Default is often "public" for read.

SNMPv3 provides encryption and authentication. Username and passphrases required.

OID starting points limit scope. System, interfaces, or specific branches.

Output formatting options help parsing. Numeric OIDs for scripting.

# CAVEATS

Community strings are plaintext. v3 recommended for security. Large walks may be slow.

# HISTORY

**snmpwalk** is part of **Net-SNMP**, the standard open-source SNMP implementation. It's essential for network device monitoring and discovery.

# SEE ALSO

[snmpget](/man/snmpget)(1), [snmpset](/man/snmpset)(1), [snmptranslate](/man/snmptranslate)(1)
