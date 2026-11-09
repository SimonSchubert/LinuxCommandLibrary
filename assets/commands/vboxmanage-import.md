# TAGLINE

Import VMs from OVF/OVA files or the cloud

# TLDR

**Import OVA appliance**

```vboxmanage import [file.ova]```

**Show what would be imported and the available overrides**

```vboxmanage import [file.ova] --dry-run```

**Import with new name**

```vboxmanage import [file.ova] --vsys=0 --vmname=[newname]```

**Override CPU count and memory**

```vboxmanage import [file.ova] --vsys=0 --cpus=[2] --memory=[4096]```

**Accept the license and skip a hardware item**

```vboxmanage import [file.ova] --vsys=0 --eula=accept --unit=[9] --ignore```

**Import an instance from Oracle Cloud**

```vboxmanage import OCI:// --cloud --vmname=[name] --cloudprofile=[profile] --cloudinstanceid=[id]```

# SYNOPSIS

**vboxmanage** **import** _ovfname_|_ovaname_ [_options_]

**vboxmanage** **import** **OCI://** **--cloud** **--cloudprofile**=_profile_ **--cloudinstanceid**=_id_ [_options_]

# PARAMETERS

**-n**, **--dry-run**
> Show the appliance contents, how it would be imported and which overrides are available.

**--options**=_option_
> **keepallmacs**, **keepnatmacs**, **importtovdi** (create VDI disks) or **keepextradata**.

**--vsys**=_n_
> Index of the VM within the appliance; affects the options that follow.

**--unit**=_n_
> Index of an item within the VM; affects the options that follow.

**--ignore**
> Remove the hardware item selected with **--unit**.

**--vmname**=_name_
> Override VM name.

**--ostype**=_type_
> Override guest OS type.

**--basefolder**=_path_
> VM location.

**--group**=_group_
> Primary group of the VM.

**--settingsfile**=_file_
> Name of the VM configuration file to create.

**--cpus**=_n_
> Override CPU count.

**--memory**=_mb_
> Override memory in MB.

**--description**=_text_
> VM description.

**--eula**=**show**|**accept**
> Show or accept a VM's license. Import fails if a required EULA is not accepted.

**--scsitype**=**BusLogic**|**LsiLogic**
> SCSI controller type of the selected unit.

**--disk**=_path_
> Target path of the selected disk.

**--controller**=_index_
> Storage controller for the selected disk.

**--port**=_n_
> Controller port for the selected disk.

**--cloud**
> Import from a cloud service.

**--cloudprofile**=_profile_
> Cloud profile to connect with.

**--cloudinstanceid**=_id_
> ID of the existing cloud instance.

**--cloudbucket**=_bucket_
> Bucket for the temporary object (default: first bucket of the profile).

# DESCRIPTION

**vboxmanage import** imports virtual machines from OVF/OVA files or from a cloud service such as Oracle Cloud Infrastructure. Creates VMs from exported appliances. Supports customizing imported settings.

Disk images are copied (by default in VMDK format). For OVF appliances the disk images must be in the same directory as the OVF file.

# CAVEATS

Which overrides are possible depends on the appliance, so run **--dry-run** first to see the numbered units. For cloud imports a dry run still performs most of the slow steps.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-export](/man/vboxmanage-export)(1), [vboxmanage-cloud](/man/vboxmanage-cloud)(1)

# RESOURCES

```[Source code](https://github.com/VirtualBox/virtualbox)```

```[Homepage](https://www.virtualbox.org/)```

```[Documentation](https://www.virtualbox.org/manual/topics/vboxmanage.html#vboxmanage-import)```

<!-- verified: 2026-11-09 -->
