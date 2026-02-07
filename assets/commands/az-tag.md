# TAGLINE

Manage tags on Azure resources

# TLDR

**Add tags** to a resource

```az tag create --resource-id [resource-id] --tags [env=prod team=dev]```

**List all tags** in a subscription

```az tag list```

**Show tags** on a resource

```az tag show --resource-id [resource-id]```

**Update tags** on a resource (merge)

```az tag update --resource-id [resource-id] --operation Merge --tags [newkey=newvalue]```

**Replace all tags** on a resource

```az tag update --resource-id [resource-id] --operation Replace --tags [key=value]```

**Delete specific tags** from a resource

```az tag update --resource-id [resource-id] --operation Delete --tags [keytoremove]```

**Delete a tag name** from subscription

```az tag delete --name [tagname]```

# SYNOPSIS

**az** **tag** _subcommand_ [_options_]

# SUBCOMMANDS

**create**
> Create tags on a resource.

**delete**
> Delete a tag from the subscription.

**list**
> List the entire set of tags on a subscription.

**show**
> Get tags on a resource.

**update**
> Update tags on a resource.

**add-value**
> Add a tag value to a tag name.

**remove-value**
> Remove a tag value from a tag name.

# PARAMETERS

**--resource-id**
> The resource ID to apply tags to.

**--tags**
> Space-separated tags as key=value pairs.

**--operation**
> Operation for update: Merge, Replace, or Delete.

**--name** **-n**
> Tag name for subscription-level operations.

# DESCRIPTION

**az tag** manages Azure resource tags, which are metadata key-value pairs used for organizing and categorizing resources. Tags help with cost management, automation, and governance.

Tags can be applied at subscription, resource group, or individual resource level. Resources do not inherit tags from their parent resource group.

# CAVEATS

Requires Azure CLI to be installed and authenticated. Maximum of 50 tags per resource. Tag names are case-insensitive but tag values are case-sensitive. Some resource types do not support tags.

# SEE ALSO

[az](/man/az)(1), [az-lock](/man/az-lock)(1), [az-provider](/man/az-provider)(1)
