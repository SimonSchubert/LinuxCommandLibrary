# TAGLINE

manages compute instances in OpenStack clouds

# TLDR

**List servers**

```openstack server list```

**Create server**

```openstack server create --flavor [m1.small] --image [ubuntu] --network [private] [server_name]```

**Show server details**

```openstack server show [server_name]```

**Delete server**

```openstack server delete [server_name]```

**Start a stopped server**

```openstack server start [server_name]```

**Stop a running server**

```openstack server stop [server_name]```

**Reboot a server**

```openstack server reboot [server_name]```

**SSH into a server**

```openstack server ssh [server_name] -- -l [username]```

# SYNOPSIS

**openstack server** _command_ [_options_]

# PARAMETERS

**list**
> List servers.

**create** _name_
> Create new server.

**delete** _name_
> Delete server.

**show** _name_
> Show server details.

**start** _name_
> Start server.

**stop** _name_
> Stop server.

**reboot** _name_
> Reboot server.

**--flavor** _flavor_
> Instance flavor/size.

**--image** _image_
> Boot image.

**--network** _network_
> Network to attach.

**--key-name** _key_
> SSH key pair.

**--security-group** _group_
> Security group to assign (repeatable).

**--availability-zone** _zone_
> Availability zone for the server.

**resize** _name_ **--flavor** _flavor_
> Resize server to a different flavor.

**ssh** _name_
> SSH into the server.

**migrate** _name_
> Migrate server to another host.

# DESCRIPTION

**openstack server** manages compute instances (virtual machines) in OpenStack clouds. It is part of the unified OpenStack command-line client (python-openstackclient). Commands follow the pattern `openstack server <action>` and support output formatting via `-f` (json, table, csv, yaml) and column selection via `-c`.

# CAVEATS

Requires valid OpenStack credentials (typically sourced from an openrc file or OS_* environment variables). Some operations like resize require confirmation. Server names may not be unique; use IDs for scripted operations.

# SEE ALSO

[openstack](/man/openstack)(1), [openstack-flavor](/man/openstack-flavor)(1), [openstack-image](/man/openstack-image)(1), [openstack-network](/man/openstack-network)(1), [openstack-volume](/man/openstack-volume)(1)

