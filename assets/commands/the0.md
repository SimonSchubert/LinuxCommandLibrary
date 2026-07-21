# TAGLINE

CLI for the0 algorithmic trading platform

# TLDR

**Install** the the0 CLI

```curl -sSL https://install.the0.app | sh```

**Initialize a local stack** with root admin credentials

```the0 local init --email [you@example.com] --password [password]```

**Start** the local Docker Compose platform

```the0 local start```

**Show** CLI help

```the0 --help```

**Log in** and obtain API credentials for remote or MCP use

```the0 auth login```

**Point the CLI** at a local Docker Compose API

```export THE0_API_URL=http://localhost:3000```

# SYNOPSIS

**the0** \<command\> [_options_]

# DESCRIPTION

**the0** is the command-line interface for **the0**, an open-source algorithmic trading execution engine. The CLI installs and manages a self-hosted stack (API, web dashboard, bot runners, and supporting services via Docker Compose or Kubernetes), authenticates against the API, and is the primary workflow for developing, deploying, and managing trading bots.

Bots can be written in Python, TypeScript, Rust, C++, C#, Scala, or Haskell with official SDKs. The platform supports scheduled (cron) and real-time bots, custom React dashboards, and exchange-agnostic strategies. Local deployment typically exposes the frontend on port **3001**, the API on **3000**, and MinIO on **9001**. The install script places the binary under **~/.the0/bin/the0** (ensure that directory is on **PATH**). Source builds from **the0/cli** install to **~/bin/the0**.

The API also exposes an MCP (Model Context Protocol) HTTP endpoint so AI assistants can list bots, deploy configurations, and read logs when given an API key.

# PARAMETERS

**local init**
> Scaffold local Docker Compose config and set the root admin (**--email**, **--password**). Requires Docker 20.10+ with Compose.

**local start**
> Start all local platform services.

**auth login**
> Authenticate and obtain API credentials (also used for MCP integration).

**--help**
> Show CLI help and available subcommands.

**THE0_API_URL**
> Environment variable for the API base URL (e.g. **http://localhost:3000** for Docker Compose, or a Kubernetes service URL).

# CAVEATS

The project is in **beta** and not production-ready. Local deploy needs Docker with Compose and roughly 4 GB of free RAM for containers. Kubernetes (Helm) needs operator-managed PostgreSQL, MongoDB, S3-compatible storage, JWT secrets, and admin configuration—it is not a one-command install. Trading bots talk to real or paper brokers under your own credentials; the CLI does not provide market access by itself.

# HISTORY

**the0** is developed by **AlphaNeuron** (Alexander Wanyoike) as an open-source multi-language bot execution platform under the Apache License 2.0, with a Go CLI (Cobra), NestJS API, and Go runtime services.

# SEE ALSO

[docker](/man/docker)(1), [docker-compose](/man/docker-compose)(1), [helm](/man/helm)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/alexanderwanyoike/the0)```

```[Homepage](https://the0.app)```

```[Documentation](https://docs.the0.app/the0-cli/)```

<!-- verified: 2026-07-21 -->
