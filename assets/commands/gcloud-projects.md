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
> List projects the active account has permission to view.

**create** _PROJECT_ID_ [**--name=**_NAME_] [**--organization=**_ORG_] [**--folder=**_FOLDER_]
> Create a new project. ID must be 6–30 characters, lowercase letters, digits, or hyphens.

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

**update** _PROJECT_ID_
> Update project metadata such as display name or labels.

**move** _PROJECT_ID_ **--organization=**_ORG_ | **--folder=**_FOLDER_
> Move a project to a different organization or folder.

**undelete** _PROJECT_ID_
> Restore a soft-deleted project within the 30-day grace period.

# DESCRIPTION

**gcloud projects** provides commands for managing Google Cloud projects, which serve as the fundamental organizational unit in GCP. Every resource in Google Cloud belongs to exactly one project, and projects provide the basis for billing, access control, and resource isolation.

The command group supports the full project lifecycle including creation, deletion, and restoration of soft-deleted projects. It also handles IAM policy management at the project level, controlling which principals have access to project resources.

Projects contain settings like project ID (immutable), project name (changeable), and project number (assigned by Google). Understanding project management is essential for organizing resources and managing costs in Google Cloud, as billing is tracked per project.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-config](/man/gcloud-config)(1)

