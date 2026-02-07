# TAGLINE

Control Omnibus GitLab services

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

**gitlab-ctl** controls an Omnibus GitLab installation. It manages all GitLab services (nginx, PostgreSQL, Redis, Puma, Sidekiq, etc.), applies configuration changes from `/etc/gitlab/gitlab.rb`, and provides debugging tools.

The `reconfigure` command is used after modifying `gitlab.rb` to apply the new settings.

# CONFIGURATION

**/etc/gitlab/gitlab.rb**
> Main configuration file for the Omnibus GitLab installation, controlling all services and settings.

# SEE ALSO

[gitlab-backup](/man/gitlab-backup)(1), [gitlab-rake](/man/gitlab-rake)(1)
