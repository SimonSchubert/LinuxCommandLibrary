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

**takeout** manages development services. It uses Docker.

Database services. MySQL, PostgreSQL, Redis.

Simple interface. Enable and disable.

Docker-based. Container management.

Laravel focused. PHP development.

# CAVEATS

Docker required. macOS/Linux. Tighten-created tool.

# HISTORY

**Takeout** was created by **Tighten** to simplify local development service management using Docker.

# SEE ALSO

[docker](/man/docker)(1), [docker-compose](/man/docker-compose)(1), [valet](/man/valet)(1)
