# TAGLINE

Run untrusted code in isolated Docker containers

# TLDR

**Pull the executor image** and verify Docker

```tako-vm setup```

**Start the REST API server**

```tako-vm server```

**Start the server on a custom port**

```tako-vm server --port [8000]```

**Start a local PostgreSQL and the server together** for development

```tako-vm dev up --with-server```

**Show the current configuration** as JSON

```tako-vm config --json```

**Validate a configuration file**

```tako-vm validate [my.yaml]```

**Start the server with a specific config file**

```tako-vm --config [my.yaml] server```

**Execute code** through the REST API

```curl -X POST http://localhost:8000/execute -H "Content-Type: application/json" -d '{"code": "print(1 + 1)"}'```

**Check server health**

```tako-vm status```

# SYNOPSIS

**tako-vm** [**--config** _file_] _command_ [_options_]

# DESCRIPTION

**tako-vm** is a self-hosted platform that gives AI agents a file system and **Python** execution: every job runs in its own ephemeral **Docker** container, sandboxed by **gVisor** and a default-deny seccomp profile. It bundles job queuing, execution history, automatic retries, idempotency keys and replay (rerun or fork past jobs), so there is no need to assemble Redis, Celery or custom infrastructure separately.

Each job runs in its own container with **network isolation by default** and an optional per-job-type allowlist. The server exposes a REST API (port **8000** by default) and a Python SDK: code is submitted to the **/execute** endpoint and run inside the sandbox. PostgreSQL backs job state and is started automatically via Docker when the server runs.

# COMMANDS

**setup**
> Pull the executor Docker image and verify the Docker installation.

**server** [**--port** _port_]
> Start the REST API server (auto-starts PostgreSQL via Docker).

**dev up** [**--with-server**]
> Start a local PostgreSQL for development, optionally with the API server.

**dev status**
> Check the local PostgreSQL status.

**dev down**
> Stop the local PostgreSQL.

**config** [**--json**]
> Show the current configuration, optionally as JSON.

**validate** [_file_]
> Validate the current or a specified configuration file.

**status**
> Check server health.

**version**
> Display version information.

# CAVEAT

Requires a working **Docker** installation and Python 3.10+; run **tako-vm setup** first. The default **security_mode: strict** with **container_runtime: runsc** refuses to run jobs without gVisor installed. **security_mode: permissive** falls back to plain Docker (**runc**), which removes the userspace-kernel boundary and should not be used for untrusted code.

Containers are currently single-use; persistent per-agent workspaces are on the roadmap.

# HISTORY

**tako-vm** is an open-source execution platform written in **Python** and maintained by **Tako Research** (originally published as las7/tako-vm), installed with **pip install "tako-vm[server]"**. It is distributed under the **Apache-2.0** license.

# SEE ALSO

[docker](/man/docker)(1), [podman](/man/podman)(1), [firejail](/man/firejail)(1), [bwrap](/man/bwrap)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/Tako-Research/TakoVM)```

```[Documentation](https://tako-research.github.io/TakoVM/)```

<!-- verified: 2026-11-23 -->
