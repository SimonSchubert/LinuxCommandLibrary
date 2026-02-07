# TAGLINE

Manage federated identity pools for AWS resource access.

# TLDR

**List identity pools** in the current region

```aws cognito-identity list-identity-pools --max-results [20]```

**Create a new identity pool**

```aws cognito-identity create-identity-pool --identity-pool-name [pool_name] --allow-unauthenticated-identities```

**Describe an identity pool** by ID

```aws cognito-identity describe-identity-pool --identity-pool-id [region:pool-id]```

**Get an identity ID** for unauthenticated access

```aws cognito-identity get-id --identity-pool-id [region:pool-id]```

**Get temporary AWS credentials** for an identity

```aws cognito-identity get-credentials-for-identity --identity-id [region:identity-id]```

**Delete an identity pool**

```aws cognito-identity delete-identity-pool --identity-pool-id [region:pool-id]```

**Link a login provider** to an existing identity

```aws cognito-identity get-id --identity-pool-id [region:pool-id] --logins [provider]=[token]```

# SYNOPSIS

**aws cognito-identity** _subcommand_ [_options_]

# DESCRIPTION

**aws cognito-identity** is a subcommand of the AWS CLI that manages Amazon Cognito Identity Pools (Federated Identities). It provides temporary AWS credentials to users authenticated through identity providers like Amazon, Facebook, Google, SAML, or Cognito User Pools.

Identity pools map user identities to IAM roles, enabling secure access to AWS services from mobile apps and web applications. Each identity pool can support both authenticated and unauthenticated (guest) access with different IAM permissions.

The service issues unique identity IDs and vends temporary AWS credentials through the STS service, allowing fine-grained access control without embedding long-term credentials in applications.

# PARAMETERS

**list-identity-pools**
> List all identity pools for the account.

**create-identity-pool**
> Create a new identity pool with specified settings.

**describe-identity-pool**
> Get details about an identity pool.

**update-identity-pool**
> Modify identity pool configuration.

**delete-identity-pool**
> Remove an identity pool.

**get-id**
> Get or create an identity ID for a user.

**get-credentials-for-identity**
> Get temporary AWS credentials for an identity.

**get-open-id-token**
> Get an OpenID token for an identity.

**get-open-id-token-for-developer-identity**
> Get token for developer-authenticated identity.

**--identity-pool-id** _id_
> The identity pool ID (format: region:uuid).

**--identity-pool-name** _name_
> Name for the identity pool.

**--allow-unauthenticated-identities**
> Enable guest access without authentication.

**--no-allow-unauthenticated-identities**
> Disable guest access.

**--logins** _map_
> Map of provider names to tokens for authentication.

**--max-results** _number_
> Maximum number of results to return.

# CAVEATS

Identity pool IDs include the region prefix (e.g., us-east-1:xxxxxxxx). Credentials expire after 1 hour by default. Requires IAM roles to be configured for both authenticated and unauthenticated access. Do not confuse Cognito Identity Pools with Cognito User Pools, which handle user registration and sign-in directly.

# HISTORY

Amazon Cognito Identity was announced at **AWS re:Invent 2014** and launched in **July 2014** as part of the mobile services suite. It was designed to simplify secure access to AWS resources from mobile applications. The service evolved to support additional identity providers, SAML federation, and enhanced flow for developer-authenticated identities.

# SEE ALSO

[aws](/man/aws)(1), [aws-cognito-idp](/man/aws-cognito-idp)(1), [aws-sts](/man/aws-sts)(1), [aws-iam](/man/aws-iam)(1)
