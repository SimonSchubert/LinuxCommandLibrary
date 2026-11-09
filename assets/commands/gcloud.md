# TAGLINE

Google Cloud Platform command-line interface

# TLDR

**Initialize gcloud** and set up configuration

```gcloud init```

**Login to Google** Cloud

```gcloud auth login```

**Set the active project**

```gcloud config set project [project-id]```

**List all projects**

```gcloud projects list```

**Create a Compute Engine VM** instance

```gcloud compute instances create [name] --zone=[zone]```

**List VM** instances

```gcloud compute instances list```

**List only running** instances

```gcloud compute instances list --filter="status=RUNNING"```

**Get credentials** for a GKE cluster, for use with kubectl

```gcloud container clusters get-credentials [cluster] --location=[location]```

**Copy files** to Cloud Storage

```gcloud storage cp [file] gs://[bucket]/```

**Switch** to another named configuration

```gcloud config configurations activate [name]```

**Update** the installed components

```gcloud components update```

**Get application-default** credentials for local development

```gcloud auth application-default login```

**Format output as JSON** for scripting

```gcloud compute instances list --format=json```

# SYNOPSIS

**gcloud** _group_ [_command_] [_options_]

# PARAMETERS

_GROUP_
> Service group: compute, container, iam, sql, storage, functions, run, etc.

**auth**
> Authentication and credential commands.

**config**
> Configuration management.

**compute**
> Compute Engine commands.

**container**
> Kubernetes Engine commands.

**projects**
> Project management.

**--project** _ID_
> Override the default project for this command.

**--format** _FORMAT_
> Output format: config, csv, default, diff, disable, flattened, get, json, list, multi, none, object, table, text, value, yaml.

**--filter** _EXPRESSION_
> Filter results of list commands (e.g. 'name~prod').

**--quiet**, **-q**
> Disable interactive prompts and use defaults.

**--verbosity** _LEVEL_
> Logging verbosity: debug, info, warning, error, critical, none.

**--account** _ACCOUNT_
> Override the default account for this command.

**--region** _REGION_
> Region for commands that operate on regional resources.

**--zone** _ZONE_
> Zone for commands that operate on zonal resources.

**--impersonate-service-account** _EMAIL_
> Run the command as the given service account.

**--billing-project** _ID_
> Project to use for quota and billing.

**--log-http**
> Log all HTTP requests and responses to stderr.

**--configuration** _NAME_
> Use a named configuration instead of the active one.

**--flags-file** _FILE_
> Read flags from a YAML or JSON file.

**--flatten** _KEY_
> Flatten nested list or map output.

**--help**
> Display help information.

# CONFIGURATION

**~/.config/gcloud/configurations/config_default**
> Default configuration properties including project, region, zone, and account settings.

**~/.config/gcloud/credentials.db**
> Credentials database for authenticated accounts.

**~/.config/gcloud/application_default_credentials.json**
> Application default credentials for local development.

# DESCRIPTION

**gcloud** is the Google Cloud Platform CLI for managing cloud resources. It provides commands for all GCP services including Compute Engine, Kubernetes Engine, Cloud SQL, Cloud Run, Cloud Functions, and more.

The tool handles authentication, configuration, and resource management. Commands are organized by service groups with subcommands for specific operations. The **--format** flag is available on all commands, and list commands add **--filter**, **--limit**, **--sort-by** and **--page-size**, which makes them useful for scripting and automation.

Multiple named configurations can be managed with **gcloud config configurations** for switching between projects and accounts.

# CAVEATS

Requires a GCP account and project. Actions may incur costs. Some commands need specific IAM permissions. **gcloud** is part of the Google Cloud CLI (formerly Cloud SDK), which is installed with Google's own installer or package repositories. New Cloud Storage scripts should use **gcloud storage** rather than **gsutil**.

# HISTORY

**gcloud** is part of the **Google Cloud SDK**, first released in **2013** as the primary CLI for Google Cloud Platform administration and automation. It has grown to cover hundreds of GCP services and is continuously updated with new features.

# SEE ALSO

[gsutil](/man/gsutil)(1), [kubectl](/man/kubectl)(1), [bq](/man/bq)(1), [aws](/man/aws)(1), [az](/man/az)(1), [terraform](/man/terraform)(1)

# RESOURCES

```[Homepage](https://cloud.google.com/cli)```

```[Documentation](https://docs.cloud.google.com/sdk/gcloud/reference)```

<!-- verified: 2026-11-09 -->
