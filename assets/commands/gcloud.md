# TLDR

**Initialize gcloud**

```gcloud init```

**Login to Google** Cloud

```gcloud auth login```

**Set project**

```gcloud config set project [project-id]```

**List projects**

```gcloud projects list```

**Create VM instance**

```gcloud compute instances create [name] --zone=[zone]```

# SYNOPSIS

**gcloud** _group_ [_command_] [_options_]

# PARAMETERS

_GROUP_
> Service group: compute, container, iam, sql, etc.

**auth**
> Authentication commands.

**config**
> Configuration management.

**compute**
> Compute Engine commands.

**container**
> Kubernetes Engine commands.

**projects**
> Project management.

**--project** _ID_
> Override project.

**--help**
> Display help information.

# DESCRIPTION

**gcloud** is the Google Cloud Platform CLI for managing cloud resources. It provides commands for all GCP services including Compute Engine, Kubernetes Engine, Cloud SQL, and more.

The tool handles authentication, configuration, and resource management. Commands are organized by service groups with subcommands for specific operations.

gcloud enables infrastructure automation and management without the web console.

# CAVEATS

Requires GCP account and project. Actions may incur costs. Some commands need specific permissions.

# HISTORY

gcloud is part of the **Google Cloud SDK**, providing CLI access to Google Cloud Platform services. It's the primary tool for GCP administration and automation.

# SEE ALSO

[gsutil](/man/gsutil)(1), [kubectl](/man/kubectl)(1), [bq](/man/bq)(1)
