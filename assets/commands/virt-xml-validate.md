# TLDR

Validate against **specific** schema

```virt-xml-validate [path/to/file.xml] [schema]```

Validate **domain** XML

```virt-xml-validate [path/to/domain.xml] domain```

# SYNOPSIS

**virt-xml-validate** _FILE_ [_SCHEMA_]

# PARAMETERS

**FILE**
> XML file to validate

**SCHEMA**
> Schema to validate against (auto-detected if not specified)

# DESCRIPTION

**virt-xml-validate** validates libvirt XML files against their schemas. If no schema is specified, it is determined automatically from the root element in the XML file.

This tool helps verify that XML configuration files are valid before using them with libvirt.

# CAVEATS

Valid XML doesn't guarantee the configuration will work. Some schema errors may not be detected. Requires libvirt schemas to be installed.

# SEE ALSO

[virt-xml](/man/virt-xml)(1), [virsh](/man/virsh)(1)
