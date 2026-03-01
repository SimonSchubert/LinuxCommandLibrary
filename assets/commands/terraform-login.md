# TAGLINE

Authenticate Terraform CLI with a remote host

# TLDR

**Log in** to HCP Terraform (default)

```terraform login```

**Log in** to a specific **Terraform Enterprise** instance

```terraform login [hostname]```

# SYNOPSIS

**terraform login** [_hostname_]

# PARAMETERS

**hostname**
> The hostname of the Terraform service to authenticate against. Defaults to **app.terraform.io** (HCP Terraform). For Terraform Enterprise, specify your organization's hostname

# DESCRIPTION

**terraform login** obtains and saves an API token for **HCP Terraform** (formerly Terraform Cloud), **Terraform Enterprise**, or any host implementing the Terraform login protocol. The command launches a web browser directing the user to the service's login page. After authorization, Terraform receives an API token via **OAuth 2.0** with **PKCE** and saves it locally.

By default, the token is stored in plain text in **~/.terraform.d/credentials.tfrc.json**. Alternatively, a **credentials helper** can be configured to store tokens in an external secrets management system.

# CONFIGURATION

Tokens are stored in **~/.terraform.d/credentials.tfrc.json** by default. The location can be overridden with the **TF_CLI_CONFIG_FILE** environment variable. Tokens can also be provided via environment variables following the pattern **TF_TOKEN_\<hostname_with_underscores\>** (e.g., **TF_TOKEN_app_terraform_io**). A **credentials_helper** block in the CLI config can integrate with external secret stores.

# CAVEATS

The command is **interactive** and launches a web browser, so it cannot be used in headless or CI/CD environments. For automation, configure credentials manually via environment variables or the credentials file. Tokens are stored in **plain text** by default. Terraform does not handle token refresh or expiration automatically; when a token expires, run **terraform login** again. Only **user tokens** or **team tokens** work; organization tokens cannot be used for CLI operations.

# HISTORY

Introduced in **Terraform v0.12.21** in early **2020** alongside **terraform logout** to simplify connecting the CLI to Terraform Cloud and Enterprise, replacing the previous manual process of generating and configuring API tokens.

# SEE ALSO

[terraform](/man/terraform)(1), [terraform-logout](/man/terraform-logout)(1), [terraform-console](/man/terraform-console)(1)
