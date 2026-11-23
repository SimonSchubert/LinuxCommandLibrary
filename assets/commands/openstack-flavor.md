# TAGLINE

manages instance flavors in OpenStack

# TLDR

**List flavors**

```openstack flavor list```

**List all flavors**, public and private, with extra details

```openstack flavor list --all --long```

**Show flavor details**

```openstack flavor show [m1.small]```

**Create flavor with specific resources**

```openstack flavor create --vcpus [2] --ram [4096] --disk [40] [custom.medium]```

**Create a private flavor** accessible to one project

```openstack flavor create --vcpus [4] --ram [8192] --disk [80] --private --project [project_name] [custom.large]```

**Grant another project access** to a private flavor

```openstack flavor set --project [project_name] [custom.large]```

**Set extra property on a flavor**

```openstack flavor set --property [hw:cpu_policy=dedicated] [custom.medium]```

**Remove a property** from a flavor

```openstack flavor unset --property [hw:cpu_policy] [custom.medium]```

**Delete flavor**

```openstack flavor delete [custom.medium]```

# SYNOPSIS

**openstack flavor** _command_ [_options_]

# PARAMETERS

**list**
> List flavors (public only by default).

**show** _flavor_
> Show flavor details.

**create** _name_
> Create flavor.

**delete** _flavor_...
> Delete one or more flavors.

**set** _flavor_
> Set flavor properties, description or project access.

**unset** _flavor_
> Remove flavor properties or project access.

**--vcpus** _num_
> Number of vCPUs (default: 1).

**--ram** _mb_
> RAM in MiB (default: 256).

**--disk** _gb_
> Root disk size in GiB (default: 0, meaning the size of the image).

**--ephemeral** _gb_
> Ephemeral disk size in GiB (default: 0).

**--swap** _mb_
> Swap space size in MiB (default: 0).

**--id** _id_
> Unique flavor ID. If omitted, Nova assigns a UUID; passing 'auto' is deprecated.

**--rxtx-factor** _factor_
> RX/TX factor.

**--public**
> Make flavor accessible to all projects (default).

**--private**
> Make flavor accessible only to projects granted access.

**--project** _project_
> Allow a project to access a private flavor (with **create**, requires **--private**).

**--property** _key=value_
> Set extra specification property on the flavor (repeatable).

**--no-property**
> With **set**, remove all properties before applying new ones.

**--description** _text_
> Flavor description (compute API 2.55 or later).

**--all**
> With **list**, show both public and private flavors.

**--min-ram** _mb_, **--min-disk** _gb_
> With **list**, filter by minimum RAM or disk.

**--long**
> With **list**, show additional fields such as properties.

# DESCRIPTION

**openstack flavor** manages instance flavors (size templates) in OpenStack Nova. Flavors define compute, memory and storage resources for virtual machines. Properties set via **--property** (aka extra_specs) control scheduler and hypervisor behavior: common keys include `hw:cpu_policy`, `hw:mem_page_size`, `hw:numa_nodes`, `quota:disk_read_bytes_sec` and `aggregate_instance_extra_specs:*`. The **set** and **unset** commands also add or remove project access for private flavors via `--project` / `--project-domain`.

Part of OpenStack unified CLI (`python-openstackclient`), superseding the old `nova flavor-*` commands.

# CAVEATS

Flavor sizes (vCPUs, RAM, disk) cannot be changed after creation: only properties, description and access can be modified with **set**/**unset**, so delete and recreate for size changes. Running instances keep the flavor they were booted with until resized. Admin role is required for create/delete and for setting most properties.

# SEE ALSO

[openstack](/man/openstack)(1), [openstack-server](/man/openstack-server)(1), [openstack-image](/man/openstack-image)(1), [openstack-volume](/man/openstack-volume)(1)

# RESOURCES

```[Source code](https://opendev.org/openstack/python-openstackclient)```

```[Homepage](https://www.openstack.org)```

```[Documentation](https://docs.openstack.org/python-openstackclient/latest/cli/command-objects/compute/v2/index.html)```

<!-- verified: 2026-11-23 -->
