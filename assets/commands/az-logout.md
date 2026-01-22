# TLDR

**Logout** current user

```az logout```

Logout **specific user**

```az logout --username [user@example.com]```

# SYNOPSIS

**az logout** [_options_]

# DESCRIPTION

**az logout** removes stored authentication credentials for the Azure CLI. It clears access tokens and refresh tokens from the local credential cache.

The command is useful when switching between accounts or securing a shared system.

# PARAMETERS

**--username** _user_
> Logout specific account

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
