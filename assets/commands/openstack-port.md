# TLDR

**List ports**

```openstack port list```

**Create port**

```openstack port create --network [network] [port_name]```

**Show port details**

```openstack port show [port_name]```

**Delete port**

```openstack port delete [port_name]```

# SYNOPSIS

**openstack port** _command_ [_options_]

# PARAMETERS

**list**
> List ports.

**create** _name_
> Create port.

**delete** _name_
> Delete port.

**show** _name_
> Show port details.

**--network** _network_
> Network for port.

**--fixed-ip** _ip_
> Fixed IP address.

**--security-group** _group_
> Security group.

**--mac-address** _mac_
> MAC address.

# DESCRIPTION

**openstack port** manages network ports in OpenStack Neutron. Ports represent virtual network interfaces attached to instances. Part of OpenStack unified CLI.

# SEE ALSO

[openstack-network](/man/openstack-network)(1), [openstack-server](/man/openstack-server)(1)

