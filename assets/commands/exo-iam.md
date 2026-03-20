# TAGLINE

Exoscale identity and access management

# TLDR

**List API keys**

```exo iam api-key list```

**Create API key** with a role

```exo iam api-key create [name] [role-name]```

**Delete API key**

```exo iam api-key delete [key_id]```

**List IAM roles**

```exo iam role list```

**Create an IAM role**

```exo iam role create [role-name] --policy [policy.json]```

**Show role details**

```exo iam role show [role-name]```

**Show organization policy**

```exo iam org-policy show```

# SYNOPSIS

**exo iam** _resource_ _action_ [_options_]

# PARAMETERS

**api-key** _ACTION_
> Manage API keys (list, create, delete).

**api-key create** _NAME_ _ROLE-NAME|ROLE-ID_
> Create new API key with the specified role name or ID.

**api-key list**
> List all API keys.

**api-key delete** _ID_
> Delete an API key.

**role** _ACTION_
> Manage IAM roles (list, create, delete, show, update).

**role create** _NAME_ **--policy** _FILE_
> Create a new IAM role with a policy file.

**role show** _NAME|ID_
> Display details of an IAM role.

**role update** _NAME|ID_ **--policy** _FILE_
> Update the policy of an existing IAM role.

**org-policy** _ACTION_
> Manage organization IAM policy (show, reset).

**--help**
> Display help information.

# DESCRIPTION

**exo iam** manages identity and access management for Exoscale cloud. It handles API keys used for authentication and roles for access control.

API keys provide programmatic access to Exoscale resources. Each key is attached to a role that defines its permissions via a policy. Roles contain policies that specify allowed and denied operations across services such as compute, dns, dbaas, sos, and block-storage. The org-policy subcommand manages the organization-level default policy.

# CAVEATS

Key secrets shown only at creation. Deleted keys are unrecoverable. Roles affect all resources. Root keys have full access.

# HISTORY

exo iam is part of the **Exoscale CLI**, providing security and access management for Exoscale cloud accounts.

# SEE ALSO

[exo](/man/exo)(1), [exo-compute](/man/exo-compute)(1)
