# TLDR

**Unregister VM**

```vboxmanage unregistervm [vmname]```

**Unregister and delete files**

```vboxmanage unregistervm [vmname] --delete```

# SYNOPSIS

**vboxmanage** **unregistervm** _vmname_ [_options_]

# PARAMETERS

**--delete**
> Delete all VM files.

# DESCRIPTION

**vboxmanage unregistervm** removes a VM from VirtualBox registry. Without --delete, only removes registration while keeping files. With --delete, permanently removes all VM files.

# CAVEATS

The --delete option permanently removes VM files and cannot be undone.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-registervm](/man/vboxmanage-registervm)(1)

