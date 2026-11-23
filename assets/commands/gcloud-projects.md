# TAGLINE

Google Cloud project management

# TLDR

**List projects**

```gcloud projects list```

**List projects** matching a filter

```gcloud projects list --filter="name:[my-app*]" --format="value(projectId)"```

**Create a project**

```gcloud projects create [project_id]```

**Create a project** under a folder with a display name and set it as the default

```gcloud projects create [project_id] --name="[My Project]" --folder=[folder_id] --set-as-default```

**Describe a project**

```gcloud projects describe [project_id]```

**Delete a project**

```gcloud projects delete [project_id]```

**Restore** a project scheduled for deletion

```gcloud projects undelete [project_id]```

**Grant a role** to a user

```gcloud projects add-iam-policy-binding [project_id] --member="user:[email]" --role="[roles/viewer]"```

**Show the IAM policy**

```gcloud projects get-iam-policy [project_id]```

**Set IAM policy**

```gcloud projects set-iam-policy [project_id] [policy.json]```

# SYNOPSIS

**gcloud** **projects** _command_ [_options_]

# SUBCOMMANDS

**list** [**--filter=**_EXPR_] [**--sort-by=**_FIELD_] [**--limit=**_N_]
> List projects the active account has permission to view.

**create** _PROJECT_ID_ [**--name=**_NAME_] [**--organization=**_ORG_] [**--folder=**_FOLDER_] [**--labels=**_KEY=VALUE_] [**--set-as-default**]
> Create a new project. The ID must be 6-30 characters, start with a lowercase letter, and contain only lowercase letters, digits, or hyphens. It cannot be changed later.

**describe** _PROJECT_ID_
> Show metadata (name, number, lifecycle state, labels) for a project.

**delete** _PROJECT_ID_
> Mark a project for deletion (it is soft-deleted for 30 days before permanent removal).

**get-iam-policy** _PROJECT_ID_
> Print the IAM policy attached to the project.

**set-iam-policy** _PROJECT_ID_ _POLICY_FILE_
> Replace the IAM policy with the one defined in the JSON or YAML file.

**add-iam-policy-binding** _PROJECT_ID_ **--member=**_MEMBER_ **--role=**_ROLE_
> Add a single member/role binding to the project's IAM policy.

**remove-iam-policy-binding** _PROJECT_ID_ **--member=**_MEMBER_ **--role=**_ROLE_
> Remove a member/role binding from the project's IAM policy.

**update** _PROJECT_ID_ **--name=**_NAME_
> Change the display name of a project.

**get-ancestors** _PROJECT_ID_
> List the folders and organization above the project in the resource hierarchy.

**get-ancestors-iam-policy** _PROJECT_ID_
> Print the IAM policies of the project and all of its ancestors.

**undelete** _PROJECT_ID_
> Restore a soft-deleted project within the 30-day grace period.

**beta move** _PROJECT_ID_ **--organization=**_ORG_ | **--folder=**_FOLDER_
> Move a project to a different organization or folder (only available as **gcloud beta projects move** or **gcloud alpha projects move**).

# DESCRIPTION

**gcloud projects** provides commands for managing Google Cloud projects, which serve as the fundamental organizational unit in GCP. Every resource in Google Cloud belongs to exactly one project, and projects provide the basis for billing, access control, and resource isolation.

The command group supports the full project lifecycle including creation, deletion, and restoration of soft-deleted projects. It also handles IAM policy management at the project level, controlling which principals have access to project resources.

Projects contain settings like project ID (immutable), project name (changeable), and project number (assigned by Google). Understanding project management is essential for organizing resources and managing costs in Google Cloud, as billing is tracked per project.

# CAVEATS

**set-iam-policy** replaces the entire policy, so a stale file can remove existing bindings; prefer **add-iam-policy-binding** and **remove-iam-policy-binding** for single changes. A deleted project keeps its project ID reserved and cannot be reused, even after permanent removal.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-config](/man/gcloud-config)(1), [gcloud-iam](/man/gcloud-iam)(1)

# RESOURCES

```[Homepage](https://cloud.google.com/sdk)```

```[Documentation](https://docs.cloud.google.com/sdk/gcloud/reference/projects)```

<!-- verified: 2026-11-23 -->
