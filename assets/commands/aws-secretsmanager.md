# TAGLINE

Store and manage secrets securely

# TLDR

**Create a new secret**

```aws secretsmanager create-secret --name [secret-name] --secret-string "[secret-value]"```

**Get the value** of a secret

```aws secretsmanager get-secret-value --secret-id [secret-name]```

**List all secrets**

```aws secretsmanager list-secrets```

**Update a secret** value

```aws secretsmanager put-secret-value --secret-id [secret-name] --secret-string "[new-value]"```

**Delete a secret** (with recovery window)

```aws secretsmanager delete-secret --secret-id [secret-name] --recovery-window-in-days [7]```

**Delete a secret immediately** (no recovery)

```aws secretsmanager delete-secret --secret-id [secret-name] --force-delete-without-recovery```

**Rotate a secret**

```aws secretsmanager rotate-secret --secret-id [secret-name]```

**Generate a random password**

```aws secretsmanager get-random-password --password-length [32]```

# SYNOPSIS

**aws secretsmanager** _subcommand_ [_options_]

# DESCRIPTION

**aws secretsmanager** is the AWS CLI interface for Amazon Secrets Manager, a service for securely storing, managing, and retrieving secrets such as database credentials, API keys, and other sensitive information.

Secrets Manager enables automatic rotation of secrets, fine-grained access control through IAM policies, and audit logging via CloudTrail. It supports replication across regions for disaster recovery.

# SUBCOMMANDS

**Secret Management**
> create-secret, delete-secret, describe-secret, get-secret-value, put-secret-value, update-secret, restore-secret

**Listing**
> list-secrets, list-secret-version-ids

**Rotation**
> rotate-secret, cancel-rotate-secret

**Replication**
> replicate-secret-to-regions, remove-regions-from-replication, stop-replication-to-replica

**Access Control**
> get-resource-policy, put-resource-policy, delete-resource-policy, validate-resource-policy

**Tagging**
> tag-resource, untag-resource

**Utilities**
> get-random-password, batch-get-secret-value, update-secret-version-stage

# CAVEATS

Deleted secrets enter a recovery window (default 30 days) before permanent deletion; use **--force-delete-without-recovery** to skip this. Secret values have a 64KB size limit. Automatic rotation requires a Lambda function. Secrets Manager charges per secret per month plus per API call.

# HISTORY

AWS Secrets Manager was launched in **April 2018** to provide a centralized secrets management service with built-in rotation capabilities. It replaced ad-hoc solutions like storing secrets in environment variables, configuration files, or Parameter Store.

# SEE ALSO

[aws](/man/aws)(1), [aws-ssm](/man/aws-ssm)(1), [vault](/man/vault)(1)
