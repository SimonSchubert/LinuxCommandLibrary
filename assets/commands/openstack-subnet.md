# TAGLINE

manages IP subnets within OpenStack networks

# TLDR

**List subnets**

```openstack subnet list```

**Create subnet**

```openstack subnet create --network [network] --subnet-range [192.168.1.0/24] [subnet_name]```

**Show subnet details**

```openstack subnet show [subnet_name]```

**Create IPv6 SLAAC subnet**

```openstack subnet create --network [network] --ip-version 6 --ipv6-ra-mode slaac --ipv6-address-mode slaac --subnet-range [2001:db8::/64] [subnet_name]```

**Set DNS servers and allocation pool**

```openstack subnet create --network [network] --subnet-range [10.0.0.0/24] --dns-nameserver [8.8.8.8] --allocation-pool start=[10.0.0.100],end=[10.0.0.200] [subnet_name]```

**List subnets of a network**

```openstack subnet list --network [network]```

**Disable DHCP on an existing subnet**

```openstack subnet set --no-dhcp [subnet_name]```

**Delete subnet**

```openstack subnet delete [subnet_name]```

# SYNOPSIS

**openstack subnet** _command_ [_options_]

# PARAMETERS

**list**
> List subnets.

**create** _name_
> Create subnet.

**delete** _name_
> Delete subnet.

**show** _name_
> Show subnet details.

**set** _name_
> Modify subnet properties (name, DHCP, gateway, DNS, pools, routes).

**unset** _name_
> Remove DNS servers, allocation pools, host routes, gateway or tags.

**--network** _network_
> Parent network.

**--subnet-range** _cidr_
> IP address range in CIDR.

**--gateway** _ip_|_auto_|_none_
> Gateway IP address, _auto_ to pick one from the subnet, or _none_ for no gateway (default: _auto_).

**--dhcp** / **--no-dhcp**
> Enable or disable DHCP on the subnet (default: _enabled_).

**--dns-nameserver** _ip_
> DNS server address (repeat for multiple).

**--allocation-pool** _start=IP,end=IP_
> Restrict DHCP allocation to a range within the subnet (repeatable).

**--ip-version** _4|6_
> IP version of the subnet (default: _4_).

**--ipv6-address-mode** _MODE_
> IPv6 address mode: _slaac_, _dhcpv6-stateful_, or _dhcpv6-stateless_.

**--ipv6-ra-mode** _MODE_
> IPv6 router advertisement mode (same values as **--ipv6-address-mode**).

**--host-route** _destination=CIDR,gateway=IP_
> Add a static host route (repeatable).

**--subnet-pool** _NAME_
> Allocate the range from a subnet pool instead of specifying **--subnet-range** directly.

**--prefix-length** _N_
> Prefix length for allocation from a subnet pool.

**--project** _project_
> Owner project (admin only).

**--description** _text_
> Subnet description.

**--long**
> With **list**, show additional columns.

# DESCRIPTION

**openstack subnet** manages IP subnets within OpenStack networks. Configure IP ranges, DHCP, DNS, and routing for virtual networks. A network can hold several subnets, including IPv4 and IPv6 ones side by side. Part of OpenStack unified CLI (**python-openstackclient**), backed by the Neutron networking service.

# CAVEATS

The CIDR and IP version cannot be changed after creation; delete and recreate the subnet instead. A subnet cannot be deleted while ports still use addresses from it. Each repeatable option (**--dns-nameserver**, **--allocation-pool**, **--host-route**) adds one value per occurrence.

# SEE ALSO

[openstack-network](/man/openstack-network)(1), [openstack-port](/man/openstack-port)(1), [openstack](/man/openstack)(1), [neutron](/man/neutron)(1)

# RESOURCES

```[Source code](https://opendev.org/openstack/python-openstackclient)```

```[Documentation](https://docs.openstack.org/python-openstackclient/latest/cli/command-objects/network/v2/index.html)```

<!-- verified: 2026-11-23 -->

