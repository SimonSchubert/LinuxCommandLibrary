# TAGLINE

sets or displays the targeted account, region, and resource group

# TLDR

**Show current target**

```ibmcloud target```

**Set target region**

```ibmcloud target -r [us-south]```

**Set target resource group**

```ibmcloud target -g [resource-group]```

**Set account, region, and resource group** at once

```ibmcloud target -c [account-id] -r [eu-de] -g [default]```

**Choose an account** interactively from a list

```ibmcloud target -ca```

**Unset resource group**

```ibmcloud target --unset-resource-group```

**Show the current target** as JSON

```ibmcloud target --output json```

# SYNOPSIS

**ibmcloud** **target** [_options_]

# PARAMETERS

**-r** _region_
> Target region, for example **us-south** or **eu-gb**.

**--unset-region**
> Clear the targeted region.

**-g** _group_
> Target resource group by name or ID.

**--unset-resource-group**
> Clear the targeted resource group.

**-c** _account_
> Target account ID (an account owner's user ID is also accepted).

**-ca**, **--choose-account**
> Pick the account to target from an interactive list.

**--output** _FORMAT_
> Output format (e.g. `json`).

# DESCRIPTION

**ibmcloud target** sets or displays the targeted account, region, and resource group. Subsequent CLI commands operate within the targeted context. Run without options to display current target.

# CAVEATS

The Cloud Foundry options **-o**, **-s**, **--cf**, and **--cf-api** were deprecated in CLI 2.15.0 and removed in later 2.x releases along with IBM Cloud Foundry; use **ibmcloud target** only for account, region, and resource group. When no resource group is targeted, resource commands act across all resource groups.

# SEE ALSO

[ibmcloud](/man/ibmcloud)(1), [ibmcloud-login](/man/ibmcloud-login)(1), [ibmcloud-regions](/man/ibmcloud-regions)(1)

# RESOURCES

```[Documentation](https://cloud.ibm.com/docs/cli?topic=cli-ibmcloud_cli)```

<!-- verified: 2026-11-23 -->
