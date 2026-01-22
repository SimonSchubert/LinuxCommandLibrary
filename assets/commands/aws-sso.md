# TLDR

**Log in** to AWS SSO

```aws sso login --profile [profile-name]```

**Log out** from AWS SSO

```aws sso logout```

**List AWS accounts** available to the user

```aws sso list-accounts --access-token [token]```

**List roles** available in an account

```aws sso list-account-roles --account-id [account-id] --access-token [token]```

**Get temporary credentials** for a role

```aws sso get-role-credentials --account-id [account-id] --role-name [role-name] --access-token [token]```

# SYNOPSIS

**aws sso** _subcommand_ [_options_]

# DESCRIPTION

**aws sso** is the AWS CLI interface for AWS IAM Identity Center (formerly AWS Single Sign-On), enabling federated access to AWS accounts and applications through a centralized identity source.

The SSO commands allow users to authenticate once and access multiple AWS accounts and applications without managing separate credentials for each account.

# SUBCOMMANDS

**login**
> Initiate SSO login through the browser to obtain an access token

**logout**
> Terminate the current SSO session and invalidate cached credentials

**list-accounts**
> List AWS accounts available to the authenticated user

**list-account-roles**
> List IAM roles available in a specific AWS account

**get-role-credentials**
> Retrieve temporary AWS credentials for assuming a role

# CAVEATS

SSO login requires browser access for the authorization flow. The access token is cached locally and has a limited lifetime (typically 8-12 hours). You must configure an SSO profile in your AWS config file before using **aws sso login**. The API namespace retains the name "sso" for backward compatibility even though the service was renamed to IAM Identity Center.

# HISTORY

AWS Single Sign-On launched in **December 2017** to simplify access management across AWS accounts. It was renamed to **AWS IAM Identity Center** in **July 2022** to better reflect its integration with IAM and its expanded capabilities.

# SEE ALSO

[aws](/man/aws)(1), [aws-sts](/man/aws-sts)(1), [aws-iam](/man/aws-iam)(1)
