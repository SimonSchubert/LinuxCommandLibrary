# TAGLINE

Secure self-hosted runtime for AI agent sandboxes

# TLDR

**Check** that Docker and backends are available

```agentnest doctor```

**Run a demo** sandbox (needs Docker)

```agentnest demo```

**Execute Python** in a disposable sandbox

```agentnest run [script.py] --image [python:3.12-slim] --timeout [60]```

**Run a shell** command in a sandbox

```agentnest shell '[python -V]' --memory [256m] --cpus [0.5]```

**Prune** orphaned sandboxes left after crashes

```agentnest prune```

**Start the remote API** (requires `agentnest[server]`)

```AGENTNEST_API_TOKEN=[secret] agentnest serve --host [127.0.0.1] --port [8765]```

**Expose AgentNest over MCP** (requires `agentnest[mcp]`)

```agentnest mcp```

**List** discovered runtime backends

```agentnest backends```

# SYNOPSIS

**agentnest** _command_ [_options_]

# DESCRIPTION

**agentnest** is the command-line interface for AgentNest, a self-hosted runtime that gives AI agents disposable, policy-controlled environments for Python, shell commands, files, packages, browsers, GPUs, and Git work.

Sandboxes run on backends you control (Docker by default; Kubernetes and others via plugins). Defaults favor isolation: non-root, read-only root filesystem, no Linux capabilities, denied networking, resource limits, and cleanup of expired resources. Optional egress allowlists can open only specific domains through a filtering proxy.

The primary programming surface is the Python `Sandbox` API; the CLI covers day-to-day operations such as one-off runs, health checks, reaping orphan containers, serving a remote API, and exposing tools over the Model Context Protocol (MCP).

# PARAMETERS

**run** _code_or_script_
> Run Python source or a **.py** file in a new sandbox. Exit status matches the sandboxed process; stdout and stderr are preserved.

**shell** _script_
> Run a shell script string in a new sandbox.

**demo**
> Run a self-contained sandbox demo (no extra arguments). Requires a working Docker setup.

**doctor**
> Check the local runtime environment. Prints machine-readable JSON and exits non-zero when Docker is unavailable.

**backends**
> List discovered runtime backend names.

**prune** [**--all**]
> Remove managed sandboxes left by crashes (expired resources). With **--all**, remove every managed sandbox, not only expired ones.

**serve** [**--host** _addr_] [**--port** _n_]
> Start the remote runtime API (default **127.0.0.1:8765**). Requires `pip install 'agentnest[server]'`. Non-loopback hosts refuse to start without **AGENTNEST_API_TOKEN**.

**mcp**
> Start the AgentNest MCP server for clients such as Claude Code or Cursor. Requires `pip install 'agentnest[mcp]'`.

**--version**
> Print the AgentNest version.

Options for **run** and **shell**:

**--image** _name_
> Container image (default **python:3.12-slim**).

**--backend** _name_
> Runtime backend (default **docker**).

**--timeout** _seconds_
> Sandbox timeout in seconds (default **300**). A timed-out command is killed; the sandbox and its state can survive depending on usage.

**--network**
> Enable networking (denied by default).

**--memory** _limit_
> Memory limit (default **512m**).

**--cpus** _n_
> CPU limit as a float (default **1.0**).

# CAVEATS

Containers share the host kernel; choose an isolation boundary appropriate for your threat model before multi-tenant or hostile workloads. Docker must be available for the default backend. Optional features (**serve**, **mcp**, Kubernetes) need matching pip extras. Install with `pip install agentnest` (or `pip install 'agentnest[all]'` for extras).

# HISTORY

**AgentNest** is an open-source, Apache-2.0 project for self-hosted AI agent sandboxes. It is distributed on PyPI as **agentnest** with a console script entry point of the same name.

# SEE ALSO

[docker](/man/docker)(1), [podman](/man/podman)(1), [firejail](/man/firejail)(1), [bubblewrap](/man/bubblewrap)(1), [pip](/man/pip)(1)

# RESOURCES

```[Source code](https://github.com/mihirahuja1/agentnestOSS)```

```[Documentation](https://mihirahuja1.github.io/agentnestOSS/)```

<!-- verified: 2026-07-23 -->
