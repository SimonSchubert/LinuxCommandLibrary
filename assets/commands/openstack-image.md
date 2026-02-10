# TAGLINE

manages virtual machine images in OpenStack Glance

# TLDR

**List images**

```openstack image list```

**Show image details**

```openstack image show [ubuntu-22.04]```

**Create image from file**

```openstack image create --file [image.qcow2] --disk-format qcow2 [image_name]```

**Delete image**

```openstack image delete [image_name]```

# SYNOPSIS

**openstack image** _command_ [_options_]

# PARAMETERS

**list**
> List images.

**show** _name_
> Show image details.

**create** _name_
> Create/upload image.

**delete** _name_
> Delete image.

**--file** _path_
> Image file to upload.

**--disk-format** _format_
> Disk format (qcow2, raw, vmdk, etc.).

**--container-format** _format_
> Container format (bare, ovf, etc.).

**--public**
> Make image public.

# DESCRIPTION

**openstack image** manages virtual machine images in OpenStack Glance. Upload, download, and manage boot images for instances. Part of OpenStack unified CLI.

# SEE ALSO

[openstack-server](/man/openstack-server)(1), [openstack](/man/openstack)(1)

