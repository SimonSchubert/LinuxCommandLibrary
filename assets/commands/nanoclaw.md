# TAGLINE

Self-hosted AI assistant that runs each agent in its own container

# TLDR

**Install and run the setup wizard**

```git clone https://github.com/nanocoai/nanoclaw.git && cd nanoclaw && bash nanoclaw.sh```

**Add a messaging channel** (run inside Claude Code in the checkout)

```/add-telegram```

**Show the host status**

```ncl status```

**List available resources and commands** of the NanoClaw CLI

```ncl help```

**List scheduled tasks**

```ncl tasks list```

**Schedule a recurring task** for an agent group

```ncl tasks create --group [agent_group_id] --prompt "[Send me a news briefing]" --process-after "[2026-01-15T09:00:00]" --recurrence "[0 9 * * 1-5]"```

**Cancel a scheduled task**

```ncl tasks cancel --id [series_id]```

**Message the assistant** from a connected chat (in a group, @mention its bot)

```@[Nano] [what's on my calendar today?]```

# SYNOPSIS

**bash nanoclaw.sh**

**ncl** _resource_ _verb_ [_options_]

**ncl** _command_ [_options_]

# PARAMETERS

**nanoclaw.sh**
> Setup script: installs Node.js, pnpm, and Docker if missing, configures a credential gateway, builds or pulls the agent image, and pairs the first channel.

**ncl help**
> List all resources and commands; **ncl** _resource_ **help** shows the verbs of one resource.

**ncl status**
> Show the running host process and connected channel adapters.

**ncl groups** list|get|create|update|delete|restart
> Manage agent groups; **create --template** _REF_ stamps an agent from a template.

**ncl tasks** list|get|create|update|cancel|run|pause|resume
> Manage one-off and recurring scheduled tasks.

**/add-**_CHANNEL_
> Coding agent skill that installs a channel adapter (Slack, WhatsApp, Telegram, Discord, Signal, Matrix, and more).

**/customize**, **/debug**
> Coding agent skills for guided changes and troubleshooting.

# DESCRIPTION

**NanoClaw** is a lightweight, self-hosted personal AI assistant. A single Node.js host process routes messages from chat apps to agents, and each agent session runs in its own Docker container with only the folders you explicitly mount, so shell access by the agent stays sandboxed.

Each agent group has its own instructions file (**CLAUDE.md**, or **AGENTS.md** for Codex and Cursor), memory, and containers. Agents run Claude through the Claude Agent SDK by default; Codex, Cursor, and OpenCode can be selected per agent group. Messages are exchanged through per-session SQLite databases. Scheduled tasks let agents run recurring jobs such as daily briefings or weekly reports.

The project favours code changes over configuration: channels and providers are added as skills that copy only the needed modules into your fork, and customization is done by asking a coding agent to modify the small codebase. **ncl** is the command-line interface to the running host; symlink **bin/ncl** into your **PATH** to use it from anywhere.

# CAVEATS

Requires macOS or Linux (Windows via WSL2), Docker, Node.js, pnpm, git, and credentials for the chosen model provider. Channel adapters are not part of the core and must be added with **/add-**_channel_ skills. Setup reports setup diagnostics under a random install ID unless **NANOCLAW_NO_DIAGNOSTICS=1** is set. Version 2 changed the architecture and task scheduling substantially; v1 installs are migrated with **migrate-v2.sh**.

# HISTORY

NanoClaw was created by **Gavriel Cohen** in **January 2026** as a minimal, auditable alternative to **OpenClaw**, relying on OS-level container isolation instead of application-level permission checks. It started out as a WhatsApp-only assistant set up through Claude Code's **/setup** command and later grew into a multi-channel, multi-provider v2. The repository moved from **qwibitai/nanoclaw** to **nanocoai/nanoclaw**.

# SEE ALSO

[openclaw](/man/openclaw)(1), [nanobot](/man/nanobot)(1), [claude](/man/claude)(1), [docker](/man/docker)(1), [leon](/man/leon)(1)

# RESOURCES

```[Source code](https://github.com/nanocoai/nanoclaw)```

```[Homepage](https://nanoclaw.dev)```

```[Documentation](https://docs.nanoclaw.dev)```

<!-- verified: 2026-11-23 -->
