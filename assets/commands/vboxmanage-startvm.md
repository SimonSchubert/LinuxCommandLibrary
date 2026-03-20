# TAGLINE

Start VirtualBox virtual machines

# TLDR

**Start VM with GUI** (default)

```vboxmanage startvm [vmname]```

**Start headless** (no window, for remote display)

```vboxmanage startvm [vmname] --type headless```

**Start with separate** detachable frontend

```vboxmanage startvm [vmname] --type separate```

**Start VM by UUID**

```vboxmanage startvm [670e746d-abea-4ba6-ad02-2a3b043810a5]```

**Set environment variable** when starting

```vboxmanage startvm [vmname] --putenv "[DISPLAY=:0.0]"```

# SYNOPSIS

**vboxmanage** **startvm** _vmname|uuid_ [**--type** _type_] [**--putenv** _name_=_value_]

# PARAMETERS

**--type** _type_
> Frontend type: gui (default, shows window), headless (no window, remote display only), separate (detachable UI).

**--putenv** _name_=_value_
> Set an environment variable for the VM process.

# DESCRIPTION

**vboxmanage startvm** starts a virtual machine that is currently in the Powered Off or Saved state. The VM can be specified by name or UUID. Supports GUI mode (default), headless (no window), and separate (detachable GUI). Use headless for server VMs.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-controlvm](/man/vboxmanage-controlvm)(1), [vboxmanage-list](/man/vboxmanage-list)(1), [vboxmanage-showvminfo](/man/vboxmanage-showvminfo)(1)

