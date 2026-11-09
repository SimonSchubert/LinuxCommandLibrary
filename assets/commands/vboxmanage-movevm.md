# TAGLINE

Relocate VirtualBox VM files

# TLDR

**Move a VM to a new folder**

```VBoxManage movevm [vmname] --folder [/path/to/new/location]```

**Move a VM identified by UUID**

```VBoxManage movevm [uuid] --type=basic --folder=[/path/to/new/location]```

**Gather scattered disk images** into the VM's current folder

```VBoxManage movevm [vmname]```

# SYNOPSIS

**VBoxManage** **movevm** _uuid_|_vmname_ [**--type**=basic] [**--folder**=_folder-name_]

# PARAMETERS

**--type** basic
> Specifies the type of move operation. "basic" is the only recognized value and the default.

**--folder** _path_
> Destination folder on the host file system. Can be a relative or absolute path. Omitting it or giving the current location moves disk images and other VM files that are stored elsewhere into that location.

# DESCRIPTION

**VBoxManage movevm** moves a virtual machine to a new location on the host. All associated files of the VM, including settings files and disk image files, are moved to the new location. The Oracle VM VirtualBox configuration is updated automatically. The VM can be identified by name or UUID. VM names containing spaces must be enclosed in double quotation marks.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-clonevm](/man/vboxmanage-clonevm)(1)

# RESOURCES

```[Source code](https://github.com/VirtualBox/virtualbox)```

```[Homepage](https://www.virtualbox.org/)```

```[Documentation](https://www.virtualbox.org/manual/ch08.html)```

<!-- verified: 2026-11-09 -->
