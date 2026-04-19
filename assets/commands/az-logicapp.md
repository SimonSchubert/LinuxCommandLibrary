# TAGLINE

Manage Azure Logic Apps

# TLDR

**Create a Logic App** on an App Service plan

```az logicapp create --name [MyLogicApp] --resource-group [MyResourceGroup] --storage-account [MyStorageAccount] --plan [MyPlan]```

**List all Logic Apps** in a resource group

```az logicapp list --resource-group [MyResourceGroup]```

**Show details** of a Logic App

```az logicapp show --name [MyLogicApp] --resource-group [MyResourceGroup]```

**Start a Logic App**

```az logicapp start --name [MyLogicApp] --resource-group [MyResourceGroup]```

**Stop a Logic App**

```az logicapp stop --name [MyLogicApp] --resource-group [MyResourceGroup]```

**Delete a Logic App**

```az logicapp delete --name [MyLogicApp] --resource-group [MyResourceGroup] --yes```

# SYNOPSIS

**az** **logicapp** _subcommand_ [_options_]

# SUBCOMMANDS

**create**
> Create a Logic App.

**delete**
> Delete a Logic App.

**list**
> List Logic Apps.

**show**
> Get details of a Logic App.

**start**
> Start a Logic App.

**stop**
> Stop a Logic App.

**restart**
> Restart a Logic App.

**deployment**
> Manage Logic App deployments.

**config**
> Configure Logic App settings.

# COMMON PARAMETERS

**--name**, **-n** _NAME_
> Name of the Logic App.

**--resource-group**, **-g** _RG_
> Resource group containing the Logic App.

**--storage-account** _ACCOUNT_
> Storage account (name or resource ID) used by the Logic App (Standard tier, required on create).

**--plan** _PLAN_
> App Service plan name or resource ID to host the Logic App.

**--functions-version** _VERSION_
> Functions runtime version (e.g. 4).

**--runtime-version** _VERSION_
> Runtime version (e.g. ~14, ~16, ~18).

**--https-only** {false,true}
> Redirect all traffic to HTTPS.

**--tags** _TAGS_
> Space-separated `key=value` tags.

**--yes**
> Skip confirmation prompts (used by `delete`).

# DESCRIPTION

**az logicapp** manages Azure Logic Apps (Standard), which are serverless workflows that integrate apps, data, services, and systems. Logic Apps provide visual designers and prebuilt connectors for enterprise integration scenarios.

This command group manages Standard tier Logic Apps. For Consumption tier Logic Apps, use the Azure portal or ARM templates.

# CAVEATS

Requires Azure CLI to be installed and authenticated. Standard tier Logic Apps require a storage account. Some features require specific Azure regions.

# SEE ALSO

[az](/man/az)(1), [az-functionapp](/man/az-functionapp)(1)
