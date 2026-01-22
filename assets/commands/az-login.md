# TLDR

**Login** interactively

```az login```

Login with **service principal**

```az login --service-principal -u [app-id] -p [password] --tenant [tenant-id]```

Login with **managed identity**

```az login --identity```

Login with **device code**

```az login --use-device-code```

Login to **specific tenant**

```az login --tenant [tenant-id]```

# SYNOPSIS

**az login** [_options_]

# DESCRIPTION

**az login** authenticates the Azure CLI with your Azure account. It supports multiple authentication methods including interactive browser login, service principals, managed identities, and device code flow.

The command stores authentication tokens locally for subsequent Azure CLI commands.

# PARAMETERS

**--service-principal**
> Login as service principal

**-u**, **--username** _name_
> Username or app ID

**-p**, **--password** _password_
> Password or certificate

**--tenant** _id_
> Tenant ID or domain

**--identity**
> Login using managed identity

**--use-device-code**
> Use device code authentication

**--allow-no-subscriptions**
> Allow login without subscriptions

**--scope** _scope_
> OAuth scope for login

# AUTHENTICATION METHODS

**Interactive** (default)
> Opens browser for authentication

**Service Principal**
> Automated authentication for applications

**Managed Identity**
> For Azure resources (VMs, App Service, etc.)

**Device Code**
> For systems without browser access

# WORKFLOW

```bash
# Interactive login
az login

# Select subscription
az account set --subscription "My Subscription"

# Verify login
az account show
```

# CAVEATS

Tokens stored in ~/.azure directory. Interactive login requires browser. Service principal credentials should be secured. Managed identity only works on Azure resources. Multiple logins create multiple contexts.

# HISTORY

**az login** has been part of Azure CLI since version 2.0 in **2017**, supporting various authentication methods as Azure's identity platform evolved.

# SEE ALSO

[az](/man/az)(1), [az-logout](/man/az-logout)(1), [az-account](/man/az-account)(1)
