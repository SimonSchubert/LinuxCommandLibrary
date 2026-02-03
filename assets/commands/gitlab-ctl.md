# TLDR

**Start GitLab**

```sudo gitlab-ctl start```

**Stop GitLab**

```sudo gitlab-ctl stop```

**Restart GitLab**

```sudo gitlab-ctl restart```

**Show status**

```sudo gitlab-ctl status```

**Reconfigure GitLab**

```sudo gitlab-ctl reconfigure```

**View logs**

```sudo gitlab-ctl tail```

**View specific service logs**

```sudo gitlab-ctl tail [nginx]```

# SYNOPSIS

**gitlab-ctl** _command_ [_options_]

# SUBCOMMANDS

**start**
> Start all services.

**stop**
> Stop all services.

**restart**
> Restart all services.

**status**
> Show service status.

**reconfigure**
> Apply configuration.

**tail**
> View logs.

**hup**
> Send HUP signal.

**console**
> Rails console.

# DESCRIPTION

**gitlab-ctl** controls Omnibus GitLab installation. Manages services, applies configuration changes, and provides debugging tools.

# SEE ALSO

[gitlab-backup](/man/gitlab-backup)(1), [gitlab-rake](/man/gitlab-rake)(1)

