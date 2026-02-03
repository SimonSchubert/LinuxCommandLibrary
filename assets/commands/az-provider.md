# TLDR

**List all resource providers**

```az provider list```

**List registered providers** only

```az provider list --query "[?registrationState=='Registered']"```

**Show details** of a specific provider

```az provider show --namespace [Microsoft.Compute]```

**Register a resource provider**

```az provider register --namespace [Microsoft.ContainerService]```

**Unregister a resource provider**

```az provider unregister --namespace [Microsoft.ContainerService]```

**List operations** available for a provider

```az provider operation list --namespace [Microsoft.Compute]```

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
> List operations for a provider.

**permission list**
> List permissions for a provider.

# PARAMETERS

**--namespace** **-n**
> The resource provider namespace (e.g., Microsoft.Compute).

**--wait**
> Wait for registration to complete.

# DESCRIPTION

**az provider** manages Azure resource providers. Resource providers are services that supply Azure resources (VMs, storage accounts, databases, etc.). Before using a resource type, the provider must be registered in your subscription.

Common providers include Microsoft.Compute (VMs), Microsoft.Storage (storage accounts), Microsoft.Network (networking), and Microsoft.ContainerService (AKS).

# CAVEATS

Requires Azure CLI to be installed and authenticated. Some providers auto-register when creating resources. Unregistering a provider does not delete existing resources but prevents creating new ones.

# SEE ALSO

[az](/man/az)(1), [az-lock](/man/az-lock)(1), [az-tag](/man/az-tag)(1)
