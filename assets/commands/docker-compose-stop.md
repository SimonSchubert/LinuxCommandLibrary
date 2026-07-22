# TAGLINE

stop Compose services without removing containers

# TLDR

**Stop** all running services

```docker compose stop```

Stop **specific** services

```docker compose stop [service1] [service2]```

Stop with a custom **timeout** in seconds

```docker compose stop -t [30]```

Use a specific **compose file**

```docker compose -f [path/to/compose.yaml] stop```

# SYNOPSIS

**docker** **compose** **stop** [_options_] [_SERVICE_...]

# PARAMETERS

**-t**, **--timeout** _seconds_
> Shutdown timeout in seconds before killing containers

# DESCRIPTION

**docker compose stop** stops running containers for one or more services defined in a Compose project **without removing** them. Stopped containers keep their configuration and volumes and can be started again with **docker compose start**.

Unlike **docker compose down**, this command does not remove containers, networks, or volumes. It is useful when you want a temporary stop while preserving the ability to resume the same containers quickly.

# INSTALL

```apt: sudo apt install docker-compose```

```dnf: sudo dnf install docker-compose```

```pacman: sudo pacman -S docker-compose```

```apk: sudo apk add docker-cli-compose```

```zypper: sudo zypper install docker-compose```

```brew: brew install docker-compose```

```nix: nix profile install nixpkgs#docker-compose```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[docker-compose](/man/docker-compose)(1), [docker-compose-up](/man/docker-compose-up)(1), [docker-compose-down](/man/docker-compose-down)(1)

# RESOURCES

```[Documentation](https://docs.docker.com/reference/cli/docker/compose/stop/)```

```[Homepage](https://docs.docker.com/compose/)```

<!-- verified: 2026-07-14 -->
