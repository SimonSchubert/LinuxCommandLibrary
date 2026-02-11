# TAGLINE

Docker-based development service manager

# TLDR

**Enable service**

```takeout enable [mysql]```

**Disable service**

```takeout disable [mysql]```

**List services**

```takeout list```

**Start all enabled**

```takeout start```

**Stop all**

```takeout stop```

**Show status**

```takeout status```

# SYNOPSIS

**takeout** _command_ [_service_]

# PARAMETERS

**enable**
> Enable service.

**disable**
> Disable service.

**start**
> Start services.

**stop**
> Stop services.

**list**
> List available.

**status**
> Show status.

# DESCRIPTION

**takeout** is a CLI tool that simplifies managing development dependencies using Docker containers. Instead of installing databases and services directly on your machine, Takeout runs them as isolated Docker containers that can be enabled or disabled with simple commands.

Supported services include MySQL, PostgreSQL, MariaDB, Redis, Memcached, Elasticsearch, MeiliSearch, MinIO, and many more. Each service runs in its own container with sensible defaults, and Takeout handles port mapping, volume persistence, and container lifecycle management automatically.

Created by **Tighten** for the Laravel ecosystem, Takeout works well for any PHP development workflow and beyond. The **enable** command pulls and starts a service container with an interactive prompt for version and configuration, while **disable** stops and removes it. The **start** and **stop** commands control all enabled services at once.

# CAVEATS

Docker required. macOS/Linux. Tighten-created tool.

# HISTORY

**Takeout** was created by **Tighten** to simplify local development service management using Docker.

# SEE ALSO

[docker](/man/docker)(1), [docker-compose](/man/docker-compose)(1), [valet](/man/valet)(1)
