# TLDR

**Create a resource group**

```az group create -l [westus] -n [MyResourceGroup]```

**List all resource groups**

```az group list -o table```

**Show details** of a resource group

```az group show -n [MyResourceGroup]```

**Check if a resource group exists**

```az group exists -n [MyResourceGroup]```

**Delete a resource group** and all its resources

```az group delete -n [MyResourceGroup]```

**Export a resource group** as a template

```az group export -n [MyResourceGroup]```

**List resource groups** in a specific location

```az group list --query "[?location=='westus']"```

# SYNOPSIS

**az group** _subcommand_ [_options_]

# DESCRIPTION

**az group** manages Azure resource groups, which are logical containers for Azure resources. All resources in Azure must belong to a resource group, and groups provide a way to organize, manage, and apply policies to related resources.

Resource groups define the lifecycle scope for resources; deleting a group deletes all contained resources. Groups also provide a scope for role-based access control (RBAC) and policy assignments.

# SUBCOMMANDS

**Management**
> create, delete, update, show, list, exists

**Templates**
> export

**Locks**
> lock create, lock delete, lock list, lock show, lock update

**Waiting**
> wait

# PARAMETERS

**-n, --name** _value_
> Name of the resource group

**-l, --location** _value_
> Location for the resource group (e.g., westus, eastus)

**--tags** _value_
> Space-separated tags in key=value format

**--export-format** _value_
> Export format: json (default) or bicep

# CAVEATS

Resource group names must be unique within a subscription and can contain only alphanumeric characters, periods, underscores, hyphens, and parentheses. Deleting a resource group is irreversible and removes all contained resources. The group's location is metadata only; resources can be in different regions.

# HISTORY

Resource groups have been fundamental to Azure Resource Manager (ARM) since its introduction in **2014**, replacing the classic deployment model. They provide the organizational foundation for Azure's role-based access control and policy management.

# SEE ALSO

[az](/man/az)(1), [az-resource](/man/az-resource)(1), [az-deployment](/man/az-deployment)(1)
