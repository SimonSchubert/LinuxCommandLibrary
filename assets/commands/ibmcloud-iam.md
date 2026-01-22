# TLDR

**List API keys**

```ibmcloud iam api-keys```

**Create API key**

```ibmcloud iam api-key-create [name]```

**List service IDs**

```ibmcloud iam service-ids```

**Show access groups**

```ibmcloud iam access-groups```

**Get user policies**

```ibmcloud iam user-policies [user]```

# SYNOPSIS

**ibmcloud iam** _command_ [_options_]

# PARAMETERS

_COMMAND_
> IAM command.

**api-keys**
> List API keys.

**api-key-create**
> Create API key.

**service-ids**
> List service IDs.

**access-groups**
> List access groups.

**user-policies**
> Show user policies.

**--help**
> Display help information.

# DESCRIPTION

**ibmcloud iam** manages Identity and Access Management. It handles API keys, service IDs, access groups, and policies.

The tool controls authentication and authorization for IBM Cloud resources. It enables secure service-to-service communication.

ibmcloud iam manages identity/access.

# CAVEATS

Account owner or admin needed. Policy changes immediate. Audit trails available.

# HISTORY

ibmcloud iam is the IAM management component of **IBM Cloud** CLI.

# SEE ALSO

[ibmcloud](/man/ibmcloud)(1), [ibmcloud-login](/man/ibmcloud-login)(1)
