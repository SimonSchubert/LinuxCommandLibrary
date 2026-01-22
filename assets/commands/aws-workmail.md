# TLDR

**List all organizations**

```aws workmail list-organizations```

**Describe an organization**

```aws workmail describe-organization --organization-id [m-1234567890abcdef0]```

**List users** in an organization

```aws workmail list-users --organization-id [m-1234567890abcdef0]```

**Create a user**

```aws workmail create-user --organization-id [m-1234567890abcdef0] --name [username] --display-name "[Display Name]" --password [password]```

**Reset a user password**

```aws workmail reset-password --organization-id [m-1234567890abcdef0] --user-id [user-id] --password [new-password]```

**List groups** in an organization

```aws workmail list-groups --organization-id [m-1234567890abcdef0]```

**List mail domains**

```aws workmail list-mail-domains --organization-id [m-1234567890abcdef0]```

# SYNOPSIS

**aws workmail** _subcommand_ [_options_]

# DESCRIPTION

**aws workmail** is the AWS CLI interface for Amazon WorkMail, a secure, managed business email and calendaring service. WorkMail supports existing desktop and mobile email clients including Microsoft Outlook, iOS, and Android applications.

The CLI provides management capabilities for WorkMail organizations, users, groups, resources (meeting rooms, equipment), mail domains, and mobile device access policies.

# SUBCOMMANDS

**Organization Management**
> create-organization, delete-organization, describe-organization, list-organizations

**User Management**
> create-user, delete-user, describe-user, list-users, update-user, reset-password, register-to-work-mail, deregister-from-work-mail

**Group Management**
> create-group, delete-group, describe-group, list-groups, associate-member-to-group, disassociate-member-from-group, list-group-members

**Resource Management**
> create-resource, delete-resource, describe-resource, list-resources, update-resource

**Mail Domains**
> register-mail-domain, deregister-mail-domain, get-mail-domain, list-mail-domains

**Aliases**
> create-alias, delete-alias, list-aliases, update-primary-email-address

**Access Control**
> create-access-control-rule, delete-access-control-rule, put-access-control-rule, list-access-control-rules

**Mailbox Management**
> put-mailbox-permissions, delete-mailbox-permissions, get-mailbox-details, start-mailbox-export-job

# CAVEATS

Organization IDs are required for most operations and follow the format **m-** followed by alphanumeric characters. User and resource management requires the entity to be registered with WorkMail before email operations work. Mailbox export jobs are asynchronous and require an S3 bucket for output.

# HISTORY

Amazon WorkMail launched in **January 2015** as a managed email and calendaring service for businesses. It was designed as an alternative to Microsoft Exchange and Google Workspace, with enterprise features like encryption, compliance, and directory integration.

# SEE ALSO

[aws](/man/aws)(1), [aws-ses](/man/aws-ses)(1)
