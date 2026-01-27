# TLDR

**Translate a numeric OID** to its textual name

```snmptranslate [.1.3.6.1.2.1.1.1.0]```

**Translate a textual OID** to numeric form

```snmptranslate -On [sysDescr.0]```

**Show full OID details** including description

```snmptranslate -Td [sysDescr]```

**Display the MIB tree** starting from a node

```snmptranslate -Tp [system]```

**Search for OIDs** by regex pattern

```snmptranslate -TB [pattern]```

**Show all OIDs** in the loaded MIBs

```snmptranslate -Ta```

**Load additional MIB** for translation

```snmptranslate -m [+MY-MIB] [OID]```

# SYNOPSIS

**snmptranslate** [_options_] _OID_

# PARAMETERS

**-On**
> Print OID in numeric form only.

**-Of**
> Print full OID path.

**-OS**
> Print the last symbolic element of the OID.

**-Td**
> Print detailed information including description, type, and access.

**-Tp**
> Print a tree of subtree rooted at the OID.

**-Ta**
> Print all OIDs in the loaded MIBs.

**-TB** _pattern_
> Search for OIDs matching the regex pattern.

**-m** _MIBLIST_
> Colon-separated list of MIB modules to load. Use **+MIB** to add to defaults.

**-M** _PATHLIST_
> Colon-separated list of directories to search for MIBs.

**-IR**
> Use random access lookup for better performance.

**-h**
> Display help information.

# DESCRIPTION

**snmptranslate** is a utility for translating between numeric and textual forms of SNMP Object Identifiers (OIDs). It uses MIB (Management Information Base) files to perform translations and can display detailed information about OIDs including their descriptions, syntax, and access permissions.

The tool is useful for understanding MIB structure, exploring available OIDs, and converting between human-readable names and numeric dotted notation used in SNMP operations. It does not communicate with any SNMP agent; all translations are performed locally using loaded MIB files.

MIBs define the structure and meaning of OIDs. Common MIBs like SNMPv2-MIB and IF-MIB are loaded by default, but vendor-specific MIBs may need to be explicitly loaded.

# CAVEATS

Translation accuracy depends on having the correct MIBs installed and loaded. Vendor-specific OIDs require the corresponding vendor MIBs. The **-m** option with a **+** prefix adds to default MIBs; without **+**, it replaces them. MIB files should be placed in standard directories or specified via **-M**.

# HISTORY

**snmptranslate** is part of the **Net-SNMP** project, an open-source suite of SNMP tools and libraries. It provides a way to work with OIDs without network communication, making it useful for MIB exploration, documentation, and scripting. The tool has been part of Net-SNMP since its early versions.

# SEE ALSO

[snmpget](/man/snmpget)(1), [snmpset](/man/snmpset)(1), [snmpwalk](/man/snmpwalk)(1), [snmpd](/man/snmpd)(8)
