# TAGLINE

manages IP subnets within OpenStack networks

# TLDR

**List subnets**

```openstack subnet list```

**Create subnet**

```openstack subnet create --network [network] --subnet-range [192.168.1.0/24] [subnet_name]```

**Show subnet details**

```openstack subnet show [subnet_name]```

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

**--network** _network_
> Parent network.

**--subnet-range** _cidr_
> IP address range in CIDR.

**--gateway** _ip_
> Gateway IP address.

**--dhcp**
> Enable DHCP.

**--dns-nameserver** _ip_
> DNS server address.

# DESCRIPTION

**openstack subnet** manages IP subnets within OpenStack networks. Configure IP ranges, DHCP, DNS, and routing for virtual networks. Part of OpenStack unified CLI.

# SEE ALSO

[openstack-network](/man/openstack-network)(1), [openstack-port](/man/openstack-port)(1)

