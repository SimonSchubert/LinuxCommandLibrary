# TAGLINE

Self-hosted Git service with web interface

# TLDR

**Start Gitea server**

```gitea```

**Start with config**

```gitea --config [/etc/gitea/app.ini]```

**Generate secret key**

```gitea generate secret INTERNAL_TOKEN```

**Create admin user**

```gitea admin user create --username [admin] --password [password] --email [admin@example.com] --admin```

**Web command**

```gitea web```

# SYNOPSIS

**gitea** [_command_] [_options_]

# PARAMETERS

**web**
> Start web server.

**admin**
> Admin operations.

**generate**
> Generate tokens/keys.

**dump**
> Backup repository.

**--config** _FILE_
> Configuration file.

**--port** _PORT_
> Server port.

**--help**
> Display help information.

# DESCRIPTION

**gitea** is a self-hosted Git service written in Go. It provides GitHub-like functionality including repositories, issues, pull requests, and CI/CD, all packaged in a single binary.

Gitea is lightweight and fast, suitable for personal or small team use. It supports OAuth, LDAP, and various database backends for enterprise deployments.

# CONFIGURATION

**/etc/gitea/app.ini**
> Main configuration file controlling server settings, database, authentication, and repository defaults.

# CAVEATS

Requires configuration for production. Database setup needed. Reverse proxy recommended.

# HISTORY

Gitea was forked from **Gogs** in **2016**, becoming a community-driven project with active development and broader feature set.

# SEE ALSO

[git](/man/git)(1), [gitlab-runner](/man/gitlab-runner)(1)
