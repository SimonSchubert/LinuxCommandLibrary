# TAGLINE

start existing Compose service containers without recreating them

# TLDR

Start **all** services that already have containers

```docker compose start```

Start **named** services only

```docker compose start [web] [db]```

Wait until services are **running or healthy**

```docker compose start --wait```

Wait, with a **timeout** in seconds

```docker compose start --wait --wait-timeout [60]```

**Dry-run** the start (global Compose flag)

```docker compose --dry-run start```

# SYNOPSIS

**docker** **compose** **start** [_options_] [_SERVICE_...]

# PARAMETERS

**--wait**
> Wait until services are running or healthy. Implies detached mode.

**--wait-timeout** _seconds_
> Maximum seconds to wait when **--wait** is set.

# DESCRIPTION

**docker compose start** starts **existing** containers for one or more services in a Compose project. It does not create missing containers; use **docker compose up** (or **create** then **start**) if the service has never been created.

Stopped containers keep their filesystem, networks, and volumes. This is the counterpart to **docker compose stop**, which pauses without removing. **docker compose down** removes containers; **start** cannot bring those back.

# CAVEATS

Services without an existing container are skipped or error depending on Compose version; they are not created. Health wait needs a healthcheck in the Compose file. Project selection still uses **-f**, **-p**, and the working directory as with other Compose commands.

# HISTORY

The standalone `docker-compose start` verb moved to the Compose V2 plugin invoked as **docker compose start**.

# INSTALL

```apt: sudo apt install docker-compose```

```dnf: sudo dnf install docker-compose```

```pacman: sudo pacman -S docker-compose```

```apk: sudo apk add docker-cli-compose```

```zypper: sudo zypper install docker-compose```

```brew: brew install docker-compose```

```nix: nix profile install nixpkgs#docker-compose```

<!-- packages: 2026-08-26 -->

# SEE ALSO

[docker-compose](/man/docker-compose)(1), [docker-compose-stop](/man/docker-compose-stop)(1), [docker-compose-up](/man/docker-compose-up)(1), [docker-compose-down](/man/docker-compose-down)(1)

# RESOURCES

```[Documentation](https://docs.docker.com/reference/cli/docker/compose/start/)```

```[Homepage](https://docs.docker.com/compose/)```

<!-- verified: 2026-08-26 -->
