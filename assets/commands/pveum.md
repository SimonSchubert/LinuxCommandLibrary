# TAGLINE

Proxmox user and permission management

# TLDR

**List** users

```pveum user list```

**Add** a user

```pveum user add [username]@pve```

Add a user with **email, description, and password**

```pveum user add [username]@pve --email [email] --comment [description] --password [password]```

**Change** user password

```pveum passwd [username]@pve```

**Delete** a user

```pveum user delete [username]@pve```

**Grant** user access to a VM with a specific role

```pveum acl modify /vms/[100] --users [username]@pve --roles PVEVMUser```

Add a user to a **group**

```pveum user modify [username]@pve --groups [group] --append 1```

**Generate** an API token for a user

```pveum user token add [username]@pve [tokenid]```

**List** available roles

```pveum role list```

# SYNOPSIS

**pveum** _command_ [_subcommand_] [_options_]

# PARAMETERS

**user** **list**
> List all users.

**user** **add** _user_
> Add new user.

**user** **modify** _user_
> Update user configuration.

**user** **delete** _user_
> Delete user.

**user** **token** **add** _user_ _tokenid_
> Generate an API token for a user. The secret is shown only once.

**user** **token** **delete** _user_ _tokenid_
> Remove an API token.

**passwd** _user_
> Change user password.

**acl** **list**
> List access control entries.

**acl** **modify** _path_ **--roles** _roles_
> Add permissions at a path.

**acl** **delete** _path_ **--roles** _roles_
> Remove permissions at a path.

**group** **list**
> List groups.

**group** **add** _group_
> Create a new group.

**role** **list**
> List roles.

**role** **add** _role_ **--privs** _privileges_
> Create a custom role.

**realm** **list**
> List authentication realms.

**realm** **add** _realm_ **--type** _type_
> Add an authentication realm.

**realm** **sync** _realm_
> Sync users and groups from LDAP or Active Directory.

**pool** **add** _poolid_
> Create a resource pool.

**pool** **list**
> List resource pools.

**--users** _users_
> Users an ACL entry applies to.

**--groups** _groups_
> Groups an ACL entry applies to, or groups for a user.

**--tokens** _tokens_
> API tokens an ACL entry applies to.

**--roles** _roles_
> Roles to grant or remove (PVEAdmin, PVEVMUser, etc.).

**--propagate** _boolean_
> Allow permissions to be inherited by child paths (default: 1).

**--email** _email_
> User email address.

**--comment** _text_
> User description.

**--expire** _seconds_
> Account or token expiry, in seconds since the epoch (0 means no expiry).

**--password** _password_
> Initial user password.

**--enable** _boolean_
> Enable or disable the account (default: 1).

# DESCRIPTION

**pveum** manages Proxmox VE users, groups, roles, and access control lists. It configures authentication realms (PAM, PVE, LDAP, Active Directory, OpenID Connect) and permission assignments for cluster resources.

The permission system uses a path-based model where access is granted at specific resource paths (datacenter, nodes, VMs, storage) with roles defining allowed operations.

Older aliases such as **useradd**, **userdel**, **usermod**, **aclmod** and **acldel** are still accepted.

# CAVEATS

User realms (@pve, @pam, @ldap) determine authentication method. PAM users must also exist as system users on each node they log in to. The built-in root@pam user cannot be deleted. Delegating user management requires the PVEUserAdmin role on the relevant /access path. Passing **--password** on the command line exposes it in shell history.

# HISTORY

Part of **Proxmox VE**, shipped in its **pve-access-control** component.

# SEE ALSO

[pvesh](/man/pvesh)(1), [qm](/man/qm)(1), [pct](/man/pct)(1), [pvecm](/man/pvecm)(1)

# RESOURCES

```[Source code](https://git.proxmox.com/?p=pve-access-control.git)```

```[Homepage](https://www.proxmox.com/en/products/proxmox-virtual-environment/overview)```

```[Documentation](https://pve.proxmox.com/pve-docs/pveum.1.html)```

<!-- verified: 2026-11-09 -->
