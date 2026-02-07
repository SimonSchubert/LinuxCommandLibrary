# TAGLINE

Identity and Access Management for Google Cloud

# TLDR

**List service accounts**

```gcloud iam service-accounts list```

**Create service account**

```gcloud iam service-accounts create [name] --display-name="[description]"```

**Create key**

```gcloud iam service-accounts keys create [key.json] --iam-account=[email]```

**Add role binding**

```gcloud projects add-iam-policy-binding [project] --member=[member] --role=[role]```

**List roles**

```gcloud iam roles list```

# SYNOPSIS

**gcloud iam** _resource_ _command_ [_options_]

# PARAMETERS

_RESOURCE_
> Resource type: service-accounts, roles, policies.

**service-accounts** _CMD_
> Service account management.

**roles** _CMD_
> IAM role operations.

**policies** _CMD_
> IAM policy management.

**--iam-account** _EMAIL_
> Service account email.

**--help**
> Display help information.

# DESCRIPTION

**gcloud iam** provides command-line access to Google Cloud's Identity and Access Management system, which controls who (identity) has what access (role) to which resources. IAM is fundamental to GCP security, implementing fine-grained access control across all cloud resources.

Service accounts are a key IAM concept, representing non-human identities for applications and services. Unlike user accounts, service accounts can be granted to VMs and applications, allowing them to authenticate to Google Cloud APIs. Keys can be created for service accounts to enable authentication from external environments.

Roles bundle related permissions into assignable units. IAM policies bind roles to principals (users, groups, or service accounts) on specific resources. The command supports listing available roles, viewing role permissions, creating custom roles, and managing policy bindings at various resource levels including project, organization, and individual resource scopes. Proper IAM configuration is critical for implementing least-privilege access and maintaining security compliance.

# CAVEATS

IAM changes may take time to propagate. Service account keys are sensitive. Role bindings are additive.

# HISTORY

gcloud iam is part of the **Google Cloud SDK** for managing IAM, Google Cloud's identity and access control system.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-auth](/man/gcloud-auth)(1)
