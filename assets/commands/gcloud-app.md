# TAGLINE

Google App Engine management commands

# TLDR

**Deploy application**

```gcloud app deploy```

**Browse deployed app**

```gcloud app browse```

**View logs**

```gcloud app logs tail```

**List services**

```gcloud app services list```

**Describe app**

```gcloud app describe```

# SYNOPSIS

**gcloud app** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: deploy, browse, logs, services, etc.

**deploy** [_YAML_]
> Deploy application.

**browse**
> Open app in browser.

**logs tail**
> Stream application logs.

**services list**
> List deployed services.

**versions list**
> List app versions.

**describe**
> Show app information.

**--help**
> Display help information.

# DESCRIPTION

**gcloud app** provides comprehensive management capabilities for Google App Engine applications. App Engine is Google's original Platform-as-a-Service offering, allowing developers to deploy web applications without managing the underlying infrastructure.

The command group handles the complete application lifecycle including deployment from app.yaml configuration files, version management, and traffic routing between multiple versions. This enables zero-downtime deployments and gradual rollouts through traffic splitting.

Monitoring capabilities include streaming logs and viewing application status. The browse command provides quick access to your deployed application in a web browser. gcloud app integrates with other GCP services, making it easy to connect App Engine applications to databases, storage, and other cloud resources.

# CAVEATS

Requires App Engine enabled. Deployments may take time. Costs based on usage.

# HISTORY

gcloud app is part of the **Google Cloud SDK** for managing App Engine, Google's original Platform-as-a-Service offering for running web applications without infrastructure management.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-compute](/man/gcloud-compute)(1)
