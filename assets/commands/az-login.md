# TAGLINE

Authenticate with Azure

# TLDR

**Login** interactively

```az login```

Login with **service principal** using a client secret

```az login --service-principal -u [app-id] -p [client-secret] --tenant [tenant-id]```

Login with **service principal** using a certificate

```az login --service-principal -u [app-id] --certificate [/path/to/cert.pem] --tenant [tenant-id]```

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

By default it logs in with a user account: it uses Web Account Manager (WAM) on Windows and browser-based login on Linux and macOS, falling back to device code flow when no browser is available. The command stores authentication tokens locally for subsequent Azure CLI commands.

# PARAMETERS

**--service-principal**
> Login as service principal

**-u**, **--username** _name_
> User name or service principal client ID

**-p**, **--password** _password_
> User password or service principal secret. Prompts if not given. No longer accepts a certificate; use --certificate instead

**--certificate** _path_
> PEM file with the key and public certificate for a service principal

**-t**, **--tenant** _id_
> Microsoft Entra tenant ID or domain. Required for a service principal

**--identity**, **-i**
> Login using a managed identity

**--client-id** _id_
> Client ID of a user-assigned managed identity (with --identity)

**--federated-token** _token_
> Federated token for OIDC token exchange (e.g. GitHub Actions, Workload Identity)

**--use-device-code**
> Use device code flow (for systems without a browser)

**--allow-no-subscriptions**
> Allow login to tenants without subscriptions, useful for tenant-level commands like az ad

**--skip-subscription-discovery**
> Skip subscription discovery during login. Requires --tenant

**--scope** _scope_
> OAuth scope used in the authorize request

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

# INSTALL

```dnf: sudo dnf install azure-cli```

```pacman: sudo pacman -S azure-cli```

```zypper: sudo zypper install azure-cli```

```brew: brew install azure-cli```

```nix: nix profile install nixpkgs#azure-cli```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[az](/man/az)(1), [az-logout](/man/az-logout)(1), [az-account](/man/az-account)(1)

# RESOURCES

```[Source code](https://github.com/Azure/azure-cli)```

```[Documentation](https://learn.microsoft.com/en-us/cli/azure/reference-index)```

<!-- verified: 2026-06-18 -->
