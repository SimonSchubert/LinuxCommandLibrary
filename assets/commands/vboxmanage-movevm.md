# TAGLINE

Relocate VirtualBox VM files

# TLDR

**Move VM to new folder**

```vboxmanage movevm [vmname] --folder [path]```

**Move with specific type**

```vboxmanage movevm [vmname] --type basic --folder [path]```

# SYNOPSIS

**vboxmanage** **movevm** _vmname_ [_options_]

# PARAMETERS

**--folder** _path_
> Destination folder.

**--type** _type_
> Move type (basic).

# DESCRIPTION

**vboxmanage movevm** relocates a VM to a different folder. Moves all VM files including virtual disks. VM must be powered off.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-clonevm](/man/vboxmanage-clonevm)(1)

