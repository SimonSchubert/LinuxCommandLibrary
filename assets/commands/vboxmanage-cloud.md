# TAGLINE

Manage cloud instances from VirtualBox

# TLDR

**List cloud instances**

```vboxmanage cloud --provider=[OCI] --profile=[profile] list instances --compartment-id=[compartment]```

**List cloud images**

```vboxmanage cloud --provider=[OCI] --profile=[profile] list images --compartment-id=[compartment]```

**Create cloud instance from an image**

```vboxmanage cloud --provider=[OCI] --profile=[profile] instance create --domain-name=[domain] --image-id=[image_id] --display-name=[name] --shape=[shape] --subnet=[subnet_id]```

**Show cloud instance details**

```vboxmanage cloud --provider=[OCI] --profile=[profile] instance info --id=[id]```

**Terminate cloud instance**

```vboxmanage cloud --provider=[OCI] --profile=[profile] instance terminate --id=[id]```

# SYNOPSIS

**vboxmanage** **cloud** **--provider**=_name_ **--profile**=_name_ _command_ [_options_]

# PARAMETERS

**--provider**=_name_
> Short cloud provider name (e.g., OCI).

**--profile**=_name_
> Cloud profile name.

**list** **instances**|**images**|**vnicattachments**
> List resources in a compartment; **--compartment-id** is required for images and VNIC attachments.

**instance** **create**|**info**|**terminate**|**start**|**pause**|**reset**|**clone**|**metriclist**|**metricdata**
> Manage cloud instances; all but **create** take **--id**.

**image** **create**|**info**|**delete**|**import**|**export**
> Manage cloud images.

**network** **setup**|**create**|**update**|**delete**|**info**
> Set up and manage cloud network environments.

# DESCRIPTION

**vboxmanage cloud** manages cloud instances from VirtualBox. Integrates with Oracle Cloud Infrastructure (OCI) for managing cloud VMs alongside local VMs. The **--provider** and **--profile** options must be placed after **cloud** and before the subcommand.

Profiles are managed with **vboxmanage cloudprofile**; **vboxmanage list cloudproviders** and **vboxmanage list cloudprofiles** show what is available.

# SEE ALSO

[vboxmanage](/man/vboxmanage)(1), [vboxmanage-list](/man/vboxmanage-list)(1), [vboxmanage-import](/man/vboxmanage-import)(1)

# RESOURCES

```[Source code](https://github.com/VirtualBox/virtualbox)```

```[Homepage](https://www.virtualbox.org/)```

```[Documentation](https://www.virtualbox.org/manual/topics/vboxmanage.html#vboxmanage-cloud)```

<!-- verified: 2026-11-09 -->
