# TAGLINE

Export VMs to OVF/OVA format

# TLDR

**Export a VM to an OVA file**

```vboxmanage export [vmname] -o [file.ova]```

**Export a VM with a manifest file for integrity verification**

```vboxmanage export [vmname] -o [file.ova] --manifest```

**Export multiple VMs into a single appliance**

```vboxmanage export [vm1] [vm2] -o [file.ova]```

**Export using OVF 2.0 format**

```vboxmanage export [vmname] -o [file.ovf] --ovf20```

**Export with custom product and vendor metadata**

```vboxmanage export [vmname] -o [file.ova] --vsys 0 --product [product_name] --vendor [vendor_name]```

# SYNOPSIS

**vboxmanage** **export** _vmname_... **-o** _file_ [_options_]

# PARAMETERS

**-o**, **--output** _file_
> Output file. Use .ova for a single-file archive or .ovf for multiple files.

**--legacy09**
> Export in OVF 0.9 legacy format.

**--ovf10**
> Export in OVF 1.0 format (default).

**--ovf20**
> Export in OVF 2.0 format.

**--manifest**
> Include a manifest file with SHA digests for integrity verification.

**--options** _option_[,...]
> Comma-separated export options: manifest, iso, nomacs, nomacsbutnat.

**--vsys** _n_
> Specify virtual system number for per-VM settings (starting at 0).

**--vmname** _name_
> Override the VM name in the exported appliance.

**--product** _name_
> Set product name in appliance metadata.

**--producturl** _url_
> Set product URL in appliance metadata.

**--vendor** _name_
> Set vendor name in appliance metadata.

**--vendorurl** _url_
> Set vendor URL in appliance metadata.

**--version** _string_
> Set version string in appliance metadata.

**--description** _text_
> Set description in appliance metadata.

**--eula** _text_
> Embed end-user license agreement text.

**--eulafile** _filename_
> Embed EULA from a file.

# DESCRIPTION

**vboxmanage export** exports one or more virtual machines to the Open Virtualization Format (OVF/OVA). This creates portable appliance packages suitable for sharing, backup, or migration to other virtualization platforms. OVA is a single-file tar archive containing all appliance files; OVF produces a directory with separate descriptor, disk, and manifest files. Per-VM metadata options (product, vendor, description, etc.) require **--vsys** to specify which VM they apply to.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-import](/man/vboxmanage-import)(1), [vboxmanage-clonevm](/man/vboxmanage-clonevm)(1)

