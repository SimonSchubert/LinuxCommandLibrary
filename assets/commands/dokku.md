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

**Enable HTTPS** with a Let's Encrypt certificate

```dokku letsencrypt:enable [app_name]```

**Install a plugin** (as root)

```sudo dokku plugin:install [https://github.com/dokku/dokku-postgres.git]```

# SYNOPSIS

**dokku** _plugin_:_command_ [_app_] [_arguments_]

Most commands follow a `namespace:verb` naming scheme, where the namespace is the plugin that provides them.

# COMMANDS

**apps:create** _app_ / **apps:list** / **apps:destroy** _app_
> Create, list, and destroy applications.

**apps:rename** _app_ _new-name_
> Rename an application and rebuild it.

**config:set** _app_ _KEY=VALUE_ / **config:unset** _app_ _KEY_ / **config:show** _app_
> Manage environment variables. Setting or unsetting restarts the app unless **--no-restart** is passed.

**ps:scale** _app_ _proc_=_n_
> Scale a process type from the Procfile to _n_ containers.

**ps:restart** _app_ / **ps:rebuild** _app_ / **ps:stop** _app_
> Restart the running containers, rebuild the app from source, or stop it.

**logs** _app_
> Show application logs. **-t** follows them, **-n** _N_ limits the number of lines.

**domains:add** _app_ _domain_ / **domains:remove** _app_ _domain_ / **domains:report** _app_
> Manage the virtual hosts routed to the app.

**letsencrypt:enable** _app_
> Request and install a Let's Encrypt certificate (requires the `dokku-letsencrypt` plugin).

**proxy:ports-add** _app_ _scheme_:_host-port_:_container-port_
> Map an external port onto a container port.

**run** _app_ _command_
> Run a one-off command in a new container from the app's image.

**enter** _app_ [_process_]
> Open a shell inside a running container.

**postgres:create** _service_ / **postgres:link** _service_ _app_
> Create a database service and expose its credentials to an app. Equivalents exist for `mysql`, `redis`, `mongo`, and others, each from its own plugin.

**plugin:install** _git-url_ / **plugin:list**
> Install and list plugins. Must be run as root.

**version**
> Print the installed Dokku version.

# DESCRIPTION

**Dokku** is a self-hosted Platform-as-a-Service (PaaS) that implements a Heroku-like workflow on a single machine. Adding the server as a git remote and pushing to it is the whole deploy: Dokku detects the application type, builds an image, and cuts traffic over to the new containers.

Applications are built either with **Herokuish** buildpacks, a **Dockerfile**, or Cloud Native Buildpacks, and are then run as Docker containers behind an nginx proxy that Dokku configures for you. A `Procfile` defines the process types, which **ps:scale** turns into container counts.

Nearly everything beyond the core is a plugin: `dokku-postgres`, `dokku-mysql`, `dokku-redis`, and friends provide backing services that are linked into an app as environment variables, while `dokku-letsencrypt` automates TLS certificates. This keeps the base install small while covering most of what Heroku offers.

# CAVEATS

Dokku targets a single host; there is no built-in clustering or zero-downtime failover across machines, and scaling means more containers on the same box. It expects a fresh server, since it takes ownership of nginx and Docker configuration. Plugin commands must be installed as **root** even though app commands run as the `dokku` user. Zero-downtime deploys depend on correctly configured `CHECKS`, otherwise a push briefly drops requests, and builds can be memory-hungry enough to fail on the smallest VPS sizes without swap.

# HISTORY

Dokku was created by **Jeff Lindsay** in **2013** as a "docker-powered mini-Heroku" written in a few hundred lines of shell. It quickly outgrew that, and maintenance passed to **Jose Diaz-Gonzalez**, who still leads the project. It remains one of the most widely used self-hosted PaaS options, and its git-push workflow is deliberately close to Heroku's so that apps can move between the two.

# INSTALL

```aur: yay -S dokku```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[docker](/man/docker)(1), [git](/man/git)(1), [heroku](/man/heroku)(1), [caprover](/man/caprover)(1)

# RESOURCES

```[Source code](https://github.com/dokku/dokku)```

```[Homepage](https://dokku.com)```

```[Documentation](https://dokku.com/docs/)```

<!-- verified: 2026-07-14 -->

