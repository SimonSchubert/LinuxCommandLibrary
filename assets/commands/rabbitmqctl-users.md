# TAGLINE

Manage RabbitMQ users and permissions

# TLDR

**List users**

```rabbitmqctl list_users```

**Add user**

```rabbitmqctl add_user [username] [password]```

**Delete user**

```rabbitmqctl delete_user [username]```

**Change user password**

```rabbitmqctl change_password [username] [new_password]```

**Set user tags**

```rabbitmqctl set_user_tags [username] [administrator]```

**Set permissions** for a user on a vhost

```rabbitmqctl set_permissions -p [vhost] [username] ".*" ".*" ".*"```

**List permissions** of a specific user across all vhosts

```rabbitmqctl list_user_permissions [username]```

**Verify** a user's credentials

```rabbitmqctl authenticate_user [username] [password]```

# SYNOPSIS

**rabbitmqctl** _user_command_ [_options_]

# PARAMETERS

**list_users**
> List all users.

**add_user** _user_ _pass_
> Create user.

**delete_user** _user_
> Remove user.

**change_password** _user_ _pass_
> Change password.

**clear_password** _user_
> Remove password for a user, preventing password-based login.

**authenticate_user** _user_ _pass_
> Verify whether credentials match a user's stored authentication.

**set_user_tags** _user_ _tags ..._
> Set role tags (administrator, monitoring, management, policymaker). Replaces all existing tags.

**set_permissions** [**-p** _vhost_] _user_ _conf_ _write_ _read_
> Set vhost permissions using regex patterns for configure, write, and read operations.

**clear_permissions** [**-p** _vhost_] _user_
> Revoke all permissions for a user on a vhost.

**list_permissions** [**-p** _vhost_]
> List all users with access to a vhost and their permissions.

**list_user_permissions** _user_
> List all vhosts a user has access to and their permissions.

**-p** _vhost_
> Target virtual host (default: "/").

# DESCRIPTION

**rabbitmqctl** user commands manage RabbitMQ users and permissions. Create users, set passwords, assign roles, and configure vhost access. Part of RabbitMQ server management. These commands only manage users in the internal RabbitMQ database; users from alternative authentication backends (such as LDAP) cannot be managed with these commands.

# SEE ALSO

[rabbitmqctl](/man/rabbitmqctl)(1), [rabbitmqctl-vhosts](/man/rabbitmqctl-vhosts)(1)

