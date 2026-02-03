# TLDR

**Clone VM**

```vboxmanage clonevm [vmname] --name [newname]```

**Clone with full clone**

```vboxmanage clonevm [vmname] --mode all --name [newname]```

**Clone and register**

```vboxmanage clonevm [vmname] --name [newname] --register```

# SYNOPSIS

**vboxmanage** **clonevm** _vmname_ [_options_]

# PARAMETERS

**--name** _name_
> Name for cloned VM.

**--mode** _mode_
> Clone mode (machine, machinechildren, all).

**--register**
> Register clone with VirtualBox.

**--basefolder** _path_
> Clone to specified folder.

**--snapshot** _name_
> Clone from snapshot.

# DESCRIPTION

**vboxmanage clonevm** creates a copy of an existing virtual machine. Supports full clones (independent) and linked clones (sharing base disk). Useful for creating test environments from templates.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-createvm](/man/vboxmanage-createvm)(1)

