# TAGLINE

manages Linode virtual machine instances

# TLDR

**List all Linodes**

```linode-cli linodes list```

**Create Linode**

```linode-cli linodes create --type [g6-nanode-1] --region [us-east] --image [linode/ubuntu22.04] --root_pass "[password]"```

**View Linode details**

```linode-cli linodes view [linode_id]```

**Boot Linode**

```linode-cli linodes boot [linode_id]```

**Shutdown Linode**

```linode-cli linodes shutdown [linode_id]```

**Delete Linode**

```linode-cli linodes delete [linode_id]```

# SYNOPSIS

**linode-cli linodes** _subcommand_ [_options_]

# PARAMETERS

_SUBCOMMAND_
> Linode operation.

**list**
> List all Linodes.

**create**
> Create new Linode.

**view** _ID_
> View Linode details.

**boot** _ID_
> Boot Linode.

**shutdown** _ID_
> Shutdown Linode.

**delete** _ID_
> Delete Linode.

**--type** _PLAN_
> Instance type/plan.

**--region** _REGION_
> Datacenter region.

**--image** _IMAGE_
> OS image to deploy.

**--help**
> Display help information.

# DESCRIPTION

**linode-cli linodes** manages Linode virtual machine instances. It handles creation, configuration, and lifecycle.

The tool controls power state, resizing, cloning, and backups for Linode instances.

# CAVEATS

Requires authentication. Creates billable resources. Deletion is permanent.

# HISTORY

linode-cli linodes is part of the **Linode CLI** for managing virtual machine instances on Linode cloud.

# SEE ALSO

[linode-cli](/man/linode-cli)(1), [linode-cli-volumes](/man/linode-cli-volumes)(1)

