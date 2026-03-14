# TAGLINE

Manage file-based Elasticsearch users

# TLDR

**List users**

```elasticsearch-users list```

**Add a user**

```elasticsearch-users useradd [username] -p [password] -r [roles]```

**Delete a user**

```elasticsearch-users userdel [username]```

**Change password**

```elasticsearch-users passwd [username]```

**Add role to user**

```elasticsearch-users roles [username] -a [role]```

**Remove role from user**

```elasticsearch-users roles [username] -r [role]```

# SYNOPSIS

**elasticsearch-users** _command_ [_options_]

# SUBCOMMANDS

**useradd**
> Add a user.

**userdel**
> Delete a user.

**passwd**
> Change password.

**roles**
> Manage user roles.

**list**
> List users.

# PARAMETERS

**-p** _pass_
> User password (must be at least 6 characters). If omitted, prompts interactively.

**-r** _roles_
> Comma-separated list of roles. With **useradd**, assigns roles. With **roles**, removes roles.

**-a** _roles_
> Add comma-separated roles (used with **roles** subcommand).

# DESCRIPTION

**elasticsearch-users** manages file-based users for Elasticsearch's native realm. These users are stored locally in the node's configuration directory and don't require an external authentication system. The tool is part of the Elasticsearch security features.

When listing users, only those registered on the local node are shown. In a multi-node cluster, file-based users must be managed on each node separately.

# SEE ALSO

[elasticsearch](/man/elasticsearch)(1), [elasticsearch-reset-password](/man/elasticsearch-reset-password)(1)

