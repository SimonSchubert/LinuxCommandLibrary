# TLDR

**Create a new API Management** service instance

```az apim create --name [MyApim] --resource-group [MyResourceGroup] --publisher-email [email@domain.com] --publisher-name [MyCompany] --location [eastus]```

**List all API Management** services in a resource group

```az apim list --resource-group [MyResourceGroup]```

**Show details** of an API Management service

```az apim show --name [MyApim] --resource-group [MyResourceGroup]```

**Import an API** from OpenAPI specification

```az apim api import --service-name [MyApim] --resource-group [MyResourceGroup] --path [myapi] --specification-format OpenAPI --specification-url [https://example.com/swagger.json]```

**List all APIs** in a service

```az apim api list --service-name [MyApim] --resource-group [MyResourceGroup]```

**Create a backup** of the service

```az apim backup --name [MyApim] --resource-group [MyResourceGroup] --backup-name [myBackup] --storage-account-name [mystorageaccount] --storage-account-container [backups]```

**Delete an API Management** service

```az apim delete --name [MyApim] --resource-group [MyResourceGroup] --yes```

# SYNOPSIS

**az** **apim** _subcommand_ [_options_]

# SUBCOMMANDS

**create**
> Create a new API Management service instance.

**show**
> Get details of an API Management service.

**list**
> List API Management service instances.

**update**
> Update an API Management service instance.

**delete**
> Delete an API Management service instance.

**backup**
> Create a backup of the API Management service.

**restore**
> Restore an API Management service from a backup.

**api create**
> Create a new API.

**api import**
> Import an API from a specification.

**api list**
> List APIs in a service.

**api operation**
> Manage API operations.

**product**
> Manage API products.

**nv**
> Manage Named Values for configuration.

# DESCRIPTION

**az apim** manages Azure API Management services, which provide a way to create consistent and modern API gateways for existing back-end services. It handles API creation, versioning, documentation, security policies, rate limiting, and developer portal management.

API Management supports multiple SKU tiers: Basic, Consumption, Developer, Isolated, Premium, and Standard, each offering different capabilities and scale options.

# CAVEATS

Requires Azure CLI to be installed and authenticated with **az login**. Creating API Management services can take 30-40 minutes for non-Consumption tiers. Use **--no-wait** for long-running operations.

# SEE ALSO

[az](/man/az)(1), [az-advisor](/man/az-advisor)(1), [az-config](/man/az-config)(1)
