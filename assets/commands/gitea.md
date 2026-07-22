# TAGLINE

Self-hosted Git service with web interface

# TLDR

**Start Gitea server**

```gitea```

**Start with config**

```gitea --config [/etc/gitea/app.ini]```

**Generate a secret key**

```gitea generate secret [INTERNAL_TOKEN]```

**Create admin user**

```gitea admin user create --username [admin] --password [password] --email [admin@example.com] --admin```

**Run health checks**

```gitea doctor check```

**Dump full installation to an archive**

```gitea dump```

**Run pending database migrations**

```gitea migrate```

# SYNOPSIS

**gitea** [_global options_] _command_ [_command options_]

# PARAMETERS

**web**
> Start the web server.

**admin**
> Perform admin operations: manage users (**user**), auth sources (**auth**), or regenerate hooks/keys (**regenerate**).

**cert**
> Generate a self-signed SSL certificate.

**doctor**
> Diagnose and optionally repair problems with the installation (**check**, **recreate-table**).

**dump**
> Export the full installation (database, repos, config, etc.) into a compressed archive.

**dump-repo** / **restore-repo**
> Migrate repository data between Gitea instances.

**generate**
> Generate random secrets/tokens: `INTERNAL_TOKEN`, `JWT_SECRET`, `SECRET_KEY`, `LFS_JWT_SECRET`.

**keys**
> Provide the `AuthorizedKeysCommand` output used for SSHD integration.

**manager**
> Control a running instance: shutdown, restart, flush queues, adjust logging.

**migrate**
> Run pending database migrations; typically run once before first startup.

**-c**, **--config** _FILE_
> Path to the configuration file (default `custom/conf/app.ini`).

**-w**, **--work-path** _PATH_
> Gitea's base working directory.

**-C**, **--custom-path** _PATH_
> Path to the custom folder.

**--port** _PORT_
> Server port (web command).

**-v**, **--version**
> Show version information.

**-h**, **--help**
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

# INSTALL

```pacman: sudo pacman -S gitea```

```apk: sudo apk add gitea```

```brew: brew install gitea```

```nix: nix profile install nixpkgs#gitea```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git](/man/git)(1), [gitlab-runner](/man/gitlab-runner)(1), [gitlab](/man/gitlab)(1)

# RESOURCES

```[Source code](https://github.com/go-gitea/gitea)```

```[Homepage](https://about.gitea.com/)```

```[Documentation](https://docs.gitea.com/)```

<!-- verified: 2026-07-17 -->
