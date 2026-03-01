# TAGLINE

Remove locally stored Terraform credentials

# TLDR

**Log out** from HCP Terraform (default)

```terraform logout```

**Log out** from a specific **Terraform Enterprise** instance

```terraform logout [hostname]```

# SYNOPSIS

**terraform logout** [_hostname_]

# PARAMETERS

**hostname**
> The hostname of the Terraform service to log out from. Defaults to **app.terraform.io** (HCP Terraform). For Terraform Enterprise, specify your organization's hostname

# DESCRIPTION

**terraform logout** removes locally stored API credentials for a specified remote service host. These credentials are typically stored after running **terraform login**. The command supports HCP Terraform, Terraform Enterprise, and any host offering Terraform services.

When using the default credentials file, it removes the token for the specified hostname from **~/.terraform.d/credentials.tfrc.json**. If a **credentials helper** is configured, Terraform invokes the helper's **forget** command to remove credentials from the external system.

# CAVEATS

The API token is **only removed from local storage**. It is **not** revoked on the remote server. The token remains valid until you manually revoke it through the service's web UI or API. For proper security hygiene, always revoke tokens on the remote service after logging out locally.

# HISTORY

Introduced in **Terraform v0.12.21** in early **2020** alongside **terraform login** to simplify credential management for Terraform Cloud and Enterprise connections.

# SEE ALSO

[terraform](/man/terraform)(1), [terraform-login](/man/terraform-login)(1)
