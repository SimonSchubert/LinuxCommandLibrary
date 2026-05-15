# TAGLINE

Agent of Empires - session manager for parallel AI coding agents

# TLDR

**Launch the interactive TUI** in the current directory

```aoe```

**Create a session** running a specific agent CLI

```aoe add --cmd [claude]```

**Add a session on a worktree branch**

```aoe add --cmd [claude] --branch [feature/login]```

**Start the web dashboard** for browser/phone access

```aoe serve```

**Expose the dashboard publicly** over HTTPS with QR auth

```aoe serve --tunnel```

**View debug logs**

```aoe logs```

**List active sessions** (also available in the TUI)

```aoe list```

# SYNOPSIS

**aoe** [_command_] [_options_]

# PARAMETERS

**add**
> Create a new agent session.
> **--cmd** _name_: agent CLI to launch (claude, opencode, gemini, codex, copilot, cursor, ...).
> **--branch** _name_: create or attach to a git worktree on that branch.
> **--sandbox**: run the session inside a Docker container with shared auth volumes.
> **--name** _label_: friendly name shown in the TUI.

**list**
> Print all known sessions and their status.

**attach** _name_
> Attach the current terminal to an existing session (equivalent to tmux attach).

**kill** _name_
> Terminate a session and clean up its worktree.

**serve**
> Start the web dashboard.
> **--port** _n_: HTTP port (default 8765).
> **--tunnel**: expose dashboard over HTTPS with QR-based pairing for phones.

**logs**
> Tail the AoE daemon log in the best viewer available.

**doctor**
> Print environment diagnostics (tmux, docker, agent binaries detected).

**--help**, **-h**
> Print help and exit.

**--version**
> Print version and exit.

# DESCRIPTION

**aoe** (Agent of Empires) is a Rust terminal session manager that orchestrates **multiple AI coding agents in parallel**. Each session runs inside its own **tmux** window — and optionally inside a **Docker** sandbox — so agents can work on different branches of the same repository without stepping on each other. The default invocation opens a **TUI** that shows every session, its current status (running, waiting for input, idle), and a diff viewer for reviewing changes without leaving the terminal.

Out of the box, aoe knows how to spawn **Claude Code**, **OpenCode**, **Gemini CLI**, **Codex CLI**, **Copilot CLI**, **Cursor CLI**, **Mistral Vibe**, **Pi.dev**, **Factory Droid**, **Hermes**, **Qwen Code**, and **Kiro CLI**. Sessions persist across SSH disconnects, terminal closes, and aoe restarts, because the underlying tmux server keeps them alive. A separate **web dashboard** (**aoe serve**) makes the same sessions accessible from a browser or, with **--tunnel**, from a phone over HTTPS.

# CONFIGURATION

**~/.config/aoe/**
> User config: agent definitions, default branch naming, dashboard auth.

**~/.local/share/aoe/**
> Per-session state, logs, and worktree metadata.

**tmux**
> Required runtime dependency; every session is a tmux window. Use **Ctrl+b d** to detach back to the AoE TUI.

**Docker**
> Optional. Required for **--sandbox**; AoE bind-mounts agent auth directories so sandboxed sessions stay signed in.

# CAVEATS

Native Windows is **not supported** — use **WSL2** instead. **tmux** is required and must be on **PATH**. Sandboxed sessions share auth volumes with the host, so secrets are visible to agents inside the container; treat this like running the agent locally. The web dashboard is in **beta**; pin a version if you script against its API.

# HISTORY

**Agent of Empires** was created by **Nate Brake** at **Mozilla.ai** and released in **late 2025** to scratch the practical itch of running several coding agents at once across long-lived sessions on a laptop or remote server. It is written in **Rust**, distributed via **Homebrew**, **Nix**, **Cargo**, and an install script, and is licensed under **MIT**.

# SEE ALSO

[tmux](/man/tmux)(1), [claude](/man/claude)(1), [gemini](/man/gemini)(1), [git-worktree](/man/git-worktree)(1)
