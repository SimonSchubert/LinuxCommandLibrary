# TAGLINE

manages instance flavors in OpenStack

# TLDR

**List flavors**

```openstack flavor list```

**Show flavor details**

```openstack flavor show [m1.small]```

**Create flavor with specific resources**

```openstack flavor create --vcpus [2] --ram [4096] --disk [40] [custom.medium]```

**Create a private flavor**

```openstack flavor create --vcpus [4] --ram [8192] --disk [80] --private [custom.large]```

**Delete flavor**

```openstack flavor delete [custom.medium]```

**Set extra property on a flavor**

```openstack flavor set --property [hw:cpu_policy=dedicated] [custom.medium]```

# SYNOPSIS

**openstack flavor** _command_ [_options_]

# PARAMETERS

**list**
> List available flavors.

**show** _name_
> Show flavor details.

**create** _name_
> Create flavor.

**delete** _name_
> Delete flavor.

**set** _name_
> Set flavor properties.

**--vcpus** _num_
> Number of vCPUs.

**--ram** _mb_
> RAM in megabytes.

**--disk** _gb_
> Root disk size in gigabytes.

**--ephemeral** _gb_
> Ephemeral disk size in gigabytes (default: 0).

**--swap** _mb_
> Swap space size in megabytes (default: 0).

**--id** _id_
> Unique flavor ID ('auto' generates a UUID, default: auto).

**--public**
> Make flavor accessible to all projects (default).

**--private**
> Make flavor accessible only to specific projects.

**--property** _key=value_
> Set extra specification property on the flavor.

# DESCRIPTION

**openstack flavor** manages instance flavors (size templates) in OpenStack. Flavors define compute, memory, and storage resources for virtual machines. Part of OpenStack unified CLI.

# SEE ALSO

[openstack-server](/man/openstack-server)(1), [openstack](/man/openstack)(1)

