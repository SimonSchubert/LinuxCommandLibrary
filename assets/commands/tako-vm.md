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

**Show the current configuration**

```tako-vm config```

**Check server health**

```tako-vm status```

# SYNOPSIS

**tako-vm** [**--config** _file_] _command_ [_options_]

# DESCRIPTION

**tako-vm** is a self-hosted platform that runs untrusted or AI-generated **Python** in isolated **Docker** containers, with optional **gVisor** sandboxing and seccomp filtering. It bundles job queuing, execution history, retry logic and replay, so there is no need to assemble Redis, Celery or custom infrastructure separately.

Each job runs in its own container with **network isolation by default** and an optional per-job-type allowlist. The server exposes a REST API: code is submitted to an /execute endpoint and run inside the sandbox. PostgreSQL backs job state and is started automatically via Docker when the server runs.

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

Requires a working **Docker** installation; run **tako-vm setup** first. Isolation rests on Docker plus optional gVisor and seccomp, so keep the executor image and Docker up to date when running untrusted code.

# HISTORY

**tako-vm** is an open-source execution platform written in **Python** by developer **las7**, installed with **pip install "tako-vm[server]"**. It is distributed under the **Apache-2.0** license.

# SEE ALSO

[docker](/man/docker)(1), [podman](/man/podman)(1), [firejail](/man/firejail)(1), [bwrap](/man/bwrap)(1)
