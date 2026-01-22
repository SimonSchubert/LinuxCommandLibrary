# TLDR

**Create a new IAM user**

```aws iam create-user --user-name [my-user]```

**Create access keys** for a user

```aws iam create-access-key --user-name [my-user]```

**Attach a policy** to a user

```aws iam attach-user-policy --user-name [my-user] --policy-arn [arn:aws:iam::aws:policy/ReadOnlyAccess]```

**Create a role** with a trust policy

```aws iam create-role --role-name [my-role] --assume-role-policy-document file://[trust-policy.json]```

**List all users** in the account

```aws iam list-users```

**Create a group** and add a user

```aws iam create-group --group-name [developers] && aws iam add-user-to-group --user-name [my-user] --group-name [developers]```

**Generate a credential report**

```aws iam generate-credential-report && aws iam get-credential-report --output text --query Content | base64 -d```

# SYNOPSIS

**aws iam** _command_ [_options_]

# DESCRIPTION

**aws iam** is the AWS CLI interface for AWS Identity and Access Management (IAM), the service for controlling access to AWS resources. IAM enables creating users, groups, roles, and policies to manage authentication and authorization.

IAM is global (not region-specific) and provides fine-grained access control through JSON policies. It supports identity federation with SAML 2.0 and OIDC providers, and multi-factor authentication for enhanced security.

# COMMANDS

**create-user**
> Create a new IAM user

**delete-user**
> Remove a user

**create-access-key**
> Generate access key credentials

**create-role**
> Create a role for service or cross-account access

**attach-user-policy**
> Attach a managed policy to a user

**attach-role-policy**
> Attach a managed policy to a role

**create-policy**
> Create a custom managed policy

**create-group**
> Create a user group

**add-user-to-group**
> Add user to a group

**list-users**
> List all IAM users

**get-user**
> Get user details

**simulate-principal-policy**
> Test policy permissions

# CAVEATS

Policy changes can take several seconds to propagate. The root account should never be used for daily operations. Access keys should be rotated regularly. IAM has a limit of 5000 users per account. Inline policies are harder to audit than managed policies.

# HISTORY

AWS IAM launched in **May 2010** as the access control system for AWS. Roles were introduced in **2012** for cross-account and service access. Policy conditions expanded significantly over the years, and IAM Identity Center (formerly SSO) was added in **2017** for centralized access management.

# SEE ALSO

[aws](/man/aws)(1), [aws-sts](/man/aws-sts)(1), [aws-organizations](/man/aws-organizations)(1)
