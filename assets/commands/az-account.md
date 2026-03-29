# TAGLINE

Manage Azure subscriptions and access tokens

# TLDR

**List all subscriptions** for the logged-in account (enabled only by default)

```az account list```

**Show the current subscription**

```az account show```

**Set the active subscription**

```az account set --subscription [subscription-id-or-name]```

**Get an access token** for the current account

```az account get-access-token```

**Get an access token** for Microsoft Graph

```az account get-access-token --resource-type ms-graph```

**List all subscriptions** including disabled ones across all clouds

```az account list --all```

**List supported regions** for the current subscription

```az account list-locations```

**Clear all cached subscriptions**

```az account clear```

# SYNOPSIS

**az account** _subcommand_ [_options_]

# DESCRIPTION

**az account** manages Azure subscription information and access tokens. It allows you to list, select, and manage subscriptions associated with your Azure account, as well as obtain access tokens for programmatic access to Azure resources.

This command group is essential for working with multiple Azure subscriptions and switching between them during CLI sessions.

# SUBCOMMANDS

**Subscription Management**
> list, show, set, clear, list-locations

**Access Tokens**
> get-access-token

**Management Groups**
> management-group create, management-group delete, management-group list, management-group show, management-group update

**Locks**
> lock create, lock delete, lock list, lock show, lock update

**Aliases (Extension)**
> alias create, alias delete, alias list, alias show

**Subscriptions (Extension)**
> subscription list, subscription show

# PARAMETERS

**--subscription**, **-s** _value_
> Name or ID of the subscription to use (accepted by `set`, `show`, `get-access-token`)

**--all**
> (`list`) Include subscriptions from all clouds and all states, not just enabled ones.

**--refresh**
> (`list`) Retrieve up-to-date subscriptions from the server rather than local cache.

**--resource-type** _value_
> Type of resource for access token. Accepted values: **aad-graph**, **arm**, **batch**, **data-lake**, **media**, **ms-graph**, **oss-rdbms**.

**--resource** _uri_
> Azure resource endpoint URI for access token (Microsoft Entra v1.0).

**--scope** _value_
> Space-separated scopes for the access token (Microsoft Entra v2.0). Defaults to Azure Resource Manager.

**--tenant**, **-t** _value_
> Tenant ID for cross-tenant token requests. Only available for user and service principal accounts.

# CAVEATS

Access tokens are valid for a minimum of 5 minutes up to a maximum of 60 minutes. The **expires_on** field in token output is a POSIX timestamp (UTC), while **expiresOn** is local datetime. Starting in September 2025, Microsoft requires MFA for user identities; scripts should migrate to service principals or managed identities.

# SEE ALSO

[az](/man/az)(1), [az-login](/man/az-login)(1), [az-logout](/man/az-logout)(1)
