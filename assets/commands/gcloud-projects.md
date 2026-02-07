# TAGLINE

Google Cloud project management

# TLDR

**List projects**

```gcloud projects list```

**Create a project**

```gcloud projects create [project_id]```

**Describe a project**

```gcloud projects describe [project_id]```

**Delete a project**

```gcloud projects delete [project_id]```

**Set IAM policy**

```gcloud projects set-iam-policy [project_id] [policy.json]```

# SYNOPSIS

**gcloud** **projects** _command_ [_options_]

# SUBCOMMANDS

**list**
> List projects.

**create**
> Create a project.

**describe**
> Describe a project.

**delete**
> Delete a project.

**get-iam-policy**
> Get IAM policy.

**set-iam-policy**
> Set IAM policy.

**add-iam-policy-binding**
> Add IAM binding.

**undelete**
> Restore deleted project.

# DESCRIPTION

**gcloud projects** provides commands for managing Google Cloud projects, which serve as the fundamental organizational unit in GCP. Every resource in Google Cloud belongs to exactly one project, and projects provide the basis for billing, access control, and resource isolation.

The command group supports the full project lifecycle including creation, deletion, and restoration of soft-deleted projects. It also handles IAM policy management at the project level, controlling which principals have access to project resources.

Projects contain settings like project ID (immutable), project name (changeable), and project number (assigned by Google). Understanding project management is essential for organizing resources and managing costs in Google Cloud, as billing is tracked per project.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-config](/man/gcloud-config)(1)

