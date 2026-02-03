# TLDR

**Export VM to OVA**

```vboxmanage export [vmname] -o [file.ova]```

**Export with manifest**

```vboxmanage export [vmname] -o [file.ova] --manifest```

**Export multiple VMs**

```vboxmanage export [vm1] [vm2] -o [file.ova]```

# SYNOPSIS

**vboxmanage** **export** _vmname_... **-o** _file_ [_options_]

# PARAMETERS

**-o**, **--output** _file_
> Output file (.ova or .ovf).

**--manifest**
> Include manifest file.

**--vsys** _n_
> Target specific VM.

**--vmname** _name_
> Override VM name.

**--product** _name_
> Product name.

**--vendor** _name_
> Vendor name.

# DESCRIPTION

**vboxmanage export** exports VMs to Open Virtualization Format (OVF/OVA). Creates portable appliances for sharing or migration. OVA is a single-file archive; OVF creates multiple files.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-import](/man/vboxmanage-import)(1)

