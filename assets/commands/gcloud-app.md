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

**gcloud app** manages Google App Engine applications. It handles deployment, monitoring, and management of serverless applications running on App Engine.

The command group supports deploying from app.yaml configurations, viewing logs, managing versions, and controlling traffic splitting between versions.

gcloud app provides CLI access to all App Engine features.

# CAVEATS

Requires App Engine enabled. Deployments may take time. Costs based on usage.

# HISTORY

gcloud app is part of the **Google Cloud SDK** for managing App Engine, Google's original Platform-as-a-Service offering for running web applications without infrastructure management.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-compute](/man/gcloud-compute)(1)
