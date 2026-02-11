# TAGLINE

Bulk retrieve SNMP MIB values efficiently

# TLDR

**Bulk get MIB values**

```snmpbulkget -v [2c] -c [public] [host] [OID]```

**Get with non-repeaters**

```snmpbulkget -Cn [1] -v [2c] -c [public] [host] [OID]```

**Get with max repetitions**

```snmpbulkget -Cr [10] -v [2c] -c [public] [host] [OID]```

# SYNOPSIS

**snmpbulkget** [_options_] _agent_ _oid_...

# PARAMETERS

**-v** _version_
> SNMP version (2c, 3).

**-c** _community_
> Community string.

**-Cn** _num_
> Non-repeaters count.

**-Cr** _num_
> Max repetitions.

**-O** _opts_
> Output options.

# DESCRIPTION

**snmpbulkget** retrieves multiple MIB values from an SNMP agent in a single request using the GETBULK operation introduced in SNMPv2c. This is significantly more efficient than issuing multiple individual GET or GETNEXT requests, especially when retrieving large tables or sequential OID ranges.

The **-Cn** (non-repeaters) parameter specifies how many of the initial OIDs should be retrieved with a simple GETNEXT, while **-Cr** (max-repetitions) controls how many successive values to fetch for the remaining OIDs. This combination allows mixing scalar and tabular data retrieval in a single request.

The tool is part of the **Net-SNMP** suite and requires SNMPv2c or SNMPv3, as the GETBULK operation is not available in SNMPv1.

# SEE ALSO

[snmpget](/man/snmpget)(1), [snmpgetnext](/man/snmpgetnext)(1), [snmpwalk](/man/snmpwalk)(1)

