# TAGLINE

manages instance flavors in OpenStack

# TLDR

**List flavors**

```openstack flavor list```

**Show flavor details**

```openstack flavor show [m1.small]```

**Create flavor**

```openstack flavor create --vcpus [2] --ram [4096] --disk [40] [custom.medium]```

**Delete flavor**

```openstack flavor delete [custom.medium]```

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

**--vcpus** _num_
> Number of vCPUs.

**--ram** _mb_
> RAM in megabytes.

**--disk** _gb_
> Root disk size in gigabytes.

**--public**
> Make flavor public.

# DESCRIPTION

**openstack flavor** manages instance flavors (size templates) in OpenStack. Flavors define compute, memory, and storage resources for virtual machines. Part of OpenStack unified CLI.

# SEE ALSO

[openstack-server](/man/openstack-server)(1), [openstack](/man/openstack)(1)

