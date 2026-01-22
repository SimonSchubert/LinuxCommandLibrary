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

**gcloud iam** manages Identity and Access Management for Google Cloud. It handles service accounts, roles, and permissions for controlling access to GCP resources.

The command creates and manages service accounts for application authentication. It also manages IAM policies that grant permissions to principals.

gcloud iam is essential for implementing least-privilege security in GCP.

# CAVEATS

IAM changes may take time to propagate. Service account keys are sensitive. Role bindings are additive.

# HISTORY

gcloud iam is part of the **Google Cloud SDK** for managing IAM, Google Cloud's identity and access control system.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-auth](/man/gcloud-auth)(1)
