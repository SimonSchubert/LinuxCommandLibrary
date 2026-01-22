# TLDR

**Login interactively**

```gcloud auth login```

**Activate service account**

```gcloud auth activate-service-account --key-file=[key.json]```

**List accounts**

```gcloud auth list```

**Print access token**

```gcloud auth print-access-token```

**Revoke credentials**

```gcloud auth revoke [account]```

# SYNOPSIS

**gcloud auth** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: login, list, revoke, etc.

**login**
> Authenticate with user account.

**activate-service-account**
> Authenticate with service account.

**list**
> List authenticated accounts.

**print-access-token**
> Output current access token.

**revoke** _ACCOUNT_
> Revoke credentials.

**--key-file** _FILE_
> Service account key file.

**--help**
> Display help information.

# DESCRIPTION

**gcloud auth** manages authentication for Google Cloud Platform. It handles user logins, service account activation, and credential management.

The command supports browser-based login for users and key-file authentication for service accounts. Multiple accounts can be configured with one active at a time.

gcloud auth is essential for authorizing CLI access to GCP resources.

# CAVEATS

Browser required for user login. Service account keys are sensitive. Token expiration requires re-authentication.

# HISTORY

gcloud auth is part of the **Google Cloud SDK**, providing unified authentication management for all gcloud commands and GCP API access.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-config](/man/gcloud-config)(1)
