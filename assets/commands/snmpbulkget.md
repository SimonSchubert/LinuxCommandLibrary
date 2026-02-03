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

**snmpbulkget** retrieves multiple MIB values efficiently using SNMP GETBULK operation. Faster than multiple get requests for retrieving table data. Part of Net-SNMP suite.

# SEE ALSO

[snmpget](/man/snmpget)(1), [snmpgetnext](/man/snmpgetnext)(1), [snmpwalk](/man/snmpwalk)(1)

