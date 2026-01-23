# TLDR

**List all resources** in the subscription

```az resource list```

**List resources** in a resource group

```az resource list --resource-group [rg_name]```

**Show a resource** by ID

```az resource show --ids [/subscriptions/.../resourceGroups/.../providers/.../name]```

**Show a resource** by name and type

```az resource show --resource-group [rg_name] --resource-type [Microsoft.Web/sites] --name [resource_name]```

**Delete a resource**

```az resource delete --ids [resource_id]```

**Move resources** to another resource group

```az resource move --destination-group [dest_rg] --ids [resource_id1] [resource_id2]```

**Tag a resource**

```az resource tag --tags [env=prod] [team=backend] --ids [resource_id]```

**Update a resource** property

```az resource update --ids [resource_id] --set properties.someProperty=value```

# SYNOPSIS

**az resource** _subcommand_ [_options_]

# DESCRIPTION

**az resource** is a subcommand of the Azure CLI that manages Azure resources generically across all resource types. It provides a unified interface for operations that apply to any resource, regardless of the specific service.

Resources in Azure are identifiable entities like virtual machines, storage accounts, or databases. Each has a unique resource ID following the pattern /subscriptions/{sub}/resourceGroups/{rg}/providers/{provider}/{type}/{name}.

This command is useful for scripting cross-resource operations, bulk management, and working with resource types that may not have dedicated CLI command groups.

# PARAMETERS

**list**
> List resources with optional filters.

**show**
> Display resource details.

**create**
> Create a resource from properties.

**delete**
> Remove a resource.

**update**
> Modify resource properties.

**move**
> Move resources between groups or subscriptions.

**tag**
> Manage resource tags.

**invoke-action**
> Invoke an action on a resource.

**--ids** _ids_
> One or more resource IDs.

**--resource-group** _rg_
> Resource group name.

**--resource-type** _type_
> Resource type (e.g., Microsoft.Compute/virtualMachines).

**--name** _name_
> Resource name.

**--namespace** _namespace_
> Provider namespace.

**--api-version** _version_
> API version for the resource type.

**--set** _property=value_
> Update a property using JMESPath.

**--tags** _tags_
> Space-separated tags (key=value).

**--query-string** _query_
> Filter resources with OData query.

# CAVEATS

Some resources cannot be moved between resource groups or subscriptions. Deleting a resource may leave orphaned dependent resources. API version compatibility varies by resource type. Generic commands may lack service-specific validations available in dedicated command groups. Resource moves may take extended time and have service-specific limitations.

# HISTORY

The generic resource commands have been part of the Azure CLI since **Azure CLI 2.0** launched in **2017**. They provide ARM (Azure Resource Manager) API access for any resource type. As Azure has grown, dedicated command groups for services have expanded, but the generic resource commands remain valuable for automation, bulk operations, and accessing new resource types before dedicated commands exist.

# SEE ALSO

[az](/man/az)(1), [az-group](/man/az-group)(1), [az-deployment](/man/az-deployment)(1), [az-tag](/man/az-tag)(1)
