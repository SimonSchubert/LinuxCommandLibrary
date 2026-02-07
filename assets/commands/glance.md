# TAGLINE

OpenStack image service client

# TLDR

**List images**

```openstack image list```

**Show image details**

```openstack image show [image-id]```

**Upload image**

```openstack image create --file [image.qcow2] --disk-format [qcow2] [image-name]```

**Download image**

```openstack image save --file [output.qcow2] [image-id]```

**Delete image**

```openstack image delete [image-id]```

**Set image property**

```openstack image set --property [key=value] [image-id]```

# SYNOPSIS

**openstack image** _command_ [_options_]

# PARAMETERS

**list**
> List available images.

**show** _image_
> Show image details.

**create**
> Create new image.

**delete** _image_
> Delete image.

**save** _image_
> Download image to file.

**set** _image_
> Update image properties.

**--file** _path_
> Image file path.

**--disk-format** _format_
> Disk format (raw, qcow2, vmdk, vdi, iso, ami).

**--container-format** _format_
> Container format (bare, ovf, aki, ari, ami).

**--property** _key=value_
> Image property.

**--public** / **--private**
> Image visibility.

# DESCRIPTION

**Glance** is the OpenStack Image Service. It provides discovery, registration, and delivery of virtual machine images. The **openstack image** commands interface with Glance.

Glance stores images that can be used to boot instances. It supports multiple storage backends and formats, with images shareable across projects or kept private.

# CAVEATS

Requires OpenStack credentials. Large images take time to upload. Image format must match hypervisor expectations. Storage quotas may apply.

# HISTORY

Glance was one of the original OpenStack services, launched with **Nova** in the **2010** Austin release. It was named after a quick "glance" at available images, following OpenStack's nature-themed naming.

# SEE ALSO

[openstack](/man/openstack)(1), [nova](/man/nova)(1), [qemu-img](/man/qemu-img)(1)
