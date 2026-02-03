# TLDR

**Show current target**

```ibmcloud target```

**Set target region**

```ibmcloud target -r [us-south]```

**Set target resource group**

```ibmcloud target -g [resource-group]```

**Set Cloud Foundry org and space**

```ibmcloud target -o [org] -s [space]```

**Set target account**

```ibmcloud target -c [account-id]```

**Unset resource group**

```ibmcloud target --unset-resource-group```

# SYNOPSIS

**ibmcloud** **target** [_options_]

# PARAMETERS

**-r** _region_
> Target region.

**-g** _group_
> Target resource group.

**-c** _account_
> Target account ID.

**-o** _org_
> Target Cloud Foundry organization.

**-s** _space_
> Target Cloud Foundry space.

**--unset-resource-group**
> Clear resource group.

# DESCRIPTION

**ibmcloud target** sets or displays the targeted account, region, resource group, and Cloud Foundry org/space. Subsequent CLI commands operate within the targeted context. Run without options to display current target.

# SEE ALSO

[ibmcloud](/man/ibmcloud)(1), [ibmcloud-login](/man/ibmcloud-login)(1)

