# TAGLINE

Acquire AWS credentials via Google Workspace SSO

# TLDR

**Authenticate and get AWS credentials** using Google SSO

```aws-google-auth```

**Authenticate with a specific profile**

```aws-google-auth -p [profile-name]```

**Authenticate with explicit Google IDP and SP IDs**

```aws-google-auth -I [google-idp-id] -S [google-sp-id] -u [user@domain.com]```

**Authenticate and assume a specific role**

```aws-google-auth -R [arn:aws:iam::account:role/role-name]```

**Set credential duration** in seconds

```aws-google-auth -d [3600]```

**Authenticate using environment variables**

```GOOGLE_USERNAME=[user@domain.com] GOOGLE_IDP_ID=[abc123] GOOGLE_SP_ID=[xyz789] aws-google-auth```

# SYNOPSIS

**aws-google-auth** [**-h**] [**-u** _username_] [**-I** _idp-id_] [**-S** _sp-id_] [**-R** _role-arn_] [**-d** _duration_] [**-p** _profile_]

# DESCRIPTION

**aws-google-auth** is a command-line tool that acquires AWS temporary (STS) credentials using Google Workspace (formerly G Suite) as a federated SAML identity provider. It enables single sign-on (SSO) from Google accounts to AWS.

The tool authenticates against Google, retrieves a SAML assertion, and exchanges it for AWS temporary credentials stored in the AWS credentials file. It supports MFA including TOTP and U2F security keys.

# PARAMETERS

**-u, --username**
> Google account email address

**-I, --idp-id**
> Google Identity Provider ID

**-S, --sp-id**
> Google Service Provider ID for AWS

**-R, --role-arn**
> AWS IAM role ARN to assume

**-d, --duration**
> Credential duration in seconds (default: 3600)

**-p, --profile**
> AWS profile name to store credentials

**-a, --ask-role**
> Prompt for role selection even if only one available

**--no-cache**
> Disable caching of IDP and SP IDs

# CONFIGURATION

**~/.aws/credentials**
> Stores temporary AWS credentials obtained after authentication.

**~/.aws/config**
> AWS profile configuration including region and output format. Profile-specific google_config.google_idp_id and google_config.google_sp_id can be set here.

# CAVEATS

Requires SAML SSO configuration between Google Workspace and AWS IAM. U2F security keys do not work in Docker containers due to USB device access limitations. The Google IDP and SP IDs must be obtained from the Google Admin console under SAML Apps settings.

# HISTORY

Created by **Cevo Australia** as an open-source tool to bridge Google Workspace authentication with AWS. First released around **2017** to address the need for Google-based SSO to AWS accounts. Available via PyPI and Docker Hub.

# SEE ALSO

[aws](/man/aws)(1), [aws-sts](/man/aws-sts)(1), [saml2aws](/man/saml2aws)(1)
