# TLDR

**Get the identity** of the current caller

```aws sts get-caller-identity```

**Assume an IAM role**

```aws sts assume-role --role-arn [arn:aws:iam::account:role/role-name] --role-session-name [session-name]```

**Get temporary session credentials**

```aws sts get-session-token --duration-seconds [3600]```

**Assume a role with MFA**

```aws sts assume-role --role-arn [arn:aws:iam::account:role/role-name] --role-session-name [session-name] --serial-number [arn:aws:iam::account:mfa/device] --token-code [123456]```

**Get account ID** from an access key

```aws sts get-access-key-info --access-key-id [AKIAIOSFODNN7EXAMPLE]```

**Decode an authorization error message**

```aws sts decode-authorization-message --encoded-message [encoded-message]```

# SYNOPSIS

**aws sts** _subcommand_ [_options_]

# DESCRIPTION

**aws sts** is the AWS CLI interface for AWS Security Token Service (STS), which enables you to request temporary, limited-privilege credentials for IAM users or federated users.

STS is essential for cross-account access, identity federation, and implementing least-privilege security. Temporary credentials include an access key, secret key, and session token with configurable expiration.

# SUBCOMMANDS

**Identity**
> get-caller-identity, get-access-key-info

**Role Assumption**
> assume-role, assume-role-with-saml, assume-role-with-web-identity, assume-root

**Temporary Credentials**
> get-session-token, get-federation-token

**Federation**
> get-web-identity-token, get-delegated-access-token

**Troubleshooting**
> decode-authorization-message

# PARAMETERS

**--role-arn** _value_
> The ARN of the role to assume

**--role-session-name** _value_
> An identifier for the assumed role session

**--duration-seconds** _value_
> Duration of the temporary credentials (900-43200 seconds)

**--serial-number** _value_
> The ARN of the MFA device for MFA-protected operations

**--token-code** _value_
> The value from the MFA device

**--external-id** _value_
> A unique identifier for cross-account access

# CAVEATS

Temporary credentials have a maximum duration of 12 hours for role assumption (1 hour default). MFA-protected role assumptions require both **--serial-number** and **--token-code**. Chained role assumptions (assuming a role from an assumed role) have a maximum duration of 1 hour.

# HISTORY

AWS STS has been available since the launch of IAM in **May 2011**, enabling temporary security credentials for AWS services. It has expanded to support web identity federation, SAML 2.0, and various assume-role scenarios.

# SEE ALSO

[aws](/man/aws)(1), [aws-iam](/man/aws-iam)(1), [aws-sso](/man/aws-sso)(1)
