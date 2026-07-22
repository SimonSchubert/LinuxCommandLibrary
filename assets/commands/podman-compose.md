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

# SUBCOMMANDS

**up** [_service_...]
> Create and start the project's containers, networks, and volumes. **--build** forces a rebuild, **--force-recreate** recreates running containers.

**down** [**-v**] [**--remove-orphans**]
> Stop and remove containers (and optionally volumes / orphan containers).

**start** / **stop** / **restart** / **pause** / **unpause** [_service_...]
> Lifecycle commands for already-created services.

**build** [_service_...]
> Build (or rebuild) service images.

**pull** / **push** [_service_...]
> Pull or push service images.

**logs** [**-f**] [_service_...]
> View / follow container logs.

**ps**
> List containers belonging to the project.

**exec** [_service_] _command_
> Run a command in a running service.

**run** [_service_] _command_
> Start a one-off container with the service's configuration.

**config**
> Render the merged Compose file as YAML and validate it.

**top** / **kill** / **rm** / **port** / **events**
> Mirror the equivalent **docker compose** subcommands.

# OPTIONS

**-f** _FILE_, **--file** _FILE_
> Path to a Compose file. Repeatable for layering multiple files.

**-p** _NAME_, **--project-name** _NAME_
> Project name (default: parent directory). Used as a prefix for container, network, and volume names.

**--profile** _NAME_
> Activate a Compose profile.

**--podman-args** _ARGS_
> Pass extra arguments to every **podman** invocation.

**--podman-run-args** _ARGS_, **--podman-build-args** _ARGS_, **--podman-pull-args** _ARGS_
> Pass extra arguments to specific Podman subcommands.

**-d**, **--detach**
> Run in the background (for **up**, **run**).

**--no-cache**
> Disable build cache (for **build**).

**--dry-run**
> Print the Podman commands that would be executed without running them.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**podman-compose** is a thin Python re-implementation of **docker compose** that drives **podman** instead of the Docker daemon. It reads **docker-compose.yml** / **compose.yaml** / **podman-compose.yml** files (Compose specification 1.x and 3.x) and translates them into a series of `podman run`, `podman build`, and `podman network create` commands, so it works rootless and without a daemon.

Modern Podman (4.0+) also ships native `podman compose` (with a space), which delegates to either **podman-compose** or **docker compose** depending on what is available — both eventually call the same Podman API.

# CAVEATS

Coverage of the Compose spec is good but not 100% — some advanced features (for example `extends`, healthcheck-driven `depends_on.condition`, certain `deploy.*` keys) behave differently or are silently ignored. Compose-managed networks use podman's CNI/Netavark backends, so DNS-based service discovery requires the **dnsname** plugin (CNI) or Aardvark-DNS (Netavark, the default since Podman 4.0).

# INSTALL

```dnf: sudo dnf install podman-compose```

```pacman: sudo pacman -S podman-compose```

```apk: sudo apk add podman-compose```

```brew: brew install podman-compose```

```nix: nix profile install nixpkgs#podman-compose```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[podman](/man/podman)(1), [docker-compose](/man/docker-compose)(1)

