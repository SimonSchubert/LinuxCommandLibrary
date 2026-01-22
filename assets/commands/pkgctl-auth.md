# TLDR

**Authenticate** pkgctl with the GitLab instance

```pkgctl auth login```

View **authentication status**

```pkgctl auth status```

# SYNOPSIS

**pkgctl auth** _command_

# PARAMETERS

**login**
> Authenticate with the GitLab instance

**status**
> Display current authentication status

# DESCRIPTION

**pkgctl auth** manages authentication for pkgctl with services like GitLab. It handles login credentials for package repository operations and source control integration.

Authentication is required for operations that interact with Arch Linux infrastructure, such as releasing packages and managing repository access.

# CAVEATS

Credentials are stored locally. Ensure proper permissions on credential files to prevent unauthorized access.

# HISTORY

Part of **pkgctl**, the Arch Linux package control tool for official repository maintainers.

# SEE ALSO

[pkgctl](/man/pkgctl)(1), [pkgctl-release](/man/pkgctl-release)(1)
