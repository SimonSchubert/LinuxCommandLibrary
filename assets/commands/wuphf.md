# TAGLINE

Multi-agent office for AI coding assistants (renamed gawkbot)

# TLDR

**Launch** the WUPHF office and open the web UI

```npx wuphf```

**Run** with a specific agent provider

```wuphf --provider [codex]```

**Use** a local Ollama model without opening the browser

```wuphf --provider ollama --no-open```

**Pick** a predefined agent team pack

```wuphf --pack [coding-team]```

**Start a one-on-one** session with a specific agent

```wuphf --1o1 [cro]```

**Use a custom** web UI port

```wuphf --web-port [8080]```

**Use** the legacy tmux terminal UI instead of the web interface

```wuphf --legacy-tui```

**List** or switch isolated workspaces

```wuphf workspace [list|switch name]```

# SYNOPSIS

**wuphf** [_options_]

**wuphf** _subcommand_ [_args_]

# PARAMETERS

**--provider** _name_
> Runtime that drives each agent: **claude-code** (default), **codex**, **opencode**, **ollama**, **hermes-agent**, or **openclaw-http**.

**--pack** _name_
> Choose a preconfigured agent team: **starter**, **founding-team**, **coding-team**, **lead-gen-agency**, or **revops**.

**--memory-backend** _name_
> Override the built-in Markdown wiki with **nex**, **gbrain**, or **none** (legacy installs only).

**--no-nex**
> Skip the Nex backend (no context graph, no Nex-managed integrations).

**--legacy-tui**
> Use the legacy tmux-based TUI instead of the web UI.

**--no-open**
> Do not open the default browser when the web UI starts.

**--opus-ceo**
> Upgrade the CEO agent from Sonnet to Opus.

**--collab**
> Collaborative mode where all agents see all messages (default).

**--unsafe**
> Bypass agent permission checks; intended only for local development.

**--web-port** _N_
> Web UI port (default **7891**).

**--workspace** _name_
> Use a specific workspace for one command without changing the active one.

**--1o1** [_agent_]
> Start a one-on-one chat with the CEO, or with the named agent if given.

**init**
> Run first-time setup.

**share**
> Invite one team member over Tailscale or WireGuard.

**shred**
> Delete workspace state and reopen onboarding.

**workspace list**, **workspace switch** _name_
> List isolated workspaces or change the active one.

**skills publish** | **skills install** _name_
> Publish a skill to, or install one from, a skill registry.

# DESCRIPTION

**wuphf** is a "Slack for AI employees": a multi-agent collaboration layer that spawns a small office of role-based agents (CEO, PM, engineers, designer, CMO, CRO) sharing a common memory store and a chat-style channel. Instead of running each AI assistant in isolation, wuphf lets them see each other's messages, claim tasks, and ship work together while preserving context across sessions.

Under the hood wuphf delegates each agent to an existing CLI or endpoint such as **claude-code**, **codex**, **opencode**, or a local **Ollama** server, and exposes a web UI by default at **http://localhost:7891** with the team roster, a shared channel, and a message composer.

Memory defaults to a built-in Markdown wiki stored under **~/.wuphf/**; the **nex** and **gbrain** backends remain available for older installs.

# CONFIGURATION

State, workspaces and the shared wiki live under **~/.wuphf/**. Custom OpenAI-compatible endpoints for **--provider ollama** are set with **WUPHF_OLLAMA_BASE_URL** and **WUPHF_OLLAMA_MODEL**; the **hermes-agent** and **openclaw-http** providers read **WUPHF_HERMES_AGENT_*** and **WUPHF_OPENCLAW_HTTP_*** variables. API keys are taken from the underlying CLI's own configuration.

# CAVEATS

The project was renamed **gawkbot** in **August 2026**: the GitHub repository moved and new releases ship as the **gawkbot** npm package and binary, so **wuphf** (last npm release **0.235.1**) no longer receives updates. The **--unsafe** flag disables per-agent permission checks and should never be used outside isolated, throw-away environments. Because agents call external LLM CLIs, costs and rate limits depend on the provider account behind each CLI.

# HISTORY

**wuphf** was developed by **Nex** (nex-crm) and distributed via **npm**, runnable without a global install through **npx wuphf**. The name is a nod to Ryan Howard's fictional social networking startup from the TV show *The Office*. In 2026 the project was renamed **gawkbot** and refocused on always-on bots supervised from a Mac app and iPhone companion.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [tmux](/man/tmux)(1), [npx](/man/npx)(1)

# RESOURCES

```[Source code](https://github.com/najmuzzaman-mohammad/gawkbot)```

```[Homepage](https://gawk.bot)```

<!-- verified: 2026-11-23 -->
