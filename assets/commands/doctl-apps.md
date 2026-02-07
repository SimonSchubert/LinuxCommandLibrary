# TAGLINE

manage DigitalOcean App Platform applications

# TLDR

**List all apps**

```doctl apps list```

**Create app from** spec file

```doctl apps create --spec [app.yaml]```

**Get app details**

```doctl apps get [app_id]```

**Delete an app**

```doctl apps delete [app_id]```

**List app deployments**

```doctl apps list-deployments [app_id]```

**View deployment logs**

```doctl apps logs [app_id]```

**Update app spec**

```doctl apps update [app_id] --spec [app.yaml]```

# SYNOPSIS

**doctl apps** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: list, create, get, delete, update, logs, etc.

**list**
> List all applications.

**create** **--spec** _FILE_
> Create app from specification.

**get** _APP_ID_
> Get application details.

**delete** _APP_ID_
> Delete application.

**list-deployments** _APP_ID_
> List app deployments.

**logs** _APP_ID_
> View application logs.

**--spec** _FILE_
> App specification file (YAML).

**--help**
> Display help information.

# DESCRIPTION

**doctl apps** manages DigitalOcean App Platform applications. App Platform is a Platform-as-a-Service (PaaS) offering that builds, deploys, and scales apps automatically.

The command handles the full app lifecycle: creating apps from specifications, managing deployments, viewing logs, and configuring scaling. App specs define services, workers, static sites, and jobs in YAML format.

App Platform supports various runtimes including Docker, Node.js, Python, Go, and static sites, with automatic builds from Git repositories.

# CAVEATS

App Platform incurs usage charges. Build times vary with app complexity. Some features require specific spec configurations. Deployment rollbacks may need manual intervention.

# HISTORY

doctl apps was added to the DigitalOcean CLI when App Platform launched in **2020**. It provides CLI access to DigitalOcean's managed application hosting platform.

# SEE ALSO

[doctl](/man/doctl)(1), [heroku](/man/heroku)(1)
