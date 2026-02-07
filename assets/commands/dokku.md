# TAGLINE

self-hosted Platform-as-a-Service powered by Docker

# TLDR

**Create an app**

```dokku apps:create [app_name]```

**Deploy via git push**

```git push dokku main```

**List all apps**

```dokku apps:list```

**View app logs**

```dokku logs [app_name]```

**Set environment variable**

```dokku config:set [app_name] [KEY]=[value]```

**Link database**

```dokku postgres:link [db_name] [app_name]```

**Scale app processes**

```dokku ps:scale [app_name] web=[2]```

**Add domain**

```dokku domains:add [app_name] [example.com]```

# SYNOPSIS

**dokku** _command_ [_options_] [_app_]

# PARAMETERS

_COMMAND_
> Dokku command and subcommand.

_APP_
> Application name.

**apps:create** _NAME_
> Create new application.

**apps:list**
> List all applications.

**logs** _APP_
> View application logs.

**config:set** _APP_ _KEY=VALUE_
> Set environment variable.

**ps:scale** _APP_ _PROC=N_
> Scale process count.

**domains:add** _APP_ _DOMAIN_
> Add custom domain.

**--help**
> Display help information.

# DESCRIPTION

**Dokku** is a self-hosted Platform-as-a-Service (PaaS) that implements a Heroku-like workflow. It uses Docker containers and buildpacks to deploy applications from git push.

The platform automatically detects application type, builds containers, manages routing, and handles SSL certificates. Plugins extend functionality with databases (PostgreSQL, MySQL, Redis), cron jobs, and more.

Dokku provides a simple deployment experience: push code to the server, and it handles building, deploying, and scaling. It's ideal for small teams wanting Heroku-like convenience on their own infrastructure.

# CAVEATS

Single-server by default (clustering requires plugins). Resource usage depends on deployed apps. Some buildpacks may need customization. SSL requires plugin configuration.

# HISTORY

Dokku was created by **Jeff Lindsay** in **2013** as a Docker-powered mini-Heroku. It became popular as a self-hosted PaaS solution, offering Heroku's git-push deployment model on personal servers.

# SEE ALSO

[docker](/man/docker)(1), [git](/man/git)(1), [heroku](/man/heroku)(1)
