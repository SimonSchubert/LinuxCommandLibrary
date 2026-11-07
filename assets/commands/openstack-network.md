# TAGLINE

manages virtual networks in OpenStack Neutron

# TLDR

**List networks**

```openstack network list```

**List external networks**

```openstack network list --external```

**Create a network**

```openstack network create [network_name]```

**Create an external provider network** (admin)

```openstack network create --external --provider-network-type flat --provider-physical-network [physnet1] [network_name]```

**Show network details**

```openstack network show [network_name]```

**Rename a network**

```openstack network set --name [new_name] [network_name]```

**Delete a network**

```openstack network delete [network_name]```

# SYNOPSIS

**openstack network** _command_ [_options_]

# PARAMETERS

**list**
> List networks.

**create** _name_
> Create a network.

**set** _network_
> Change network properties.

**show** _network_
> Show network details.

**delete** _network_
> Delete a network.

**--external** / **--internal**
> Mark the network as external or internal (default: internal).

**--share** / **--no-share**
> Share the network across projects.

**--provider-network-type** _type_
> Physical mechanism: flat, geneve, gre, local, vlan, vxlan.

**--provider-physical-network** _name_
> Physical network the virtual network is implemented on.

**--provider-segment** _id_
> VLAN ID or tunnel ID for the segment.

**--mtu** _size_
> Network MTU.

**--enable** / **--disable**
> Set the administrative state.

# DESCRIPTION

**openstack network** manages virtual networks in OpenStack Neutron. Create isolated networks, configure external connectivity, and manage network infrastructure. IP addressing is added separately with subnets. Part of the OpenStack unified CLI.

# CAVEATS

Provider options and **--external** usually require admin rights. A network cannot be deleted while ports are still in use on it.

# SEE ALSO

[openstack-subnet](/man/openstack-subnet)(1), [openstack-port](/man/openstack-port)(1), [openstack-server](/man/openstack-server)(1)

# RESOURCES

```[Source code](https://opendev.org/openstack/python-openstackclient)```

```[Documentation](https://docs.openstack.org/python-openstackclient/latest/cli/command-objects/network.html)```

<!-- verified: 2026-11-07 -->
