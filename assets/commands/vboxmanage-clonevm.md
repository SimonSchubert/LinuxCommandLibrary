# TAGLINE

Clone VirtualBox virtual machines

# TLDR

**Clone the current state of a VM**

```vboxmanage clonevm [vmname] --name=[newname]```

**Clone including all snapshots**

```vboxmanage clonevm [vmname] --mode=all --name=[newname]```

**Clone and register**

```vboxmanage clonevm [vmname] --name=[newname] --register```

**Create a linked clone from a snapshot**

```vboxmanage clonevm [vmname] --snapshot=[snapshot] --options=link --name=[newname] --register```

**Clone from a snapshot and keep all MAC addresses**

```vboxmanage clonevm [vmname] --snapshot=[snapshot] --options=keepallmacs --name=[newname] --register```

# SYNOPSIS

**vboxmanage** **clonevm** _vmname_|_uuid_ [_options_]

# PARAMETERS

**--name**=_name_
> Name for the clone (default: _original-name_ Clone).

**--mode**=_mode_
> **machine** clones the current state only (default), **machineandchildren** clones the snapshot given by **--snapshot** and its child snapshots, **all** clones all snapshots and the current state.

**--options**=_option_,...
> Comma-separated and case-insensitive; may be repeated. **Link** creates a linked clone (snapshot only), **KeepAllMACs** reuses every NIC MAC address, **KeepNATMACs** reuses the MAC of NAT NICs, **KeepDiskNames** reuses disk image names, **KeepHwUUIDs** reuses hardware IDs.

**--register**
> Register the clone with VirtualBox. Without it, register later with **vboxmanage registervm**.

**--basefolder**=_path_
> Folder in which to save the new VM's configuration.

**--snapshot**=_name_
> Snapshot to clone from (default: the current state).

**--groups**=_group_,...
> Assign the clone to groups. Group IDs start with **/**.

**--uuid**=_uuid_
> UUID for the new VM (default: generated).

# DESCRIPTION

**vboxmanage clonevm** creates a copy of an existing virtual machine. Supports full clones (independent) and linked clones (sharing base disk). Useful for creating test environments from templates.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-createvm](/man/vboxmanage-createvm)(1), [vboxmanage-registervm](/man/vboxmanage-registervm)(1)

# RESOURCES

```[Source code](https://github.com/VirtualBox/virtualbox)```

```[Homepage](https://www.virtualbox.org/)```

```[Documentation](https://www.virtualbox.org/manual/topics/vboxmanage.html#vboxmanage-clonevm)```

<!-- verified: 2026-11-09 -->
