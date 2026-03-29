# TAGLINE

Remove VM from VirtualBox registry

# TLDR

**Unregister a VM by name**

```vboxmanage unregistervm [vmname]```

**Unregister a VM by UUID**

```vboxmanage unregistervm [uuid]```

**Unregister and delete all associated VM files**

```vboxmanage unregistervm [vmname] --delete```

**Unregister and delete all files including attached DVDs and floppies**

```vboxmanage unregistervm [vmname] --delete-all```

# SYNOPSIS

**vboxmanage** **unregistervm** _uuid_ | _vmname_ [**--delete** | **--delete-all**]

# PARAMETERS

**--delete**
> Delete all VM files including hard disk images (that are not shared with other VMs), the machine XML definition file, and snapshot files.

**--delete-all**
> Delete all files described in --delete, as well as all DVDs and floppy images located in the VM folder and attached only to this VM.

# DESCRIPTION

**vboxmanage unregistervm** removes a virtual machine from the VirtualBox registry. The VM can be identified by its name or UUID. Without --delete, only the registration is removed while all VM files are kept on disk. With --delete or --delete-all, the associated files are permanently removed.

# CAVEATS

The --delete and --delete-all options permanently remove VM files and cannot be undone. Shared disk images used by other VMs are not deleted.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-registervm](/man/vboxmanage-registervm)(1), [vboxmanage-list](/man/vboxmanage-list)(1), [vboxmanage-showvminfo](/man/vboxmanage-showvminfo)(1)

