# TAGLINE

Unified CLI for running parallel AI coding agents across providers

# TLDR

**Start the local daemon** that hosts running agents

```paseo daemon start```

**Launch an agent** with a specified provider and prompt

```paseo run --provider [claude/opus-4.6] "[implement user authentication]"```

**Launch an agent in its own git worktree** so its edits stay isolated

```paseo run --worktree [feature-branch] --provider [codex] "[refactor the payment module]"```

**List currently running agents** managed by the daemon

```paseo ls```

**Stream live output** from a running agent by ID

```paseo attach [agent_id]```

**Send a follow-up instruction** to an active agent

```paseo send [agent_id] "[also add unit tests]"```

**Target a remote daemon** instead of the local one

```paseo run --host [host:port] --provider [opencode] "[review the diff]"```

# SYNOPSIS

**paseo** _subcommand_ [_options_]

**paseo** **run** **--provider** _PROVIDER_ [**--worktree** _BRANCH_] [**--host** _HOST_] _prompt_

**paseo** **ls**

**paseo** **attach** _agent_id_

**paseo** **send** _agent_id_ _message_

**paseo** **daemon** **start** | **stop** | **status**

# DESCRIPTION

**paseo** is a command-line client and local daemon that orchestrates multiple AI coding agents behind a single interface. Each invocation of **paseo run** spawns an agent process under one of the supported providers (Claude Code, Codex, GitHub Copilot, OpenCode, Pi) and registers it with the daemon, which keeps the agent alive across terminal sessions and exposes it for follow-up messages or live attachment.

A typical workflow is to start the daemon once with **paseo daemon start**, fire off several agents in parallel on different prompts or branches, list them with **paseo ls** to see status and IDs, and then **attach** or **send** to interact with whichever one needs supervision. Because each agent can be pinned to its own git worktree, parallel agents work on isolated branches without stomping on each other's edits.

The daemon model also enables cross-device usage: a daemon running on a workstation can be reached from a laptop by passing **--host**, so long-running agent sessions outlive any single shell or device. Paseo positions itself as a thin coordination layer above the underlying coding-agent CLIs rather than a separate AI: model selection and prompts are handed straight to the chosen provider.

# PARAMETERS

**--provider** _PROVIDER_

> Required for **paseo run**. Selects the underlying coding agent, e.g. **claude/opus-4.6**, **codex**, **copilot**, **opencode**, **pi**. Use the provider's own model identifier where applicable.

**--worktree** _BRANCH_

> Run the agent inside a dedicated git worktree on _BRANCH_, so its file edits stay isolated from other parallel agents.

**--host** _HOST_

> Route the command to a remote Paseo daemon at _HOST_ (e.g. **host:port**) instead of the local one.

# SUBCOMMANDS

**run**

> Start a new agent under the chosen provider with the given prompt.

**ls**

> List running agents with their IDs, providers, and status.

**attach** _id_

> Stream live output from an agent. Detach to leave the agent running.

**send** _id_ _message_

> Send a follow-up message to an agent that is already running.

**daemon start | stop | status**

> Manage the local Paseo daemon that hosts running agents.

# INSTALLATION

```
npm install -g @getpaseo/cli
```

After install, run **paseo daemon start** once to bring up the local daemon.

# CAVEATS

**paseo** is a thin wrapper: it does not replace the underlying provider CLIs, and each provider must be installed and authenticated separately. API costs and rate limits apply per provider as usual.

The daemon keeps agents alive in the background. Forgetting to **paseo ls** or **paseo daemon stop** can leave long-running agent processes (and their token usage) accumulating silently.

Worktrees created with **--worktree** persist on disk after the agent exits. Clean them up with **git worktree remove** when no longer needed.

# HISTORY

**paseo** is a recent project (first public releases in 2026) from the **getpaseo** team, released under the **AGPL-3.0** license. It emerged alongside the broader trend of multi-agent coding workflows, aiming to provide one interface, one history, and one daemon for users who run Claude Code, Codex, Copilot, OpenCode, and Pi side by side.

# INSTALL

```aur: yay -S paseo```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[claude](/man/claude)(1), [codex](/man/codex)(1), [copilot](/man/copilot)(1), [git-worktree](/man/git-worktree)(1)
