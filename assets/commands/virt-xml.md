# TAGLINE

Edit libvirt domain XML configuration

# TLDR

**List available disk suboptions**

```virt-xml --disk=?```

**Edit VM metadata**

```virt-xml [domain] --edit --metadata description="[new_description]"```

**Toggle boot menu**

```virt-xml [domain] --edit --boot bootmenu=[on]```

**Add a disk to a VM**

```virt-xml [domain] --add-device --disk [path=/var/lib/libvirt/images/disk.qcow2]```

**Attach USB device to a running VM**

```virt-xml [domain] --update --add-device --hostdev [bus].[device]```

# SYNOPSIS

**virt-xml** [_OPTIONS_] _DOMAIN_

# PARAMETERS

**--edit**
> Edit existing configuration

**--add-device**
> Add a new device

**--update**
> Apply changes to running VM

**--disk**
> Disk configuration options

**--network**
> Network configuration options

**--boot**
> Boot configuration options

**--metadata**
> Metadata options (description, title, etc.)

**--hostdev**
> Host device passthrough

# DESCRIPTION

**virt-xml** edits libvirt domain XML files using explicit command-line options. It provides a way to modify VM configurations without manually editing XML.

Domain can be specified by name, UUID, or ID for existing VMs. Adding =? to any option lists available suboptions.

# CAVEATS

Changes to running VMs may require restart. Not all options can be changed on running VMs. Requires proper libvirt permissions.

# SEE ALSO

[virsh](/man/virsh)(1), [virt-manager](/man/virt-manager)(1), [virt-xml-validate](/man/virt-xml-validate)(1)
