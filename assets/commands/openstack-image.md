# TAGLINE

manages virtual machine images in OpenStack Glance

# TLDR

**List images**

```openstack image list```

**Show image details**

```openstack image show [ubuntu-22.04]```

**Upload an image** from a file

```openstack image create --file [image.qcow2] --disk-format qcow2 --container-format bare [image_name]```

**Upload a public image** with minimum requirements

```openstack image create --file [image.qcow2] --disk-format qcow2 --public --min-disk [10] --min-ram [1024] [image_name]```

**Download an image** to a file

```openstack image save --file [output.qcow2] [image_name]```

**Set a property** on an image

```openstack image set --property [hw_disk_bus=scsi] [image_name]```

**Delete an image**

```openstack image delete [image_name]```

# SYNOPSIS

**openstack image** _command_ [_options_]

# PARAMETERS

**list**
> List images.

**show** _image_
> Show image details.

**create** _name_
> Create or upload an image.

**set** _image_
> Change image properties.

**save** _image_
> Download an image.

**delete** _image_
> Delete an image.

**--file** _path_
> Image file to upload (create) or write to (save).

**--disk-format** _format_
> Disk format: raw, qcow2, vmdk, vdi, iso, vhd, vhdx, ploop, aki, ari, ami (default: raw).

**--container-format** _format_
> Container format: bare, ovf, ova, docker, aki, ari, ami, compressed (default: bare).

**--public** / **--private** / **--shared** / **--community**
> Image visibility.

**--min-disk** _GB_
> Minimum disk size needed to boot the image.

**--min-ram** _MB_
> Minimum RAM needed to boot the image.

**--property** _key=value_
> Set an image property; repeatable.

**--protected** / **--unprotected**
> Prevent or allow image deletion.

# DESCRIPTION

**openstack image** manages virtual machine images in OpenStack Glance. Upload, download, share and manage boot images for instances. Part of the OpenStack unified CLI.

# CAVEATS

Creating **--public** images usually requires admin rights. Protected images must be set **--unprotected** before they can be deleted.

# SEE ALSO

[openstack-server](/man/openstack-server)(1), [openstack-flavor](/man/openstack-flavor)(1), [openstack](/man/openstack)(1)

# RESOURCES

```[Source code](https://opendev.org/openstack/python-openstackclient)```

```[Documentation](https://docs.openstack.org/python-openstackclient/latest/cli/command-objects/image-v2.html)```

<!-- verified: 2026-11-07 -->
