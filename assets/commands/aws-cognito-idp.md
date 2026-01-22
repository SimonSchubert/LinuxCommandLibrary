# TLDR

**Create a new user pool**

```aws cognito-idp create-user-pool --pool-name [my-pool]```

**Create a user** in a user pool

```aws cognito-idp admin-create-user --user-pool-id [pool-id] --username [user@example.com]```

**List all users** in a user pool

```aws cognito-idp list-users --user-pool-id [pool-id]```

**Initiate authentication** for a user

```aws cognito-idp admin-initiate-auth --user-pool-id [pool-id] --client-id [client-id] --auth-flow ADMIN_USER_PASSWORD_AUTH --auth-parameters USERNAME=[username],PASSWORD=[password]```

**Create a user pool client** for an application

```aws cognito-idp create-user-pool-client --user-pool-id [pool-id] --client-name [my-app]```

**Set a user's password** permanently

```aws cognito-idp admin-set-user-password --user-pool-id [pool-id] --username [user@example.com] --password [NewPassword123!] --permanent```

**Add a user to a group**

```aws cognito-idp admin-add-user-to-group --user-pool-id [pool-id] --username [user@example.com] --group-name [admins]```

# SYNOPSIS

**aws cognito-idp** _command_ [_options_]

# DESCRIPTION

**aws cognito-idp** is the AWS CLI interface for Amazon Cognito User Pools, a user directory service for web and mobile app authentication. It handles user registration, authentication, account recovery, and integration with external identity providers like Google, Facebook, and SAML-based systems.

Cognito User Pools provides features including multi-factor authentication, password policies, email/SMS verification, and OAuth 2.0 token issuance. It can be used for both server-side administration and client-side user flows.

# COMMANDS

**create-user-pool**
> Create a new user pool

**admin-create-user**
> Create a user as an administrator

**admin-delete-user**
> Delete a user from the pool

**list-users**
> List users in a user pool

**admin-initiate-auth**
> Start server-side authentication

**admin-respond-to-auth-challenge**
> Respond to authentication challenges (MFA, new password)

**admin-set-user-password**
> Set or reset a user's password

**create-group**
> Create a user group

**admin-add-user-to-group**
> Add a user to a group

**create-user-pool-client**
> Create an app client for authentication

# CAVEATS

User pool configuration cannot be changed after creation for some settings like username attributes. Tokens issued by Cognito have a maximum lifetime of 24 hours for access tokens. Custom authentication lambdas add latency to sign-in flows. SMS-based MFA incurs additional SNS charges.

# HISTORY

Amazon Cognito User Pools launched in **July 2016** as a managed user directory. It built upon Cognito Identity (federated identities) which launched in **2014**. Advanced security features including adaptive authentication were added in **2017**, and WebAuthn/passkey support was introduced in **2023**.

# SEE ALSO

[aws](/man/aws)(1), [aws-cognito-identity](/man/aws-cognito-identity)(1), [aws-iam](/man/aws-iam)(1)
