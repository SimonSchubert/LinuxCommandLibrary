# TAGLINE

manages networks for LXD containers and VMs

# TLDR

List **all networks**

```lxc network list```

Show network **configuration**

```lxc network show [network_name]```

Show runtime **state and addresses** of a network

```lxc network info [network_name]```

**Create** a new managed bridge

```lxc network create [network_name]```

Create a bridge with a **specific subnet** and NAT

```lxc network create [network_name] ipv4.address=[10.10.10.1/24] ipv4.nat=true ipv6.address=none```

Create a **macvlan** network on a host interface

```lxc network create [network_name] --type=macvlan parent=[eth0]```

**Attach** an instance to a network

```lxc network attach [network_name] [instance_name] [eth0]```

**Detach** an instance from a network

```lxc network detach [network_name] [instance_name]```

Add a host interface to the **bridge**

```lxc network set [network_name] bridge.external_interfaces=[eth1]```

**Disable NAT**

```lxc network set [network_name] ipv4.nat=false```

List **DHCP leases** handed out by a network

```lxc network list-leases [network_name]```

**Edit** the full configuration in an editor

```lxc network edit [network_name]```

# SYNOPSIS

**lxc network** _subcommand_ [[_remote_:]_network_] [_args_] [_options_]

# DESCRIPTION

**lxc network** manages networks for LXD containers and virtual machines. Managed network types include **bridge** (default), **macvlan**, **sriov**, **ovn** and **physical**. It can create and configure networks, attach them to instances or profiles, and inspect leases and allocations.

Configuration keys such as **ipv4.address**, **ipv4.nat**, **ipv4.dhcp**, **ipv6.address**, **dns.domain** and **bridge.mtu** are set at creation time or later with **set**.

# SUBCOMMANDS

**list** [_remote_:]
> List available networks. Supports **--format** (csv, json, table, yaml, compact) and **--all-projects**.

**show** _network_
> Show network configuration as YAML.

**info** _network_
> Show runtime information (addresses, traffic counters, bond/VLAN state).

**create** _network_ [_key_=_value_...]
> Create a new managed network. **--type**/**-t** sets the network type.

**delete** _network_
> Delete a network.

**rename** _network_ _new-name_
> Rename a network.

**edit** _network_
> Edit the network configuration as YAML.

**get** _network_ _key_
> Get a configuration value.

**set** _network_ _key_=_value_...
> Set configuration values.

**unset** _network_ _key_
> Remove a configuration key.

**attach** _network_ _instance_ [_device_] [_interface_]
> Attach a network interface to an instance.

**detach** _network_ _instance_ [_device_]
> Detach a network interface from an instance.

**attach-profile** / **detach-profile** _network_ _profile_ [_device_]
> Attach or detach a network interface to/from a profile.

**list-leases** _network_
> List DHCP leases.

**list-allocations**
> List IP addresses in use across networks and instances.

**acl**, **forward**, **load-balancer**, **peer**, **zone**
> Manage network ACLs, address forwards, load balancers, OVN peerings and DNS zones.

# PARAMETERS

**--target** _member_
> Cluster member to act on (for create, get, set, show, info and others).

**-p**, **--property**
> With get, set or unset: treat the key as a network property (such as description) rather than a config key.

# CAVEATS

Only managed networks can be configured; unmanaged host interfaces appear in the list but cannot be edited. Changing **ipv4.address** on a bridge in use disrupts connected instances. In Incus, the community fork of LXD, the same functionality is provided by **incus network**, and the separate LXC tools (**lxc-start** etc.) have no **lxc-network** command.

# HISTORY

Managed networks and the **lxc network** command were introduced in **LXD 2.3** (2016). Since 2023 LXD is developed by **Canonical**, while the Linux Containers community continues the codebase as **Incus**.

# SEE ALSO

[lxc](/man/lxc)(1), [incus](/man/incus)(1), [lxc-start](/man/lxc-start)(1)

# RESOURCES

```[Source code](https://github.com/canonical/lxd)```

```[Homepage](https://canonical.com/lxd)```

```[Documentation](https://canonical.com/lxd/docs/latest/reference/manpages/lxc/network/)```

<!-- verified: 2026-09-29 -->
