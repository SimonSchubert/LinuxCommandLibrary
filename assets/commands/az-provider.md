# TAGLINE

Manage Azure resource providers

# TLDR

**List all resource providers**

```az provider list```

**List registered providers** only

```az provider list --query "[?registrationState=='Registered']"```

**Show details** of a specific provider

```az provider show --namespace [Microsoft.Compute]```

**Register a resource provider** and wait for it to finish

```az provider register --namespace [Microsoft.ContainerService] --wait```

**Unregister a resource provider**

```az provider unregister --namespace [Microsoft.ContainerService]```

**Show operations** for a specific provider

```az provider operation show --namespace [Microsoft.Compute]```

# SYNOPSIS

**az** **provider** _subcommand_ [_options_]

# SUBCOMMANDS

**list**
> List resource providers for a subscription.

**show**
> Get details about a resource provider.

**register**
> Register a resource provider.

**unregister**
> Unregister a resource provider.

**operation list**
> Get operations from all providers.

**operation show**
> Get an individual provider's operations.

**permission list**
> List permissions for a provider.

# PARAMETERS

**--namespace** **-n**
> The resource provider namespace (e.g., Microsoft.Compute).

**--wait**
> Wait for the registration to finish. Default: false.

**--management-group-id** **-m**
> The management group id to register the provider against.

**--consent-to-permissions** **-c**
> Indicate whether authorization is consented (used by register). Default: false.

**--accept-terms**
> Accept terms when registering an RPaaS (Resource Provider as a Service) provider.

**--expand**
> Properties to include in list/show results, e.g. resourceTypes/aliases.

# DESCRIPTION

**az provider** manages Azure resource providers. Resource providers are services that supply Azure resources (VMs, storage accounts, databases, etc.). Before using a resource type, the provider must be registered in your subscription.

Common providers include Microsoft.Compute (VMs), Microsoft.Storage (storage accounts), Microsoft.Network (networking), and Microsoft.ContainerService (AKS).

# CAVEATS

Requires Azure CLI to be installed and authenticated. Some providers auto-register when creating resources. Unregistering a provider does not delete existing resources but prevents creating new ones.

# SEE ALSO

[az](/man/az)(1), [az-resource](/man/az-resource)(1), [az-lock](/man/az-lock)(1), [az-tag](/man/az-tag)(1)

# RESOURCES

```[Source code](https://github.com/Azure/azure-cli)```

```[Documentation](https://learn.microsoft.com/en-us/cli/azure/provider)```

```[Homepage](https://learn.microsoft.com/en-us/cli/azure/)```

<!-- verified: 2026-06-19 -->
