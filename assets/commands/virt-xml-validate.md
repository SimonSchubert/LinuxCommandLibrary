# TAGLINE

Validate libvirt XML files

# TLDR

Validate against **specific** schema

```virt-xml-validate [path/to/file.xml] [schema]```

Validate **domain** XML

```virt-xml-validate [path/to/domain.xml] domain```

Validate **network** XML

```virt-xml-validate [path/to/network.xml] network```

Validate **storage pool** XML

```virt-xml-validate [path/to/pool.xml] storagepool```

# SYNOPSIS

**virt-xml-validate** _FILE_ [_SCHEMA_]

# PARAMETERS

**FILE**
> XML file to validate

**SCHEMA**
> Schema name to validate against (auto-detected from root element if omitted). Valid schemas include: domain, domainsnapshot, domaincheckpoint, domainbackup, domaincaps, network, networkport, nwfilter, nwfilterbinding, storagepool, storagepoolcaps, storagevol, nodedev, capability, interface, secret, cpu.

**-h**, **--help**
> Display command-line help then exit.

**-V**, **--version**
> Display version information then exit.

# DESCRIPTION

**virt-xml-validate** validates libvirt XML files against their schemas. If no schema is specified, it is determined automatically from the root element in the XML file.

This tool helps verify that XML configuration files are valid before using them with libvirt.

# CAVEATS

Valid XML doesn't guarantee the configuration will work. Some schema errors may not be detected. Requires libvirt schemas to be installed.

# SEE ALSO

[virt-xml](/man/virt-xml)(1), [virsh](/man/virsh)(1)
