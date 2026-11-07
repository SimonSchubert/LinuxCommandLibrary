# TAGLINE

manages block storage volumes in OpenStack Cinder

# TLDR

**List volumes**

```openstack volume list```

**Create a volume**

```openstack volume create --size [10] [volume_name]```

**Create a bootable volume** from an image

```openstack volume create --size [20] --image [image] --bootable [volume_name]```

**Attach a volume** to a server

```openstack server add volume [server] [volume]```

**Detach a volume** from a server

```openstack server remove volume [server] [volume]```

**Extend a volume**

```openstack volume set --size [20] [volume_name]```

**Create a snapshot**

```openstack volume snapshot create --volume [volume_name] [snapshot_name]```

**Delete a volume**

```openstack volume delete [volume_name]```

# SYNOPSIS

**openstack volume** _command_ [_options_]

# PARAMETERS

**list**
> List volumes.

**create** _name_
> Create a volume.

**set** _volume_
> Change volume properties or size.

**show** _volume_
> Show volume details.

**delete** _volume_
> Delete a volume.

**--size** _GB_
> Volume size in gigabytes.

**--image** _image_
> Create from an image.

**--snapshot** _snapshot_
> Create from a snapshot.

**--source** _volume_
> Clone an existing volume.

**--type** _type_
> Volume type (backend, QoS class).

**--bootable** / **--non-bootable**
> Mark the volume bootable.

**--description** _text_
> Volume description.

# DESCRIPTION

**openstack volume** manages block storage volumes in OpenStack Cinder. Create persistent storage volumes that survive instance deletion, attach them to instances, snapshot and resize them. Part of the OpenStack unified CLI.

# CAVEATS

Volumes can only grow, not shrink. Extending an attached volume depends on the backend and API version; otherwise detach first. A volume with snapshots cannot be deleted until the snapshots are removed.

# SEE ALSO

[openstack-server](/man/openstack-server)(1), [openstack-image](/man/openstack-image)(1), [openstack](/man/openstack)(1)

# RESOURCES

```[Source code](https://opendev.org/openstack/python-openstackclient)```

```[Documentation](https://docs.openstack.org/python-openstackclient/latest/cli/command-objects/volume.html)```

<!-- verified: 2026-11-07 -->
