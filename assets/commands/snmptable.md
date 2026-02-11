# TAGLINE

Display SNMP MIB data in table format

# TLDR

**Display SNMP table**

```snmptable -v [2c] -c [public] [host] [TABLE_OID]```

**Show with column headers**

```snmptable -v [2c] -c [public] -Cb [host] [TABLE_OID]```

**Show interface table**

```snmptable -v [2c] -c [public] [host] ifTable```

# SYNOPSIS

**snmptable** [_options_] _agent_ _table_oid_

# PARAMETERS

**-v** _version_
> SNMP version (1, 2c, 3).

**-c** _community_
> Community string.

**-Cb**
> Brief column names.

**-Cf** _sep_
> Field separator.

**-Cw** _width_
> Column width.

# DESCRIPTION

**snmptable** displays SNMP table data in tabular format. Retrieves and formats MIB tables for easy reading. Part of Net-SNMP suite for network management.

# SEE ALSO

[snmpwalk](/man/snmpwalk)(1), [snmpget](/man/snmpget)(1)

