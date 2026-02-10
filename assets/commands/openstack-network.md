# TAGLINE

manages virtual networks in OpenStack Neutron

# TLDR

**List networks**

```openstack network list```

**Create network**

```openstack network create [network_name]```

**Show network details**

```openstack network show [network_name]```

**Delete network**

```openstack network delete [network_name]```

# SYNOPSIS

**openstack network** _command_ [_options_]

# PARAMETERS

**list**
> List networks.

**create** _name_
> Create network.

**delete** _name_
> Delete network.

**show** _name_
> Show network details.

**--external**
> Create as external network.

**--share**
> Share network across projects.

**--provider-network-type** _type_
> Provider network type (flat, vlan, vxlan).

# DESCRIPTION

**openstack network** manages virtual networks in OpenStack Neutron. Create isolated networks, configure external connectivity, and manage network infrastructure. Part of OpenStack unified CLI.

# SEE ALSO

[openstack-subnet](/man/openstack-subnet)(1), [openstack-port](/man/openstack-port)(1), [openstack-server](/man/openstack-server)(1)

