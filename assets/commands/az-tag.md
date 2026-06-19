# TAGLINE

Manage tags on Azure resources

# TLDR

**Set the entire tag set** on a resource (acts like init, replaces existing)

```az tag create --resource-id [resource-id] --tags [env=prod team=dev]```

**List tags** on a resource, resource group, or subscription

```az tag list --resource-id [resource-id]```

**Merge tags** into the existing set (add or update)

```az tag update --resource-id [resource-id] --operation Merge --tags [newkey=newvalue]```

**Replace all tags** on a resource

```az tag update --resource-id [resource-id] --operation Replace --tags [key=value]```

**Selectively delete tags** from a resource

```az tag update --resource-id [resource-id] --operation Delete --tags [keytoremove=value]```

**Create a predefined tag name** at the subscription level

```az tag create --name [tagname]```

**Add a predefined value** to a tag name

```az tag add-value --name [tagname] --value [tagvalue]```

**Delete a predefined tag name** from the subscription

```az tag delete --name [tagname]```

# SYNOPSIS

**az** **tag** _subcommand_ [_options_]

# SUBCOMMANDS

**create**
> Create (set) the entire set of tags on a resource, resource group, or subscription. Replaces any existing tags. With only --name, creates a predefined tag name on the subscription.

**delete**
> Delete the entire set of tags on a resource, or delete a predefined tag name from the subscription.

**list**
> List the entire set of tags on a resource, resource group, or subscription.

**update**
> Selectively update tags on a resource using Merge, Replace, or Delete.

**add-value**
> Create a predefined tag value for a predefined tag name.

**remove-value**
> Delete a predefined tag value for a predefined tag name.

# PARAMETERS

**--resource-id**
> The resource identifier for the entity being tagged. A resource, resource group, or subscription may be tagged.

**--tags**
> Space-separated tags as key=value pairs.

**--operation**
> Update operation: Merge, Replace, or Delete.

**--name** **-n**
> Predefined tag name for subscription-level operations.

**--value**
> Tag value, used with add-value and remove-value.

**--yes** **-y**
> Do not prompt for confirmation (delete).

# DESCRIPTION

**az tag** manages Azure resource tags, which are metadata key-value pairs used for organizing and categorizing resources. Tags help with cost management, automation, and governance.

Tags can be applied at subscription, resource group, or individual resource level via **--resource-id**. Resources do not inherit tags from their parent resource group. Separately, **--name** and **--value** manage predefined tag names and values at the subscription level (a reusable taxonomy) without attaching them to a resource.

# CAVEATS

Requires Azure CLI to be installed and authenticated. Maximum of 50 tags per resource. Tag names are case-insensitive but tag values are case-sensitive. Some resource types do not support tags.

# SEE ALSO

[az](/man/az)(1), [az-resource](/man/az-resource)(1), [az-lock](/man/az-lock)(1), [az-provider](/man/az-provider)(1)

# RESOURCES

```[Source code](https://github.com/Azure/azure-cli)```

```[Documentation](https://learn.microsoft.com/en-us/cli/azure/tag)```

```[Homepage](https://learn.microsoft.com/en-us/cli/azure/)```

<!-- verified: 2026-06-19 -->
