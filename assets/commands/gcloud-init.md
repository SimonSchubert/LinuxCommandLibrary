# TAGLINE

initialize Google Cloud SDK configuration

# TLDR

**Initialize gcloud**

```gcloud init```

**Initialize without browser**

```gcloud init --console-only```

**Reinitialize with new configuration**

```gcloud init --skip-diagnostics```

# SYNOPSIS

**gcloud** **init** [_options_]

# PARAMETERS

**--console-only**
> Don't launch browser for login.

**--skip-diagnostics**
> Skip network diagnostics.

**--configuration** _name_
> Use specific configuration.

# DESCRIPTION

**gcloud init** is an interactive wizard that guides you through the initial setup of the Google Cloud SDK. It handles authentication by launching a browser for OAuth login, then helps you select a default project from those available to your account.

The initialization process also prompts for default Compute Engine region and zone settings, which streamlines future commands by eliminating the need to specify these values repeatedly. The command creates or updates a configuration profile with these preferences.

gcloud init can be run multiple times to create different named configurations for working with multiple projects or accounts. It's the recommended first step after installing the Google Cloud SDK and the easiest way to switch between different GCP environments.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-auth-login](/man/gcloud-auth-login)(1)

