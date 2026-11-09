# TAGLINE

Docker-based development service manager

# TLDR

**Enable service**

```takeout enable [mysql]```

**Enable service** with default settings

```takeout enable [mysql] --default```

**Enable multiple** services

```takeout enable [mysql] [redis] [meilisearch]```

Enable with extra **docker run options**

```takeout enable [mysql] --run="[docker-run-options]"```

**Disable service**

```takeout disable [mysql]```

**Disable all** services

```takeout disable --all```

**List** enabled services

```takeout list```

**Start** a stopped container

```takeout start [container_id]```

**Start all** enabled containers

```takeout start --all```

**Stop all** running containers

```takeout stop --all```

Open a **shell** inside a running service

```takeout shell [mysql]```

Show container **logs**

```takeout logs [container_id]```

# SYNOPSIS

**takeout** _command_ [_arguments_] [_options_]

# PARAMETERS

**enable** [_SERVICE..._]
> Enable and start service containers, prompting for version, port and volume. With no argument, shows a menu of available services.

**--default**
> Accept default parameters when enabling (skip prompts).

**--run=**_OPTIONS_
> Pass extra options to the generated **docker run** command when enabling. Arguments after **--** are passed to the container entrypoint.

**disable** [_SERVICE..._] [**--all**]
> Stop and remove service containers. With no argument, shows a menu of enabled services.

**start** [_CONTAINER_ID..._] [**--all**]
> Start stopped containers. With no argument, shows a menu.

**stop** [_CONTAINER_ID..._] [**--all**]
> Stop running containers. With no argument, shows a menu.

**list** [**--json**]
> List all services enabled by Takeout, optionally as JSON.

**logs** [_CONTAINER_ID_]
> Display container logs.

**shell** _SERVICE_
> Open a bash or sh shell inside a running Takeout container.

# DESCRIPTION

**takeout** is a CLI tool that simplifies managing development dependencies using Docker containers. Instead of installing databases and services directly on your machine, Takeout runs them as isolated Docker containers that can be enabled or disabled with simple commands.

Supported services include MySQL, PostgreSQL, MariaDB, Redis, Valkey, Memcached, ElasticSearch, OpenSearch, MeiliSearch, Typesense, MinIO, Mailpit, Ollama, and many more. Each service runs in its own container with sensible defaults, and Takeout handles port mapping and volume persistence automatically.

Created by **Tighten** for the Laravel ecosystem, Takeout works well for any development workflow. The **enable** command pulls and starts a service container, with an interactive prompt for version and configuration, while **disable** removes the container but keeps its data volume. Running **enable** again with a different port and volume name lets several versions of a service run side by side. Containers join a Docker network named **takeout**, where they are reachable by aliases such as **mysql** or **mysql8.0**.

# CAVEATS

Requires Docker. Runs on macOS, Linux, Windows 10 and WSL2. The recommended install is a shell alias around the **tighten/takeout** Docker image; a Composer install needs a current PHP version. Takeout manages containers globally, not per project. It does not install PHP extensions or drivers.

# HISTORY

**Takeout** was created by **Tighten** to simplify local development service management using Docker.

# SEE ALSO

[docker](/man/docker)(1), [docker-compose](/man/docker-compose)(1), [valet](/man/valet)(1)

# RESOURCES

```[Source code](https://github.com/tighten/takeout)```

<!-- verified: 2026-11-09 -->
