# TAGLINE

Relocate VirtualBox VM files

# TLDR

**Move a VM to a new folder**

```VBoxManage movevm [vmname] --type basic --folder [/path/to/new/location]```

**Move a VM identified by UUID**

```VBoxManage movevm [uuid] --type basic --folder [/path/to/new/location]```

# SYNOPSIS

**VBoxManage** **movevm** _vm_ **--type** basic [**--folder** _path_]

# PARAMETERS

**--type** basic
> Specifies the type of move operation. Currently only "basic" is supported.

**--folder** _path_
> Destination folder on the host file system. Can be a relative or absolute path.

# DESCRIPTION

**VBoxManage movevm** moves a virtual machine to a new location on the host. All associated files of the VM, including settings files and disk image files, are moved to the new location. The Oracle VM VirtualBox configuration is updated automatically. The VM can be identified by name or UUID. VM names containing spaces must be enclosed in double quotation marks.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-clonevm](/man/vboxmanage-clonevm)(1)

