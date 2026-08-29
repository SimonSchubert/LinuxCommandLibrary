# TAGLINE

manages IBM Cloud Identity and Access Management

# TLDR

**List** the API keys of the current user

```ibmcloud iam api-keys```

**Create** a platform API key and save it to a file

```ibmcloud iam api-key-create [name] -d "[description]" --file [key.json]```

**List** service IDs

```ibmcloud iam service-ids```

**Create** a service ID and an API key for it

```ibmcloud iam service-id-create [name] -d "[description]" && ibmcloud iam service-api-key-create [key-name] [name]```

**List** access groups in the account

```ibmcloud iam access-groups```

**Create** an access group and add a user

```ibmcloud iam access-group-create [group] -d "[description]" && ibmcloud iam access-group-user-add [group] [user@example.com]```

**Show** the access policies of a user

```ibmcloud iam user-policies [user@example.com]```

**Print** the OAuth tokens of the current session

```ibmcloud iam oauth-tokens```

# SYNOPSIS

**ibmcloud** **iam** _command_ [_arguments_] [_options_]

# PARAMETERS

**api-keys** [**--uuid**] [**-n** _STRING_] [**-d** _STRING_]
> List platform API keys, optionally filtered by name or description.

**api-key-create** _NAME_ [**-d** _DESCRIPTION_] [**--file** _FILE_] [**--lock**]
> Create a platform API key. The secret is shown once; **--file** saves it as JSON.

**api-key-delete**, **api-key-update**, **api-key-lock**, **api-key-unlock**
> Manage an existing API key.

**service-ids** [**--uuid**] [**-n** _STRING_] [**-d** _STRING_]
> List service IDs in the current account.

**service-id-create** _NAME_ [**-d** _DESCRIPTION_] [**--lock**]
> Create a service ID for machine-to-machine access.

**service-api-key-create** _NAME_ _SERVICE_ID_
> Create an API key bound to a service ID.

**access-groups** [**-u** _USER_ | **-s** _SERVICE_ID_ | **-p** _PROFILE_]
> List access groups, optionally only those a user, service ID, or trusted profile belongs to.

**access-group-create** _GROUP_NAME_ [**-d** _DESCRIPTION_]
> Create an access group.

**access-group-user-add**, **access-group-user-remove**, **access-group-service-id-add**
> Manage access group membership.

**access-group-policy-create** _GROUP_NAME_
> Attach an access policy to an access group.

**user-policies** _USER_NAME_
> List all access policies of a user.

**user-policy-create**, **user-policy-update**, **user-policy-delete**
> Manage a user's access policies.

**service-policies**, **service-policy-create**
> List or create policies attached to a service ID.

**authorization-policies**, **authorization-policy-create**
> Manage service-to-service authorizations.

**trusted-profiles**, **trusted-profile-create**, **trusted-profile-link-create**
> Manage trusted profiles and the compute resources linked to them.

**roles** [**--service** _SERVICE_NAME_]
> List platform, service-defined, and custom roles.

**oauth-tokens**
> Retrieve and display the OAuth tokens of the current session.

**bearer-token**
> Print the bare Bearer token of the current session.

**account-settings**, **account-settings-update**
> View or change account-wide IAM settings such as session lifetime and MFA.

# DESCRIPTION

**ibmcloud iam** manages Identity and Access Management for the targeted IBM Cloud account. It creates and revokes API keys, defines service IDs and trusted profiles for non-human identities, groups users into access groups, and attaches the policies that grant roles on resources.

The command group is built into the core CLI, so no plugin is needed. All operations apply to the account currently targeted by **ibmcloud target**, and most listing commands accept **--output json** for scripting.

Access in IBM Cloud is granted by policies that bind a subject (user, service ID, trusted profile, or access group) to a target (an account, resource group, service instance, or resource type) with one or more roles. Assigning policies to an access group instead of individual users is the recommended way to keep permissions manageable.

# CAVEATS

An API key secret is displayed only when it is created. Save it with **--file** or copy it immediately; it cannot be retrieved later, only deleted and recreated.

Managing other identities requires administrator rights on the IAM Identity Service or on the account. Policy changes take effect within seconds but cached tokens keep their old authorizations until they are refreshed.

Deleting a service ID revokes every API key bound to it, which breaks any automation still using those keys.

# HISTORY

**ibmcloud iam** is part of the IBM Cloud CLI, which replaced the earlier `bluemix` (`bx`) CLI when Bluemix was rebranded to IBM Cloud around **2018**. Access groups, trusted profiles, and policy templates were added to the command group as the IAM service gained them.

# SEE ALSO

[ibmcloud](/man/ibmcloud)(1), [ibmcloud-login](/man/ibmcloud-login)(1), [ibmcloud-target](/man/ibmcloud-target)(1), [ibmcloud-ks](/man/ibmcloud-ks)(1)

# RESOURCES

```[Homepage](https://cloud.ibm.com/docs/cli)```

```[Documentation](https://cloud.ibm.com/docs/cli?topic=cli-ibmcloud_commands_iam)```

<!-- verified: 2026-08-30 -->
