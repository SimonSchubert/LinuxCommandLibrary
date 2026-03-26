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

**List running VM** instances

```gcloud compute instances list```

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
> Output format: json, yaml, csv, table, text, value, etc.

**--filter** _EXPRESSION_
> Filter results (e.g. 'name~prod').

**--quiet**, **-q**
> Disable interactive prompts and use defaults.

**--verbosity** _LEVEL_
> Logging verbosity: debug, info, warning, error, critical, none.

**--account** _ACCOUNT_
> Override the default account for this command.

**--region** _REGION_
> Override the default region for this command.

**--zone** _ZONE_
> Override the default zone for this command.

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
> Encrypted credentials database for authenticated accounts.

**~/.config/gcloud/application_default_credentials.json**
> Application default credentials for local development.

# DESCRIPTION

**gcloud** is the Google Cloud Platform CLI for managing cloud resources. It provides commands for all GCP services including Compute Engine, Kubernetes Engine, Cloud SQL, Cloud Run, Cloud Functions, and more.

The tool handles authentication, configuration, and resource management. Commands are organized by service groups with subcommands for specific operations. The **--format** and **--filter** flags are available on all commands for scripting and automation. Output formats include json, yaml, csv, table, text, value, and more.

Multiple named configurations can be managed with **gcloud config configurations** for switching between projects and accounts.

# CAVEATS

Requires a GCP account and project. Actions may incur costs. Some commands need specific IAM permissions. The **gcloud** CLI is part of the Google Cloud SDK, which must be installed separately from most package managers.

# HISTORY

**gcloud** is part of the **Google Cloud SDK**, first released in **2013** as the primary CLI for Google Cloud Platform administration and automation. It has grown to cover hundreds of GCP services and is continuously updated with new features.

# SEE ALSO

[gsutil](/man/gsutil)(1), [kubectl](/man/kubectl)(1), [bq](/man/bq)(1), [aws](/man/aws)(1), [az](/man/az)(1), [terraform](/man/terraform)(1)
