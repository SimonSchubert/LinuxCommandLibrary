# TAGLINE

Import VMs from OVF/OVA files

# TLDR

**Import OVA appliance**

```vboxmanage import [file.ova]```

**Import with dry run**

```vboxmanage import [file.ova] --dry-run```

**Import with new name**

```vboxmanage import [file.ova] --vsys 0 --vmname [newname]```

# SYNOPSIS

**vboxmanage** **import** _file_ [_options_]

# PARAMETERS

**--dry-run**
> Show what would be done.

**--vsys** _n_
> Target VM in appliance.

**--vmname** _name_
> Override VM name.

**--basefolder** _path_
> VM location.

**--cpus** _n_
> Override CPU count.

**--memory** _mb_
> Override memory.

# DESCRIPTION

**vboxmanage import** imports virtual machines from OVF/OVA files. Creates VMs from exported appliances. Supports customizing imported settings.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-export](/man/vboxmanage-export)(1)

