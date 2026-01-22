# TLDR

**List API keys**

```exo iam api-key list```

**Create API key**

```exo iam api-key create [name]```

**Delete API key**

```exo iam api-key delete [key_id]```

**List roles**

```exo iam role list```

**Show current identity**

```exo iam whoami```

# SYNOPSIS

**exo iam** _resource_ _action_ [_options_]

# PARAMETERS

_RESOURCE_
> Resource type: api-key, role.

_ACTION_
> Operation: list, create, delete, show.

**api-key create** _NAME_
> Create new API key.

**api-key delete** _ID_
> Delete API key.

**role list**
> List IAM roles.

**whoami**
> Show current identity.

**--help**
> Display help information.

# DESCRIPTION

**exo iam** manages identity and access management for Exoscale. It handles API keys used for authentication and roles for access control.

API keys provide programmatic access to Exoscale resources. Keys can be scoped with roles to limit permissions. whoami confirms the current authenticated identity.

IAM management is essential for securing cloud infrastructure access.

# CAVEATS

Key secrets shown only at creation. Deleted keys are unrecoverable. Roles affect all resources. Root keys have full access.

# HISTORY

exo iam is part of the **Exoscale CLI**, providing security and access management for Exoscale cloud accounts.

# SEE ALSO

[exo](/man/exo)(1), [exo-compute](/man/exo-compute)(1)
