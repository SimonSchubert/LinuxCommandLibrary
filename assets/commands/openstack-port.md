# TAGLINE

manages network ports in OpenStack Neutron

# TLDR

**List ports**

```openstack port list```

**List ports of a server**

```openstack port list --server [server]```

**Create a port**

```openstack port create --network [network] [port_name]```

**Create a port with a fixed IP**

```openstack port create --network [network] --fixed-ip subnet=[subnet],ip-address=[10.0.0.5] [port_name]```

**Add a security group** to a port

```openstack port set --security-group [group] [port_name]```

**Show port details**

```openstack port show [port_name]```

**Delete a port**

```openstack port delete [port_name]```

# SYNOPSIS

**openstack port** _command_ [_options_]

# PARAMETERS

**list**
> List ports.

**create** _name_
> Create a port.

**set** _port_
> Change port properties.

**unset** _port_
> Remove port properties.

**show** _port_
> Show port details.

**delete** _port_
> Delete a port.

**--network** _network_
> Network to attach the port to (required on create).

**--fixed-ip** subnet=_subnet_,ip-address=_ip_
> Desired IP and/or subnet; repeatable.

**--security-group** _group_
> Security group to apply; repeatable.

**--no-security-group**
> Associate no security groups.

**--mac-address** _mac_
> MAC address of the port (admin only).

**--allowed-address** ip-address=_ip_[,mac-address=_mac_]
> Extra address pair allowed through port security.

**--device** _id_
> ID of the device using this port.

**--server** _server_
> Filter list by server.

# DESCRIPTION

**openstack port** manages network ports in OpenStack Neutron. Ports represent virtual network interfaces, holding MAC and IP addresses, that are attached to instances, routers or other devices. Part of the OpenStack unified CLI.

# SEE ALSO

[openstack-network](/man/openstack-network)(1), [openstack-subnet](/man/openstack-subnet)(1), [openstack-server](/man/openstack-server)(1)

# RESOURCES

```[Source code](https://opendev.org/openstack/python-openstackclient)```

```[Documentation](https://docs.openstack.org/python-openstackclient/latest/cli/command-objects/port.html)```

<!-- verified: 2026-11-07 -->
