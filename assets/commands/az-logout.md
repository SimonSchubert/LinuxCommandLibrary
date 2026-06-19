# TAGLINE

Remove Azure CLI authentication credentials

# TLDR

**Logout** current user

```az logout```

Logout **specific user**

```az logout --username [user@example.com]```

# SYNOPSIS

**az logout** [_options_]

# DESCRIPTION

**az logout** logs out to remove access to Azure subscriptions. It clears access tokens and refresh tokens for the account from the local credential cache.

The command is useful when switching between accounts or securing a shared system.

# PARAMETERS

**--username** _user_
> Account user to log out. If missing, log out the current active account.

# WORKFLOW

```bash
# Logout current account
az logout

# Login with different account
az login
```

# CAVEATS

Does not revoke tokens on Azure side, only removes local cache. Service principal credentials in environment variables are not affected. Managed identity authentication persists.

# HISTORY

**az logout** has been available since Azure CLI 2.0 in **2017** as the companion to az login for credential management.

# SEE ALSO

[az-login](/man/az-login)(1), [az-account](/man/az-account)(1), [az](/man/az)(1)

# RESOURCES

```[Source code](https://github.com/Azure/azure-cli)```

```[Documentation](https://learn.microsoft.com/en-us/cli/azure/reference-index#az-logout)```

```[Homepage](https://learn.microsoft.com/en-us/cli/azure/)```

<!-- verified: 2026-06-19 -->
