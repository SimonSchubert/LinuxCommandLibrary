# TAGLINE

Google App Engine management commands

# TLDR

**Create** an App Engine app in the current project (once per project, region cannot be changed later)

```gcloud app create --region=[us-central1]```

**Deploy** the app described by app.yaml in the current directory

```gcloud app deploy```

**Deploy a new version without sending traffic** to it

```gcloud app deploy [app.yaml] --version=[v2] --no-promote```

**Browse deployed app**

```gcloud app browse```

**Stream logs** of a service

```gcloud app logs tail -s [default]```

**List services**

```gcloud app services list```

**Describe app**

```gcloud app describe```

**Split traffic between versions**

```gcloud app services set-traffic [service] --splits=[v1=0.5,v2=0.5]```

**List versions** of all services

```gcloud app versions list```

**Delete a version**

```gcloud app versions delete [version-id] --service=[service]```

# SYNOPSIS

**gcloud app** _command_ [_options_]

# PARAMETERS

**create** **--region**=_REGION_
> Create an App Engine application within the current project.

**deploy** [_DEPLOYABLES_...]
> Deploy local code and/or configuration (app.yaml, dispatch.yaml, cron.yaml, ...).

**--version**=_VERSION_, **-v** _VERSION_
> (deploy) Version ID to use instead of a generated one.

**--no-promote**
> (deploy) Do not route all traffic to the new version.

**--stop-previous-version**
> (deploy) Stop the previously running version once the new one serves traffic. Has no effect on auto-scaled standard services.

**browse**
> Open the current app in a web browser.

**describe**
> Display all data about the existing application.

**open-console**
> Open the App Engine dashboard or log viewer in a browser.

**update**
> Update application settings such as **--split-health-checks** or **--service-account**.

**logs tail** | **logs read**
> Stream or read application logs.

**services** list | describe | browse | set-traffic | delete
> Manage services and traffic splitting.

**versions** list | describe | browse | start | stop | migrate | delete
> Manage deployed versions.

**instances**, **domain-mappings**, **firewall-rules**, **ssl-certificates**, **operations**, **regions**, **runtimes**
> Further command groups for managing the application.

**--project**=_PROJECT_
> Global flag selecting the Google Cloud project.

**--help**
> Display help information.

# DESCRIPTION

**gcloud app** provides comprehensive management capabilities for Google App Engine applications. App Engine is Google's original Platform-as-a-Service offering, allowing developers to deploy web applications without managing the underlying infrastructure.

The command group handles the complete application lifecycle including deployment from app.yaml configuration files, version management, and traffic routing between multiple versions. This enables zero-downtime deployments and gradual rollouts through traffic splitting.

Monitoring capabilities include streaming logs and viewing application status. The browse command provides quick access to your deployed application in a web browser. gcloud app integrates with other GCP services, making it easy to connect App Engine applications to databases, storage, and other cloud resources.

# CAVEATS

An app must first be created with **gcloud app create**, and its region cannot be changed afterwards. Each project has at most one App Engine application. Old versions are kept until deleted and can incur costs if they keep running.

# HISTORY

gcloud app is part of the **Google Cloud SDK** for managing App Engine, Google's original Platform-as-a-Service offering for running web applications without infrastructure management.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-compute](/man/gcloud-compute)(1)

# RESOURCES

```[Homepage](https://cloud.google.com/appengine)```

```[Documentation](https://docs.cloud.google.com/sdk/gcloud/reference/app)```

<!-- verified: 2026-11-23 -->
