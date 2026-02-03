# TLDR

**Create a Logic App**

```az logicapp create --name [MyLogicApp] --resource-group [MyResourceGroup] --storage-account [MyStorageAccount]```

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

# DESCRIPTION

**az logicapp** manages Azure Logic Apps (Standard), which are serverless workflows that integrate apps, data, services, and systems. Logic Apps provide visual designers and prebuilt connectors for enterprise integration scenarios.

This command group manages Standard tier Logic Apps. For Consumption tier Logic Apps, use the Azure portal or ARM templates.

# CAVEATS

Requires Azure CLI to be installed and authenticated. Standard tier Logic Apps require a storage account. Some features require specific Azure regions.

# SEE ALSO

[az](/man/az)(1), [az-functionapp](/man/az-functionapp)(1)
