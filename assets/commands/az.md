# TAGLINE

Unified command-line interface for Microsoft Azure

# TLDR

**Login** to Azure

```az login```

**List** resource groups

```az group list```

**Create** resource group

```az group create --name [MyResourceGroup] --location [eastus]```

**List** virtual machines

```az vm list```

**Get** account information

```az account show```

Use **specific subscription**

```az account set --subscription [subscription-id]```

# SYNOPSIS

**az** [_group_] [_subgroup_] [_command_] [_options_]

# DESCRIPTION

**az** is the unified command-line interface for Microsoft Azure. It provides access to Azure services including virtual machines, storage, databases, Kubernetes, and hundreds of other cloud resources through a consistent cross-platform interface.

The CLI enables automation, scripting, and management of Azure resources without using the web portal.

# PARAMETERS

**--output**, **-o** _format_
> Output format (json, jsonc, table, tsv, yaml, none)

**--query**
> JMESPath query to filter output

**--subscription** _id_
> Subscription name or ID

**--resource-group**, **-g** _name_
> Resource group name

**--location**, **-l** _region_
> Azure region

**--verbose**
> Increase logging verbosity

**--debug**
> Enable debug logging

**--only-show-errors**
> Only show errors

# COMMON SERVICES

- **vm** - Virtual machines
- **storage** - Storage accounts
- **aks** - Azure Kubernetes Service
- **webapp** - Web apps
- **sql** - SQL databases
- **cosmosdb** - Cosmos DB
- **keyvault** - Key Vault
- **network** - Networking resources
- **group** - Resource groups
- **account** - Account management

# CONFIGURATION

**~/.azure/config**
> INI-format configuration file for defaults and settings. Sections include [core], [defaults], and [cloud]. Managed via `az config set`.

```bash
# Set default output format
az config set core.output=table

# Set default location
az config set defaults.location=eastus
```

# CAVEATS

Requires Azure subscription and authentication. Some operations are destructive. API rate limits may apply. Large outputs can be slow. Not all Azure features available immediately in CLI. Use --dry-run when available.

# HISTORY

The **Azure CLI 2.0** was released by Microsoft in **2017** as a complete rewrite of the original Azure CLI, built in Python with focus on usability and cross-platform support.

# SEE ALSO

[az-login](/man/az-login)(1), [az-account](/man/az-account)(1), [terraform](/man/terraform)(1)
