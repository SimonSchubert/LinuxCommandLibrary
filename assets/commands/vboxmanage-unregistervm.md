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

**vboxmanage** **unregistervm** _uuid_ | _vmname_ [**--delete**] [**--delete-all**]

# PARAMETERS

**--delete**
> Delete the files related to the VM: all hard disk images including differencing files, saved state files (one per snapshot), the XML machine definition and its backups, log files, and the then-empty VM directory.

**--delete-all**
> Delete all files described in --delete, as well as all DVDs and floppy images located in the VM folder and attached only to this VM.

# DESCRIPTION

**vboxmanage unregistervm** removes a virtual machine from the VirtualBox registry. The VM can be identified by its name or UUID. Without --delete, only the registration is removed while all VM files are kept on disk. With --delete or --delete-all, the associated files are permanently removed.

# CAVEATS

The --delete and --delete-all options permanently remove VM files and cannot be undone. A running VM cannot be unregistered until it is powered off. Shared disk images used by other VMs are not deleted.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-registervm](/man/vboxmanage-registervm)(1), [vboxmanage-list](/man/vboxmanage-list)(1), [vboxmanage-showvminfo](/man/vboxmanage-showvminfo)(1)

# RESOURCES

```[Source code](https://github.com/VirtualBox/virtualbox)```

```[Homepage](https://www.virtualbox.org/)```

```[Documentation](https://www.virtualbox.org/manual/ch08.html)```

<!-- verified: 2026-11-09 -->
