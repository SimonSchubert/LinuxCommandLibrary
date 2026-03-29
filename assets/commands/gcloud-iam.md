# TAGLINE

Identity and Access Management for Google Cloud

# TLDR

**List service accounts in the current project**

```gcloud iam service-accounts list```

**Create a service account**

```gcloud iam service-accounts create [name] --display-name="[description]"```

**Create a key for a service account**

```gcloud iam service-accounts keys create [key.json] --iam-account=[email]```

**List keys for a service account**

```gcloud iam service-accounts keys list --iam-account=[email]```

**List all predefined roles**

```gcloud iam roles list```

**Describe a specific role and its permissions**

```gcloud iam roles describe [roles/editor]```

**List grantable roles for a resource**

```gcloud iam list-grantable-roles [//cloudresourcemanager.googleapis.com/projects/my-project]```

# SYNOPSIS

**gcloud iam** _group_ _command_ [_options_]

# PARAMETERS

**service-accounts** _CMD_
> Manage service accounts (create, delete, describe, list, update, add/get/set-iam-policy-binding, keys).

**roles** _CMD_
> Manage IAM roles (create, delete, describe, list, update, copy, undelete).

**policies** _CMD_
> Manage IAM deny policies.

**workload-identity-pools** _CMD_
> Manage workload identity pools for external identity federation.

**list-grantable-roles** _RESOURCE_
> List grantable roles for a given resource.

**--iam-account** _EMAIL_
> Service account email (used with service-accounts keys subcommands).

**--help**
> Display help information.

# DESCRIPTION

**gcloud iam** provides command-line access to Google Cloud's Identity and Access Management system, which controls who (identity) has what access (role) to which resources.

Service accounts represent non-human identities for applications and services. Keys can be created for service accounts to enable authentication from external environments. Roles bundle related permissions into assignable units. IAM policies bind roles to principals (users, groups, or service accounts) on specific resources.

Note that adding role bindings to projects is done via **gcloud projects add-iam-policy-binding**, not through the **gcloud iam** command group directly.

# CAVEATS

IAM changes may take time to propagate. Service account keys are security-sensitive credentials and should be rotated regularly. Role bindings are additive; removing access requires explicit policy modification.

# HISTORY

gcloud iam is part of the **Google Cloud SDK** for managing IAM, Google Cloud's identity and access control system.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-auth](/man/gcloud-auth)(1), [gcloud-config](/man/gcloud-config)(1), [gcloud-projects](/man/gcloud-projects)(1)
