# TAGLINE

Multi-agent collaboration office for AI coding assistants

# TLDR

**Launch** the WUPHF office and open the web UI

```npx wuphf```

**Run** with a specific agent provider

```npx wuphf --provider [codex]```

**Use** the tmux-based terminal UI instead of the web interface

```npx wuphf --tui```

**Pick** a predefined agent team pack

```npx wuphf --pack [coding-team]```

**Choose** a memory backend

```npx wuphf --memory-backend [markdown]```

**Start a one-on-one** session with a specific agent

```npx wuphf --1o1 [ceo]```

**Run** without opening the browser automatically

```npx wuphf --no-open```

**Use a custom** web UI port

```npx wuphf --web-port [7891]```

# SYNOPSIS

**wuphf** [_options_] [_subcommand_]

# PARAMETERS

**--memory-backend** _name_
> Select the shared-memory backend: **nex**, **gbrain**, **markdown** (default), or **none**.

**--pack** _name_
> Choose a preconfigured agent team: **starter**, **founding-team**, **coding-team**, **lead-gen-agency**, or **revops**.

**--provider** _name_
> LLM CLI to drive each agent: **claude-code** (default), **codex**, or **openclaw**.

**--tui**
> Use the tmux-based terminal UI instead of the web UI.

**--no-nex**
> Disable the Nex backend while keeping local integrations.

**--no-open**
> Do not open the default browser when the web UI starts.

**--opus-ceo**
> Upgrade the CEO agent from Sonnet to Opus.

**--collab**
> Enable collaborative mode (default).

**--unsafe**
> Bypass agent permission checks; intended only for local experimentation.

**--web-port** _N_
> Web UI port (default **7891**).

**--1o1** [_agent_]
> Start a one-on-one chat with the CEO, or with the named agent if given.

**init**
> Run initial setup and write a configuration file.

**shred**
> Terminate the active office session and clean up local state.

# DESCRIPTION

**wuphf** is a "Slack for AI employees" — a multi-agent collaboration layer that spawns a small office of role-based agents (CEO, PM, engineers, designer, CMO, CRO) sharing a common memory store and a chat-style channel. Instead of running each AI assistant in isolation, wuphf lets them see each other's messages, claim tasks, and ship work together while preserving context across sessions.

Under the hood wuphf delegates each agent to an existing CLI such as **claude-code**, **codex**, or **openclaw**, and exposes a web UI by default at **http://localhost:7891** with the team roster, a shared channel, and a message composer. A **--tui** mode renders the same office inside a tmux session for terminal-only environments.

Memory is pluggable via **--memory-backend**: the **markdown** backend keeps a human-readable Markdown brain on disk, while **nex** and **gbrain** integrate with hosted services. Agent rosters are described by the **--pack** option, and custom packs can be defined in configuration.

# CONFIGURATION

After **wuphf init**, configuration is stored locally and read on each launch. Required runtime dependencies are **node** / **npx**, **python3**, **curl**, **tmux** (for **--tui** mode), and at least one supported LLM CLI on **PATH** (**claude**, **codex**, or **openclaw**). API keys are taken from the underlying CLI's own configuration — wuphf does not store them itself.

# CAVEATS

wuphf is an early-stage orchestration layer; flag names and pack contents change between releases. The **--unsafe** flag disables per-agent permission checks and should never be used outside isolated, throw-away environments. Because agents call external LLM CLIs, costs and rate limits depend on the provider account behind each CLI.

# HISTORY

**wuphf** is developed by **Nex** and published at **github.com/nex-crm/wuphf**. The name is a nod to the fictional notification service from the TV show *Parks and Recreation*. It is distributed via **npm** and runs without a global install through **npx wuphf**.

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [tmux](/man/tmux)(1), [npx](/man/npx)(1)
