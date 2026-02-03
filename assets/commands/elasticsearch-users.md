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

**-p**, **--password** _pass_
> User password.

**-r**, **--roles** _roles_
> Comma-separated roles.

**-a**, **--add** _roles_
> Add roles.

# DESCRIPTION

**elasticsearch-users** manages file-based users for Elasticsearch. These users are stored locally and don't require an external authentication system.

# SEE ALSO

[elasticsearch](/man/elasticsearch)(1), [elasticsearch-reset-password](/man/elasticsearch-reset-password)(1)

