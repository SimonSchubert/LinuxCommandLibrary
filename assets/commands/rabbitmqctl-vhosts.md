# TLDR

**List virtual hosts**

```rabbitmqctl list_vhosts```

**Add virtual host**

```rabbitmqctl add_vhost [vhost_name]```

**Delete virtual host**

```rabbitmqctl delete_vhost [vhost_name]```

**Set vhost limits**

```rabbitmqctl set_vhost_limits -p [vhost] '{"max-queues":100}'```

# SYNOPSIS

**rabbitmqctl** _vhost_command_ [_options_]

# PARAMETERS

**list_vhosts**
> List all virtual hosts.

**add_vhost** _name_
> Create virtual host.

**delete_vhost** _name_
> Remove virtual host.

**set_vhost_limits** _json_
> Set resource limits.

**clear_vhost_limits**
> Remove limits.

**-p** _vhost_
> Target virtual host.

# DESCRIPTION

**rabbitmqctl** vhost commands manage RabbitMQ virtual hosts. Virtual hosts provide logical separation for queues, exchanges, and permissions. Part of RabbitMQ server management.

# SEE ALSO

[rabbitmqctl](/man/rabbitmqctl)(1), [rabbitmqctl-users](/man/rabbitmqctl-users)(1)

