# TAGLINE

View and manage Azure best-practice recommendations

# TLDR

**List all Azure Advisor recommendations**

```az advisor recommendation list```

**List recommendations** for a specific category

```az advisor recommendation list --category [Cost|Security|Reliability|Performance|OperationalExcellence]```

**Show Advisor configuration** for the subscription

```az advisor configuration show```

**List configuration** for the entire subscription

```az advisor configuration list```

**Disable a recommendation**

```az advisor recommendation disable --name [recommendation-name] --resource-group [rg-name]```

**Enable a previously disabled** recommendation

```az advisor recommendation enable --name [recommendation-name] --resource-group [rg-name]```

# SYNOPSIS

**az** **advisor** _subcommand_ [_options_]

# SUBCOMMANDS

**configuration list**
> List Azure Advisor configuration for the entire subscription.

**configuration show**
> Show Azure Advisor configuration for the given subscription or resource group.

**configuration update**
> Update Azure Advisor configuration.

**recommendation list**
> List Azure Advisor recommendations.

**recommendation disable**
> Dismiss Azure Advisor recommendations.

**recommendation enable**
> Enable Azure Advisor recommendations.

# DESCRIPTION

**az advisor** manages Azure Advisor, a personalized cloud consultant that helps you follow best practices to optimize your Azure deployments. Azure Advisor analyzes resource configuration and usage telemetry, then recommends solutions to improve cost effectiveness, performance, reliability, and security.

Recommendations are categorized into: Cost, Security, Reliability, Performance, and OperationalExcellence.

# CAVEATS

Requires Azure CLI to be installed and authenticated with **az login**. Appropriate Azure RBAC permissions are needed to view and manage Advisor recommendations.

# SEE ALSO

[az](/man/az)(1), [az-config](/man/az-config)(1), [az-feedback](/man/az-feedback)(1)
