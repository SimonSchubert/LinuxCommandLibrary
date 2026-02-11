# TAGLINE

Run multi-container applications with Podman

# TLDR

**Start services**

```podman-compose up```

**Start in background**

```podman-compose up -d```

**Stop services**

```podman-compose down```

**View logs**

```podman-compose logs```

**Build images**

```podman-compose build```

**List containers**

```podman-compose ps```

**Execute command in service**

```podman-compose exec [service] [command]```

# SYNOPSIS

**podman-compose** [_options_] _command_ [_args_...]

# PARAMETERS

**up**
> Create and start containers.

**down**
> Stop and remove containers.

**build**
> Build images.

**logs**
> View container logs.

**ps**
> List containers.

**exec**
> Execute command in container.

**-d**, **--detach**
> Run in background.

**-f** _file_
> Compose file path.

# DESCRIPTION

**podman-compose** runs multi-container applications defined in docker-compose.yml files using Podman. Drop-in replacement for docker-compose. Supports most compose file features without requiring a daemon.

# SEE ALSO

[podman](/man/podman)(1), [docker-compose](/man/docker-compose)(1)

