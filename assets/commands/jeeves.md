# TAGLINE

Run development dependencies inside pre-configured Docker containers

# TLDR

**Install Jeeves** from its Git repository

```pip install git+https://github.com/fhsinchy/jeeves.git#egg=jeeves```

**Start a service** (e.g. MySQL) with an interactive wizard

```jeeves start [mysql]```

**Start a service using default settings** (skip prompts)

```jeeves start [mysql] --default```

**Stop a running service** and remove its container

```jeeves stop [mysql]```

**List active Jeeves containers**

```jeeves list```

**Launch several services at once**

```jeeves start [mysql] && jeeves start [redis] && jeeves start [mongo]```

# SYNOPSIS

**jeeves** _command_ [_arguments_] [_options_]

# COMMANDS

**start** _SERVICE_
> Create and start a container for the named service. Prompts for version, port, password, and volume name unless **--default** is given.

**stop** _SERVICE_
> Stop and remove the container for the named service.

**list**
> Print a table of Jeeves-managed containers.

**--help**, **-h**
> Show help for the command or subcommand.

# PARAMETERS

**--default**
> Skip interactive configuration prompts and use sensible defaults.

# DESCRIPTION

**jeeves** is a Python-based command-line butler that wraps **Docker** so developers can bring up common local dependencies (**MySQL**, **PostgreSQL**, **MongoDB**, **Redis**, **Memcached**, **Mailhog**, and others) with single-line commands. Each service is started in its own container with a named Docker volume for persistence, so data survives between restarts.

Because Jeeves uses regular Docker containers under the hood, standard Docker tooling (**docker ps**, **docker logs**, **docker exec**) continues to work alongside it — Jeeves is only responsible for the declaration and lifecycle, not for re-implementing container management.

# REQUIREMENTS

- **Python 3**
- **Docker** daemon running locally

# CAVEATS

The project is marked **experimental** and is not recommended for production workloads. It is heavily inspired by **Tighten/Takeout** and the earlier **fhsinchy/Tent**. Because Jeeves prompts interactively by default, scripted usage should always pass **--default**.

# HISTORY

**jeeves** was created by **Farhan Hasin Chowdhury (fhsinchy)** as a cross-platform successor to Tighten's macOS-only **Takeout** tool, with the goal of making Docker-backed local dev environments work equally well on Windows, Linux, and macOS.

# SEE ALSO

[docker](/man/docker)(1), [docker-compose](/man/docker-compose)(1), [takeout](/man/takeout)(1), [lando](/man/lando)(1)
