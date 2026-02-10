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

**Start/stop server**

```openstack server start [server_name]```

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

# DESCRIPTION

**openstack server** manages compute instances in OpenStack clouds. Create, delete, start, stop, and manage virtual machines. Part of OpenStack unified CLI.

# SEE ALSO

[openstack-flavor](/man/openstack-flavor)(1), [openstack-image](/man/openstack-image)(1), [openstack-network](/man/openstack-network)(1)

