# TAGLINE

Manage RabbitMQ users and permissions

# TLDR

**List users**

```rabbitmqctl list_users```

**Add user**

```rabbitmqctl add_user [username] [password]```

**Delete user**

```rabbitmqctl delete_user [username]```

**Set user tags**

```rabbitmqctl set_user_tags [username] [administrator]```

**Set permissions**

```rabbitmqctl set_permissions -p [vhost] [username] ".*" ".*" ".*"```

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

**set_user_tags** _user_ _tags_
> Set role tags (administrator, monitoring, etc.).

**set_permissions** _user_ _conf_ _write_ _read_
> Set vhost permissions.

**-p** _vhost_
> Target virtual host.

# DESCRIPTION

**rabbitmqctl** user commands manage RabbitMQ users and permissions. Create users, set passwords, assign roles, and configure vhost access. Part of RabbitMQ server management.

# SEE ALSO

[rabbitmqctl](/man/rabbitmqctl)(1), [rabbitmqctl-vhosts](/man/rabbitmqctl-vhosts)(1)

