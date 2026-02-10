# TAGLINE

command-line client for OpenStack Compute, which manages virtual machine

# TLDR

**List VMs** on current tenant

```nova list```

List VMs of **all tenants** (admin user only)

```nova list --all-tenants```

**Boot a VM** on a specific host

```nova boot --nic net-id=[net_id] --image [image_id] --flavor [flavor] --availability-zone nova:[host_name] [vm_name]```

**Start** a server

```nova start [server]```

**Stop** a server

```nova stop [server]```

**Attach a network interface** to a specific VM

```nova interface-attach --net-id [net_id] [server]```

# SYNOPSIS

**nova** _command_ [_options_] [_arguments_]

# PARAMETERS

**list**
> List virtual machines

**boot**
> Create and boot a new VM

**start**
> Start a stopped VM

**stop**
> Stop a running VM

**delete**
> Delete a VM

**show**
> Show details of a VM

**interface-attach**
> Attach a network interface to a VM

**--nic net-id=_id_**
> Network to attach

**--image _id_**
> Image ID to boot from

**--flavor _name_**
> Instance type/size

**--availability-zone _zone:host_**
> Placement specification

**--all-tenants**
> Show VMs from all tenants (admin)

# DESCRIPTION

**nova** is the command-line client for OpenStack Compute (Nova), which manages virtual machine instances in OpenStack clouds. It handles VM lifecycle operations: creating, starting, stopping, and deleting instances.

Nova integrates with other OpenStack services: Glance for images, Neutron for networking, Cinder for block storage, and Keystone for authentication. Authentication credentials are typically provided through environment variables (OS_USERNAME, OS_PASSWORD, etc.).

The client communicates with the Nova API to provision compute resources according to specified configurations (flavor, image, network).

# CAVEATS

Requires OpenStack credentials configured (typically via sourcing an openrc file). The legacy nova client is being replaced by **openstack** unified client. Network and storage configurations must exist before VM creation. Admin privileges needed for cross-tenant operations.

# SEE ALSO

[openstack](/man/openstack)(1), [neutron](/man/neutron)(1), [glance](/man/glance)(1)
