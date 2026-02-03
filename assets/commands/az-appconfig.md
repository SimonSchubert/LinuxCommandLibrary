# TLDR

**Create an App Configuration store**

```az appconfig create --name [MyAppConfig] --resource-group [MyResourceGroup] --location [westus] --sku [Standard]```

**List all App Configuration stores** in a resource group

```az appconfig list --resource-group [MyResourceGroup]```

**Show details** of an App Configuration store

```az appconfig show --name [MyAppConfig] --resource-group [MyResourceGroup]```

**Set a key-value** in the store

```az appconfig kv set --name [MyAppConfig] --key [myKey] --value [myValue]```

**Import configuration** from a file

```az appconfig kv import --name [MyAppConfig] --source file --path [config.json] --format json```

**Enable a feature flag**

```az appconfig feature enable --name [MyAppConfig] --feature [myFeature]```

**Delete an App Configuration store**

```az appconfig delete --name [MyAppConfig] --resource-group [MyResourceGroup]```

# SYNOPSIS

**az** **appconfig** _subcommand_ [_options_]

# SUBCOMMANDS

**create**
> Create an App Configuration store.

**delete**
> Delete an App Configuration store.

**list**
> List all App Configuration stores.

**show**
> Show properties of a store.

**update**
> Update an App Configuration store.

**kv**
> Manage key-values (set, get, list, delete, lock, unlock).

**kv import/export**
> Import/export configurations.

**feature**
> Manage feature flags (enable, disable, set, delete).

**credential**
> Manage access keys.

**replica**
> Manage replicas (Premium tier).

**snapshot**
> Manage configuration snapshots.

# DESCRIPTION

**az appconfig** manages Azure App Configuration stores, which provide a service to centrally manage application settings and feature flags. App Configuration helps implement the Twelve-Factor App methodology by separating configuration from code.

Available SKUs include Developer, Standard, and Premium, with Premium offering additional features like replicas.

# CAVEATS

Requires Azure CLI to be installed and authenticated with **az login**. Some features like replicas are only available in Premium tier.

# SEE ALSO

[az](/man/az)(1), [az-config](/man/az-config)(1), [az-advisor](/man/az-advisor)(1)
