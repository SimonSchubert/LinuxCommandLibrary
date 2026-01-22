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

**Grant** user access to a VM with specific permissions

```pveum acl modify /vms/1000 --user [username]@pve --role PVEVMUser```

# SYNOPSIS

**pveum** _command_ [_subcommand_] [_options_]

# PARAMETERS

**user** **list**, **u l**
> List all users

**user** **add**, **u a** _user_
> Add new user

**user** **delete**, **u d** _user_
> Delete user

**passwd**, **pa** _user_
> Change user password

**acl** **modify**, **a m** _path_
> Modify access control list

**group** **list**
> List groups

**role** **list**
> List roles

**--role** _role_
> Assign role (PVEAdmin, PVEVMUser, etc.)

**--email** _email_
> User email address

**--comment** _text_
> User description

# DESCRIPTION

**pveum** manages Proxmox VE users, groups, roles, and access control lists. It configures authentication realms (PAM, PVE, LDAP, Active Directory) and permission assignments for cluster resources.

The permission system uses a path-based model where access is granted at specific resource paths (datacenter, nodes, VMs, storage) with roles defining allowed operations.

# CAVEATS

User realms (@pve, @pam, @ldap) determine authentication method. Permission changes take effect immediately. Built-in root@pam cannot be deleted. Some operations require PVEUserAdmin role.

# HISTORY

Part of **Proxmox VE**, providing fine-grained access control for multi-user virtualization environments. Supports enterprise features like LDAP/AD integration and two-factor authentication.

# SEE ALSO

[pvesh](/man/pvesh)(1), [qm](/man/qm)(1), [pct](/man/pct)(1)
