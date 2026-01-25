# TLDR

**List networks**

```openstack network list```

**Create network**

```openstack network create [network_name]```

**Create subnet**

```openstack subnet create --network [network] --subnet-range [192.168.1.0/24] [subnet_name]```

**Create router**

```openstack router create [router_name]```

**List ports**

```openstack port list```

**Show network details**

```openstack network show [network_name]```

# SYNOPSIS

**openstack network** _command_ [_options_]

# PARAMETERS

**list**
> List networks.

**create**
> Create network.

**delete**
> Delete network.

**show**
> Show network details.

**set**
> Modify network.

# DESCRIPTION

**Neutron** is the OpenStack networking service (now accessed via unified openstack client). It provides network connectivity as a service, managing networks, subnets, routers, and ports.

Neutron supports various network topologies and plugins.

# NETWORK TYPES

```
flat       - Untagged network
vlan       - VLAN segmentation
vxlan      - Virtual overlay
gre        - GRE tunnels
geneve     - Geneve encapsulation
```

# COMPONENTS

```
neutron-server      - API server
neutron-l2-agent    - L2 connectivity
neutron-l3-agent    - L3 routing
neutron-dhcp-agent  - DHCP service
```

# CAVEATS

Requires OpenStack credentials. Plugin determines capabilities. Complex multi-tenant networking.

# HISTORY

Neutron was originally called Quantum, renamed in **2013**. It's part of OpenStack's core services for software-defined networking.

# SEE ALSO

[openstack](/man/openstack)(1), [nova](/man/nova)(1), [ovs-vsctl](/man/ovs-vsctl)(1)
