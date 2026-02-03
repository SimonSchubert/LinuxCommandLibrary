# TLDR

**List volumes**

```openstack volume list```

**Create volume**

```openstack volume create --size [10] [volume_name]```

**Attach volume to server**

```openstack server add volume [server] [volume]```

**Delete volume**

```openstack volume delete [volume_name]```

# SYNOPSIS

**openstack volume** _command_ [_options_]

# PARAMETERS

**list**
> List volumes.

**create** _name_
> Create volume.

**delete** _name_
> Delete volume.

**show** _name_
> Show volume details.

**--size** _gb_
> Volume size in gigabytes.

**--image** _image_
> Create from image.

**--snapshot** _snapshot_
> Create from snapshot.

**--type** _type_
> Volume type.

# DESCRIPTION

**openstack volume** manages block storage volumes in OpenStack Cinder. Create persistent storage volumes to attach to instances. Part of OpenStack unified CLI.

# SEE ALSO

[openstack-server](/man/openstack-server)(1), [openstack](/man/openstack)(1)

