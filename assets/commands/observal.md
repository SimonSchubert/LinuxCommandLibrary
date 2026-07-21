# TAGLINE

CLI for Observal AI agent registry and analytics

# TLDR

**Install** the standalone CLI binary

```curl -fsSL https://raw.githubusercontent.com/Observal/Observal/main/install.sh | bash```

**Install** via Python tooling

```uv tool install observal-cli```

**Log in** to your Observal server

```observal auth login```

**Detect harness and install** telemetry hooks

```observal doctor --patch```

**Pull an agent** into a specific coding harness

```observal pull [agent-name] --harness [pi|cursor|codex|...]```

**Create a redacted support bundle**

```observal support bundle```

**Stream** local dev logs

```observal logs```

# SYNOPSIS

**observal** \<command\> [_options_]

# DESCRIPTION

**observal** is the developer CLI for **Observal**, a self-hosted control plane and registry for internal AI components (skills, MCP servers, agents, hooks, prompts, and sandboxes). The CLI authenticates to a deployed Observal server, installs session telemetry into coding harnesses, pulls versioned agents with harness-specific config, and helps diagnose issues.

Supported harnesses include Claude Code, Cursor, Kiro, Pi, GitHub Copilot (CLI and VS Code), Codex, OpenCode, and Antigravity CLI. After **auth login** and **doctor --patch**, Observal can capture sessions and generate the right install layout per harness. Agents are portable packages: define once in the registry, then **pull** with the appropriate **--harness**.

The CLI is installable as a standalone binary (no Python required) or as the **observal-cli** package via **uv** / **pipx**. The server side is a separate Docker Compose stack (API, web UI, PostgreSQL, ClickHouse, Redis, and more); the CLI only talks to a running server.

# PARAMETERS

**auth login**
> Authenticate with your Observal server.

**doctor** [**--patch**]
> Diagnose the local harness setup; **--patch** installs telemetry hooks and prepares agent installs.

**pull** _agent_ [**--harness** _name_]
> Install a registry agent into the selected coding harness, generating harness-specific config.

**support bundle**
> Write a redacted diagnostic archive for bug reports.

**support inspect** _archive_
> Review a support bundle before sharing.

**logs**
> Stream loguru-based dev logs (written under **~/.observal/logs/**).

# CAVEATS

The CLI needs a reachable Observal server; installing only the CLI is not enough. Full self-hosting pulls a multi-service Docker stack and needs Docker Engine ≥ 24 with Compose v2. Telemetry and agent installs modify local harness configuration—review **doctor** output before **--patch** on shared machines. Session capture and insights depend on server-side storage and optional LLM configuration for insight reports.

# HISTORY

**Observal** is an Apache-2.0 open-source project providing a governed registry and analytics platform for internal AI agents and components, with a Python (Typer/Rich) CLI and a FastAPI-backed server.

# SEE ALSO

[uv](/man/uv)(1), [pip](/man/pip)(1), [docker](/man/docker)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/Observal/Observal)```

```[Homepage](https://observal.io)```

```[Documentation](https://docs.observal.io/)```

<!-- verified: 2026-07-21 -->
