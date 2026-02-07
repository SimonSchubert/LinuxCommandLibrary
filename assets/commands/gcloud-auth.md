# TAGLINE

Google Cloud authentication management

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

**gcloud auth** manages authentication and authorization for Google Cloud Platform access. All gcloud operations require valid credentials, which this command group provides and maintains.

For interactive use, the login command initiates a browser-based OAuth flow where you authenticate with your Google account. For automation and server environments, service accounts can be activated using JSON key files, providing non-interactive authentication suitable for CI/CD pipelines.

The command supports multiple concurrent authenticated accounts, allowing you to switch between different Google accounts or between user accounts and service accounts. Only one account is active at a time, but switching is quick and preserves all credentials. Access tokens can be printed for use with external tools that need to authenticate to Google Cloud APIs.

# CAVEATS

Browser required for user login. Service account keys are sensitive. Token expiration requires re-authentication.

# HISTORY

gcloud auth is part of the **Google Cloud SDK**, providing unified authentication management for all gcloud commands and GCP API access.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-config](/man/gcloud-config)(1)
