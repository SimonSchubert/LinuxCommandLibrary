# TAGLINE

Store and manage secrets securely

# TLDR

**Create a new secret**

```aws secretsmanager create-secret --name [secret_name] --secret-string "[secret_value]"```

**Retrieve a secret value**

```aws secretsmanager get-secret-value --secret-id [secret_name]```

**List all secrets**

```aws secretsmanager list-secrets```

**Update a secret value**

```aws secretsmanager put-secret-value --secret-id [secret_name] --secret-string "[new_value]"```

**Delete a secret** (with recovery window)

```aws secretsmanager delete-secret --secret-id [secret_name] --recovery-window-in-days [30]```

**Delete immediately** without recovery

```aws secretsmanager delete-secret --secret-id [secret_name] --force-delete-without-recovery```

**Restore a deleted secret**

```aws secretsmanager restore-secret --secret-id [secret_name]```

**Rotate a secret**

```aws secretsmanager rotate-secret --secret-id [secret_name]```

# SYNOPSIS

**aws secretsmanager** _command_ [_options_]

# PARAMETERS

**create-secret**
> Create a new secret.

**get-secret-value**
> Retrieve the encrypted value of a secret.

**list-secrets**
> List secrets in the account.

**put-secret-value**
> Store a new value for an existing secret.

**update-secret**
> Update secret metadata or value.

**delete-secret**
> Mark a secret for deletion.

**restore-secret**
> Restore a previously deleted secret.

**rotate-secret**
> Trigger secret rotation.

**describe-secret**
> Get metadata about a secret.

**--secret-id** _id_
> Secret name or ARN.

**--secret-string** _value_
> Secret value as a string.

**--secret-binary** _blob_
> Secret value as base64-encoded binary.

**--kms-key-id** _key_
> KMS key for encryption (optional).

**--recovery-window-in-days** _days_
> Waiting period before permanent deletion (7-30 days).

# DESCRIPTION

**AWS Secrets Manager** is a service for securely storing and managing sensitive information like database credentials, API keys, and passwords. The **aws secretsmanager** commands provide CLI access to create, retrieve, rotate, and manage secrets.

Secrets are encrypted at rest using AWS KMS and can be automatically rotated on a schedule using Lambda functions. Access is controlled through IAM policies, and all access is logged to CloudTrail for auditing.

Secrets can store strings up to 64KB, supporting JSON for structured data like database credentials. Applications retrieve secrets at runtime, eliminating hardcoded credentials in code or configuration files.

# CAVEATS

Retrieving secrets incurs per-request charges. Deleted secrets have a recovery window by default; use **--force-delete-without-recovery** cautiously. Automatic rotation requires a configured Lambda function. Cross-region replication requires explicit configuration. Secrets Manager is separate from Systems Manager Parameter Store (another secrets option).

# HISTORY

AWS Secrets Manager was launched in **April 2018** to address the challenge of managing application secrets securely. It was built on lessons learned from AWS Systems Manager Parameter Store, adding features like automatic rotation, cross-region replication, and native integration with RDS, Redshift, and DocumentDB for credential management.

# SEE ALSO

[aws](/man/aws)(1), [vault](/man/vault)(1), [aws-vault](/man/aws-vault)(1)
